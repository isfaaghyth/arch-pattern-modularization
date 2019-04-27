package app.isfaaghyth.git_repositories.data.remote

import app.isfaaghyth.git_repositories.data.entity.Repo

/**
 * Created by isfaaghyth on 27/04/19.
 * github: @isfaaghyth
 */
interface RemoteRepository {
    fun getRepos(username: String): List<Repo>
}