<style scoped>
  li{
    margin:10px 0;
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
      <li v-for="item in newsList">
        <a :href="item.url">>&nbsp;&nbsp;<span>[{{item.classify}}]</span>&nbsp;&nbsp;{{item.title}}
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
            time: '2017-05-05'
          },{
            classify:'社区新闻',
            title: '关怀老人，爱心铃集市“益”起来',
            url: 'http://www.sqfw360.cn/index.php/News/detail/item/1553.html',
            time: '2017-05-05'
          },{
            classify:'社区新闻',
            title: '关怀老人，爱心铃集市“益”起来',
            url: 'http://www.sqfw360.cn/index.php/News/detail/item/1553.html',
            time: '2017-05-05'
          },{
            classify:'社区新闻',
            title: '关怀老人，爱心铃集市“益”起来',
            url: 'http://www.sqfw360.cn/index.php/News/detail/item/1553.html',
            time: '2017-05-05'
          },
          {
            classify:'社区新闻',
            title: '关怀老人，爱心铃集市“益”起来',
            url: 'http://www.sqfw360.cn/index.php/News/detail/item/1553.html',
            time: '2017-05-05'
          },
          {
            classify:'社区新闻',
            title: '关怀老人，爱心铃集市“益”起来',
            url: 'http://www.sqfw360.cn/index.php/News/detail/item/1553.html',
            time: '2017-05-05'
          },{
            classify:'社区新闻',
            title: '关怀老人，爱心铃集市“益”起来',
            url: 'http://www.sqfw360.cn/index.php/News/detail/item/1553.html',
            time: '2017-05-05'
          },{
            classify:'社区新闻',
            title: '关怀老人，爱心铃集市“益”起来',
            url: 'http://www.sqfw360.cn/index.php/News/detail/item/1553.html',
            time: '2017-05-05'
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
