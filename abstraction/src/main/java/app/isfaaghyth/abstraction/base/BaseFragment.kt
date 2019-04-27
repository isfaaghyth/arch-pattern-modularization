package app.isfaaghyth.abstraction.base

import android.app.Activity
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import app.isfaaghyth.abstraction.utils.KeyboardUtils
import app.isfaaghyth.abstraction.utils.NetworkUtils

/**
 * Created by isfaaghyth on 11/04/19.
 * github: @isfaaghyth
 */
abstract class BaseFragment: Fragment(), BaseView {

    /**
     * lifecycle method
     * @method contentView(): @return resLayoutId
     * @method initView()
     */
    abstract fun contentView(): Int
    abstract fun initView()

    /**
     * (optional, use it if needed)
     */
    protected lateinit var savedInstanceState: Bundle

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(contentView(), container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        if (savedInstanceState != null) {
            this.savedInstanceState = savedInstanceState
        }
        initView()
    }

    override fun onMessage(message: String?) {
        Toast.makeText(context, message, Toast.LENGTH_LONG).show()
    }

    override fun onMessage(stringResId: Int) {
        onMessage(getString(stringResId))
    }

    override fun isNetworkConnect(): Boolean {
        return if (context != null) {
            NetworkUtils.connection(context!!)
        } else {
            false
        }
    }

    override fun hideKeyboard() {
        return (activity as Activity).let {
            KeyboardUtils.hide(it)
        }
    }

}