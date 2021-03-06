// The Vue build version to load with the `import` command
// (runtime-only or standalone) has been set in webpack.base.conf with an alias.
import Vue from 'vue'
import App from './App'
import router from './router/index.js'
import store from './store/index'
import ElementUi from 'element-ui'
import VueResource from 'vue-resource'
// import store from './store'

require.ensure([], function () {
  require('element-ui/lib/theme-default/index.css')
})

Vue.use(ElementUi)
Vue.use(VueResource)
Vue.config.productionTip = false

/* eslint-disable no-new */
new Vue({
  el: '#app',
  router,
  store,
  template: '<App/>',
  components: { App }
})
