package isfaaghyth.app.gists.feature

import app.isfaaghyth.abstraction.base.BasePresenter
import isfaaghyth.app.gists.data.DataManager
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import javax.inject.Inject

class GistPresenter @Inject constructor(
        private val dataManager: DataManager
    ): BasePresenter<GistView>(), GistPresenterInteractor {

    override fun onGetGist(username: String) {
        CoroutineScope(Dispatchers.IO).launch {
            val data = dataManager.getGithubGist(username).await()
            withContext(Dispatchers.Main) {
                view.onResultGist(data)
            }
        }
    }

}