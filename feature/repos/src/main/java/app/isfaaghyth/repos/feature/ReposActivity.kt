package app.isfaaghyth.repos.feature

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

    override fun initView() {
        //initialize
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

    }

}