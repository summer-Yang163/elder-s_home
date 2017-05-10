<style>html{width:100%;height:100%;} body{width:100%;height:100%;}#app{width:100%;height:100%;} </style>
<style scoped>

  .layout {
    border: 1px solid #d7dde4;
    background: #f5f7f9;
    position: relative;
    height:100%;
  }

  .layout-breadcrumb {
    padding: 10px 15px 0;
  }

  .layout-content {
    min-height: 200px;
    margin: 15px;
    overflow: hidden;
    background: #fff;
    border-radius: 4px;
  }

  .layout-content-main {
    padding: 10px;
  }

.layout-copy {
    text-align: center;
    padding: 10px 0 20px;
    color: #9ea7b4;
  }

  .layout-menu-left {
    background: #464c5b;
    height:100%;
  }
  .ivu-row-flex{
    height:100%;
  }
  .layout-header {
    height: 60px;
    background: #fff;
    box-shadow: 0 1px 1px rgba(0, 0, 0, .1);
  }

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
  <div class="layout">
    <Row type="flex">
      <i-col span="5" class="layout-menu-left" style="min-width:200px;">
        <Menu active-name="1-2" theme="dark" width="auto" :open-names="['1']" >
          <div class="layout-logo-left">
            时光驿站后台管理系统
            <!--时光驿站社区服务工作系统-->

          </div>
          <Submenu name="1">
            <template slot="title">
              <Icon type="ios-navigate"></Icon>
              用户管理
            </template>
            <Menu-item name="1-1">选项 1</Menu-item>
            <Menu-item name="1-2">选项 2</Menu-item>
            <Menu-item name="1-3">选项 3</Menu-item>
          </Submenu>
          <Submenu name="2">
            <template slot="title">
              <Icon type="ios-keypad"></Icon>
              社区管理

            </template>
            <Menu-item name="2-1">选项 1</Menu-item>
            <Menu-item name="2-2">选项 2</Menu-item>
          </Submenu>
          <Submenu name="3">
            <template slot="title">
              <Icon type="ios-analytics"></Icon>
              社区服务人员管理

            </template>
            <Menu-item name="3-1">选项 1</Menu-item>
            <Menu-item name="3-2">选项 2</Menu-item>
          </Submenu>
          <Submenu name="4">
            <template slot="title">
              <Icon type="ios-analytics"></Icon>
              新闻管理

            </template>
            <Menu-item name="4-1">选项 1</Menu-item>
            <Menu-item name="4-2">选项 2</Menu-item>
          </Submenu>
          <Submenu name="5">
            <template slot="title">
              <Icon type="ios-analytics"></Icon>
              养老贴士管理

            </template>
            <Menu-item name="5-1">选项 1</Menu-item>
            <Menu-item name="5-2">选项 2</Menu-item>
          </Submenu>
          <Submenu name="6">
            <template slot="title">
              <Icon type="ios-analytics"></Icon>
              服务项目管理

            </template>
            <Menu-item name="6-1">选项 1</Menu-item>
            <Menu-item name="6-2">选项 2</Menu-item>
          </Submenu>
        </Menu>
      </i-col>
      <i-col span="19">
        <div class="layout-header"></div>
        <div class="layout-breadcrumb">
          <Breadcrumb>
            <Breadcrumb-item href="#">后台管理</Breadcrumb-item>
            <Breadcrumb-item href="#">用户管理</Breadcrumb-item>
            <Breadcrumb-item>某应用</Breadcrumb-item>
          </Breadcrumb>
        </div>
        <div class="layout-content">
          <div class="layout-content-main">内容区域</div>
        </div>
        <div class="layout-copy">
          2011-2016 &copy; TalkingData

        </div>
      </i-col>
    </Row>
  </div>
</template>
<script>
  export default {}
</script>
