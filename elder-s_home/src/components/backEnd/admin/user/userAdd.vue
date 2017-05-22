<style scoped>

</style>
<template>
    <Modal
      v-model="modal1=myModal"
      :title=titleName()
      @on-ok="ok(formValidate)"
      @on-cancel="cancel" width="350"   :styles="{top: '20px'}">
      <Form ref="formValidate" :model="formValidate" :rules="ruleValidate" :label-width="80">
        <Form-item label="用户名" prop="name">
          <Input v-model="formValidate.name" placeholder="请输入用户名"></Input>
        </Form-item>
        <Form-item label="用户密码" prop="password">
          <Input v-model="formValidate.password" placeholder="请输入用户密码"></Input>
        </Form-item>
        <Form-item label="用户类型" prop="type">
          <Select v-model="formValidate.type" placeholder="请选择用户类型">
            <Option value="1">社区网站工作人员</Option>
            <Option value="2">超级管理员</Option>
            <Option value="3">普通用户</Option>
            <Option value="4">社区服务人员</Option>
          </Select>
        </Form-item>
      </Form>
    </Modal>
</template>
<script>
  export default {
    props:[ 'ModalType','conData'],
    data(){
        return {
//          title:'',
          modal1:false,
          myModal:this.ModalType,//首先建立一个props的副本
          formValidate: {
            name: '',
            password: '',
            type: ''
          },
          ruleValidate: {
            name: [
              { required: true, message: '姓名不能为空', trigger: 'blur' }
            ],
            password: [
              { required: true, message: '用户密码不能为空', trigger: 'blur' },
            ],
            type: [
              { required: true, message: '请选择用户类型', trigger: 'change' }
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
      }
    },
    computed:{
//      titleName:function(){
//          return '新增普通用户'
//        }
    },
    methods:{
      titleName(){
            if(this.conData){
                this.formValidate ={
                  name: '128',
                  password: '172373',
                  type: 2
                }
              console.log( this.formValidate)
                return '修改用户'
            }else{
              return '新增普通用户'
            }
      },
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
