<style scoped>
  .main{
    min-height:100%;
  }
  .content{
    min-height:100vh;
    margin-bottom:-60px;
    overflow: auto;
  }
</style>
<template>
  <div class="main" >
    <div class="content">
    <Vhead></Vhead>
    <router-view ></router-view>
    </div>
    <VFooter></VFooter>
  </div>
</template>
<script>
  import Vhead from './fronted/common/vheader'
  import VFooter from './fronted/common/footer'
    export default {
      components:{Vhead,VFooter}
    }
</script>
