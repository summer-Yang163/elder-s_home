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
  .community_service {
    padding: 20px 0;
    overflow: auto;
  }
  .community_service .community {
    float: left;
    width: 50%;
    padding: 0 10px 0 10px;
  }
  .community_service .head{
    display:block;
    height:30px;
    width:100%;
  }
  .community_service .service {
    float: left;
    width: 50%;
    padding: 0 10px 0 10px;
  }

  .community_service .head_left {
    float: left;
    font-size: 16px;
  }

  .community_service .head_right {
    float: right;
    font-size: 16px;
  }
  .community_photo{
    float:left;
  }
  .community_photo img{
    display:none;
    /*display:block;*/
    width:300px;
    height:250px;
  }
  .community_photo img.active{
    display:block;
  }
  .community_introduction{
    clear:both;
    padding:10px 0;
    text-indent:2em;
  }
  .news_tips {
    padding: 20px 0;
    overflow: auto;
    margin-bottom:60px;
  }
  .news_tips .news {
    float: left;
    width: 50%;
    padding: 0 10px 0 10px;
  }
  .news_tips .head{
    display:block;
    height:30px;
    width:100%;
  }
  .news_tips .tips {
    float: left;
    width: 50%;
    padding: 0 10px 0 10px;
  }

  .news_tips .head_left {
    float: left;
    font-size: 16px;
  }
  .news_tips .head_right {
    float: right;
    font-size: 16px;
  }
</style>
<template>
  <div>
    <!--<Vhead></Vhead>-->
    <Carousel class="main"></Carousel>
    <div class="main community_service">
      <div class="community">
        <div class="head">
          <div class="head_left">今日推荐社区:<span style="color:orange"> {{community.name}}</span></div>
          <router-link class="head_right" to="/community">更多>></router-link>
        </div>
        <div class="container">
          <div class="community_photo">
            <img src="../../assets/community/1.jpg" title="北苑家园" value="1" class="active">
          </div>
          <DetailCard></DetailCard>
          <div class="community_introduction" >
            <p >{{community.location}}</p>
            <p>{{community.locate}}</p>
          </div>
        </div>
      </div>
      <div class="service">
        <div class="head">
          <div class="head_left">养老服务基本类型简介</div>
          <router-link class="head_right" to="/service">详情>></router-link>
        </div>
        <div class="container">
         <Service></Service>
        </div>
      </div>
    </div>
    <div class="main news_tips">
      <div class="news">
        <div class="head">
          <div class="head_left">最新通知</div>
          <router-link class="head_right" to="/news">更多>></router-link>
        </div>
        <div class="container">
          <News></News>
        </div>
      </div>
      <div class="tips">
        <div class="head">
          <div class="head_left">养老小贴士</div>
          <router-link class="head_right" to="/tips">更多>></router-link>
        </div>
        <div class="container">
          <Tips></Tips>
        </div>
      </div>
    </div>
    <!--<VFooter></VFooter>-->
  </div>

</template>
<script>
  import Vhead from './common/vheader'
  import Carousel from './home/carousel'
  import DetailCard from './home/detailCard'
  import VFooter from './common/footer'
  import Service from './home/sservice'
  import News from './home/snews'
  import Tips from './home/stips'

  export default {
    components: {Vhead, Carousel,DetailCard,VFooter,Service,News,Tips},
    data () {
      return {
          community:{
              name:'北苑家园',
            location:'北苑家园位于荆州市沙市区江津路与红门路交汇处的东北角（大润发超市东侧），项目占地13.25公顷，紧邻荆州市商业繁华区，交通便利，周边学校、医院等公共服务设施齐备，且分布均匀，地理位置优越。 ',
            locate:'北苑家园定位高端，项目规划、设计、施工、后期的服务与管理等各个方面不断完善和学习先进的理念，项目一经推出即受到广大消费者的厚爱与追捧。'
          }
      }
    }
  }
</script>
