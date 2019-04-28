package app.isfaaghyth.repos.data.remote

import app.isfaaghyth.repos.data.ReposServices
import app.isfaaghyth.repos.data.entity.Repo
import io.reactivex.Single
import javax.inject.Inject

/**
 * Created by isfaaghyth on 28/04/19.
 * github: @isfaaghyth
 */
class RemoteRepositoryImpl @Inject constructor(private val services: ReposServices): RemoteRepository {

    override fun getGithubRepo(username: String): Single<List<Repo>>
    = services.getGithubRepo(username)

}