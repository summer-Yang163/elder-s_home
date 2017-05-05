<style  scoped>
  .main{
    width:80%;
    margin:0 auto;
  }
  .ivu-menu-dark {
    /*opacity: 0.7;*/
    background: #aaa799;
  }
</style>
<template>
  <div  >
    <Vhead></Vhead>
    <Carousel class="main"></Carousel>
    <
  </div>
</template>
<script>
  import Vhead from '../fronted/common/vheader'
  import Carousel from '../fronted/common/carousel'

  export default {
    components: { Vhead,Carousel},
    data () {
      return {

      }
    }
  }


</script>
