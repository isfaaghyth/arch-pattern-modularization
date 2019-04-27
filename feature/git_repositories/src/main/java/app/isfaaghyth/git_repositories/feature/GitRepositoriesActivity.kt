package app.isfaaghyth.git_repositories.feature

import android.content.Context
import android.content.Intent
import app.isfaaghyth.abstraction.base.BaseActivity
import app.isfaaghyth.git_repositories.R
import app.isfaaghyth.git_repositories.data.entity.Repo
import app.isfaaghyth.git_repositories.di.DaggerGitRepositoriesComponent
import app.isfaaghyth.git_repositories.di.GitRepositoriesModule
import javax.inject.Inject

/**
 * Created by isfaaghyth on 27/04/19.
 * github: @isfaaghyth
 */
class GitRepositoriesActivity: BaseActivity(), GitRepositoriesView {

    companion object {
        private const val GITHUB_USERNAME = "github_username"

        fun show(context: Context, username: String): Intent {
            val intent = Intent(context, GitRepositoriesActivity::class.java)
            intent.putExtra(GITHUB_USERNAME, username)
            return intent
        }
    }

    override fun contentView(): Int = R.layout.activity_git_repositories
    @Inject lateinit var presenter: GitRepositoriesPresenter

    private fun initInjector() {
        DaggerGitRepositoriesComponent.builder()
            .gitRepositoriesModule(GitRepositoriesModule())
            .build()
            .inject(this)
    }

    override fun initView() {
        //initialize
        initInjector()
        presenter.attachView(this)

        //hit APIs
        val username = intent?.data?.lastPathSegment as String
        if (username == "isfaaghyth") {
            presenter.getRepos(username)
        } else {
            onMessage("oops! github username not found")
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        presenter.dettachView()
    }

    override fun resultRepos(repos: List<Repo>) {
        for (repo: Repo in repos) {
            onMessage(repo.name)
        }
    }

}