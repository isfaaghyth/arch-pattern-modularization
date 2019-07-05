package isfaaghyth.app.gists.data.remote

import isfaaghyth.app.gists.data.entity.Gist
import kotlinx.coroutines.Deferred

interface GistRepository {
    fun getGithubGist(username: String): Deferred<List<Gist>>
}