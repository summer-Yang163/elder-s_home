<style scoped>
  li{
    margin:10px 0;
  }
  li span{
    color:#ffac2d;
  }
</style>
<template>
  <Card style="width:210px;float:right">
    <p slot="title">
      <Icon type="ios-film-outline"></Icon>
      相关推荐指数
  </p>
    <ul>
      <li v-for="item in movieList">
        <a >{{ item.name }}</a>
        <span>
          <Icon type="ios-star" v-for="n in 4" :key="n"></Icon>
          <Icon type="ios-star" v-if="item.rate >= 9.5"></Icon>
          <Icon type="ios-star-half" v-else></Icon>
                    {{ item.rate }}
          </span>
      </li>
    </ul>
  </Card>
</template>
<script>
  export default {
    data () {
      return {
        movieList: [
          {
            name: '服务指数',
            url: 'https://movie.douban.com/subject/1291546/',
            rate: 8
          },
          {
            name: '环境指数',
            url: 'https://movie.douban.com/subject/1292052/',
            rate: 9.6
          },
          {
            name: '价格指数',
            url: 'https://movie.douban.com/subject/1295644/',
            rate: 6
          },
          {
            name: '已住空间',
            url: 'https://movie.douban.com/subject/1292720/',
            rate: 9.4
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
