package app.isfaaghyth.git_repositories.feature

import app.isfaaghyth.abstraction.base.BasePresenter
import app.isfaaghyth.git_repositories.data.DataManager

/**
 * Created by isfaaghyth on 27/04/19.
 * github: @isfaaghyth
 */
class GitRepositoriesPresenter(private val dataManager: DataManager)
    : BasePresenter<GitRepositoriesView>() {

    fun getRepos(username: String) {
        view.resultRepos(dataManager.getRepos(username))
    }

}