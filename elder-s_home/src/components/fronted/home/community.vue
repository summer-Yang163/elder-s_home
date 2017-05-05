<style scoped>
  .footer{
    clear:both;
    margin:20px 0;
    width:100%;
    height:100px;
    text-align:center;
  }
  .footer p{
    margin-top:30px  ;
  }
</style>
<template>
  <div class="community_photo">
    <img src="../../../../assets/community/1.jpg" title="北苑家园" value="1" class="active">
  </div>
  <DetailCard></DetailCard>
  <div class="community_introduction" >
    <p >{{location}}</p>
    <p>{{locate}}</p>
  </div>
</template>
<script>
  import DetailCard from './common/home/detailCard'

  export default{
    components: {DetailCard},
    data(){
      return {
        location:'北苑家园位于荆州市沙市区江津路与红门路交汇处的东北角（大润发超市东侧），项目占地13.25公顷，紧邻荆州市商业繁华区，交通便利，周边学校、医院等公共服务设施齐备，且分布均匀，地理位置优越。 ',
        locate:'北苑家园定位高端，项目规划、设计、施工、后期的服务与管理等各个方面不断完善和学习先进的理念，项目一经推出即受到广大消费者的厚爱与追捧。'
      }
    }
  }
</script>
