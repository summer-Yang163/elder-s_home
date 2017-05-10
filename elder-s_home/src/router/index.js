import Vue from 'vue'
import Router from 'vue-router'

import LogRes from '@/components/logRes/logRes'
import Home from '@/components/fronted/home'
import Community from '@/components/fronted/community'
import Service from '@/components/fronted/service'
import News from '@/components/fronted/news'
import Tips from '@/components/fronted/tips'
import Detail_community from '@/components/fronted/community/detail_community'
import DetailTips from '@/components/fronted/tips/detailTips'
import DetailNews from '@/components/fronted/news/detailNew'
import BackEnd from '@/components/backEnd/admin/userManage'



// import

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: 'LogRes',
      component: LogRes
    },
    {
      path: '/home',
      name: 'home',
      children:[],
      component: Home
    },
    {
      path: '/community',
      name: 'community',
      component: Community
    },
    {
      path: '/service',
      name: 'service',
      component: Service
    },
    {
      path: '/news',
      name: 'news',
      component: News
    },
    {
      path: '/tips',
      name: 'tips',
      component: Tips
    },
    {
      path: '/comDeatail',
      name: 'comDeatail',
      component: Detail_community
    },
    {
      path: '/detailTips',
      name: 'detailTips',
      component: DetailTips
    },{
      path:'/detailNews',
      name:'detailNews',
      component:DetailNews
    },{
      path:'/backEnd',
      name:'backEnd',
      component:BackEnd
    }

  ]
})
