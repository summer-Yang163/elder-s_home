<style scoped>
  .layout{
    /*border: 1px solid #d7dde4;*/
    background: #f5f7f9;
  }
  .layout-logo{
    width: 100px;
    height: 30px;
    background: #5b6270;
    border-radius: 3px;
    float: left;
    position: relative;
    top: 15px;
    left: 20px;
  }
  .layout-nav{
    width: 700px;
    margin: 0 auto;
  }
  .ivu-menu-dark{
    opacity:0.7;
    /*background: #aaa799;*/
  }

</style>
<template>
  <div class="layout">
    <Menu mode="horizontal" theme="dark" active-name="1">
      <div class="layout-logo">

      </div>
      <div class="layout-nav">
        <Menu-item name = "5">
          <Icon type="ios-navigate"></Icon>
          首页
      </Menu-item>
        <Menu-item name="1">
          <Icon type="ios-keypad"></Icon>
          社区展示
      </Menu-item>
        <Menu-item name="2">
          <Icon type="ios-analytics"></Icon>
          服务概览
      </Menu-item>
        <Menu-item name="3">
          <Icon type="ios-paper"></Icon>
          新闻公告
      </Menu-item>
        <Menu-item name="4">
          <Icon type="ios-paper"></Icon>
          养老小贴士
      </Menu-item>

      </div>
    </Menu>
  </div>
</template>
<script>
  export default {

  }
</script>
