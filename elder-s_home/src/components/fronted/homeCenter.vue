<style>
  /*.footer{*/
    /*clear:both;*/
    /*position:fixed;*/
    /*bottom:0;*/
    /*width:100%;*/
    /*height:60px;*/
    /*!*padding-top:10px;*!*/
    /*background-color: #b8bfc8;*/
    /*text-align:center;*/
    /*!*margin-bottom:20px;*!*/
    /*z-index:100;*/
  /*}*/
  /*.footer p{*/
    /*margin-top:10px  ;*/
  /*}*/
</style>
<style scoped>
  .main {
    width: 90%;
    margin: 0 auto;
    overflow: auto;
  }
  .ivu-menu-dark {
    /*opacity: 0.7;*/
    background: #aaa799;
  }
  .main .main_left{
    float:left;
    /*width:21%;*/
  }
  .main .main_right{
    float:left;
    /*min-width:700px;*/
    /*margin-left:100px;*/
    width:80%;
  }

  .layout{
    border: 1px solid #d7dde4;
    background: #f5f7f9;
    position: relative;
    border-radius: 4px;
    overflow: hidden;
  }
  .layout-breadcrumb{
    padding: 10px 15px 0;
  }
  .layout-content{
    min-height: 200px;
    margin: 15px;
    overflow: hidden;
    background: #fff;
    border-radius: 4px;
  }
  .layout-content-main{
    padding: 10px;
  }
  .layout-copy{
    text-align: center;
    padding: 10px 0 20px;
    color: #9ea7b4;
  }
  .layout-menu-left{
    background: #464c5b;
  }
  .layout-header{
    height: 60px;
    background: #fff;
    box-shadow: 0 1px 1px rgba(0,0,0,.1);
  }
  .layout-logo-left{
    width: 90%;
    height: 30px;
    background: #5b6270;
    border-radius: 3px;
    margin: 15px auto;
  }
  .layout-ceiling-main a{
    color: #9ba7b5;
  }
  .layout-hide-text .layout-text{
    display: none;
  }
  .ivu-col{
    transition: width .2s ease-in-out;
  }

</style>
<template>
  <div>
    <div class="main ">
      <div class="main_left">
      <Menu :theme="theme3" :active-name="headData" style="min-width: 200px;" @on-select="handleSelect">
        <Menu-group title="家人中心">
          <Menu-item name="personInf">
            <Icon type="document-text"></Icon>
            个人信息
        </Menu-item>
          <Menu-item name="serviceProj">
            <Icon type="chatbubbles"></Icon>
            服务订单信息
        </Menu-item>
          <Menu-item name="personTipsHome">
            <Icon type="heart"></Icon>
            个性化提醒
        </Menu-item>
          <Menu-item name="serFeedBack">
            <Icon type="heart-broken"></Icon>
            服务反馈
        </Menu-item>
        </Menu-group>
      </Menu>
      </div>
      <div class="main_right">
        <router-view></router-view>
      </div>
    </div>
  </div>
</template>
<script>

  export default {
    data () {
      return {
        theme3: 'light'
      }
    },
    computed:{
      headData:function(){
        const path =  this.$route.name
        return  this.$route.name

      }
    },
    methods:{
        handleSelect (name) {
          this.$router.push(name)
        }
      }

  }
</script>
