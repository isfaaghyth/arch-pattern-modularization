package app.isfaaghyth.repos.feature

import android.util.Log
import app.isfaaghyth.abstraction.base.BaseActivity
import app.isfaaghyth.abstraction.utils.toast
import app.isfaaghyth.repos.R
import app.isfaaghyth.repos.data.entity.Repo
import app.isfaaghyth.repos.di.DaggerReposComponent
import app.isfaaghyth.repos.di.ReposModule
import javax.inject.Inject

/**
 * Created by isfaaghyth on 28/04/19.
 * github: @isfaaghyth
 */
class ReposActivity: BaseActivity(), ReposView {

    override fun contentView(): Int = R.layout.activity_repos_main
    @Inject lateinit var presenter: ReposPresenterInteractor

    override fun initInjector() {
        DaggerReposComponent.builder()
            .reposModule(ReposModule())
            .build()
            .inject(this)
    }

    override fun initView() {
        //init
        presenter.attachView(this)

        //hit API
        try {
            val username = intent?.data?.lastPathSegment as String
            presenter.getGithubRepo(username)
        } catch (e: Exception) {
            toast(e.message)
            finish()
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        presenter.dettachView()
    }

    override fun resultGithubRepo(result: List<Repo>) {
        for (repo: Repo in result) {
            Log.d("MyRepo", repo.name)
        }
    }

    override fun onErrorGetGithubRepo() {
        toast("Opps! terjadi kesalahan.")
    }

    override fun progressLoader(state: ReposState) {
        when (state) {
            is ReposState.Progress -> {
                //showing progress dialog
            }
            is ReposState.Complete -> {
                //hide progress dialog
            }
        }
    }

}