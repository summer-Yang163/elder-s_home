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
            <Page class="page" :total="40" size="small"  ></Page>
          </Card>
        </div>
      </div>
      <div class="classification">
        <h2 >老年饮食</h2>
        <Card  class="card" >
          <ul v-for="(item,index) in  tipsList2" :key="index">
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
          <Page class="page" :total="40"></Page>
        </Card>
      </div>
      <div class="classification">
        <h2 >老年疾病</h2>
        <Card  class="card" >
          <ul v-for="(item,index) in  tipsList3" :key="index">
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
          <Page class="page" :total="40"  ></Page>
        </Card>
      </div>
      <div class="classification">
        <h2 >老年心理</h2>
        <Card  class="card" >
          <ul v-for="(item,index) in  tipsList4" :key="index">
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
          <Page class="page" :total="40" ></Page>
        </Card>
      </div>
    </div>
    <!--<VFooter></VFooter>-->
  </div>

</template>
<script>
  import Vhead from './common/vheader'
  import VFooter from './common/footer'
  import Carousel from './tips/carousel'
  import src1 from '../../assets/tips/1.jpg'
  import imgSrc2 from  '../../assets/tips/2.jpg'
  import imgSrc3 from  '../../assets/tips/3.jpg'
  import imgSrc4 from  '../../assets/tips/4.jpg'
  import imgSrc5 from  '../../assets/tips/5.jpg'
  import imgSrc6 from  '../../assets/tips/6.jpg'
  import imgSrc7 from  '../../assets/tips/7.jpg'
  import imgSrc8 from  '../../assets/tips/8.jpg'
  import imgSrc9 from  '../../assets/tips/9.jpg'
  import imgSrc10 from  '../../assets/tips/10.png'
  import imgSrc11 from  '../../assets/tips/11.jpg'
  import imgSrc12 from  '../../assets/tips/12.jpg'

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
            src:imgSrc2,
            title: '得了高血压还不知道怎么吃，怎么办？',
            url: 'http://www.yanglaocn.com/shtml/20170425/1493088000110403.html',
            introduction: '高血压患者常伴有抑郁症，对疾病产生恐惧感、缺乏信心，特别是重症高血压病人与治疗效果欠佳等病人，有时候会产生......',
            classify:'老年饮食',
            time:'2017-04-25',
          },{
            src:imgSrc3,
            title: '养好心态',
            url: 'http://www.yanglaocn.com/shtml/20170327/1490600636109196.html',
            introduction: '谈到健康这个话题，许多人都把重点放在饮食上。认为人要健康，首先得吃好喝好，次之是锻炼好。不过，这两点固然重要......',
            classify:'老年饮食',
            time:'2017-04-25',
          }],
        tipsList2:[{
          title:'减脂必喝 | 精致营养低热量私房粥',
          introduction:'减脂更要吃的讲究，减脂不只要降低热量，还要补足营养(热量和营养不是一个概念哦)。所以我经常会在需要进补的时候给自己熬美味的粥。 ',
          time:'2017-03-15',
          src:imgSrc4,
          classify:'老年饮食',
          url:'/detailTips'
        },
          {
            src:imgSrc5,
            title: '看人不能“白富美”，看吃也不能“白富美”',
            url: 'http://www.yanglaocn.com/shtml/20170425/1493088000110403.html',
            introduction: '相信不少人都对，出自诗经中的古诗《关雎》第一二句“关关雎鸠，在河之洲。窈窕淑女，君子好逑”这句诗很熟悉。这样看来，自古人们对美好的事物都有着相同的追求，包括现在，大众对美女的常用形容词汇是“白富美”',
            classify:'老年饮食',
            time:'2017-03-24',
          },{
            src:imgSrc6,
            title: '营养师 | 关于粗粮的“风言风语”',
            url: 'http://www.yanglaocn.com/shtml/20170327/1490600636109196.html',
            introduction: '随着人们对健康饮食的注重，粗粮的营养价值也已经被逐渐得到认可，逐步出现在老百姓的餐桌上。但是相信大家在生活中曾经疑问过或是被问过，一些关于吃粗粮所引发的疑问。',
            classify:'老年饮食',
            time:'2017-03-15',
          }],
        tipsList3:[
          {
            src:imgSrc8,
            title: '专家解答 | 患高血压的老年朋友能吃咸菜么？',
            url: 'http://www.yanglaocn.com/shtml/20170425/1493088000110403.html',
            introduction: '北京中医药大学中药学专业，国家二级公共营养师，首都营养保健美食学会高级会员，北京营养师俱乐部金牌讲师，曾在《百姓健康》栏目中担任营养专家，是营养配餐、营养检测、营养强化、营养评估等领域的专家，其中尤为擅长营养配餐与慢病饮食调理。',
            classify:'老年饮食',
            time:'2017-04-17',
          },{
            src:imgSrc9,
            title: '哮喘患者在饮食上需要注意些什么？',
            url: 'http://www.yanglaocn.com/shtml/20170327/1490600636109196.html',
            introduction: '哮喘患者，往往需要注意饮食清淡，少油腻，更重要的是忌食咸辣食物。咸辣食品往往对咽喉刺激强烈，很容易诱发病情发作，对病情非常不利，所以这类食物尽量不要食用。',
            classify:'老年饮食',
            time:'2017-02-22',
          },
          {
            title:'有意识或无意识的昏厥，需预防及检查治疗',
            introduction:'昏厥也被称为“脑贫血”，因为只会失去意识非常短暂的一段时间，因此一直被认为是“不需担心的事”。但其实“昏厥”正代表身体发出了警讯了。若是发生了昏厥，各位应该会先被送到急救中心，原因不明的状况也很多。 ',
            time:'2016-11-14',
            src:imgSrc7,
            classify:'老年饮食',
            url:'/detailTips'
          }],
        tipsList4:[
          {
            src:imgSrc12,
            title: '白头偕老的夫妻是如何让婚姻“保鲜”',
            url: 'http://www.yanglaocn.com/shtml/20170327/1490600636109196.html',
            introduction: '白头偕老几乎是所有夫妻的愿望，每每看到步入银婚、金婚乃至钻石婚的老人，我们总是投以祝福与羡慕的目光。但随着离婚率的逐年增长，实现白头偕老的难度好似也随之增长。那些步入金婚、银婚的夫妻又是如何做到的呢?维持婚姻的秘诀有哪些?其实在婚姻步入“老夫老妻”阶段',
            classify:'老年饮食',
            time:'2016-01-08',
          },{
            src:imgSrc11,
            title: '现代老人更在乎什么',
            url: 'http://www.yanglaocn.com/shtml/20170425/1493088000110403.html',
            introduction: '相信不少人都对，出自诗经中的古诗《关雎》第一二句“关关雎鸠，在河之洲。窈窕淑女，君子好逑”这句诗很熟悉。这样看来，自古人们对美好的事物都有着相同的追求，包括现在，大众对美女的常用形容词汇是“白富美”',
            classify:'老年饮食',
            time:'2015-10-15',
          },{
            title:'记忆力最好时段是早晨吗？不见得!',
            introduction:'相信每个人上学的时候都听到过父母对你说“早上起来背书，记性好!”这句话一直根深蒂固存在于我们的思想中，然而一整天下来，真的是早晨记忆力最好吗?不见得! ',
            time:'2015-09-14',
            src:imgSrc10,
            classify:'老年饮食',
            url:'/detailTips'
          }]

      }
    }
  }
</script>
