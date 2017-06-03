<style scoped>
.breadCrumb{
    margin:10px 10px;
    padding:0 0 10px;
    border-bottom:1px solid #d7dde4;
  }
.fromCard{
  width:400px;
  /*margin-left:30px;*/
  margin:0 auto;
}
.fromCard li{
  overflow: auto;
}
.fromCard p{
  line-height:40px;
}
.fromCard  .li_left{
  float:left;
  width:100px;
  margin-right:20px;
}
</style>


<template>
  <div style="margin-bottom:70px;">
  <Breadcrumb class="breadCrumb">
    <Breadcrumb-item href="/homeCenter">
      <Icon type="ios-home-outline"></Icon> 家人中心
            </Breadcrumb-item>
    <Breadcrumb-item href="/homeCenter/personInf" >
      <span style="color:orange"><Icon type="pound"></Icon> 个人信息</span>
    </Breadcrumb-item>
    <Button type="ghost" style="float:right;" @click="modifyWay()">修改</Button>
  </Breadcrumb>
  <Card class='fromCard' v-show="!Inf">
    <Form :model="formLeft" label-position="left" :label-width="120">
      <Form-item label="真实姓名" >
        <Input v-model="formLeft.trueName" placeholder="请输入用户真实姓名" ></Input>
      </Form-item>
      <Form-item label="性别" prop="gender">
        <Radio-group v-model="formLeft.gender" >
          <Radio label="1" >男</Radio>
          <Radio label="2" >女</Radio>
        </Radio-group>
      </Form-item>
      <Form-item label="电话">
        <Input v-model="formLeft.phone"placeholder="请输入用户电话" ></Input>
      </Form-item>
      <Form-item label="年龄">
        <Input v-model="formLeft.age"placeholder="请输入用户真实姓名"></Input>
      </Form-item>
      <Form-item label="邮箱">
        <Input v-model="formLeft.email"placeholder="请输入用户邮箱"></Input>
      </Form-item>
      <Form-item label="用户住址">
        <Input v-model="formLeft.address" placeholder="请输入用户住址"></Input>
      </Form-item>
      <!--<Form-item label="查找老人">-->
        <!--<Input v-model="formLeft.oldName" placeholder="请输入老人身份证号"></Input>-->
      <!--</Form-item>-->
      <Form ref="formDynamic" :model="formDynamic"  :rules="ruleDynamic" :label-width="120">
        <Form-item
          v-for="(item, index) in formDynamic.items"
          :key="item"
          :label="'关联老人身份证号' "
          :prop="'items.' + index + '.value'"
          :rules="{required: true, message: '身份证号' +'不能为空', trigger: 'blur'}"
        >
          <Row>
            <Col span="18">
            <Input type="text" v-model="item.value" placeholder="请输入老人身份证号"></Input>
            </Col>
            <Col span="4" offset="1">
            <Button type="ghost" @click="handleRemove(index)">删除</Button>
            </Col>
          </Row>
        </Form-item>
        <Form-item>
            <Button type="dashed" long @click="handleAdd" icon="plus-round">新增</Button>
        </Form-item>
        </Form>
      <Form-item>
        <Button type="primary" @click="handleSubmit('formValidate')">提交</Button>
        <Button type="ghost" @click="handleReset('formValidate')" style="margin-left: 8px">重置</Button>
      </Form-item>
    </Form>
  </Card>
    <Card class='fromCard' v-show="Inf" title="个人信息卡片">
      <ul>
        <li>
          <p class="li_left">真实姓名</p>
          <p class="li_right" >{{data[0].trueName}} </p>
        </li>
        <li>
          <p class="li_left">性别</p>
          <p class="li_right" >{{data[0].genderName}} </p>
        </li>
        <li>
          <p class="li_left">电话</p>
          <p class="li_right" >{{data[0].phone}} </p>
        </li>
        <li>
          <p class="li_left">年龄</p>
          <p class="li_right" >{{data[0].age}} </p>
        </li>
        <li>
          <p class="li_left">邮箱</p>
          <p class="li_right" >{{data[0].trueName}}</p>
        </li>
        <li>
          <p class="li_left">用户住址</p>
          <p class="li_right" >{{data[0].email}} </p>
        </li>
        <li>
          <p class="li_left">关联老人</p>
          <p class="li_right" >{{data[0].oldName}} </p>
        </li>
        <li>
          <p class="li_left">老人地址</p>
          <p class="li_right" >{{data[0].oldAddress}} </p>
        </li>
      </ul>
    </Card>
  </div>
