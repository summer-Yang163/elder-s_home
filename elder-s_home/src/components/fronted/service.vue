<style scoped>
  .main {
    width: 80%;
    margin: 0 auto 70px;
  }
  .ivu-menu-dark {
    /*opacity: 0.7;*/
    background: #aaa799;
  }

</style>
<template>
  <div class="main ">
  <router-view></router-view>
  </div>
</template>
<script>
  import Carousel from './service/carousel'
//  import Carousel from './service/carousel'

  //  import VFooter from './service/footer'
  export default {
    components: {Carousel},
    data () {
      return {
      }
    }
  }
</script>
