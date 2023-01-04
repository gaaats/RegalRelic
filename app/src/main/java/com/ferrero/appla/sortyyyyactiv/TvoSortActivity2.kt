package com.ferrero.appla.sortyyyyactiv


import com.appsflyer.AppsFlyerConversionListener
import com.appsflyer.AppsFlyerLib
import com.ferrero.appla.ottthee.appp.ApplicaClassa.Companion.appsCheckfrr6
import com.ferrero.appla.ottthee.appp.ApplicaClassa.Companion.countryCodefrrfrfrfrrf
import com.ferrero.appla.ottthee.appp.ApplicaClassa.Companion.geomeogtgt
import com.ferrero.appla.vebvieeev.VebVieeevActivity2
import com.ferrero.appla.actiiiiv.GameeeeeeeeActivity2
import com.ferrero.appla.databinding.ActivityTvoSort2Binding
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ferrero.appla.ottthee.appp.ApplicaClassa.Companion.C1gttggtgt
import com.ferrero.appla.ottthee.appp.ApplicaClassa.Companion.DEEPLfrfrfrfr
import com.ferrero.appla.ottthee.appp.ApplicaClassa.Companion.apps
import com.orhanobut.hawk.Hawk
import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit

class TvoSortActivity2 : AppCompatActivity() {


    private fun lllllll() {
        val gtggtgtggggg5 = Intent(this@TvoSortActivity2, GameeeeeeeeActivity2::class.java)
        gtgtugtugt()
        gtjgtjigtijgtji()
        gjgtgtji()
        startActivity(gtggtgtggggg5)
        finish()
    }

    private fun intWEdrfrrfiiii() {
        val bhnhnhhnnnbnb = Intent(this@TvoSortActivity2, VebVieeevActivity2::class.java)
        gtgtugtugt()
        gtjgtjigtijgtji()
        gjgtgtji()
        startActivity(bhnhnhhnnnbnb)
        finish()
    }

    private fun gtgtugtugt() {
        Hawk.put(geomeogtgt, null)
    }

    private fun gtjgtjigtijgtji() {
        Hawk.put(countryCodefrrfrfrfrrf, null)
    }

    private fun gjgtgtji() {
        Hawk.put(appsCheckfrr6, null)
    }

    lateinit var activityTvoSort2Binding: ActivityTvoSort2Binding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        activityTvoSort2Binding = ActivityTvoSort2Binding.inflate(layoutInflater)
        setContentView(activityTvoSort2Binding.root)

        val vbvbvvbv: String? = Hawk.get(appsCheckfrr6, "null")

        if (vbvbvvbv == "1") {
            AppsFlyerLib.getInstance()
                .init(apps, juujggfff, applicationContext)
            AppsFlyerLib.getInstance().start(this)
        }

        jhjyhyjihyjihyj()

    }

    private fun jhjyhyjihyjihyj() {

        val ooony = "1"

        val nulllly = "null"
        val mjmkkmkkm: String = Hawk.get(geomeogtgt)
        val nhggfff: String? = Hawk.get(appsCheckfrr6, "null")
        var olol: String? = Hawk.get(C1gttggtgt)
        val koko: String = Hawk.get(countryCodefrrfrfrfrrf, "null")
        val moko: String? = Hawk.get(DEEPLfrfrfrfr, "null")

        val tdb2 = "tdb2"

        if (nhggfff == ooony) {
            val bgbgbgbgbg = Executors.newSingleThreadScheduledExecutor()
            bgbgbgbgbg.scheduleAtFixedRate({
                if (olol != null) {
                    if (olol!!.contains("tdb2") || mjmkkmkkm.contains(koko) || moko!!.contains("tdb2")) {
                        bgbgbgbgbg.shutdown()
                        intWEdrfrrfiiii()
                    } else {
                        bgbgbgbgbg.shutdown()
                        lllllll()

                    }
                } else {
                    olol = Hawk.get(C1gttggtgt)

                }
            }, 0, 1, TimeUnit.SECONDS)
        }  else if (mjmkkmkkm.contains(koko)) {
            gtkkgtkgtkgt()
        } else {
            lllllll()
        }

    }

    private fun gtkkgtkgtkgt() {
        intWEdrfrrfiiii()
    }


    private val juujggfff = object : AppsFlyerConversionListener {
        override fun onConversionDataSuccess(data: MutableMap<String, Any>?) {
            val gotten = data?.get("campaign").toString()
            Hawk.put(C1gttggtgt, gotten)
        }
        override fun onConversionDataFail(p0: String?) {}
        override fun onAppOpenAttribution(p0: MutableMap<String, String>?) {}
        override fun onAttributionFailure(p0: String?) {}
    }


}