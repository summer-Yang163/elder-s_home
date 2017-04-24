import Vue from 'vue'
import Router from 'vue-router'
import Hello from '@/components/Hello'
// import Login from '@/components/login'
import LogRes from '@/components/logRes/logRes'
// import

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: 'LogRes',
      component: LogRes
    }
  ]
})
