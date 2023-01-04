package com.ferrero.appla.sortyyyyactiv

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ferrero.appla.R
import com.ferrero.appla.actiiiiv.GameeeeeeeeActivity2
import com.ferrero.appla.ottthee.appp.ApplicaClassa
import com.ferrero.appla.ottthee.appp.ApplicaClassa.Companion.MAIN_IDffrrfrrf
import com.ferrero.appla.ottthee.appp.ApplicaClassa.Companion.appsCheckfrr6
import com.google.android.gms.ads.identifier.AdvertisingIdClient
import com.orhanobut.hawk.Hawk
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class OneSortActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_one_sort2)
        checkCountryfrfrfrr()
    }

    private fun hyyhyggggg(): String? {
        val checkftgtgtgtt: String? = Hawk.get(appsCheckfrr6)
        return checkftgtgtgtt
    }

    private fun checkCountryfrfrfrr() {

        val bgbbggb = hyyhyggggg()

        if (bgbbggb == "0") {
            intALonehyhyyfrrf()

        } else {
            GlobalScope.launch(Dispatchers.Default) {
                gfgtgtt()
            }
            intAfbftgttgtgtttgtgt()
        }
    }

    private fun intALonehyhyyfrrf() {
        kgtkgtgtk()
    }

    private fun kgtkgtgtk() {
        val ddede = Intent(this@OneSortActivity2, GameeeeeeeeActivity2::class.java)
        Hawk.put(ApplicaClassa.geomeogtgt, null)
        gtjigtijgtjgt()
        startActivity(ddede)
        finish()
    }

    private fun gtjigtijgtjgt() {
        Hawk.put(ApplicaClassa.countryCodefrrfrfrfrrf, null)
        Hawk.put(appsCheckfrr6, null)
    }

    private fun intAfbftgttgtgtttgtgt() {
        gtjgtjigtji()
    }

    private fun gtjgtjigtji() {
        val hyhyyhyhy = Intent(this@OneSortActivity2, TvoSortActivity2::class.java)
        startActivity(hyhyyhyhy)
        finish()
    }

    private fun gfgtgtt() {
        val gtgttadInfo = AdvertisingIdClient(applicationContext)
        gtgttadInfo.start()
        val adIdInfofrrrf = gtgttadInfo.info.id
        Hawk.put(MAIN_IDffrrfrrf, adIdInfofrrrf)
    }



}