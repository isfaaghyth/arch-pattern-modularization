package app.isfaaghyth.abstraction.utils

import android.app.Activity
import android.support.v4.app.Fragment
import android.widget.Toast

/**
 * Created by isfaaghyth on 29/04/19.
 * github: @isfaaghyth
 */

fun Activity.toast(message: String?) {
    Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
}

fun Fragment.toast(message: String?) {
    Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
}