<style scoped>
  .demo-carousel img{
    display:block;
    width:100%;
    height:370px;
    margin:0 auto;
  }
</style>
<template>
  <Carousel autoplay   v-model="value2">
    <Carousel-item>
      <div class="demo-carousel"><img src="../../../assets/home/home5.jpg"></div>
    </Carousel-item>
    <Carousel-item>
      <div class="demo-carousel"><img src="../../../assets/home/home8.jpg"></div>
    </Carousel-item>
    <Carousel-item>
      <div class="demo-carousel"><img src="../../../assets/home/home6.jpg"></div>
    </Carousel-item>
    <Carousel-item>
      <div class="demo-carousel"><img src="../../../assets/home/service7.jpg"></div>
    </Carousel-item>
  </Carousel>
</template>
<script>
  export default {
    data () {
      return {
        value2: 0
      }
    }
  }
</script>
