<style scoped>
</style>
<template>
  <div class="content">
    <Vhead></Vhead>
    <router-view ></router-view>
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
