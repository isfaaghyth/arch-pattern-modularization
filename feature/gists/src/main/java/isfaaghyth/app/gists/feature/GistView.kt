package isfaaghyth.app.gists.feature

import app.isfaaghyth.abstraction.base.BaseView
import isfaaghyth.app.gists.data.entity.Gist

interface GistView: BaseView {
    fun onResultGist(gists: List<Gist>)
}