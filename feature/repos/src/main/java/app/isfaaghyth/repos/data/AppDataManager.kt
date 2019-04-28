package app.isfaaghyth.repos.data

import app.isfaaghyth.repos.data.entity.Repo
import app.isfaaghyth.repos.data.remote.RemoteRepository
import io.reactivex.Single

/**
 * Created by isfaaghyth on 28/04/19.
 * github: @isfaaghyth
 */
class AppDataManager(private val remote: RemoteRepository): DataManager {

    override fun getGithubRepo(username: String): Single<List<Repo>>
    = remote.getGithubRepo(username)

}