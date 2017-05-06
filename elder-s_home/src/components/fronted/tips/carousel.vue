<style scoped>
  .demo-carousel{
    position: relative;
    margin:5px 0  10px;
  }
  .demo-carousel img{
    display:block;
    width:100%;
    height:370px;
    margin:0 auto;
  }
  .demo-carousel .text{
    position: absolute;
    left:0;
    bottom: 0;
    line-height: 30px;
    width:100px;
    text-align: center;
    color:white;
    background-color: rgba(105, 105, 105, 0.56);
  }

</style>
<template>
  <Carousel    v-model="value2">
    <Carousel-item>
      <div class="demo-carousel">
        <img :src="imgSrc[0]">
      </div>
    </Carousel-item>
    <Carousel-item>
      <div class="demo-carousel">
        <img :src="imgSrc[1]">
      </div>
    </Carousel-item>
    <Carousel-item>
      <div class="demo-carousel">
        <img :src="imgSrc[2]">
      </div>
    </Carousel-item>
    <Carousel-item>
      <div class="demo-carousel">
        <img :src="imgSrc[3]">
      </div>
    </Carousel-item>
  </Carousel>
</template>
<script>
  import src1 from '../../../assets/tips/1.jpg'
  import src2 from '../../../assets/tips/1.jpg'
  import src3 from '../../../assets/tips/1.jpg'
  import src4 from '../../../assets/tips/1.jpg'

  export default {
    data () {
      return {
        value2: 0,
        imgSrc:[src1,src2,src3,src4]
      }
    }
  }
</script>
