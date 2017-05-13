<style scoped>
  #login {
    margin-top: 40px;
  }

  #blogin Button {
    width: 100px;
  }

</style>
<template>
  <Form ref="formInline" :model="formInline" :rules="ruleInline" inline id="login">
    <Form-item prop="user">
      <Input type="text" v-model="formInline.user" placeholder="Username">
      <Icon type="ios-person-outline" slot="prepend"></Icon>
      </Input>
    </Form-item>
    <Form-item prop="password">
      <Input type="password" v-model="formInline.password" placeholder="Password">
      <Icon type="ios-locked-outline" slot="prepend"></Icon>
      </Input>
    </Form-item>
    <Form-item id='blogin'>
      <Button type="primary" @click="handleSubmit(formInline)">登录</Button>
    </Form-item>
  </Form>
</template>
<script>
  export default {
    data () {
      return {
        formInline: {
          user: '',
          password: ''
        },
        ruleInline: {
          user: [
            {required: true, message: '请填写用户名', trigger: 'blur'}
          ],
          password: [
            {required: true, message: '请填写密码', trigger: 'blur'},
            {type: 'string', min: 6, message: '密码长度不能小于6位', trigger: 'blur'}
          ]
        },
        loginUrl:'http://rapapi.org/mockjs/18342/login'
      }

    },
    methods: {
      handleSubmit(data) {
          console.log(data)
        if(data.user&&data.password){
          this.$http.post(this.loginUrl,data).then((response) =>{
            this.$Message.success('提交成功!');
            this.$router.push({path:'/Home'})
          },(response)=>{
            this.$Message.error('登陆失败!');
          });
        }else{
          this.$Message.warning('请将登陆信息填写完整!');
        }
      }
    }
  }

</script>
