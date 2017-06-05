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
            <Page :total="100" class="page"></Page>
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
          <Page :total="100" class="page"></Page>
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
  import src3 from '../../assets/news/3.jpg'
  import src4 from '../../assets/news/4.jpg'
  import src5 from '../../assets/news/5.jpg'


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
          title:'板芙镇板尾村、民众镇浪网村端午游园绿键活动',
          introduction:'5月25日-5月26日，值此端午佳节之际，慈善爱心铃分别在板芙镇板尾村居委会门口与民众镇浪网村文化广场举办了“慈善爱心铃端午游园会”系列活动，并邀请了板芙扬帆社工站与民众镇心苑社工站提供欢乐益智小游戏以及中山市奥理得眼科医院免费提供眼科检查',
          time:'2017年5月28日',
          src:src3,
          classify:'社区通知',
          url:'/detailNews'
        },{
          title:'石岐区暖阳居家养老服务中心绿键活动',
          introduction:'4月25日，石岐暖阳居家养老服务中心的小广场热闹非凡，这是怎么回事呢？原来是慈善爱心铃联合暖阳中心开展“慈善爱心铃APP回馈日”活动，并邀请了爱尔眼科医院与艾逊造型公馆为现场的老友记分别提供免费验眼与义剪的暖心服务',
          time:'2017年4月26日',
          src:src4,
          classify:'社区新闻',
          url:'/detailNews'
        },{
          title:'东区居家养老服务中心绿键活动',
          introduction:'4月13日，踏着春风，中山博爱行动义工爱心铃服务队来到东区居家养老服务中心推广宣传慈善爱心铃与爱心铃APP，为符合条件的长者进行登记安装',
          time:'2017年4月15日',
          src:src5,
          classify:'社区新闻',
          url:'/detailNews'
        }
//        ,{
//          title:'民众镇心苑社工站绿键活动',
//          introduction:'为了关注老人的居家生活安全，4月27日，中山博爱行动义工爱心铃服务队受邀参加心苑社工站主办的“长者居家应急安全知识讲座”的活动，并给现场的老友记讲解了爱心铃的服务项目和使用技巧。',
//          time:'2017年4月27日',
//          src:src1,
//          classify:'社区新闻',
//          url:'/detailNews'
//        },{
//          title:'民众镇心苑社工站绿键活动',
//          introduction:'为了关注老人的居家生活安全，4月27日，中山博爱行动义工爱心铃服务队受邀参加心苑社工站主办的“长者居家应急安全知识讲座”的活动，并给现场的老友记讲解了爱心铃的服务项目和使用技巧。',
//          time:'2017年4月27日',
//          src:src1,
//          classify:'社区新闻',
//          url:'/detailNews'
//        },{
//          title:'民众镇心苑社工站绿键活动',
//          introduction:'为了关注老人的居家生活安全，4月27日，中山博爱行动义工爱心铃服务队受邀参加心苑社工站主办的“长者居家应急安全知识讲座”的活动，并给现场的老友记讲解了爱心铃的服务项目和使用技巧。',
//          time:'2017年4月27日',
//          src:src1,
//          classify:'社区新闻',
//          url:'/detailNews'
//        },{
//          title:'民众镇心苑社工站绿键活动',
//          introduction:'为了关注老人的居家生活安全，4月27日，中山博爱行动义工爱心铃服务队受邀参加心苑社工站主办的“长者居家应急安全知识讲座”的活动，并给现场的老友记讲解了爱心铃的服务项目和使用技巧。',
//          time:'2017年4月27日',
//          src:src1,
//          classify:'社区新闻',
//          url:'/detailNews'
//        },{
//          title:'民众镇心苑社工站绿键活动',
//          introduction:'为了关注老人的居家生活安全，4月27日，中山博爱行动义工爱心铃服务队受邀参加心苑社工站主办的“长者居家应急安全知识讲座”的活动，并给现场的老友记讲解了爱心铃的服务项目和使用技巧。',
//          time:'2017年4月27日',
//          src:src1,
//          classify:'社区新闻',
//          url:'/detailNews'
//        },{
//          title:'民众镇心苑社工站绿键活动',
//          introduction:'为了关注老人的居家生活安全，4月27日，中山博爱行动义工爱心铃服务队受邀参加心苑社工站主办的“长者居家应急安全知识讲座”的活动，并给现场的老友记讲解了爱心铃的服务项目和使用技巧。',
//          time:'2017年4月27日',
//          src:src1,
//          classify:'社区新闻',
//          url:'/detailNews'
//        }
 ]
      }
    }
  }
</script>
