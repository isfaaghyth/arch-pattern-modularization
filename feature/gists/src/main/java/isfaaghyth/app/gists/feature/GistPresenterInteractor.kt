package isfaaghyth.app.gists.feature

import app.isfaaghyth.abstraction.base.BasePresenterIntr

interface GistPresenterInteractor: BasePresenterIntr<GistView> {
    fun onGetGist(username: String)
}