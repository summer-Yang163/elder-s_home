<style>html {
  width: 100%;
  height: 100%;
}

body {
  width: 100%;
  height: 100%;
}

#app {
  width: 100%;
  height: 100%;
} </style>
<style scoped>
  .layout {
    border: 1px solid #d7dde4;
    background: #f5f7f9;
    position: relative;
    height: 100%;
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

  .layout-breadcrumb .addDelete {
    /*border-top:1px solid #c1c3c5;*/
    float: right;
    /*padding:10px;*/
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
    height: 100%;
  }

  .ivu-row-flex {
    height: 100%;
  }

  .layout-header {
    height: 60px;
    background: #fff;
    box-shadow: 0 1px 1px rgba(0, 0, 0, .1);
  }
</style>
<template>
  <div class="layout">
    <Row type="flex">
      <i-col span="5" class="layout-menu-left" style="min-width:200px;">
        <Vhead :data ='headData'></Vhead>
      </i-col>
      <i-col span="19">
        <div class="layout-header">
        </div>
        <router-view></router-view>
        <div class="layout-copy">
          2017-05 &copy; TalkingData

        </div>
      </i-col>
    </Row>
  </div>
</template>
<script>
  import Vhead from '../common/vhead'
  import AddDelTag from '../common/addDelTag'
  export default {
    components: {Vhead, AddDelTag},
    data(){
      return {
          headData:{
            userAuthority:'3',
            menuName:'1-1'
          }
      }
    },
    props: {
      user: 2
    }
  }
</script>

