package com.ferrero.appla.vebvieeev


import androidx.appcompat.app.AppCompatActivity
import android.provider.MediaStore
import android.util.Log
import android.webkit.*
import android.app.Activity
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.*
import com.ferrero.appla.ottthee.appp.ApplicaClassa.Companion.paccccka
import com.google.android.material.snackbar.Snackbar
import com.onesignal.OneSignal
import com.ferrero.appla.ottthee.appp.ApplicaClassa.Companion.MAIN_IDffrrfrrf
import com.ferrero.appla.ottthee.appp.ApplicaClassa.Companion.linkfrrrfrffr
import com.orhanobut.hawk.Hawk
import org.json.JSONException
import org.json.JSONObject
import java.io.File
import java.io.IOException
import android.widget.Toast
import androidx.lifecycle.lifecycleScope
import com.appsflyer.AppsFlyerLib
import com.ferrero.appla.R
import com.ferrero.appla.databinding.ActivityVebVieeev2Binding
import com.ferrero.appla.ottthee.appp.ApplicaClassa.Companion.C1gttggtgt
import com.ferrero.appla.ottthee.appp.ApplicaClassa.Companion.DEEPLfrfrfrfr
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch


class VebVieeevActivity2 : AppCompatActivity() {

    override fun onBackPressed() {
        if (bgbgbgbgbg.canGoBack()) {
            if (hyhyhyhy) {
                bgbgbgbgbg.stopLoading()
                bgbgbgbgbg.loadUrl(ccdcdcdcdf)
            }
            this.hyhyhyhy = true
            bgbgbgbgbg.goBack()
            Handler(Looper.getMainLooper()).postDelayed(Runnable {
                hyhyhyhy = false
            }, 2000)

        } else {
            super.onBackPressed()
        }
    }

    private val gggg = 1

    private fun bgnhhhh() {
        val settingssss = bgbgbgbgbg.settings
        settingssss.javaScriptEnabled = true

        settingssss.useWideViewPort = true

        settingssss.loadWithOverviewMode = true
        settingssss.allowFileAccess = true
        settingssss.domStorageEnabled = true
        settingssss.userAgentString = settingssss.userAgentString.replace("; wv", "")

        settingssss.javaScriptCanOpenWindowsAutomatically = true
        settingssss.setSupportMultipleWindows(false)

        settingssss.displayZoomControls = false
        settingssss.builtInZoomControls = true
        settingssss.setSupportZoom(true)

        settingssss.pluginState = WebSettings.PluginState.ON
        settingssss.mixedContentMode = WebSettings.MIXED_CONTENT_ALWAYS_ALLOW
        settingssss.setAppCacheEnabled(true)

        settingssss.allowContentAccess = true
    }

    var nhnnhjj: ValueCallback<Array<Uri>>? = null
    lateinit var bgbgbgbgbg: WebView

    var ccdcdcdcdf = ""
    fun saaaveeeee(lurlurlurlurlur: String?) {
        if (!lurlurlurlurlur!!.contains("t.me")) {

            if (ccdcdcdcdf == "") {
                ccdcdcdcdf = getSharedPreferences(
                    "SP_WEBVIEW_PREFS",
                    AppCompatActivity.MODE_PRIVATE
                ).getString(
                    "SAVED_URL",
                    lurlurlurlurlur
                ).toString()

                val sharedPreferences =
                    getSharedPreferences("SP_WEBVIEW_PREFS", AppCompatActivity.MODE_PRIVATE)
                val jukikiikik = sharedPreferences.edit()
                jukikiikik.putString("SAVED_URL", lurlurlurlurlur)
                jukikiikik.apply()
            }
        }
    }

    lateinit var klpip: ActivityVebVieeev2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        klpip = ActivityVebVieeev2Binding.inflate(layoutInflater)
        setContentView(klpip.root)

        bgbgbgbgbg = klpip.viiiiiiiiiiii
        hykhykokohyk()


