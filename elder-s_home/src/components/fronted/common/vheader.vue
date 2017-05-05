<style scoped>
  .layout {
    /*border: 1px solid #d7dde4;*/
    background: #f5f7f9;
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
.logButton{
  position:absolute; top:0; right:20px;
}
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
        <router-link to="/home">
          <Menu-item name="2">
            <Icon type="ios-keypad"></Icon>
            社区展示
          </Menu-item>
        </router-link>
        <router-link to="/home">
          <Menu-item name="3">
            <Icon type="ios-analytics"></Icon>
            服务概览
          </Menu-item>
        </router-link>
        <router-link to="/home">
          <Menu-item name="4">
            <Icon type="ios-paper"></Icon>
            新闻公告
          </Menu-item>
        </router-link>
        <router-link to="/home">
          <Menu-item name="5">
            <Icon type="ios-paper"></Icon>
            养老小贴士
          </Menu-item>
        </router-link>
      </div>
      <div class="layout-ceiling logButton">
        <div class="layout-ceiling-main">
          <a href="#">注册登录</a>
        </div>

      </div>
    </Menu>

  </div>
</template>
<script>
  import Vue from 'vue'
  import Router from 'vue-router'
  export default {
    data(){
      return {
      }
    },
    computed:{
      headdata:function(){
          return this.$route.name
      }
    },
    methods:{

    }
  }
</script>
<!--
遗留问题：权限相关
    登陆注册页：没有登录注册相关按钮；
    登陆用户权限不同时，显示的导航栏不同
-->
