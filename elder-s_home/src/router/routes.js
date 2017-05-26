// import Vue from 'vue'
// import Router from 'vue-router'

import Layout from '@/components/layout'
import Login from '@/components/logRes/logRes'
import Home from '@/components/fronted/home'
import Community from '@/components/fronted/community'
import Service from '@/components/fronted/service'
import AllService from '@/components/fronted/service/allService'
import SingleService from '@/components/fronted/service/singleService'

import News from '@/components/fronted/news'
import Tips from '@/components/fronted/tips'
import Detail_community from '@/components/fronted/community/detail_community'
import DetailTips from '@/components/fronted/tips/detailTips'
import DetailNews from '@/components/fronted/news/detailNew'
import HomeCenter from '@/components/fronted/homecenter'
import SerFeedBack from '@/components/fronted/homecenter/feedBack'
import PersonInf from '@/components/fronted/homecenter/personInf'
import PersonTipsHome from '@/components/fronted/homecenter/personTips'
import ServiceProj from '@/components/fronted/homecenter/serviceProj'


import BackEnd from '@/components/backEnd/admin/backEnd'
import UserManage from '@/components/backEnd/admin/user/userManage'
import SystemNum from '@/components/backEnd/admin/user/systemNum'
import OldManage from '@/components/backEnd/admin/user/oldManage'
import CommunityMan from '@/components/backEnd/admin/community/communityMan'
import SerPerson from '@/components/backEnd/admin/serPerMan/serPerson'
import NewsList from '@/components/backEnd/admin/news/newsList'
import AddNews from '@/components/backEnd/admin/news/addNews'
import TipsList from '@/components/backEnd/admin/tips/tipsList'
import AddTips from '@/components/backEnd/admin/tips/addTips'
import BasicPro from '@/components/backEnd/admin/serProMan/basicPro'
import FeaturePro from '@/components/backEnd/admin/serProMan/featurePro'
import PersonOrder from '@/components/backEnd/admin/serProMan/personOrder'
import SerOrderEval from '@/components/backEnd/admin/serProMan/serOrder'
import PerTips from '@/components/backEnd/admin/serProMan/perTips'


import ServiceWork from '@/components/backEnd/service/serviceWork'
import SerAddNews from '@/components/backEnd/service/addNews/addNews'
import SerAddOld from '@/components/backEnd/service/addOld/addOld'
import SerAddProject from '@/components/backEnd/service/addProject/addProject'
import SerAddTips from '@/components/backEnd/service/addTips/addTips'
import AccountCheck from '@/components/backEnd/service/checkOldInf/accountCheck'
import CheckOrder from '@/components/backEnd/service/checkOrder/checkOrder'
import FeedBack from '@/components/backEnd/service/handlePro/feedBack'
import PersonTips from '@/components/backEnd/service/handlePro/personTips'
import ProcessProj from '@/components/backEnd/service/handlePro/processProj'
import ServiceOld from '@/components/backEnd/service/handlePro/serviceOld'



  export default  [
    {
      path: '/',
      redirect: '/home',
      name: 'layout',
      component: Layout,
      children:[
        {
          path: '/home',
          name: 'home',
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
          redirect: '/service/allService',
          component: Service,
          children:[{
            path:'/service/allService',
            name:'allService',
            component:AllService
          },{
            path:'/service/:id',
            name:'singleService',
            component:SingleService
          }]
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
          path:'/homeCenter',
          name:'homeCenter',
          component:HomeCenter,
          redirect: '/homeCenter/personInf',
          meta:{requiresAuth:true},
          children:[{
            path:'/homeCenter/serFeedBack',
            name:'serFeedBack',
            component:SerFeedBack,
          },{
            path:'/homeCenter/personTipsHome',
            name:'personTipsHome',
            component:PersonTipsHome,
          },{
            path:'/homeCenter/personInf',
            name:'personInf',
            component:PersonInf,
          },{
            path:'/homeCenter/serviceProj',
            name:'serviceProj',
            component:ServiceProj,
          }]
        }
      ]
    }, {
      path:'/login',
      name:'login',
      component:Login,
    },{
      path:'/backEnd',
      name:'backEnd',
      redirect: '/backEnd/userManage',
      component:BackEnd,
      meta:{requiresAuth:true},
      children:[
        {
          path:'/backEnd/userManage',
          name:'user/userManage',
          component:UserManage,
          meta:{requiresAuth:true}
        },
        {
          path:'/backEnd/systemNum',
          name:'user/systemNum',
          component:SystemNum
        },
        {
          path:'/backEnd/oldManage',
          name:'user/oldManage',
          component:OldManage
        },{
          path:'/backEnd/communityMan',
          name:'community/communityMan',
          component:CommunityMan
        },{
          path:'/backEnd/serPerson',
          name:'serPerMan/serPerson',
          component:SerPerson
        },{
          path:'/backEnd/newsList',
          name:'news/newsList',
          component:NewsList
        },{
          path:'/backEnd/addNews',
          name:'news/addNews',
          component:AddNews
        },{
          path:'/backEnd/tipsList',
          name:'news/tipsList',
          component:TipsList
        },{
          path:'/backEnd/addTips',
          name:'news/addTips',
          component:AddTips
        },{
          path:'/backEnd/basicPro',
          name:'serProMan/basicPro',
          component:BasicPro
        },{
          path:'/backEnd/featurePro',
          name:'serProMan/featurePro',
          component:FeaturePro
        },{
          path:'/backEnd/personOrder',
          name:'serProMan/personOrder',
          component:PersonOrder
        },{
          path:'/backEnd/perTips',
          name:'serProMan/perTips',
          component:PerTips
        },{
          path:'/backEnd/serOrderEval',
          name:'serProMan/serOrderEval',
          component:SerOrderEval
        }
      ]
    },{
      path:'/serviceWork',
      name:'serviceWork',
      redirect: '/serviceWork/processProj',
      component:ServiceWork,
      meta:{requiresAuth:true},
      children:[
        {
          path:'/serviceWork/processProj',
          name:'handlePro/processProj',
          component:ProcessProj
        },
        {
          path:'/serviceWork/serviceOld',
          name:'handlePro/serviceOld',
          component:ServiceOld
        },
        {
          path:'/serviceWork/personTips',
          name:'handlePro/personTips',
          component:PersonTips
        },
        {
          path:'/serviceWork/feedBack',
          name:'handlePro/feedBack',
          component:FeedBack
        },
        {
          path:'/serviceWork/addOld',
          name:'addOld/addOld',
          component:SerAddOld
        },
        {
          path:'/serviceWork/addProject',
          name:'addProject/addProject',
          component:SerAddProject
        },
        {
          path:'/serviceWork/addTips',
          name:'addTips/addTips',
          component:SerAddTips
        },
        {
          path:'/serviceWork/addNews',
          name:'addNews/addNews',
          component:SerAddNews
        },
        {
          path:'/serviceWork/checkOrder',
          name:'checkOrder/checkOrder',
          component:CheckOrder
        },{
          path:'/serviceWork/accountCheck',
          name:'checkOldInf/accountCheck',
          component:AccountCheck
        }]
    }
  ]
