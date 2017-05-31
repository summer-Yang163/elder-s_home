<style scoped>
  li{
    margin:15px 0;
  }
  li a{
    display:block;
    color: #5d5d5d;
  }
  li .time{
    float:right;
  }
</style>
<template>
    <ul>
      <li v-for="item in newsList" :key="item.id">
        <a :href="item.url" >>&nbsp;&nbsp;<span style="color:#ff630d">[{{item.classify}}]</span>&nbsp;&nbsp;{{item.title}}
        <p class="time">{{item.time}}</p></a>
      </li>
    </ul>
</template>
<script>
  export default {
    data () {
      return {
        newsList: [
          {
            classify:'社区新闻',
            title: '关怀老人，爱心铃集市“益”起来',
            url: 'http://www.sqfw360.cn/index.php/News/detail/item/1553.html',
            time: '2017-05-28'
          },{
            classify:'社区新闻',
            title: '感恩母亲节，爱心铃APP粉丝同乐日',
            url: 'http://www.sqfw360.cn/index.php/News/detail/item/1553.html',
            time: '2017-05-12'
          },
          {
            classify:'社区新闻',
            title: '温情探访，暖人心窝',
            url: 'http://www.sqfw360.cn/index.php/News/detail/item/1553.html',
            time: '2017-03-20'
          },{
            classify:'社区新闻',
            title: '爱心探访，为老人排忧解难',
            url: 'http://www.sqfw360.cn/index.php/News/detail/item/1553.html',
            time: '2017-03-01'
          },{
            classify:'社区通知',
            title: '爱心贺元宵，耆趣包汤圆',
            url: 'http://www.sqfw360.cn/index.php/News/detail/item/1553.html',
            time: '2017-02-13'
          },{
            classify:'社区通知',
            title: '弘扬博爱精神，献血献爱心',
            url: 'http://www.sqfw360.cn/index.php/News/detail/item/1553.html',
            time: '2016-11-05'
          },{
            classify:'社区通知',
            title: '观演歌舞剧，退休欢乐趣',
            url: 'http://www.sqfw360.cn/index.php/News/detail/item/1553.html',
            time: '2016-10-28'
          },{
            classify:'社区新闻',
            title: '和美中山，最是夕阳红',
            url: 'http://www.sqfw360.cn/index.php/News/detail/item/1553.html',
            time: '2016-10-15'
          },{
            classify:'社区新闻',
            title: '八旬老人来访 爱心传递真情',
            url: 'http://www.sqfw360.cn/index.php/News/detail/item/1553.html',
            time: '2016-10-01'
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
