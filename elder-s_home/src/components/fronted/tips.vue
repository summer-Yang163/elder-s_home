<style scoped>
  .main {
    width: 80%;
    margin: 0 auto;
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
</style>
<template>
  <div>
    <Vhead></Vhead>
    <div class="main ">
      <div class="newest">
        <div class="main_left">
          <carousel></carousel>
        </div>
        <div class="main_right" >
          <h2 style="color:orange;">最新更新</h2>
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
          </Card>
        </div>
      </div>
      <div class="classification">
        <h2 >老年饮食</h2>
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
        </Card>
      </div>
      <div class="classification">
        <h2 >老年疾病</h2>
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
        </Card>
      </div>
      <div class="classification">
        <h2 >老年心理</h2>
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
        </Card>
      </div>
    </div>
    <VFooter></VFooter>
  </div>

</template>
<script>
  import Vhead from './common/vheader'
  import VFooter from './common/footer'
  import Carousel from './tips/carousel'
  import src1 from '../../assets/tips/1.jpg'
  export default {
    components: {Vhead,VFooter,Carousel},
    data () {
      return {
        tipsList:[{
            title:'高血压与高盐饮食丨高血压患者的饮食需要特别注意的几点！',
            introduction:'食盐，又称餐桌盐是对人类生存最重要的物质之一，也是生活的必需品。盐对于人体来说，非常重要。食盐中的主要成分就是氯化钠。钠... ',
            time:'2017-05-05',
            src:src1,
            classify:'老年饮食',
            url:'/detailTips'
        },
          {
            title:'高血压与高盐饮食丨高血压患者的饮食需要特别注意的几点！',
            introduction:'食盐，又称餐桌盐是对人类生存最重要的物质之一，也是生活的必需品。盐对于人体来说，非常重要。食盐中的主要成分就是氯化钠。钠... ',
            time:'2017-05-05',
            src:src1,
            classify:'老年饮食',
            url:'/detailTips'
          },{
            title:'高血压与高盐饮食丨高血压患者的饮食需要特别注意的几点！',
            introduction:'食盐，又称餐桌盐是对人类生存最重要的物质之一，也是生活的必需品。盐对于人体来说，非常重要。食盐中的主要成分就是氯化钠。钠... ',
            time:'2017-05-05',
            src:src1,
            classify:'老年饮食',
            url:'/detailTips'
          }]
      }
    }
  }
</script>
