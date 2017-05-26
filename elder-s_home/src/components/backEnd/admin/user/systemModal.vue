<style scoped>

</style>
<template>
    <Modal
      v-model="modal1=myModal"
      :title="this.$props.conData === false? '新增系统账号' : '修改系统账号'"
      @on-ok="ok(formValidate)"
      @on-cancel="cancel" width="350"   :styles="{top: '20px'}">
      <Form ref="formValidate" :model="formValidate" :rules="ruleValidate" :label-width="80">
        <Form-item label="用户名" prop="userName">
          <Input v-model="formValidate.userName" placeholder="请输入用户名"></Input>
        </Form-item>
        <Form-item label="用户密码" prop="password">
          <Input v-model="formValidate.password" placeholder="请输入用户密码"></Input>
        </Form-item>
        <Form-item label="用户类型" prop="typeId">
          <Select v-model="formValidate.typeId" placeholder="请选择用户类型">
            <Option value="1">普通用户</Option>
            <Option value="2">社区服务人员</Option>
            <Option value="3">普通管理员</Option>
            <Option value="4">超级管理员</Option>
          </Select>
        </Form-item>
      </Form>
    </Modal>
</template>
<script>
  import axios from 'axios'

  export default {
    props:[ 'ModalType','conData'],
    data(){
      const validateName = (rule, value, callback)=>{
        if(!value){
          callback(new Error('用户名不能为空'));
        }else{
          const valiNameUrl = this.HOST+'/user/validateUserName/'+value;
          axios.post(valiNameUrl).then((response) =>{
            if(!response.data.success){
              callback(new Error('用户名已存在'));
            }else{
              callback();
            }
          },(response)=>{
            callback(new Error('用户名已存在'));
          }).catch(function(error){
            callback(new Error('用户名已存在'));
          });
        }
      };
        return {
          fromData:this.conData,
          modal1:false,
          myModal:this.ModalType,//首先建立一个props的副本
          formValidate: {
            userName: '',
            password: '',
            typeId: ''
          },
          ruleValidate: {
            userName: [
              { required: true, validator: validateName, trigger: 'blur' }
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
      ok (data) {
        if(data.userName&&data.password&&data.typeId){
          data.typeId = data.typeId-0;
          if(this.fromData){
//              修改
            const modifyUrl = this.HOST+'/user/updateUserPower';
            delete data.userName;
            console.log(data);
            axios.post(modifyUrl,data).then((json)=>{
              if(json.data.success){
                this.$Message.success('修改账号成功');
                data.typeName = data.userUserType.typeName
                this.$router.go(0);
              }else{
                this.$router.go(0);
                this.$Message.error('修改账号失败');
              }
            }).catch((error)=>{
              this.$router.go(0);
              this.$Message.error('修改失败');
            })
          }else{
            const addUrl = this.HOST+'/user/insertUser';

            axios.post(addUrl,data).then((json)=>{
              if(json.data.success){
                this.$Message.success('新增账号成功');
                this.$router.go(0)
              }else{
                this.$Message.error('新增账号失败');
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
        this.$Message.info('取消新增账号');
      }
    },
    computed:{
    }

  }
</script>
