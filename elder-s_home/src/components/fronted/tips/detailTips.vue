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
  .main .content{
    text-align: center;
  }
  .main .content p{
    padding: 0 10px;
  }

</style>
<template>
  <div>
    <Vhead></Vhead>
    <div class="main ">
      <Breadcrumb style="margin:10px 0;">
        <Breadcrumb-item href="/tips">
          <Icon type="ios-home-outline"></Icon> 养老小贴士
        </Breadcrumb-item>
        <Breadcrumb-item href="/detailTips" >
          <span style="color:orange"><Icon type="pound"></Icon> 老年饮食</span>
        </Breadcrumb-item>
      </Breadcrumb>
      <div class="content">
        <Card  class="card">
          <h1>{{tip.title}}</h1>
          <div v-html="tip.content"></div>
        </Card>
      </div>
    </div>
    <VFooter></VFooter>
  </div>

</template>
<script>
  import Vhead from '../common/vheader'
  import VFooter from '../common/footer'
  import BreadCrumb from '../common/breadCrumb'
  import src1 from '../../../assets/tips/1.jpg'


  export default {
    components: {Vhead, BreadCrumb,VFooter},
    data () {
      return {
        tip:{
          title:'高血压与高盐饮食丨高血压患者的饮食需要特别注意的几点！',
          content:'<div class="PageDetailsContext"><p style="text-indent:2em"> <strong>食盐，又称餐桌盐</strong></p> <p style="text-indent:2em"> <strong><img align="" alt="食盐，又称餐桌盐" border="0" height="400" src="http://www.yanglaocn.com/ckfinder/userfiles/images/2017/0428/bf634d2d8da0f2d8cf2687ce65df1877.jpg" width="550" /></strong></p> <p style="text-indent:2em">是对人类生存最<a href="http://www.yanglaocn.com/Search.php?label_id=32776" title="重要的" target="_blank">重要的</a>物质之一，也是<a href="http://www.yanglaocn.com/life/" title="生活" target="_blank">生活</a>的必需品。盐对于人体来说，<a href="http://www.yanglaocn.com/Search.php?label_id=22863" title="非常重" target="_blank">非常重</a>要。</p> <p style="text-indent:2em">食盐中的主要成分就是氯化钠。钠离子、氯离子的生理<a href="http://www.yanglaocn.com/Search.php?label_id=927" title="功能" target="_blank">功能</a>是，维持细胞外液的渗透压;参与体内酸碱平衡的调节;氯离子在体内还参与胃酸的形成，此外，食盐在维持神经和肌肉的<a href="http://www.yanglaocn.com/Search.php?label_id=2745" title="正常" target="_blank">正常</a>兴奋性上也有作用。</p> <p style="text-indent:2em">所以人体是<a href="http://www.yanglaocn.com/Search.php?label_id=48375" title="离不开" target="_blank">离不开</a>盐，可一旦<a href="http://www.yanglaocn.com/Search.php?label_id=721" title="高血压" target="_blank">高血压</a>被确诊，<a href="http://www.yanglaocn.com/Search.php?label_id=521" title="饮食" target="_blank">饮食</a>上首要要明确的一点就是，<a href="http://www.yanglaocn.com/Search.php?label_id=58698" title="严格控制" target="_blank">严格控制</a>食盐的摄入量，并且《<a href="http://www.yanglaocn.com/Search.php?label_id=195" title="中国" target="_blank">中国</a><a href="http://www.yanglaocn.com/Search.php?label_id=413" title="居民" target="_blank">居民</a>膳食指南》当中也明确指出，<a href="http://www.yanglaocn.com/Search.php?label_id=6703" title="每人" target="_blank">每人</a>每天食盐的摄入量要小于6g。</p> <p style="text-indent:2em">可是对人体这么重要的物质，怎么就影响血压了呢?</p> <p style="text-indent:2em"> <strong>高盐饮食是<a href="http://www.yanglaocn.com/Search.php?label_id=967" title="如何" target="_blank">如何</a>导致高血压的呢？</strong></p> <p style="text-indent:2em"> <strong><img align="" alt="高盐饮食是如何导致高血压的呢？" border="0" height="367" src="http://www.yanglaocn.com/ckfinder/userfiles/images/2017/0428/81999e0378feff6e1138a3076070aa38.jpg" width="550" /></strong></p> <p style="text-indent:2em"> <strong>微观细胞</strong></p> <p style="text-indent:2em">摄入大量的食盐后，钠离子<a href="http://www.yanglaocn.com/Search.php?label_id=80" title="通过" target="_blank">通过</a>细胞内外液的浓度梯度差，随水进入细胞，使得细胞体积增大，进而血容量<a href="http://www.yanglaocn.com/Search.php?label_id=3083" title="增加" target="_blank">增加</a>，使得血管腔相对变窄，阻力增大，也就使得血管所承受的压力增大，血压也就升高了。</p> <p style="text-indent:2em"> <strong>整体宏观</strong></p> <p style="text-indent:2em">当摄入过多的盐分后，使得渗透压升高，激发下丘脑渗透压感受器和口渴中枢，让人产生口渴的感觉，促使人喝水来稀释血液中过多的盐分。</p> <p style="text-indent:2em">血液中盐分增多，肾脏为调节水-<a href="http://www.yanglaocn.com/Search.php?label_id=41572" title="电解质" target="_blank">电解质</a>的平衡会分泌一些激素，比方说，肾上腺分泌的醛固酮，具有很强的收缩血管的作用。</p> <p style="text-indent:2em">除了上述影响外，盐还破坏血管内壁，损伤内皮细胞，破坏血管，长期的这类损伤刺激，必然会导致血管变薄变脆弱。</p> <p style="text-indent:2em">所以，<a href="http://www.yanglaocn.com/Search.php?label_id=45298" title="无论是" target="_blank">无论是</a>否被确诊高血压，一定要严格控制钠盐的摄入。</p> <p style="text-indent:2em"> <strong>如何减少钠盐的摄入？</strong></p> <p style="text-indent:2em"> <strong><img align="" alt="如何减少钠盐的摄入？" border="0" height="332" src="http://www.yanglaocn.com/ckfinder/userfiles/images/2017/0428/506dd7e3250e07ebaf8ee91d5dc24143.jpg" width="550" /></strong></p> <p style="text-indent:2em">1、在家炒菜尽量少放盐，用适当的酸、辣、辛香料替代，烹调<a href="http://www.yanglaocn.com/Search.php?label_id=30394" title="过程中" target="_blank">过程中</a>，用带有香味的食材做辅料搭配做菜，比方说，洋葱、香菇、<a href="http://www.yanglaocn.com/Search.php?label_id=36785" title="西红柿" target="_blank">西红柿</a>、柠檬等。</p> <p style="text-indent:2em">在外就餐，准备一杯清水，别小看这一杯水，在涮菜的过程中，不但能够稀释掉<a href="http://www.yanglaocn.com/Search.php?label_id=35557" title="一部分" target="_blank">一部分</a>盐分，还能去掉一部分油脂，这对于想要控制体重的来说，也是不错的方法。</p> <p style="text-indent:2em">2、避免或少吃含盐腌制品及调味品，比方说，榨菜、腌肉、酱油、黄酱、大酱、豆瓣酱、腐乳等</p> <p style="text-indent:2em">3、少喝含钠的饮料及<a href="http://www.yanglaocn.com/Search.php?label_id=75" title="运动" target="_blank">运动</a>饮料，注意隐形盐的摄入(这点非常非常重要)，比方说，<a href="http://www.yanglaocn.com/Search.php?label_id=58054" title="咸鸭蛋" target="_blank">咸鸭蛋</a>、<a href="http://www.yanglaocn.com/Search.php?label_id=12572" title="方便面" target="_blank">方便面</a>、榨菜、酱菜、火腿、饭菜汤、加工蜜饯类等。</p> </div>',
          time:'2017-05-05',
          src:src1,
          classify:'老年饮食',
          url:'/tips'
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
