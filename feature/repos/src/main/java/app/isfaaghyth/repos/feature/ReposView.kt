package app.isfaaghyth.repos.feature

import app.isfaaghyth.abstraction.base.BaseView
import app.isfaaghyth.repos.data.entity.Repo

/**
 * Created by isfaaghyth on 28/04/19.
 * github: @isfaaghyth
 */
interface ReposView: BaseView {
    fun resultGithubRepo(result: List<Repo>)
}