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
  import imgSrc2 from  '../../../assets/tips/2.jpg'
  import imgSrc3 from  '../../../assets/tips/3.jpg'

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
            src:imgSrc2,
            title: '得了高血压还不知道怎么吃，怎么办？',
            url: 'http://www.yanglaocn.com/shtml/20170425/1493088000110403.html',
            content: '高血压患者常伴有抑郁症，对疾病产生恐惧感、缺乏信心，特别是重症高血压病人与治疗效果欠佳等病人，有时候会产生对饮食的某些嗜好或过度摄入食物来缓解自己的不良心态。所以，作为亲人或是朋友，要对他们多些耐心和关注。'
          },{
            src:imgSrc3,
            title: '养好心态',
            url: 'http://www.yanglaocn.com/shtml/20170327/1490600636109196.html',
            content: '谈到健康这个话题，许多人都把重点放在饮食上。认为人要健康，首先得吃好喝好，次之是锻炼好。不过，这两点固然重要，但我觉得保持一个好心态更重要。心态和人的性格有着密切关联，性子急而且暴躁的人，很难有平静心态。心态是人的修养和道德品质的体现'
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
