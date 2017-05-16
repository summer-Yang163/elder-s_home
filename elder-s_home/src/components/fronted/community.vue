<style scoped>
  .main {
    width: 80%;
    min-width:960px;
    margin: 0 auto;
  }
  .ivu-menu-dark {
    /*opacity: 0.7;*/
    background: #aaa799;
  }
  .today_recommended .head{
    font-size:16px;
  }
  .today_recommended .head span{
    color:orange;
  }
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
  <div>
    <div class="main  ">
      <div class="today_recommended">
        <div class="head">今日推荐：<span>{{today_recommended.title}}</span></div>
        <Carousel></Carousel>
      </div>
      <Cascader></Cascader>
   <VDetails></VDetails>
    </div>
  </div>

</template>
<script>
  import Carousel from './community/carousel'
  import Cascader from './community/cascader'
  import VDetails from './community/vdetails'

  export default {
    components: { Carousel,Cascader,VDetails},
    data () {
      return {
        today_recommended:{
            title:'北苑家园',
            src:{

            }
        }
      }
    }
  }
</script>
