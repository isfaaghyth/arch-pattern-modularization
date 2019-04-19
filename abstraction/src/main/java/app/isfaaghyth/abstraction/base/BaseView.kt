package app.isfaaghyth.abstraction.base

import android.support.annotation.StringRes

/**
 * Created by isfaaghyth on 11/04/19.
 * github: @isfaaghyth
 */
interface BaseView {
    /**
     * showing custom message in current activity
     * @param message
     * @param stringResId
     */
    fun onMessage(message: String?)
    fun onMessage(@StringRes stringResId: Int)

    /**
     * check internet connection
     * @return boolean
     */
    fun isNetworkConnect(): Boolean

    /**
     * hide keyboard.
     * you could use this when you have any editText actively
     * @return boolean
     */
    fun hideKeyboard()
}