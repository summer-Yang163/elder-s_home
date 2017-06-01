<style >

</style>
<style scoped>
  .footer{
    /*clear:both;*/
    /*position:fixed;*/
    bottom:0;
    width:100%;
    height:60px;
    padding-top:10px;
    background-color: #b8bfc8;
    text-align:center;
    /*margin-bottom:20px;*/
    /*z-index:100;*/
  }
  .footer p{
    margin-top:10px  ;
  }
</style>
<template>
  <!-- 关于我们 -->
  <div class="footer">
    <p>{{text}}</p>
    <router-link to="/home">{{introduction}}</router-link>
  </div>
</template>
<script>
  export default{
      data(){
         return {
           text:'时光驿站房地产开发集团有限公司版权所有 监察部举报电话：0757-263959',
           introduction:'关于时光驿站集团'
         }
      }
  }
</script>
