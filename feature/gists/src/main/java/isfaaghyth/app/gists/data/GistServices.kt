package isfaaghyth.app.gists.data

import isfaaghyth.app.gists.data.entity.Gist
import kotlinx.coroutines.Deferred
import retrofit2.http.GET
import retrofit2.http.Path

interface GistServices {

    @GET("users/{username}/gists")
    fun getGithubGist(
        @Path("username") username: String
    ): Deferred<List<Gist>>

    @GET("users/{username}/gist")
    fun getGithubGistError(
        @Path("username") username: String
    ): Deferred<List<Gist>>

}