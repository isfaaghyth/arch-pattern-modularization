package app.isfaaghyth.git_repositories.data

import app.isfaaghyth.git_repositories.data.entity.Repo
import app.isfaaghyth.git_repositories.data.remote.RemoteRepository

/**
 * Created by isfaaghyth on 27/04/19.
 * github: @isfaaghyth
 */
class AppDataManager(private val remoteRepository: RemoteRepository): DataManager {

    override fun getRepos(username: String): List<Repo> {
        return remoteRepository.getRepos(username)
    }

}