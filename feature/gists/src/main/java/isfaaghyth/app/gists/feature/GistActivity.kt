package isfaaghyth.app.gists.feature

import android.util.Log
import app.isfaaghyth.abstraction.base.BaseActivity
import app.isfaaghyth.network.serviceCoroutines
import isfaaghyth.app.gists.R
import isfaaghyth.app.gists.data.AppDataManager
import isfaaghyth.app.gists.data.GistServices
import isfaaghyth.app.gists.data.entity.Gist
import isfaaghyth.app.gists.data.remote.GistRepositoryImpl

class GistActivity: BaseActivity(), GistView {

    override fun contentView(): Int = R.layout.activity_gist

    override fun initInjector() {}

    lateinit var presenter: GistPresenterInteractor

    override fun initView() {
        val service = serviceCoroutines<GistServices>()
        val remote = GistRepositoryImpl(service)
        val dataManager = AppDataManager(remote)
        presenter = GistPresenter(dataManager)
        presenter.attachView(this)

        //example get gist
        presenter.onGetGist("isfaaghyth")
    }

    override fun onDestroy() {
        super.onDestroy()
        presenter.dettachView()
    }

    override fun onResultGist(gists: List<Gist>) {
        for (gist: Gist in gists) {
            Log.d("TAG", gist.url)
        }
    }

}