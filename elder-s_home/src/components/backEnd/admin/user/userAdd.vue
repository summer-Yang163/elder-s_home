<style scoped>

</style>
<template>
    <Modal
      v-model="modal1=myModal"
      :title = "this.$props.conData === false? '新增社区信息' : '修改社区信息'"
      @on-ok="ok(formValidate)"
      @on-cancel="cancel" width="500"   :styles="{top: '20px'}">
      <Form ref="formValidate" :model="formValidate" :rules="ruleValidate" :label-width="80">
        <Form-item label="用户名" prop="userName">
          <Input v-model="formValidate.userName" placeholder="请输入用户名"></Input>
        </Form-item>
        <Form-item label="登陆密码" prop="password">
          <Input v-model="formValidate.password" placeholder="请输入登陆密码"></Input>
        </Form-item>
        <Form-item label="真实姓名" prop="trueName">
          <Input v-model="formValidate.trueName" placeholder="请输入真实姓名"></Input>
        </Form-item>
        <Form-item label="性别" prop="userGender">
          <Radio-group v-model="formValidate.userGender">
            <Radio label="1">男</Radio>
            <Radio label="2">女</Radio>
          </Radio-group>
        </Form-item>
        <!--<Form-item label="性别" prop="userGender">-->
          <!--<Input v-model="formValidate.userGender" placeholder="请输入用户性别"></Input>-->
        <!--</Form-item>-->
        <Form-item label="电话" prop="userPhone">
          <Input v-model="formValidate.userPhone" placeholder="请输入用户电话"></Input>
        </Form-item>
        <Form-item label="年龄" prop="userAge">
          <Input v-model="formValidate.userAge" placeholder="请输入用户年龄"></Input>
        </Form-item>
        <Form-item label="邮箱" prop="userEmail">
          <Input v-model="formValidate.userEmail" placeholder="请输入用户邮箱"></Input>
        </Form-item>
        <Form-item label="地址" prop="userAddress">
          <Input v-model="formValidate.userAddress" placeholder="请输入用户地址"></Input>
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
//          title:this.$props.conData ? '修改用户管理' : '新增用户管理',
          modal1:false,
          myModal:this.ModalType,//首先建立一个props的副本
          fromData:this.conData,
          formValidate: {
            userName: '',
            password: '',
            trueName: '',
            userGender:'',
            userPhone:'',
            userAge:'',
            userEmail:'',
            userAddress:''
          },
          ruleValidate: {
            userName: [
              { required: true, message: '姓名不能为空', trigger: 'blur' }
            ],
            password: [
              { required: true, message: '用户密码不能为空', trigger: 'blur' },
            ]
// ,
//            trueName: [
//              { required: true, message: '请选择用户类型', trigger: 'change' }
//            ]
          },
          addUrl:'/api/'
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
//          请将必填信息填写完整
        if(data.userName&&data.password){
          if(this.fromData){
//              修改
            const modifyUrl = this.HOST
            axios.post(modifyUrl,data).then((json)=>{
              this.$Message.success('修改账号成功');
            },(json)=>{
              this.$Message.error('修改账号失败');

            }).catch((error)=>{
              this.$Message.error('修改账号失败');
//        next(false)
            })
          }
        }
//          this.$http.post(this.addUrl,data).then((json)=>{
////            console.log(json.data);
//            this.$Message.info('新增账号成功');
//          },(json)=>{
//            this.$Message.info('新增账号失败');
//          })
//        }else{
//          this.$Message.warning('请将账号信息填写完整!');

      },
      cancel () {
          if(this.fromData){
            this.$Message.info('取消修改信息');
          }else{
            this.$Message.info('取消新增账号');
          }
      }
    },
    computed:{
    }

  }
</script>
