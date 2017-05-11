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
            <Button type="primary" @click="handleSubmit(formValidate)" class="bregister">注册</Button>
    </Form>
</template>
<script>
    export default {
        data () {
            return {
                formValidate: {
                    name: '',
                    phone:'',
                    password1: '',
                    password2: ''

                },
                ruleValidate: {
                    name: [
                        { required: true, message: '用户名不能为空', trigger: 'blur' }
                    ],
                    phone:[
                        { required: true, message: '手机号码不能为空', trigger: 'blur' }
                    ],
                    password1: [
                        { required: true, message: '登陆密码不能为空', trigger: 'blur' }
                    ],
                    password2: [
                        { required: true, message: '请填写确认密码', trigger: 'blur' }
                    ]
                },
              resUrl:'http://rapapi.org/mockjs/18342/register'
            }
        },
        methods: {
            handleSubmit (data) {
                console.log(data)
                if(data.name){
                    console.log(data);
                    if(data.password2 ==data.password1 ){
                      this.$http.post(this.resUrl,name).then((json)=>{
                        console.log(json.data);
                        this.$Message.success('提交成功!');
      //                if(json.data){
      //                  this.$router.go(0);
      //                }
                      },(json)=>{
                        this.$Message.error('表单验证失败!');
                      })
                    }
                }

//              console.log(this.$refs[name].validate);
//                this.$refs[name].validate((valid) => {
//                    if (valid) {
//                        this.$Message.success('提交成功!');
//                    } else {
//                        this.$Message.error('表单验证失败!');
//                    }
//                })
            },
            handleReset (name) {
                this.$refs[name].resetFields();
            }
        }
    }
</script>
