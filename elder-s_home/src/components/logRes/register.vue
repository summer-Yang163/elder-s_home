<style>
.bregister{
width:150px;
}
</style>
<template>
    <Form ref="formValidate" :model="formValidate" :rules="ruleValidate" :label-width="80">
        <Form-item label="用户名" prop="name">
            <Input v-model="formValidate.name" placeholder="请输入用户名"></Input>
        </Form-item>
        <Form-item label="手机号" prop="phone">
            <Input v-model="formValidate.phone" placeholder="请输入手机号"></Input>
        </Form-item>
        <Form-item label="登陆密码" prop="password1">
            <Input type="password" v-model="formValidate.password1" placeholder="请输入登陆密码"></Input>
        </Form-item>
        <Form-item label="确认密码" prop="password2">
            <Input type="password" v-model="formValidate.password2" placeholder="请再次输入密码"></Input>
        </Form-item>
            <Button type="primary" @click="reHandleSubmit(formValidate)" class="bregister">注册</Button>
    </Form>
</template>
<script>
  import axios from 'axios' //引入axios

  export default {
        data () {
          const validateName = (rule, value, callback)=>{
            if(!value){
              callback(new Error('用户名不能为空'));
            }else{
              if(value.length>30){
                callback(new Error('用户名长度不得大于30个字符'));
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

            }
          };
            return {
                formValidate: {
                    name: '',
                    phone:'',
                    password1: '',
                    password2: ''
                },
                ruleValidate: {
                    name: [
                      {required: true,validator: validateName,  trigger: 'blur'}
                    ],
                    phone:[
                        { required: true, message: '手机号码不能为空', trigger: 'blur' }
                    ],
                    password1: [
                        { required: true, message: '登陆密码不能为空', trigger: 'blur' },
                      {type: 'string', min: 6, message: '密码长度不能小于6位', trigger: 'blur'},{type: 'string', max: 30, message: '密码长度不能大于30位', trigger: 'blur'}
                    ],
                    password2: [
                        { required: true, message: '请填写确认密码', trigger: 'blur' }
                    ]
                },
              resUrl:this.HOST+'/user/registerUser/'
            }
        },
        methods: {
          reHandleSubmit (data) {
            const regDataUrl = this.resUrl+data.name +'/'+ data.password1
              if(data.name&&data.phone&&data.password1&&data.password2){
                if(data.password2 ==data.password1 ){
                  axios.post(regDataUrl).then((json)=>{
                        if(json.data.success){
                          this.$Message.success('提交成功!');
                            this.$router.go(0);
                          }
                  },(json)=>{
                    this.$Message.error('表单验证失败!');
                  })
                }else{
                  this.$Message.warning('登陆密码与确认密码不一致!');
                }
              }else{
                this.$Message.warning('请将注册信息填写完整!');
              }
            },
            handleReset (name) {
                this.$refs[name].resetFields();
            }
        }
    }
</script>
