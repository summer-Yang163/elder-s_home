<style scoped>
  .main {
    width: 80%;
    margin: 0 auto;
    margin-bottom: 70px;
  }
  .ivu-menu-dark {
    /*opacity: 0.7;*/
    background: #aaa799;
  }
  .newest{
    overflow: auto;
    margin-bottom: 10px;
  }
  .main_left{
    float:left;
    width:35%;
  }
  .main_right{
    float:left;
    width:65%;
    padding-left:10px;
  }
  .main .card{
    overflow: hidden;
    margin-top:10px;

  }
  .main .card img{
    display:block;
    float:left;
    width:100px;
    height:90px;
    border:none;
    margin-right:10px;
  }
  .main .card li{
    overflow: auto;
    margin-bottom:10px;
  }
  .main .card .text{
    color: #504a4e;
  }
  .classification{
    overflow: auto;
    margin-bottom: 10px;
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
  .card .page{
    float:right;
    padding: 10px 0;
  }
</style>
<template>
  <div>
    <!--<Vhead></Vhead>-->
    <div class="main ">
      <div class="newest">
        <div class="main_left">
          <carousel></carousel>
        </div>
        <div class="main_right" >
          <h2 style="color:orange;">社区新闻</h2>
          <Card  class="card" >
              <detailNewList></detailNewList>
              <Page class="page" :total="40" size="small" show-elevator show-sizer ></Page>
          </Card>
        </div>
      </div>
      <div class="classification">
        <h2 >活动通知</h2>
        <Card  class="card" >
          <ul v-for="(item,index) in  tipsList" :key="index">
            <li>
              <router-link :to="item.url" >
                <img :src="item.src" >
                <div class="content">
                  <h3>{{item.title}}</h3>
                  <p class="text"> {{item.introduction}}</p>
                  <p class="text">发布时间：{{item.time}}</p>
                </div>
              </router-link>
            </li>
          </ul>
          <Page  class="page" :total="40" size="small" show-elevator show-sizer></Page>
        </Card>
      </div>
    </div>
    <!--<VFooter></VFooter>-->
  </div>

</template>
<script>
  import Vhead from './common/vheader'
  import VFooter from './common/footer'
  import Carousel from './news/carousel'
  import src1 from '../../assets/news/2.jpg'
  import detailNewList from './news/detailNewList'
  export default {
    components: {Vhead,VFooter,Carousel,detailNewList,src1},
    data () {
      return {
        tipsList:[{
          title:'民众镇心苑社工站绿键活动',
          introduction:'为了关注老人的居家生活安全，4月27日，中山博爱行动义工爱心铃服务队受邀参加心苑社工站主办的“长者居家应急安全知识讲座”的活动，并给现场的老友记讲解了爱心铃的服务项目和使用技巧。',
          time:'2017年4月27日',
          src:src1,
          classify:'社区新闻',
          url:'/detailNews'
        },{
          title:'民众镇心苑社工站绿键活动',
          introduction:'为了关注老人的居家生活安全，4月27日，中山博爱行动义工爱心铃服务队受邀参加心苑社工站主办的“长者居家应急安全知识讲座”的活动，并给现场的老友记讲解了爱心铃的服务项目和使用技巧。',
          time:'2017年4月27日',
          src:src1,
          classify:'社区新闻',
          url:'/detailNews'
        },{
          title:'民众镇心苑社工站绿键活动',
          introduction:'为了关注老人的居家生活安全，4月27日，中山博爱行动义工爱心铃服务队受邀参加心苑社工站主办的“长者居家应急安全知识讲座”的活动，并给现场的老友记讲解了爱心铃的服务项目和使用技巧。',
          time:'2017年4月27日',
          src:src1,
          classify:'社区新闻',
          url:'/detailNews'
        },{
          title:'民众镇心苑社工站绿键活动',
          introduction:'为了关注老人的居家生活安全，4月27日，中山博爱行动义工爱心铃服务队受邀参加心苑社工站主办的“长者居家应急安全知识讲座”的活动，并给现场的老友记讲解了爱心铃的服务项目和使用技巧。',
          time:'2017年4月27日',
          src:src1,
          classify:'社区新闻',
          url:'/detailNews'
        },{
          title:'民众镇心苑社工站绿键活动',
          introduction:'为了关注老人的居家生活安全，4月27日，中山博爱行动义工爱心铃服务队受邀参加心苑社工站主办的“长者居家应急安全知识讲座”的活动，并给现场的老友记讲解了爱心铃的服务项目和使用技巧。',
          time:'2017年4月27日',
          src:src1,
          classify:'社区新闻',
          url:'/detailNews'
        },{
          title:'民众镇心苑社工站绿键活动',
          introduction:'为了关注老人的居家生活安全，4月27日，中山博爱行动义工爱心铃服务队受邀参加心苑社工站主办的“长者居家应急安全知识讲座”的活动，并给现场的老友记讲解了爱心铃的服务项目和使用技巧。',
          time:'2017年4月27日',
          src:src1,
          classify:'社区新闻',
          url:'/detailNews'
        },{
          title:'民众镇心苑社工站绿键活动',
          introduction:'为了关注老人的居家生活安全，4月27日，中山博爱行动义工爱心铃服务队受邀参加心苑社工站主办的“长者居家应急安全知识讲座”的活动，并给现场的老友记讲解了爱心铃的服务项目和使用技巧。',
          time:'2017年4月27日',
          src:src1,
          classify:'社区新闻',
          url:'/detailNews'
        },{
          title:'民众镇心苑社工站绿键活动',
          introduction:'为了关注老人的居家生活安全，4月27日，中山博爱行动义工爱心铃服务队受邀参加心苑社工站主办的“长者居家应急安全知识讲座”的活动，并给现场的老友记讲解了爱心铃的服务项目和使用技巧。',
          time:'2017年4月27日',
          src:src1,
          classify:'社区新闻',
          url:'/detailNews'
        },{
          title:'民众镇心苑社工站绿键活动',
          introduction:'为了关注老人的居家生活安全，4月27日，中山博爱行动义工爱心铃服务队受邀参加心苑社工站主办的“长者居家应急安全知识讲座”的活动，并给现场的老友记讲解了爱心铃的服务项目和使用技巧。',
          time:'2017年4月27日',
          src:src1,
          classify:'社区新闻',
          url:'/detailNews'
        },{
          title:'民众镇心苑社工站绿键活动',
          introduction:'为了关注老人的居家生活安全，4月27日，中山博爱行动义工爱心铃服务队受邀参加心苑社工站主办的“长者居家应急安全知识讲座”的活动，并给现场的老友记讲解了爱心铃的服务项目和使用技巧。',
          time:'2017年4月27日',
          src:src1,
          classify:'社区新闻',
          url:'/detailNews'
        }]
      }
    }
  }
</script>
