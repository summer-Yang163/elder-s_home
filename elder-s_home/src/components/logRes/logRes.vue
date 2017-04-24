<style scoped>
body{
  background-image: url(../../assets/login-bg.png);
  background-size: 100 100;
  display:block;
  height:100%;
  width:100%;
}
.logRes{
  display:block;
  position:relative;
  left:900px;
  top:50px;
  width:370px;
}
#blogin Button{
   width:100px;
}
.logRes a{
  display:block;
  text-align:left;
  margin-bottom:20px;
}
  .input {
    margin-bottom:20px ;
  }
</style>
<template>
  <div>
  <Head></Head>
<div style="background:#eee;padding: 20px" class="logRes">
  <Modal v-model="modal1" title="请重置密码"
             @on-ok="ok" @on-cancel="cancel" width="350">
        <div class="input">
        <Input v-model="phone" icon="ios-information-outline"
               placeholder="请输入手机号" style="width: 300px"></Input>
          </div>
        <div class="input">
          <Input v-model="verification" placeholder="请输入验证码" style="width: 180px"></Input>
          <Button type="primary"@click="">点击获取验证码</Button>
        </div>
        <div>
          <Input v-model="password"icon="locked" placeholder="请输入密码" style="width: 300px"></Input>
        </div>
      </Modal>

       <Card :bordered="false" style="text-align:center">
           <Tabs value="name1">
           <Tab-pane label="登陆" name="name1" >
           <Login></Login>
             <Reset></Reset>
             <a type="primary" @click="modal1 = true">忘记密码？</a>
           </Tab-pane>
           <Tab-pane label="注册" name="name2">
           <Register></Register>
           </Tab-pane>
           </Tabs>
       </Card>
   </div>
  </div>
</template>
<script>
  import Head from '../fronted/common/head'
  import Login from './login'
  import Register from './register'

  export default {
       components: { Register,Login ,Head},
        data () {
          return {
            modal1: false
          }
        },
        methods:{
          ok () {
            this.$Message.info('重置密码成功');
          },
          cancel () {
            this.$Message.info('取消重置密码');
          },
          verifiCode(){

          }

        }
    }



</script>
