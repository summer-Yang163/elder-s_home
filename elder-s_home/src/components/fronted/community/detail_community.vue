<style scoped>
  .main {
    width: 80%;
    min-width:960px;
    margin: 0 auto 80px;
    position: relative;
    overflow: hidden;
  }
  .ivu-menu-dark {
    /*opacity: 0.7;*/
    background: #aaa799;
  }
  .main .main_left{
    float:left;
    width:60%;
    height:520px;
  }
  .main .main_left .bigSrc{
    display:block;
    width:100%;
    height:400px;
  }
  .main .main_left li{
    display:inline-block;
    width:18%;
    height:100px;
    margin:10px 1%;
  }
  .main .main_left img{
    display:block;
    width:100%;
    height:100%;
  }
  .main .main_left .text{
    position: relative;
    left:0;
    bottom: 30px;
    line-height: 30px;
    width:100px;
    text-align: center;
    color:white;
    background-color: rgba(105, 105, 105, 0.56);
  }
  .main .main_right{
    float:left;
    width:40%;
    padding-left:10px;
  }
  .main_right ul{
    width:100%;
  }
  .main_right  .card{
    overflow: hidden;
  }
  .main_right li{
    text-align: left;
    line-height:30px;
    margin-bottom: 5px;
  }
  .main_right li .li_left{
    display:inline-block;
    width:150px;
    font-weight: bold;
  }
  .main_right li .li_right{
    display:inline-block;
  }

</style>
<template>
  <div>
    <!--<Vhead></Vhead>-->
    <div class="main ">
     <BreadCrumb></BreadCrumb>
      <div class="main_left">
        <img :src="bigSrc" class="bigSrc"> <div  class="text">{{Text}} </div>
        <ul>
          <li @click="exchange(item,index)"  v-for="(item,index) in community.imgSrcs" :key="item.index">
            <img :src="item">
          </li>
        </ul>
      </div>
      <div class="main_right">
        <Card  class="card">
          <div style="text-align:center">
            <ul >
              <li><span class="li_left">社区名称：</span><span class="li_right" >{{community.name}}</span></li>
              <li><span class="li_left"> 社区地址：</span><span class="li_right"  >{{community.address}}</span></li>
              <li><span class="li_left">社区服务电话：</span><span class="li_right"  >{{community.phone}}</span></li>
              <li><span class="li_left">社区主负责人：</span><span  class="li_right" >{{community.employee}}</span></li>
              <li><span class="li_left">社区购房、租房电话：</span><span class="li_right"  >{{community.Reservation_phone}}</span></li>
              <li><span class="li_left">社区平均房价：</span><span class="li_right"  >{{community.House_price}}</span></li>
              <li><span class="li_left">社区租房价格：</span><span class="li_right"  >{{community.Rent_price}}</span></li>
              <li><span class="li_left">社区描述：</span><span class="li_right"  >{{community.introduction}}</span></li>
            </ul>
          </div>
        </Card>
      </div>
    </div>
    <!--<VFooter></VFooter>-->
  </div>

</template>
<script>
  import Vhead from '../common/vheader'
  import VFooter from '../common/footer'
  import BreadCrumb from '../common/breadCrumb'
  import src1 from '../../../assets/community/1.jpg'
  import src2 from '../../../assets/community/beiyuan1.jpg'
  import src3 from '../../../assets/community/beiyuan2.jpg'
  import src4 from '../../../assets/community/beiyuan3.jpg'
  import src5 from '../../../assets/community/beiyuan4.jpg'

  export default {
    components: {Vhead, BreadCrumb,VFooter},
    data () {
      return {
        bigSrc:src1,
        Text:'小区全景图',
        community:{
          imgSrcs:[src1,src2,src3,src4,src5],
          imgText:['小区全景图','小区住房一览','小区住房一览','小区路况图','小区户型图'],
          name:'北苑家园',
          address:'湖北省荆州市沙市区',
          phone:'0551--63831525',
          employee:'里斯',
          introduction:'北苑家园占地13.25公顷，紧邻荆州市商业繁华区，交通便利，周边学校、医院等公共服务设施齐备，且分布均匀，地理位置优越。北苑家园定位高端，项目规划、设计、施工、后期的服务与管理等各个方面不断完善和学习先进的理念，项目一经推出即受到广大消费者的厚爱与追捧。',
          Reservation_phone:'12222222222',
          House_price:'8000/m^2',
          Rent_price:'1400/间'
        }
        }
      },
    methods:{
      exchange:function(data,index){
          this.bigSrc = data;
          this.Text = this.community.imgText[index];
      }
    }
    }

</script>
