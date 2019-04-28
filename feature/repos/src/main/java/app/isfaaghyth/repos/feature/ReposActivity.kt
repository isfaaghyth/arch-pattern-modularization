package app.isfaaghyth.repos.feature

import android.util.Log
import app.isfaaghyth.abstraction.base.BaseActivity
import app.isfaaghyth.repos.R
import app.isfaaghyth.repos.data.entity.Repo
import javax.inject.Inject

/**
 * Created by isfaaghyth on 28/04/19.
 * github: @isfaaghyth
 */
class ReposActivity: BaseActivity(), ReposView {

    override fun contentView(): Int = R.layout.activity_repos_main
    @Inject lateinit var presenter: ReposPresenter

    private fun initInjector() {

    }

    override fun initView() {
        //initialize
        initInjector()
        presenter.attachView(this)

        //hit API
        val username = "isfaaghyth"
        presenter.getGithubRepo(username)
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

}