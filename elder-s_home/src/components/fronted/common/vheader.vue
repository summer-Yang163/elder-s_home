<style scoped>
  .layout {
    /*border: 1px solid #d7dde4;*/
    background: #f5f7f9;
    margin-bottom: 5px;
  }

  .layout-logo {
    width: 100px;
    height: 30px;
    background: #5b6270;
    border-radius: 3px;
    float: left;
    position: relative;
    top: 15px;
    left: 20px;
    color: #ffab6a;
    line-height: 30px;
    text-align: center;
  }

  .layout-nav {
    width: 700px;
    margin: 0 auto;
  }
  .ivu-menu-dark {
    opacity: 0.7;
    /*background: #aaa799;*/
  }
/*.logButton{*/
  /*position:absolute; top:0; right:20px;*/
/*}*/
</style>
<template>
  <div class="layout">
    <Menu mode="horizontal" theme="dark" v-bind:active-name="headdata">
      <div class="layout-logo">时光驿站
      </div>
      <div class="layout-nav">
        <router-link to="/home">
          <Menu-item name="home">
            <Icon type="ios-navigate"></Icon>
            首页
          </Menu-item>
        </router-link>
        <router-link to="/community">
          <Menu-item name="community">
            <Icon type="ios-keypad"></Icon>
            社区展示
          </Menu-item>
        </router-link>
        <router-link to="/service">
          <Menu-item name="service">
            <Icon type="ios-analytics"></Icon>
            服务概览
          </Menu-item>
        </router-link>
        <router-link to="/news">
          <Menu-item name="news">
            <Icon type="ios-paper"></Icon>
            新闻公告
          </Menu-item>
        </router-link>
        <router-link to="/tips">
          <Menu-item name="tips">
            <Icon type="clipboard"></Icon>
            养老小贴士
          </Menu-item>
        </router-link>
        <router-link to="/homeCenter" v-if="userName">
          <!-- v-if -->
          <Menu-item name="homeCenter">
            <Icon type="ios-home"></Icon>
            家人中心
          </Menu-item>
        </router-link>
      </div>
     <div v-if="activeDis">
        <Menu-item name="login" style="float:right"  v-if="!userName">
          <router-link to="/login">注册登录</router-link>
      </Menu-item>
      <div v-else >
      <Menu-item name="user" style="float:right">
        <Button type="primary" shape="circle" @click="loginOut()">退出</Button>
      </Menu-item>
        <Menu-item name="user" style="float:right" >
          <Icon type="ios-people"></Icon>
          欢迎你：{{ userName}}
      </Menu-item>
      </div>
</div>
    </Menu>
  </div>
</template>
<script>
  import axios from 'axios' //引入axios
  import * as types from '../../../store/types'
  const localStorage = window.localStorage

  export default {
    data(){
      return {
          loginOutUrl:this.HOST+'/user/userLogOut'
      }
    },
    computed:{
      headdata:function(){
        const pathname = this.$route.path.split('/')
          return pathname[1]
      },
      activeDis:function(){
          return  this.$route.name != 'login'
      },
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
          //axios中直接使用function 会改变原先的this指向，所以要调用全局参数，尽量用箭头函数
//        axios.post(this.loginOutUrl).then(function(response){
//            console.log(that)
//          if(!response.data.success){
////            this.$store.commit(types.LOGOUT)
////            this.$Message.success('退出成功!')
////            this.$Notice.open({
////              title: '退出成功'
////            });
//            that.$router.push({path:'/login'})
//          }else{
////            this.$Message.error('退出失败!');
//            console.log('de2')
//
//          }
//        }).catch(function(error){
//            console.log(error)
////          this.$Message.error('退出失败!');
//        })
      }

    }
  }
</script>
<!--
遗留问题：权限相关
    登陆注册页：没有登录注册相关按钮；
    登陆用户权限不同时，显示的导航栏不同
-->
