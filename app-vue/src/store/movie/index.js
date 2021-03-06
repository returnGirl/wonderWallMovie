import {getters} from './getters'
import {actions} from './actions'
import {mutations} from './mutations'
const state = {
  moviesList: {  // 正在上映列表
    subjects: []
  },
  movieDetail: { // 电影详情
    rating: {},
    images: {}
  },
  id: '', // 电影ID
  name: '', // 电影名称
  loginDialogVisible: false, // 登陆对话框
  registerDialogVisible: false, // 注册对话框
  selectSeatDialogVisible: false, // 选座对话框
  user: null, // 登录用户
  selectedSession: null, // 选择场次
}

export default {
  state,
  getters,
  actions,
  mutations
}
