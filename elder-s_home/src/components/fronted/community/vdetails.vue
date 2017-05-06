<style scoped>
  .main {
    width: 80%;
    margin: 0 auto;
  }
  .ivu-menu-dark {
    /*opacity: 0.7;*/
    background: #aaa799;
  }
  .details{
  }
  .details .head{
    font-size:16px;
  }
  .details .head span{
    color:orange;
  }
  .details .content{
    height:300px;
    width:100%;
    margin:10px;
    overflow: auto;
  }
  .details .content_left{
    float:left;
    width:60%;

  }
  .details .content_left p{
    margin:10px 0;
    line-height:25px;
  }
  .details .content_left p span{
    font-size:16px;
    color:orange;
  }
  .details .content_right{
    float:left;
    width:40%;
    height:300px;
  }
  .details .content_right img{
    display:block;
    width:100%;
    height:100%;
  }
</style>
<template>
  <div>
  <div class="details" v-for="item in communText" :key="item.id">
    <div class="head">现有社区：<span><router-link :to="item.url">{{item.name}}</router-link></span></div>
    <div class="content">
      <div class="content_left">
        <p><span>地址：</span>{{item.address}}</p>
        <p><span>简介：</span>{{item.introduction}}</p>
        <p class="service"><router-link :to="item.serviceUrl"><span>相关服务:</span></router-link></p>
      </div>
      <div class="content_right">
        <img :src="item.src">
      </div>
    </div>
  </div>
  </div>
</template>
<script>
  import src1 from '../../../assets/community/1.jpg'
  import src2 from '../../../assets/community/2.jpg'
  import src3 from '../../../assets/community/3.jpg'
  import src4 from '../../../assets/community/4.jpg'
  import src5 from '../../../assets/community/5.jpg'
  import src6 from '../../../assets/community/6.jpg'
  import src7 from '../../../assets/community/7.jpg'
  export default {
    data () {
      return {
        communText:[{
            name:'北苑家园',
            address:'湖北省荆州市沙市区江津路与红门路交汇处的东北角',
            introduction:'北苑家园占地13.25公顷，紧邻荆州市商业繁华区，交通便利，周边学校、医院等公共服务设施齐备，且分布均匀，地理位置优越。北苑家园定位高端，项目规划、设计、施工、后期的服务与管理等各个方面不断完善和学习先进的理念，项目一经推出即受到广大消费者的厚爱与追捧。',
            src:src1,
            url:'/comDeatail',
          serviceUrl:'/service'
        },{
          name:'百旺家苑',
          address:'安徽省合肥市蜀山区',
          introduction:'百旺家苑占地13.25公顷，交通便利，周边学校、医院等公共服务设施齐备，且分布均匀，地理位置优越。定位高端，项目规划、设计、施工、后期的服务与管理等各个方面不断完善和学习先进的理念，项目一经推出即受到广大消费者的厚爱与追捧。',
          src:src2,
          url:'/comDeatail',
          serviceUrl:'/service'
        },{
          name:'万和世家',
          address:'北京市朝阳区',
          introduction:'万和世家占地13.25公顷，交通便利，周边学校、医院等公共服务设施齐备，且分布均匀，地理位置优越。定位高端，项目规划、设计、施工、后期的服务与管理等各个方面不断完善和学习先进的理念，项目一经推出即受到广大消费者的厚爱与追捧。',
          src:src3,
          url:'/comDeatail',
          serviceUrl:'/service'
        },{
          name:'嘉禾人家',
          address:'浙江省杭州市滨江区',
          introduction:'嘉禾人家占地13.25公顷，交通便利，周边学校、医院等公共服务设施齐备，且分布均匀，地理位置优越。定位高端，项目规划、设计、施工、后期的服务与管理等各个方面不断完善和学习先进的理念，项目一经推出即受到广大消费者的厚爱与追捧。',
          src:src4,
          url:'/comDeatail',
          serviceUrl:'/service'
        },{
          name:'天伦锦城',
          address:'安徽省六安市金安区',
          introduction:'天伦锦城占地13.25公顷，紧邻六安市商业繁华区，交通便利，周边学校、医院等公共服务设施齐备，且分布均匀，地理位置优越。定位高端，项目规划、设计、施工、后期的服务与管理等各个方面不断完善和学习先进的理念，项目一经推出即受到广大消费者的厚爱与追捧。',
          src:src5,
          url:'/comDeatail',
          serviceUrl:'/service'
        },{
          name:'天和人家',
          address:'江苏省南京市江宁区',
          introduction:'天和人家紧邻南京市商业繁华区，交通便利，周边学校、医院等公共服务设施齐备，且分布均匀，地理位置优越。定位高端，项目规划、设计、施工、后期的服务与管理等各个方面不断完善和学习先进的理念，项目一经推出即受到广大消费者的厚爱与追捧。',
          src:src6,
          url:'/comDeatail',
          serviceUrl:'/service'
        },{
          name:'万源公园世家',
          address:'安徽省合肥市包河区',
          introduction:'万源公园世家占地13.25公顷，交通便利，周边学校、医院等公共服务设施齐备，且分布均匀，地理位置优越。定位高端，项目规划、设计、施工、后期的服务与管理等各个方面不断完善和学习先进的理念，项目一经推出即受到广大消费者的厚爱与追捧。',
          src:src7,
          url:'/comDeatail',
          serviceUrl:'/service'
        }]
      }
    }
  }
</script>
