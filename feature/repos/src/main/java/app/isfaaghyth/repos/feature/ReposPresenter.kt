package app.isfaaghyth.repos.feature

import app.isfaaghyth.abstraction.base.BasePresenter
import app.isfaaghyth.repos.data.DataManager
import io.reactivex.schedulers.Schedulers

/**
 * Created by isfaaghyth on 28/04/19.
 * github: @isfaaghyth
 */
class ReposPresenter(
    private val dataManager: DataManager
    ): BasePresenter<ReposView>(), ReposPresenterInteractor {

    override fun getGithubRepo(username: String) {
        subscribe {
            dataManager.getGithubRepo(username)
                .subscribeOn(Schedulers.io())
                .subscribe {
                    result -> view.resultGithubRepo(result)
                }
        }
    }
}