package app.isfaaghyth.repos.data.remote

import app.isfaaghyth.repos.data.entity.Repo
import io.reactivex.Single

/**
 * Created by isfaaghyth on 28/04/19.
 * github: @isfaaghyth
 */
interface RemoteRepository {
    fun getGithubRepo(username: String): Single<List<Repo>>
}