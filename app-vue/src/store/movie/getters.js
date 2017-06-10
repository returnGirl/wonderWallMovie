/**
 * @author 王镇佳 <wzjfloor@163.com>
 * @date 2017/04/17
 */
export const getters = {
  hotmoviesList: state => {
    return state.hotmoviesList
  },
  moviesList: state => {
    return state.moviesList
  },
  movieDetail: state => {
    return state.movieDetail
  },
  loginDialogVisible: state => {
    return state.loginDialogVisible
  },
  registerDialogVisible: state => {
    return state.registerDialogVisible
  },
  selectSeatDialogVisible: state => {
    return state.selectSeatDialogVisible
  },
  selectedSession: state => {
    return state.selectedSession
  },
  cinemaList: state => {
    return state.cinemaList;
  },
  sessionList: state => {
    return state.sessionList;
  },
  seatInfo: state => {
    return state.seatInfo;
  },
  selectedCinema: state => {
    return state.selectedCinema
  }
}
