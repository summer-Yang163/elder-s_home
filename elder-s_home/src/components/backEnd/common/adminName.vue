<style scoped>
  .layout-header {
    height: 60px;
    background: #fff;
    box-shadow: 0 1px 1px rgba(0, 0, 0, .1);
    overflow: auto;
  }
  .layout{
    width:80px;
    line-height:60px;
    float:right
  }
  .adminNa{
    min-width:100px;
    padding-right:20px;
    line-height:60px;
    float:right;
    font-size:15px;
  }

</style>
<template>
  <div class="layout-header" >

    <div  class="layout">
      <Button type="primary" shape="circle" @click="loginOut()">退出</Button>
    </div>

    <div class="adminNa">
      <Icon type="ios-people"></Icon>
      欢迎你：{{ userName}}
      </div>

  </div>
</template>
<script>
  import * as types from '../../../store/types'
  import axios from 'axios' //引入axios
  const localStorage = window.localStorage
  export default {
    data(){
      return {
        loginOutUrl:this.HOST+'/user/userLogOut'
      }
    },
    computed:{
      userName:function(){
        return localStorage.token
      }
    },
    methods:{
      loginOut(){
        axios.post(this.loginOutUrl)
          .then((response) =>{
            if(!response.data.success){
              this.$store.commit(types.LOGOUT)
              this.$Message.success('退出成功!')
              this.$router.push({path:'/login'})
            }else{
              this.$Message.error('退出失败!');
            }
          })
          .catch((error) =>{
            this.$Message.error('退出失败!');
          });
      }

    }
  }
</script>
