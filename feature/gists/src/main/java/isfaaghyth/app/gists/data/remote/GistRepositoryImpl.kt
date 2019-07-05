package isfaaghyth.app.gists.data.remote

import isfaaghyth.app.gists.data.GistServices
import isfaaghyth.app.gists.data.entity.Gist
import kotlinx.coroutines.Deferred

class GistRepositoryImpl(private val services: GistServices): GistRepository {

    override fun getGithubGist(username: String): Deferred<List<Gist>>
    = services.getGithubGist(username)

    /**
     * @TODO(testing purpose)
     */
    fun getGithubGistError(username: String): Deferred<List<Gist>>
    = services.getGithubGistError(username)

}