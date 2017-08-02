package com.fanhl.rongclouddemo

import android.app.Application
import io.rong.imkit.RongIM


/**
 * desc:
 * date: 2017/8/2

 * @author fanhl
 */
class App : Application() {
    override fun onCreate() {
        super.onCreate()
        RongIM.init(this)
    }
}
