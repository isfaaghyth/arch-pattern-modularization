package app.isfaaghyth.abstraction.base

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import app.isfaaghyth.abstraction.utils.KeyboardUtils
import app.isfaaghyth.abstraction.utils.NetworkUtils

/**
 * Created by isfaaghyth on 11/04/19.
 * github: @isfaaghyth
 */
abstract class BaseActivity: AppCompatActivity(), BaseView {

    /**
     * lifecycle method
     * @method contentView(): @return resLayoutId
     * @method initView()
     */
    abstract fun contentView(): Int
    abstract fun initView()
    abstract fun initInjector()

    /**
     * (optional, use it if needed)
     */
    protected lateinit var savedInstanceState: Bundle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (savedInstanceState != null) {
            this.savedInstanceState = savedInstanceState
        }
        setContentView(contentView())
        initInjector()
        initView()
    }

    override fun onMessage(message: String?) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show()
    }

    override fun onMessage(stringResId: Int) {
        onMessage(getString(stringResId))
    }

    /**
     * check internet connection
     */
    override fun isNetworkConnect(): Boolean {
        return NetworkUtils.connection(this)
    }

    /**
     * hide keyboard layout
     */
    override fun hideKeyboard() {
        return KeyboardUtils.hide(this)
    }

}