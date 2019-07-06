package isfaaghyth.app.gists.data

import isfaaghyth.app.gists.data.entity.Gist
import isfaaghyth.app.gists.data.remote.GistRepository
import kotlinx.coroutines.Deferred
import javax.inject.Inject

class AppDataManager @Inject constructor(private val remote: GistRepository): DataManager {

    override fun getGithubGist(username: String): Deferred<List<Gist>>
    = remote.getGithubGist(username)

}