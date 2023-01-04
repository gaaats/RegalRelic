package com.ferrero.appla.ottthee.appp

import android.app.Application
import com.onesignal.OneSignal
import com.orhanobut.hawk.Hawk

class ApplicaClassa : Application() {
    companion object {

        var DEEPLfrfrfrfr: String? = "d11"
        var countryCodefrrfrfrfrrf: String? = "countryCode"
        var geomeogtgt = "geo"
        var C1gttggtgt: String? = "c11"
        var appsCheckfrr6 = "appsChecker"
        var linkfrrrfrffr = "link"
        var MAIN_IDffrrfrrf: String? = "mainid"
        const val oneSfrgtftrgt = "50f57bac-3d4f-4677-830b-afca678d66d0"
        val paccccka = "com.ferrero.appla"
        val apps = "edJtjHJgwZDP8Xgcu9rikS"
    }

    override fun onCreate() {
        super.onCreate()
        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE)
        OneSignal.initWithContext(this)
        OneSignal.setAppId(oneSfrgtftrgt)
        gtjtgjitjgit()
    }

    private fun gtjtgjitjgit() {
        gtgtgt()
    }

    private fun gtgtgt() {
        Hawk.init(this).build()
    }


}