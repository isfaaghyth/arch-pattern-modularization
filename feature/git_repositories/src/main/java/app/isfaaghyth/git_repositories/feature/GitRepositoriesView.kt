package app.isfaaghyth.git_repositories.feature

import app.isfaaghyth.abstraction.base.BaseView
import app.isfaaghyth.git_repositories.data.entity.Repo

/**
 * Created by isfaaghyth on 27/04/19.
 * github: @isfaaghyth
 */
interface GitRepositoriesView: BaseView {
    fun resultRepos(repos: List<Repo>)
}