</template>
<script>
  import axios from 'axios' //引入axios
  import * as types from '../../../store/types'
  const localStorage = window.localStorage

  export default{

    data(){
      const validateName = (rule, value, callback)=>{
        if(!value){
          callback(new Error('请输入老人身份证号'));
        }else{
          const valiNameUrl = this.HOST+'/user/validateUserName/'+value;
          axios.post(valiNameUrl).then((response) =>{
            if(!response.data.success){
              callback();
            }else{
              callback(new Error('该老人不存在，请拨打社区服务电话或者联系居委会增加老人信息'));
            }
          },(response)=>{
            callback(new Error('查询出错'));
          }).catch(function(error){
            callback(new Error('查询出错'));
          });
        }
      };
      return {
        formDynamic: {
          items: [
            {
              value: ''
            }
          ]
        },
        ruleDynamic:{

        },
//        modify:'',
        formLeft: {
          trueName: '',
          gender: '',
          phone: '',
          age: '',
          email: '',
          address: '',
          oldName:'',
          oldAddress:''
        },
        data:[{
          trueName: '诸葛亮',
          gender: '1',
          genderName:'男',
          phone: '18788836331',
          age: '23',
          email: '229707654@qq.com',
          address: '安徽省巴中县',
          oldName:'诸葛流云',
          oldAddress:'北苑家园1栋1单元302室',
          idCard:[{value:'140778196811015964'}]
        }],
        Inf:false
      }
    },
    created(){
        if(localStorage.token=='王五'){
            this.Inf = true;
        }else{
            console.log(localStorage.token)
        }
//      this.getUserData(1)
    },
    beforeRouteEnter (to, from, next) {
      console.log(localStorage.token)
//    const inquireUrl = this.HOST;
//    axios.post(inquireUrl).then((json)=>{
//
//    }).catch((error)=>{
//      this.$Message.error(error)
//    })
      next()
//    axios.get(to.params.id, (err, post) =>{
//    if (err) {
//      // display some global error message
//      next(false)
//    } else {
//      next(vm => {
//        vm.post = post
//      })
//    }
//  })
    },

    methods:{
      handleAdd () {
        this.formDynamic.items.push({
          value: ''
        });
      },
      handleRemove (index) {
        this.formDynamic.items.splice(index, 1);
      },
      getUserData(current){
        const getUserUrl = this.HOST+'/userDetails/queryAllUserDetailsByPage'
        axios.post(getUserUrl,({
          currentPage:current,
          pageSize:this.pageSize
        })).then((response) =>{
          if(response.data.success){
            console.log(response.data)
            const Mode = response.data.pageMode
            this.pageTotal = Mode.totalRows
            this.data1 = Mode.dataList
            for(let i =0;i<Mode.dataList.length;i++){
              Mode.dataList[i].userGenderName=Mode.dataList[i].userGender==1? '男':'女';
              if(Mode.dataList[i].userDetatilsUser){
                Mode.dataList[i].userName= Mode.dataList[i].userDetatilsUser.userName
                Mode.dataList[i].password= Mode.dataList[i].userDetatilsUser.password
              }else{
                Mode.dataList[i].userName= ''
                Mode.dataList[i].password= ''
              }
            }
            this.spinshow = true
          }else{
            this.$Message.error('获取数据失败！')
          }
        }).catch((error)=>{
          this.$Message.error('请重新获取数据！')
        });
      },
      handleSubmit (name) {
        this.$refs[name].validate((valid) => {
          if (valid) {
            this.$Message.success('提交成功!');
          } else {
            this.$Message.error('表单验证失败!');
          }
        })
      },
      handleReset (name) {
        this.$refs[name].resetFields();
      },
      modifyWay(){
        this.Inf = !this.Inf;
        this.formLeft = this.data[0];
        this.formDynamic.items = this.data[0].idCard
      }
    }
  }
</script>
