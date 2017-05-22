// The Vue build version to load with the `import` command
// (runtime-only or standalone) has been set in webpack.base.conf with an alias.
import Vue from 'vue' //引入vue
import App from './App' //引入app.vue
import router from './router/index'
import store from './store/store'

import iView from 'iview'
import 'iview/dist/styles/iview.css'
Vue.config.productionTip = false
Vue.use(iView);
// Vue.prototype.HOST = 'http://127.0.0.1:8087/elder_home'
Vue.prototype.HOST = 'http://192.168.199.239:8087/elder_home'

// Vue.use(axios);
new Vue({
    el: '#app',
    // router: router,
    router,
    store,
    render: h => h(App)
    // template: '<App/>',
    // components: { App }//注册app组件

});
