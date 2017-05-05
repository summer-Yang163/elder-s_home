<style scoped>
  .demo-carousel img{
    display:block;
    width:100%;
    height:370px;
    margin:0 auto;
  }
</style>
<template>
  <Carousel autoplay  autoplaySpeed="3000" v-model="value1">
    <Carousel-item>
      <div class="demo-carousel"><img src="../../../assets/home11.jpg"></div>
    </Carousel-item>
    <Carousel-item>
      <div class="demo-carousel"><img src="../../../assets/home12.jpg"></div>
    </Carousel-item>
    <Carousel-item>
      <div class="demo-carousel"><img src="../../../assets/home13.jpg"></div>
    </Carousel-item>
    <Carousel-item>
      <div class="demo-carousel"><img src="../../../assets/home14.jpg"></div>
    </Carousel-item>
  </Carousel>
</template>
<script>
  export default {
    data () {
      return {
        value1: 0
      }
    }
  }
</script>
