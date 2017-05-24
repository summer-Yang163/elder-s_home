<style scoped>

</style>
<template>
  <Modal
    v-model="modal1=myModal"
    :title = "this.$props.conData === false? '新增社区服务人员' : '修改社区服务人员信息'"
    @on-ok="ok(formValidate)"
    @on-cancel="cancel" width="500"   :styles="{top: '20px'}">
    <Form ref="formValidate" :model="formValidate" :rules="ruleValidate" :label-width="80">
      <Form-item label="工号" prop="serviceJobNum">
        <Input v-model="formValidate.serviceJobNum" placeholder="请输入服务人员工号"></Input>
      </Form-item>
      <Form-item label="姓名" prop="serviceName">
        <Input v-model="formValidate.serviceName" placeholder="请输入真实姓名"></Input>
      </Form-item>
      <Form-item label="用户名" prop="userName">
        <Input v-model="formValidate.userName" placeholder="请输入登陆用户名"></Input>
      </Form-item>
      <Form-item label="密码" prop="password">
      <Input v-model="formValidate.password" placeholder="请输入登陆密码"></Input>
      </Form-item>
      <Form-item label="性别" prop="serviceGender">
        <Radio-group v-model="formValidate.serviceGender">
          <Radio label="1">男</Radio>
          <Radio label="2">女</Radio>
        </Radio-group>
      </Form-item>
      <Form-item label="电话" prop="servicePhone">
        <Input v-model="formValidate.servicePhone" placeholder="请输入服务人员电话"></Input>
      </Form-item>
      <Form-item label="年龄" prop="serviceAge">
        <Input v-model="formValidate.serviceAge" placeholder="请输入服务人员年龄"></Input>
      </Form-item>
      <Form-item label="服务社区" prop="communityId">
        <Input v-model="formValidate.communityId" placeholder="请输入服务社区"></Input>
      </Form-item>
      <Form-item label="工作年限" prop="serviceWorkTime">
        <Input v-model="formValidate.serviceWorkTime" placeholder="请输入工作年限"></Input>
      </Form-item>
      <Form-item label="工作职位" prop="serviceWorkPosition">
        <Input v-model="formValidate.serviceWorkPosition" placeholder="请输入工作职位"></Input>
      </Form-item>
    </Form>
  </Modal>
</template>
<script>
  export default {
    props:[ 'ModalType','conData'],
    data(){
      return {
//          title:this.$props.conData ? '修改用户管理' : '新增用户管理',
        modal1:false,
        myModal:this.ModalType,//首先建立一个props的副本
        fromData:this.conData,
        formValidate: {
          servicePersonId: '',
          serviceJobNum: '',
          serviceName: '',
          userName:'',
          password:'',
          serviceGender:'',
          servicePhone:'',
          serviceAge:'',
          communityId:'',
          serviceWorkTime:'',
          serviceWorkPosition:''
        },
        ruleValidate: {
          serviceJobNum: [
            { required: true, message: '服务人员工号不能为空', trigger: 'blur' }
          ],
          serviceName: [
            { required: true, message: '服务人员姓名不能为空', trigger: 'blur' },
          ],
          userName: [
            { required: true, message: '用户名不能为空', trigger: 'blur' },
          ],
          password: [
            { required: true, message: '密码不能为空', trigger: 'blur' }
          ],
          serviceGender: [
            { required: true, message: '服务人员性别不能为空', trigger: 'blur' },
          ],
          servicePhone: [
            { required: true, message: '用户电话不能为空', trigger: 'blur' },
          ],
          communityId: [
            { required: true, message: '服务社区不能为空', trigger: 'blur' }
          ]

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

        if(data.name&&data.password&&data.type){
//          this.$http.post(this.addUrl,data).then((json)=>{
////            console.log(json.data);
//            this.$Message.info('新增账号成功');
//          },(json)=>{
//            this.$Message.info('新增账号失败');
//          })
//        }else{
//          this.$Message.warning('请将账号信息填写完整!');
        }
      },
      cancel () {
        this.$Message.info('取消新增账号');
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
      }
    },
    computed:{
    }

  }
</script>
