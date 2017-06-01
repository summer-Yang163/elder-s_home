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
  .main .content h1{
    text-align: center;
  }
  .main .content p{
    padding: 0 10px;
  }

</style>
<template>
  <div>
    <!--<Vhead></Vhead>-->
    <div class="main ">
      <Breadcrumb style="margin:10px 0;">
        <Breadcrumb-item href="/news">
          <Icon type="ios-home-outline"></Icon> 新闻公告
        </Breadcrumb-item>
        <Breadcrumb-item href="/detailTips" >
          <span style="color:orange"><Icon type="pound"></Icon> 社区新闻</span>
        </Breadcrumb-item>
      </Breadcrumb>
      <div class="content">
        <Card  class="card">
          <h1>{{tip.title}}</h1>
          <div v-html="tip.content"></div>
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
  import src1 from '../../../assets/tips/1.jpg'


  export default {
    components: {Vhead, BreadCrumb,VFooter},
    data () {
      return {
        tip:{
          title:'民众镇心苑社工站绿键活动',
          content:'<div class="list_con_con_time">　发布日期：2017年04月28日</div> <div class="list_con_con_com" style="overflow:hidden"><p><span style="font-size:19px;font-family:宋体">活动时间：</span><span style="font-size:19px">2017</span><span style="font-size:19px;font-family:宋体">年</span><span style="font-size:19px">4</span><span style="font-size:19px;font-family: 宋体">月</span><span style="font-size: 19px">27</span><span style="font-size:19px;font-family:宋体">日</span></p><p><span style="font-size:19px;font-family:宋体">活动地点：民众镇浪网村老人活动中心</span></p><p><span style="font-size:19px;font-family:宋体">主办方：民众镇心苑社工站</span></p><p><span style="font-size:19px;font-family:宋体">协办方：中山博爱行动义工爱心铃服务队</span></p><p><span style="font-size:19px">&nbsp;</span></p><p style="text-indent:36px"><span style="font-size:19px;font-family:宋体">为了关注老人的居家生活安全，</span><span style="font-size:19px">4</span><span style="font-size:19px;font-family:宋体">月</span><span style="font-size:19px">27</span><span style="font-size:19px;font-family: 宋体">日，中山博爱行动义工爱心铃服务队受邀参加心苑社工站主办的“长者居家应急安全知识讲座”的活动，并给现场的老友记讲解了爱心铃的服务项目和使用技巧。</span></p><p style="text-indent:36px"><span style="font-size:19px">&nbsp;</span></p><p style="text-indent:36px"><span style="font-size:19px;font-family:宋体">当日，共吸引了二十几位老友记前来参加活动。活动一开始，义工就拿着慈善爱心铃样机向现场的老友记详细地介绍了爱心铃与手机爱心铃的功能，义工风趣生动的讲解，获得了老友记的一致好评。而对于老友记五花八门的提问，义工也耐心地一一做了解答。家住浪网村的福伯是爱心铃的老用户了，但对于手机爱心铃知之甚少。“我识字不多，用的又是老人手机，怎样使用你们的手机爱心铃，会不会很复杂？”其实，为了更好地服务老人，爱心铃在今年推出了爱心铃快捷键的功能，任何型号的手机都能够安装爱心铃快捷键，且操作界面也简洁明了，便于老人使用，意在让每一位老人都能够享受到爱心铃优质的服务。福伯听完义工的介绍后，满意地竖起大拇指赞到：“真方便！”</span></p><p><span style="font-size:19px">&nbsp;</span></p><p><span style="font-size:19px">&nbsp;&nbsp;&nbsp; </span><span style="font-size:19px;font-family:宋体">本次活动，心苑社工站也贴心地为老友记普及了居家安全的小知识，增强了长者们的应急安全能力。而老友记也纷纷表示希望社工站与爱心铃以后多多开展此类有助于老人的活动。</span></p><p><span style="font-size:19px">&nbsp;</span></p><p><span style="font-size:19px;font-family:宋体">活动剪影：</span></p><p><img src="http://www.sqfw360.cn/Uploads/News/20170428/20170428_482646.jpg" style="" title="20170428_482646.jpg"/></p><p><img src="http://www.cure-link.com/Uploads/ueditor/image/20170428/20170428_254822.jpg" title="20170428_254822.jpg" style="white-space: normal;"/></p><p><img src="http://www.sqfw360.cn/Uploads/News/20170428/20170428_974635.jpg" style="" title="20170428_974635.jpg"/></p><p style="text-align: center;"></p></div>',
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
