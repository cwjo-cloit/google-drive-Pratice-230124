
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import FileInfoManager from "./components/listers/FileInfoCards"
import FileInfoDetail from "./components/listers/FileInfoDetail"

import FileIndexManager from "./components/listers/FileIndexCards"
import FileIndexDetail from "./components/listers/FileIndexDetail"

import FileVideoManager from "./components/listers/FileVideoCards"
import FileVideoDetail from "./components/listers/FileVideoDetail"


import DashboardView from "./components/DashboardView"
import DashboardViewDetail from "./components/DashboardViewDetail"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/fileInfos',
                name: 'FileInfoManager',
                component: FileInfoManager
            },
            {
                path: '/fileInfos/:id',
                name: 'FileInfoDetail',
                component: FileInfoDetail
            },

            {
                path: '/fileIndices',
                name: 'FileIndexManager',
                component: FileIndexManager
            },
            {
                path: '/fileIndices/:id',
                name: 'FileIndexDetail',
                component: FileIndexDetail
            },

            {
                path: '/fileVideos',
                name: 'FileVideoManager',
                component: FileVideoManager
            },
            {
                path: '/fileVideos/:id',
                name: 'FileVideoDetail',
                component: FileVideoDetail
            },


            {
                path: '/dashboards',
                name: 'DashboardView',
                component: DashboardView
            },
            {
                path: '/dashboards/:id',
                name: 'DashboardViewDetail',
                component: DashboardViewDetail
            },



    ]
})
