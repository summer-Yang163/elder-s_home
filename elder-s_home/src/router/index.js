import Vue from 'vue'
import Router from 'vue-router'
import Hello from '@/components/Hello'
// import Login from '@/components/login'
import LogRes from '@/components/logRes/logRes'
import Home from '@/components/fronted/home'
import Community from '@/components/fronted/community'

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
      component: Home
    },
    {
      path: '/community',
      name: 'community',
      component: Community
    }

  ]
})
