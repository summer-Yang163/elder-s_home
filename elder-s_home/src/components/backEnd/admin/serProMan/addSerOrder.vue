<style scoped>

</style>
<template>
    <Modal
      v-model="modal1=myModal"
      :title = "this.$props.conData === false? '新增服务项目订单评价' : '修改服务项目订单评价'"
      @on-ok="ok(formValidate)"
      @on-cancel="cancel" width="500"   :styles="{top: '20px'}">
      <!--<Form ref="formValidate" :model="userDetatilsUser" :rules="rule" :label-width="80">-->
        <!--<Form-item label="用户名" prop="userName" >-->
          <!--<Input v-model="userDetatilsUser.userName" placeholder="请输入用户名"></Input>-->
        <!--</Form-item>-->
        <!--<Form-item label="登陆密码" prop="password">-->
          <!--<Input v-model="userDetatilsUser.password" placeholder="请输入登陆密码"></Input>-->
        <!--</Form-item>-->
      <!--</Form>-->
      <Form ref="formValidate" :model="formValidate" :rules="ruleValidate" :label-width="80">
        <Form-item label="服务订单编号" prop="serviceOrderId" >
          <Input v-model="formValidate.serviceOrderId" placeholder="请输入用户名"></Input>
        </Form-item>
        <Form-item label="用户评价内容" prop="evaluationContent">
          <Input v-model="formValidate.evaluationContent" placeholder="请输入登陆密码"></Input>
        </Form-item>
        <Form-item label="服务人员" prop="serviceName">
          <Input v-model="formValidate.serviceName" placeholder="请输入真实姓名"></Input>
        </Form-item>
        <!--<Form-item label="性别" prop="userGender">-->
          <!--<Radio-group v-model="formValidate.userGender">-->
            <!--<Radio label="1">男</Radio>-->
            <!--<Radio label="2">女</Radio>-->
          <!--</Radio-group>-->
        <!--</Form-item>-->
        <Form-item label="下单用户名" prop="userName">
          <Input v-model="formValidate.userName" placeholder="请输入用户性别"></Input>
        </Form-item>
        <Form-item label="是否满意" prop="isSatisfaction">
          <Input v-model="formValidate.isSatisfaction" placeholder="请输入用户电话"></Input>
        </Form-item>
        <Form-item label="备注" prop="remarks">
          <Input v-model="formValidate.remarks" placeholder="请输入用户年龄"></Input>
        </Form-item>
      </Form>
    </Modal>
</template>
<script>
  import axios from 'axios'

  export default {
    props:[ 'ModalType','conData'],
    data(){
        return {
          modal1:false,
          myModal:this.ModalType,//首先建立一个props的副本
          fromData:this.conData,
          formValidate: {
            serviceOrderId: '',
            evaluationContent:'',
            serviceName:'',
            userName:'',
            isSatisfaction:'',
            remarks:''
          },
          ruleValidate: {
            userDetatilsUser:{
              userName: [
                { required: true, message: '姓名不能为空', trigger: 'blur' }
              ],
              password: [
                { required: true, message: '用户密码不能为空', trigger: 'blur' },
                {type: 'string', min: 6, message: '密码长度不能小于6位', trigger: 'blur'}
              ]
            }

          }

        }
    },
    watch:{
      ModalType(val){
         this.myModal = val //监听外部对ModalType的变更，并同步到组件内的data
      },
      myModal(val){
          this.$emit('changeMod',val)//组件内对myModal改变后向外部发送事件通知
      },
      conData(val){
        this.fromData = val
        if(this.fromData){
          this.formValidate = this.fromData
        }
      }
    },
    computed:{
    },
    methods:{
      ok (data) {
        if(data.userDetatilsUser.userName&&data.userDetatilsUser.password){
          if(this.fromData){
//            修改
            delete data.userName;
            delete data.password;
            delete data.userGenderName;
            const modifyUrl = this.HOST+'/userDetails/updateUserDetails'
            axios.post(modifyUrl,data).then((json)=>{
                if(json.data.success){
                  this.$Message.success('修改用户成功');
                  this.$router.go(0)
                }else{
                  this.$Message.error('修改用户失败');
                  this.$router.go(0)
                }
            }).catch((error)=>{
              this.$Message.error('修改失败');
            })
          }else{
            const addUrl = this.HOST+'/userDetails/insertUserDetails'
            axios.post(addUrl,data).then((json)=>{
                console.log(json.data)
              if(json.data.success){
                this.$Message.success('新增用户成功');
//                this.$router.go(0)
              }else{
                this.$Message.error('新增用户失败');
              }
            }).catch((error)=>{
              this.$Message.error('新增失败');
            })
          }
        }else{
          this.$Message.warning('请将必填信息填写完整!');
        }
      },
      cancel () {
          if(this.fromData){
            this.$Message.info('取消修改信息');
          }else{
            this.$Message.info('取消新增用户');
          }
      }
    },
    computed:{
    }

  }
</script>
