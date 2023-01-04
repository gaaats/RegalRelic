package com.ferrero.appla

import android.content.Context
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit
import android.content.Intent
import com.ferrero.appla.ottthee.appp.ApplicaClassa.Companion.countryCodefrrfrfrfrrf
import com.ferrero.appla.ottthee.appp.ApplicaClassa.Companion.geomeogtgt
import com.ferrero.appla.serrvice.SsssserviceApi
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.facebook.applinks.AppLinkData
import com.ferrero.appla.databinding.ActivityMainBinding
import com.ferrero.appla.ottthee.appp.ApplicaClassa

import com.ferrero.appla.sortyyyyactiv.OneSortActivity2
import com.orhanobut.hawk.Hawk


class MainActivity : AppCompatActivity() {


    private suspend fun hkhkhkhk() {
        val liiink = "http://pro.ip-api.com/"

        val ssssserviceApi = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(liiink)
            .build()
            .create(SsssserviceApi::class.java)
        val frfrrfr = ssssserviceApi.getData().body()?.countryCodefgtgt56556gtgt

        gjtjgtjtigtgij(frfrrfr)
    }

    private fun gjtjgtjtigtgij(frfrrfr: String?) {
        Hawk.put(countryCodefrrfrfrfrrf, frfrrfr)
    }

    private lateinit var mainBinding: ActivityMainBinding

    fun gtgtgtgttg(context: Context) {
        AppLinkData.fetchDeferredAppLinkData(
            context
        ) { appLinkData: AppLinkData? ->
            appLinkData?.let {
                val jujuujujuj = appLinkData.targetUri.host.toString()
                Hawk.put(ApplicaClassa.DEEPLfrfrfrfr, jujuujujuj)
            }
            if (appLinkData == null) {
            }
        }
    }

    private suspend fun hyyhjuuu() {

        val llllllllllll = "http://regalrelic.fun/"

        val ssssserviceApi = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(llllllllllll)
            .build()
            .create(SsssserviceApi::class.java)
        val jkjkjk = ssssserviceApi.getDataDev().body()?.nhhhnh.toString()
        val ggggg5 = ssssserviceApi.getDataDev().body()?.ffgghj.toString()
        val ddddd6 = ssssserviceApi.getDataDev().body()?.vfvfvf.toString()

        gtjgtjigtjigtji(jkjkjk)
        Hawk.put(ApplicaClassa.appsCheckfrr6, ggggg5)
        Hawk.put(ApplicaClassa.geomeogtgt, ddddd6)

    }

    private fun gtjgtjigtjigtji(jkjkjk: String) {
        Hawk.put(ApplicaClassa.linkfrrrfrffr, jkjkjk)
    }


    private val job: Job = GlobalScope.launch(Dispatchers.IO) {
        hkhkhkhk()
        hyyhjuuu()
    }

    private fun bggbhhh() {
        val intent = Intent(this@MainActivity, OneSortActivity2::class.java)
        startActivity(intent)
        finish()
    }

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainBinding.root)

        gtgtgtgttg(this)

        val scheduledExecutorServiceeeee = Executors.newSingleThreadScheduledExecutor()
        var jujuhh: String? = Hawk.get(countryCodefrrfrfrfrrf, null)
        var vfffgg: String? = Hawk.get(geomeogtgt, null)
        scheduledExecutorServiceeeee.scheduleAtFixedRate({
            if (jujuhh != null && vfffgg != null) {
                scheduledExecutorServiceeeee.shutdown()
                bggbhhh()
            } else {
                jujuhh = Hawk.get(countryCodefrrfrfrfrrf)
                vfffgg = Hawk.get(geomeogtgt)
            }
        }, 0, 1, TimeUnit.SECONDS)

        GlobalScope.launch(Dispatchers.IO) {
            job
        }
    }


}