        val cookieManager = CookieManager.getInstance()
        cookieManager.setAcceptCookie(true)
        cookieManager.setAcceptThirdPartyCookies(bgbgbgbgbg, true)
        bgnhhhh()
        val activityyyy: Activity = this
        bgbgbgbgbg.webViewClient = object : WebViewClient() {


            override fun shouldOverrideUrlLoading(view: WebView, url: String): Boolean {
                try {
                    if (URLUtil.isNetworkUrl(url)) {
                        return false
                    }
                    if (hbbgbgbgbg(url)) {

                        val jkojoujogttgtg = Intent(Intent.ACTION_VIEW)
                        jkojoujogttgtg.data = Uri.parse(url)
                        startActivity(jkojoujogttgtg)
                    } else {
                        Toast.makeText(
                            applicationContext,
                            "Application is not installed",
                            Toast.LENGTH_LONG
                        ).show()
                        startActivity(
                            Intent(
                                Intent.ACTION_VIEW,
                                Uri.parse("https://play.google.com/store/apps/details?id=org.telegram.messenger")
                            )
                        )
                    }
                    return true
                } catch (e: Exception) {
                    return false
                }
                view.loadUrl(url)
            }


            override fun onPageFinished(view: WebView, url: String) {
                super.onPageFinished(view, url)
                saaaveeeee(url)
            }

            override fun onReceivedError(
                view: WebView,
                errorCode: Int,
                description: String,
                failingUrl: String
            ) {
                Toast.makeText(activityyyy, description, Toast.LENGTH_SHORT).show()
            }


        }
        bgbgbgbgbg.webChromeClient = object : WebChromeClient() {
            override fun onShowFileChooser(
                webView: WebView, filePathCallback: ValueCallback<Array<Uri>>,
                fileChooserParams: FileChooserParams
            ): Boolean {
                nhnnhjj?.onReceiveValue(null)
                nhnnhjj = filePathCallback
                var cvdf: Intent? = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
                if (cvdf!!.resolveActivity(packageManager) != null) {

                    var ghgtgt: File? = null
                    try {
                        ghgtgt = bgnjbgngbg()
                        cvdf.putExtra("PhotoPath", kgjfhdkxfjujuuj)
                    } catch (ex: IOException) {
                    }

                    if (ghgtgt != null) {
                        kgjfhdkxfjujuuj = "file:" + ghgtgt.absolutePath
                        cvdf.putExtra(
                            MediaStore.EXTRA_OUTPUT,
                            Uri.fromFile(ghgtgt)
                        )
                    } else {
                        cvdf = null
                    }
                }
                val bgnhbghgg = Intent(Intent.ACTION_GET_CONTENT)
                bgnhbghgg.addCategory(Intent.CATEGORY_OPENABLE)
                bgnhbghgg.type = "image/*"
                val bbggjjgjggj: Array<Intent?> =
                    cvdf?.let { arrayOf(it) } ?: arrayOfNulls(0)
                val hyjhyjhyjuhyjuhy = Intent(Intent.ACTION_CHOOSER)
                hyjhyjhyjuhyjuhy.putExtra(Intent.EXTRA_INTENT, bgnhbghgg)
                hyjhyjhyjuhyjuhy.putExtra(Intent.EXTRA_TITLE, getString(R.string.take_imagiiiiiiiiiiiigtgt))
                hyjhyjhyjuhyjuhy.putExtra(Intent.EXTRA_INITIAL_INTENTS, bbggjjgjggj)
                startActivityForResult(
                    hyjhyjhyjuhyjuhy, gggg
                )
                return true
            }

            @Throws(IOException::class)
            private fun bgnjbgngbg(): File {
                var frfrrfr = File(
                    Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES),
                    "DirectoryNameHere"
                )
                if (!frfrrfr.exists()) {
                    frfrrfr.mkdirs()
                }

                frfrrfr =
                    File(frfrrfr.toString() + File.separator + "IMG_" + System.currentTimeMillis() + ".jpg")
                return frfrrfr
            }

        }

        bgbgbgbgbg.loadUrl(bgnjbgnjngg())
    }

    private fun hykhykokohyk() {
        Snackbar.make(
            klpip.root, "Loading...",
            Snackbar.LENGTH_LONG
        ).show()
    }

    var kgjfhdkxfjujuuj: String? = null

    private fun jukkiikik(string: String) {
        OneSignal.setExternalUserId(
            string,
            object : OneSignal.OSExternalUserIdUpdateCompletionHandler {
                override fun onSuccess(results: JSONObject) {
                    try {
                        if (results.has("push") && results.getJSONObject("push").has("success")) {
                            val frrfrfrrf = results.getJSONObject("push").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for push status: $frrfrfrrf"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                    try {
                        if (results.has("email") && results.getJSONObject("email").has("success")) {
                            val vvvvv =
                                results.getJSONObject("email").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for email status: $vvvvv"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                    try {
                        if (results.has("sms") && results.getJSONObject("sms").has("success")) {
                            val kiikik = results.getJSONObject("sms").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for sms status: $kiikik"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                }

                override fun onFailure(error: OneSignal.ExternalIdError) {
                    OneSignal.onesignalLog(
                        OneSignal.LOG_LEVEL.VERBOSE,
                        "Set external user id done with error: $error"
                    )
                }
            })
    }


    private fun bgnjbgnjngg(): String {

        val mmnnhnh = "naming"
        val deppfrfrf = "deeporg"

        val vvvvv = "deviceID="
        val bbggbbg = "sub_id_6="
        val nhnhnhnh = "ad_id="
        val nnhnhnh = "sub_id_4="
        val mjmjmjmjmj = "sub_id_1="
        val jnnjnjnj = "sub_id_5="


        val nhnjjukiik = getSharedPreferences("SP_WEBVIEW_PREFS", AppCompatActivity.MODE_PRIVATE)

        val pppop = paccccka

        val ghujuikik: String? = gtkgtkkgt()
        val gthyhyhyhy: String? = Hawk.get(MAIN_IDffrrfrrf, "null")
        val vgbgbhhhffd: String? = Hawk.get(DEEPLfrfrfrfr, "null")

        val bgbbggb = AppsFlyerLib.getInstance().getAppsFlyerUID(this)


        AppsFlyerLib.getInstance().setCollectAndroidID(true)


        val vfvfddd = Build.VERSION.RELEASE

        val hyjujuju = Hawk.get(linkfrrrfrffr, "null")

        var jujjugffffff = ""
        if (ghujuikik != "null") {
            jujjugffffff =
                "$hyjujuju$mjmjmjmjmj$ghujuikik&$vvvvv$bgbbggb&$nhnhnhnh$gthyhyhyhy&$nnhnhnh$pppop&$jnnjnjnj$vfvfddd&$bbggbbg$mmnnhnh"
            jukkiikik(bgbbggb.toString())
        } else {
            jujjugffffff =
                "$hyjujuju$mjmjmjmjmj$vgbgbhhhffd&$vvvvv$bgbbggb&$nhnhnhnh$gthyhyhyhy&$nnhnhnh$pppop&$jnnjnjnj$vfvfddd&$bbggbbg$deppfrfrf"
            jukkiikik(bgbbggb.toString())
        }

        return nhnjjukiik.getString("SAVED_URL", jujjugffffff).toString()
    }

    private fun gtkgtkkgt() = Hawk.get(C1gttggtgt, "null")


    private fun hbbgbgbgbg(uri: String): Boolean {

        val kiikikik = packageManager
        try {

            kiikikik.getPackageInfo("org.telegram.messenger", PackageManager.GET_ACTIVITIES)

            return true
        } catch (e: PackageManager.NameNotFoundException) {

        }
        return false
    }

    private var hyhyhyhy = false

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if (requestCode != gggg || nhnnhjj == null) {
            super.onActivityResult(requestCode, resultCode, data)
            return
        }
        var arrayOfUrisssss: Array<Uri>? = null

        if (resultCode == AppCompatActivity.RESULT_OK) {
            if (data == null || data.data == null) {
                arrayOfUrisssss = arrayOf(Uri.parse(kgjfhdkxfjujuuj))
            } else {
                val vfvddsser = data.dataString
                if (vfvddsser != null) {
                    arrayOfUrisssss = arrayOf(Uri.parse(vfvddsser))
                }
            }
        }
        nhnnhjj?.onReceiveValue(arrayOfUrisssss)
        nhnnhjj = null
    }


}