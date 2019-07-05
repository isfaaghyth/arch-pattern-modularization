package isfaaghyth.app.gists.feature

import android.content.Context
import android.content.Intent
import android.util.Log
import app.isfaaghyth.abstraction.base.BaseActivity
import app.isfaaghyth.network.serviceCoroutines
import isfaaghyth.app.gists.R
import isfaaghyth.app.gists.data.AppDataManager
import isfaaghyth.app.gists.data.GistServices
import isfaaghyth.app.gists.data.entity.Gist
import isfaaghyth.app.gists.data.remote.GistRepositoryImpl
import isfaaghyth.app.gists.di.DaggerGistComponent
import isfaaghyth.app.gists.di.GistModule
import javax.inject.Inject

class GistActivity: BaseActivity(), GistView {

    companion object {
        const val GITHUB_USERNAME = "github_username"

        fun open(context: Context, username: String): Intent {
            val intent = Intent(context, GistActivity::class.java)
            intent.putExtra(GITHUB_USERNAME, username)
            return intent
        }
    }

    override fun contentView(): Int = R.layout.activity_gist

    override fun initInjector() {
        DaggerGistComponent.builder()
            .gistModule(GistModule())
            .build()
            .inject(this)
    }

    @Inject lateinit var presenter: GistPresenterInteractor

    override fun initView() {
        presenter.attachView(this)

        //example get gist
        val username = intent?.getStringExtra(GITHUB_USERNAME)?: ""
        if (username.isNotEmpty()) {
            presenter.onGetGist(username)
        } else {
            finish()
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        presenter.dettachView()
    }

    override fun onResultGist(gists: List<Gist>) {
        for (gist: Gist in gists) {
            Log.d("GIST URL", gist.url)
        }
    }

}