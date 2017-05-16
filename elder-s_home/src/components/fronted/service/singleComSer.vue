<style scoped>
  .footer{
    clear:both;
    position:static;
    width:100%;
    height:60px;
    background-color: #b8bfc8;
    text-align:center;
    padding-top:8px;
    z-index:100;
  }
</style>
<template>
  <div >
    <Breadcrumb>
      <Breadcrumb-item href="/community">
        <Icon type="ios-home-outline"></Icon> 社区服务展示
        </Breadcrumb-item>
      <Breadcrumb-item href="/comDeatail" >
        <span style="color:orange"><Icon type="pound"></Icon> {{name}}详情</span>
      </Breadcrumb-item>
    </Breadcrumb>
    <h2>基本服务：</h2>
    <h2>特色服务：</h2>
  </div>
</template>
<script>


  export default {
    components: { },
    data () {
      return {
//          name:'北苑家园'
      }
    },
    computed:{
        name:function(){
            return this.$route.params.id
        }
    }
  }
</script>
