<style scoped>
  .layout-breadcrumb {
    padding: 10px 15px 0;
  }

  .layout-content {
    min-height: 200px;
    margin: 15px;
    overflow: hidden;
    background: #fff;
    border-radius: 4px;
  }

  .layout-breadcrumb .addDelete{
    /*border-top:1px solid #c1c3c5;*/
    float:right;
    /*padding:10px;*/
  }
  .layout-content-main {
    padding: 10px;
  }
  .layout-copy {
    text-align: center;
    padding: 10px 0 20px;
    color: #9ea7b4;
  }

</style>
<template>
  <div>
  <sysHead></sysHead>
  <div class="layout-breadcrumb" style="overflow: hidden;">
    <Breadcrumb style="float:left;line-height: 32px;">
      <Breadcrumb-item href="#">时光驿站社区服务工作系统</Breadcrumb-item>
      <Breadcrumb-item href="#">社区老人信息添加</Breadcrumb-item>
      <Breadcrumb-item>添加老人信息</Breadcrumb-item>
    </Breadcrumb>
    <div class="addDelete">
      <!--<Button style="margin-right:25px;"  @click=" add()">新增</Button>-->
      <!--<Button >批量删除</Button>-->
    </div>
  </div>
  <div class="layout-content">
    <div class="layout-content-main">
      <Card style="width:600px;margin:10px auto;">
        <Form ref="formValidate" :model="formValidate" :rules="ruleValidate" :label-width="100">
          <Form-item label="老人姓名" prop="oldName">
            <Input v-model="formValidate.oldName" placeholder="请输入老人姓名"></Input>
          </Form-item>
          <Form-item label="性别" prop="oldGender">
            <Radio-group v-model="formValidate.oldGender">
              <Radio label="1">男</Radio>
              <Radio label="2">女</Radio>
            </Radio-group>
          </Form-item>
          <Form-item label="电话" prop="oldPhone">
            <Input v-model="formValidate.oldPhone" placeholder="请输入老人电话"></Input>
          </Form-item>
          <Form-item label="年龄" prop="oldAge">
            <Input v-model="formValidate.oldAge" placeholder="请输入老人年龄"></Input>
          </Form-item>
          <Form-item label="身份证号" prop="idCard">
            <Input v-model="formValidate.idCard" placeholder="请输入老人身份证号"></Input>
          </Form-item>
          <!--<Form-item label="老人图片" prop="oldPhoto">-->
            <!--<Input v-model="formValidate.oldPhoto" placeholder="请选择老人图片"></Input>-->
          <!--</Form-item>-->
          <Form-item label="紧急联系人" prop="oldEmContact">
            <Input v-model="formValidate.oldEmContact" placeholder="请输入老人紧急联系人"></Input>
          </Form-item>
          <Form-item label="紧急联系电话" prop="oldEmPhone">
            <Input v-model="formValidate.oldEmPhone" placeholder="请输入老人紧急联系电话"></Input>
          </Form-item>
          <Form-item label="入住社区" prop="oldCommunityId">
            <Input v-model="formValidate.oldCommunityId" placeholder="请输入老人入住社区"></Input>
          </Form-item>
          <Form-item label="备注" prop="remarks">
            <Input v-model="formValidate.remarks" placeholder="备注信息"></Input>
          </Form-item>
          <Form-item>
            <Button type="primary" @click="ok(formValidate)">提交</Button>
            <Button type="ghost" @click="handleReset('formValidate')" style="margin-left: 8px">重置</Button>
          </Form-item>
        </Form>
      </Card>
    </div>
  </div>
  </div>
</template>
<script>
  import axios from 'axios'
  import sysHead from '../../common/adminName'

  export default {
    components:{sysHead},
    props:[ 'ModalType','conData'],
    data(){
      return {
        fromData:this.conData,
        modal1:false,
        myModal:this.ModalType,//首先建立一个props的副本
        formValidate: {
          oldName: '',
          oldGender: '',
          oldPhone: '',
          oldAge:'',
          idCard:'',
          oldPhoto:'',
          oldEmContact:'',
          oldEmPhone:'',
          oldCommunityId:'',
          remarks:''
        },
        ruleValidate: {
          userName: [
            { required: true, message: '姓名不能为空', trigger: 'blur' }
          ],
          password: [
            { required: true, message: '用户密码不能为空', trigger: 'blur' },
          ],
          typeId: [
            { required: true, message: '请选择用户类型', trigger: 'change' }
          ]
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
        this.fromData = val;
        if(this.fromData){
          this.formValidate = this.fromData
        }
      }
    },
    computed:{
    },
    methods:{
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
      ok (data) {
        console.log(data)
        if(data.oldName&&data.oldGender&&data.oldPhone&&data.oldAge&&data.idCard&&data.oldEmContact&&data.oldEmPhone&&data.oldCommunityId){
          data.oldCommunityId = data.oldCommunityId-0;
//          if(this.fromData){
////              修改
//            const modifyUrl = this.HOST+'/oldMan/updateOldMan';
//            delete data.oldGenderName;
//            console.log(data);
//            axios.post(modifyUrl,data).then((json)=>{
//              if(json.data.success){
//                this.$Message.success('修改老人信息成功');
//                this.$router.go(0);
//              }else{
//                this.$router.go(0);
//                this.$Message.error('修改老人信息失败');
//              }
//            }).catch((error)=>{
//              this.$router.go(0);
//              this.$Message.error('修改失败');
//            })
//          }else{
            console.log(data)
            const addUrl = this.HOST+'/oldMan/insertOldMan';
            axios.post(addUrl,data).then((json)=>{
              if(json.data.success){
                this.$Message.success('新增老人信息成功');
                this.$router.go(0)
              }else{
                this.$Message.error('新增老人信息失败');
              }
            }).catch((error)=>{
              this.$Message.error('新增失败');
            })
//          }
        }else{
          this.$Message.warning('请将必填信息填写完整!');
        }
      },
      cancel () {
//        if(this.fromData){
//          this.$Message.info('取消修改老人信息');
//
//        }else{
          this.$Message.info('取消新增老人信息');

//        }
      },
    },
    computed:{
    }

  }
</script>
