<style scoped>
body{
  background-image: url(../assets/login-bg.png);
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
</style>
<template>
<div style="background:#eee;padding: 20px" class="logRes">
       <Card :bordered="false" style="text-align:center">
           <Tabs value="name1">
           <Tab-pane label="登陆" name="name1" >
           <Login></Login>
           </Tab-pane>
           <Tab-pane label="注册" name="name2">
           <Register></Register>
           </Tab-pane>
           </Tabs>
       </Card>
   </div>

</template>
<script>
  import Login from './login'
  import Register from './register'
  export default {
       components: { Register,Login }
    }



</script>
