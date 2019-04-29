package app.isfaaghyth.repos.feature

import app.isfaaghyth.abstraction.base.BasePresenterIntr

/**
 * Created by isfaaghyth on 28/04/19.
 * github: @isfaaghyth
 */
interface ReposPresenterInteractor: BasePresenterIntr<ReposView> {
    /**
     * get github repositories by username
     * @param: username
     */
    fun getGithubRepo(username: String)
}