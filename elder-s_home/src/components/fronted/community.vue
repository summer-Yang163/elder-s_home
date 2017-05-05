<style scoped>
  .main {
    width: 80%;
    margin: 0 auto;
  }

  .ivu-menu-dark {
    /*opacity: 0.7;*/
    background: #aaa799;
  }


</style>
<template>
  <div>
    <Vhead></Vhead>
    <div class="main ">

    </div>
    <VFooter></VFooter>
  </div>

</template>
<script>
  import Vhead from './common/vheader'
  import Carousel from './common/carousel'
  import VFooter from './common/footer'

  export default {
    components: {Vhead, Carousel,VFooter},
    data () {
      return {

      }
    }
  }
</script>
