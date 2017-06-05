<style>html{width:100%;height:100%;} body{width:100%;height:100%;}#app{width:100%;height:100%;} </style>
<style scoped>
  .layout-logo-left {
    width: 90%;
    height: 30px;
    background: #5b6270;
    border-radius: 3px;
    margin: 15px auto;
    color: #ffab6a;
    text-align: center;
    line-height: 30px;
  }
</style>
<template>
  <Menu :active-name='data.menuName' theme="dark" width="auto" :open-names=data.openMenu accordion @on-select="handleSelect">
    <div class="layout-logo-left">
      <span v-if=" data.userAuthority==1">
        时光驿站后台管理系统</span>
      <span v-else>时光驿站社区服务工作系统</span>
    </div>
    <div v-if="  data.userAuthority==1">
    <Submenu name="user">
      <template slot="title">
        <Icon type="ios-navigate"></Icon>
        用户管理
      </template>
      <Menu-item name="systemNum">系统账号管理</Menu-item>
      <Menu-item name="oldManage">社区老人管理</Menu-item>
      <Menu-item name="userManage">普通用户管理</Menu-item>
    </Submenu>
    <Submenu name="community">
      <template slot="title">
        <Icon type="ios-keypad"></Icon>
        社区管理
      </template>
      <Menu-item name="communityMan">社区基本情况</Menu-item>
    </Submenu>
    <Submenu name="serPerMan">
      <template slot="title">
        <Icon type="ios-analytics"></Icon>
        社区服务人员管理
      </template>
      <Menu-item name="serPerson">服务人员基本信息</Menu-item>
    </Submenu>
    <Submenu name="news">
      <template slot="title">
        <Icon type="ios-analytics"></Icon>
        新闻管理

      </template>
      <Menu-item name="newsList">已有新闻管理</Menu-item>
      <Menu-item name="addNews">新增新闻</Menu-item>
    </Submenu>
    <Submenu name="tips">
      <template slot="title">
        <Icon type="ios-analytics"></Icon>
        养老贴士管理

      </template>
      <Menu-item name="tipsList">已有养老贴士</Menu-item>
      <Menu-item name="addTips">新增养老贴士</Menu-item>
    </Submenu>
    <Submenu name="serProMan">
      <template slot="title">
        <Icon type="ios-analytics"></Icon>
        服务项目管理
      </template>
      <Menu-item name="basicPro">基本项目管理</Menu-item>
      <!--<Menu-item name="featurePro">特色项目管理</Menu-item>-->
      <Menu-item name="personOrder">服务订单管理</Menu-item>
      <Menu-item name="perTips">个性化提醒管理</Menu-item>
      <Menu-item name="serOrderEval">服务订单评价管理</Menu-item>
    </Submenu>
    </div>
    <div v-else>
      <Submenu name="handlePro" v-if="  data.userAuthority==3">
        <template slot="title">
          <Icon type="ios-navigate"></Icon>
          社区服务项目处理
        </template>
        <Menu-item name="processProj">服务项目处理进度</Menu-item>
        <Menu-item name="serviceOld">服务老人信息</Menu-item>
        <Menu-item name="personTips">个性化提醒</Menu-item>
        <Menu-item name="feedBack">服务评价查看</Menu-item>
      </Submenu>
      <Submenu name="addOld">
        <template slot="title">
          <Icon type="ios-navigate"></Icon>
          社区老人信息添加
        </template>
        <Menu-item name="inquireOl">已有老人信息</Menu-item>
        <Menu-item name="addOldDel">添加老人信息</Menu-item>
      </Submenu>
      <Submenu name="checkOldInf">
        <template slot="title">
          <Icon type="ios-navigate"></Icon>
          老人信息审核
        </template>
        <Menu-item name="checkList">已审核账号</Menu-item>
        <Menu-item name="accountCheck">待审核账号</Menu-item>
      </Submenu>
      <Submenu name="checkOrder">
        <template slot="title">
          <Icon type="ios-navigate"></Icon>
          服务订单审核
        </template>
        <Menu-item name="orderList">已审核订单</Menu-item>
        <Menu-item name="checkOrder">待审核订单</Menu-item>
      </Submenu>
      <Submenu name="addNews">
        <template slot="title">
          <Icon type="ios-navigate"></Icon>
          发布新闻
        </template>
        <Menu-item name="inquireNews">新闻列表查看</Menu-item>
        <Menu-item name="addNews">新增新闻</Menu-item>
      </Submenu>
      <Submenu name="addTips">
        <template slot="title">
          <Icon type="ios-navigate"></Icon>
          发布养老贴士
        </template>
        <Menu-item name="inquireTips">养老贴士查看</Menu-item>
        <Menu-item name="addTips">新增养老贴士</Menu-item>
      </Submenu>
      <Submenu name="addProject">
        <template slot="title">
          <Icon type="ios-navigate"></Icon>
          发布服务项目
        </template>
        <Menu-item name="inquirePro">服务项目查看</Menu-item>
        <Menu-item name="addProject">新增服务项目</Menu-item>
      </Submenu>
    </div>
  </Menu>

</template>
<script>
//  import Table from '../common/table'
  export default {
//    components:{Table}
    props:[ 'data'],
    data(){
      return {
      }
},
    watch:{
      BreadName:{

      }
    },
    methods:{
      handleSelect (name) {
        this.$router.push(name)
      }
    }
  }
</script>
