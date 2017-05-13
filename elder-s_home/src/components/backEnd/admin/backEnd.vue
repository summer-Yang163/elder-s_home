<style>html{width:100%;height:100%;} body{width:100%;height:100%;}#app{width:100%;height:100%;} </style>
<style scoped>
  .layout {
    border: 1px solid #d7dde4;
    background: #f5f7f9;
    position: relative;
    height:100%;
  }
  .ivu-row-flex{
    height:100%;
  }

  .layout-menu-left {
    background: #464c5b;
    height:100%;
  }



</style>
<template>
  <div class="layout">
    <Row type="flex">
      <i-col span="5" class="layout-menu-left" style="min-width:200px;">
       <Vhead :data ='headData'></Vhead>
      </i-col>
      <i-col span="19">
      <router-view></router-view>
      </i-col>
    </Row>
  </div>
</template>
<script>
    import Vhead from '../common/vhead'
    import AddDelTag from '../common/addDelTag'
  export default {
    components:{Vhead,AddDelTag},
    data(){
      return {
        menuBread:{
          first:'后台管理',
        second:'用户管理',
        third:'普通用户管理'
        }
      }
    },
    computed:{
      headData:function(){
        const path =  this.$route.name
        const openName =[path.split('/')[0]]
        const activeName =  path.split('/')[1]
        return {
          userAuthority:'1',
          menuName:activeName,
          openMenu:openName
        }

      },
//      menuBread:function(){
//          const path = this.$route.path
//          const first = path.split('/')[2]
//          const second = path.split('/')[2]
//          const third = path.split('/')[3]
//
////        first:'后台管理',
////        second:'用户管理',
////        third:'普通用户管理'
//      }

    }
//    props:[ 'userAuthority']
  }
</script>
