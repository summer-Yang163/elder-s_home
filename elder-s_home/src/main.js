// The Vue build version to load with the `import` command
// (runtime-only or standalone) has been set in webpack.base.conf with an alias.
import Vue from 'vue' //引入vue
import App from './App' //引入app.vue
import router from './router'
import resource from 'vue-resource' //引入vue-resource
import iView from 'iview'
import 'iview/dist/styles/iview.css'
Vue.config.productionTip = false
Vue.use(iView);
Vue.use(resource);
new Vue({
    el: '#app',
    // router: router,
    router,
    render: h => h(App)
    // template: '<App/>',
    // components: { App }//注册app组件
});
