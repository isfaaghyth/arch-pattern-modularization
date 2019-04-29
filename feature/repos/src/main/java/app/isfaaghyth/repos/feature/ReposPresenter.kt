package app.isfaaghyth.repos.feature

import app.isfaaghyth.abstraction.base.BasePresenter
import app.isfaaghyth.abstraction.utils.rx.SchedulerProvider
import app.isfaaghyth.abstraction.utils.rx.with
import app.isfaaghyth.repos.data.DataManager
import io.reactivex.rxkotlin.subscribeBy
import javax.inject.Inject

/**
 * Created by isfaaghyth on 28/04/19.
 * github: @isfaaghyth
 */
class ReposPresenter @Inject constructor(
    private val dataManager: DataManager,
    private val schedulerProvider: SchedulerProvider
    ): BasePresenter<ReposView>(), ReposPresenterInteractor {

    override fun getGithubRepo(username: String) {
        if (view.isNetworkConnect()) {
            view.progressLoader(ReposState.Progress)
            subscribe {
                dataManager.getGithubRepo(username)
                    .with(schedulerProvider)
                    .subscribeBy(
                        onSuccess = {
                            view.resultGithubRepo(it)
                            view.progressLoader(ReposState.Complete)
                        },
                        onError = {
                            view.onErrorGetGithubRepo()
                            view.progressLoader(ReposState.Progress)
                        }
                    )
            }
        } else {
            //when network isn't connected,
            //load data from localRepository
        }
    }
}