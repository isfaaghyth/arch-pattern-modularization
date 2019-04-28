package app.isfaaghyth.repos.data

import app.isfaaghyth.repos.data.entity.Repo
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Path

/**
 * Created by isfaaghyth on 28/04/19.
 * github: @isfaaghyth
 */
interface ReposServices {

    /**
     * get github repositories by username
     * @param: username
     * @return: Observable with Array of Object
     */
    @GET("users/{username}/repos")
    fun getGithubRepo(
        @Path("username") username: String
    ): Single<List<Repo>>

}