<style scoped>
  li{
    display:block;
    margin:5px 0;
    height:100px;
    overflow: auto;
  }
  li img{
    display:block;
    width:80px;
    height:80px;
    float:left;
  }
  li a{
    display:block;
  }
  li a p{
    color: #5d5d5d;
  }

</style>
<template>
  <ul>
    <li v-for="item in tipsList">
      <img :src="item.src">
      <a :href="item.url">
        <h3>{{item.title}}</h3>
        <p>{{item.content}}</p>
      </a>
    </li>
  </ul>
</template>
<script>
  import imgSrc from  '../../../assets/tips/1.jpg'
  export default {
    data () {
      return {
        tipsList: [
          {
            src:imgSrc,
            title: '高血压患者的饮食需要特别注意的几点！',
            url: 'http://www.yanglaocn.com/shtml/20170428/1493364370110472.html',
            content: '食盐，又称餐桌盐是对人类生存最重要的物质之一，也是生活的必需品。盐对于人体来说，非常重要。'
          },{
            src:imgSrc,
            title: '高血压患者的饮食需要特别注意的几点！',
            url: 'http://www.yanglaocn.com/shtml/20170428/1493364370110472.html',
            content: '食盐，又称餐桌盐是对人类生存最重要的物质之一，也是生活的必需品。盐对于人体来说，非常重要。'
          },{
            src:imgSrc,
            title: '高血压患者的饮食需要特别注意的几点！',
            url: 'http://www.yanglaocn.com/shtml/20170428/1493364370110472.html',
            content: '食盐，又称餐桌盐是对人类生存最重要的物质之一，也是生活的必需品。盐对于人体来说，非常重要。'
          }
        ]
      }
    },
    methods: {

    },
    mounted () {
    }
  }
</script>
