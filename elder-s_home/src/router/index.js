import Vue from 'vue'
import VueRouter from 'vue-router'
import store from '../store/store'

Vue.use(VueRouter)
import routes from './routes'
// 滚动条滚回顶部
// const scrollBehavior =(to, from, savedPosition)=> {
//   if (savedPosition) {
//     return savedPosition
//   } else {
//     return { x: 0, y: 0 }
//   }
// }
//
// const router =  new VueRouter({
//   // mode:'history',
//   // scrollBehavior,
//   routes
// })
if (window.localStorage.getItem('token')) {
  store.commit(types.LOGIN, window.localStorage.getItem('token'))
}

const router = new VueRouter({
  routes
});
router.beforeEach((to, from, next) => {
  // let {auth=true}=meta
  // let isLogin = Boolean(store.state.token)
  // console.log(isLogin)
  // console.log(to.matched)
  if (to.matched.some(r => r.meta.requiresAuth)) {
    // console.log(r.meta.requireAuth)
    if (store.state.token) {
      next();
    }
    else {
      next({
        // path: '/login',
        // query: {redirect: to.fullPath}
      })
    }
  }
  else {
    console.log('de')
    next();
  }
})

// router.beforeEach((to, from, next) => {
//   if (to.meta.requireAuth) {  // 判断该路由是否需要登录权限
//     console.log('dee')
//     if (!store.state.token) {// 通过vuex state获取当前的token是否存在
//       next();
//     }
//     else {
//       next({
//         path: '/login',
//         query: {redirect: to.fullPath}  // 将跳转的路由path作为参数，登录成功后跳转到该路由
//       })
//     }
//   }
//   else {
//     next();
//   }
// })

export default router
