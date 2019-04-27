package app.isfaaghyth.abstraction.utils

import android.content.Context
import android.net.ConnectivityManager

/**
 * Created by isfaaghyth on 19/04/19.
 * github: @isfaaghyth
 */
object NetworkUtils {

    fun connection(context: Context): Boolean {
        val connectivityManager = context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        return connectivityManager.activeNetworkInfo != null && connectivityManager.activeNetworkInfo.isConnected
    }

}