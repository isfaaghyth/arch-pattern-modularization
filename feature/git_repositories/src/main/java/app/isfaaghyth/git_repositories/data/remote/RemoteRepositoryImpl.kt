package app.isfaaghyth.git_repositories.data.remote

import app.isfaaghyth.git_repositories.data.entity.Repo

/**
 * Created by isfaaghyth on 27/04/19.
 * github: @isfaaghyth
 */
class RemoteRepositoryImpl: RemoteRepository {

    override fun getRepos(username: String): List<Repo> {
        val repos = arrayListOf<Repo>()
        repos.add(Repo("modularization-arch-pattern", "github.com/isfaaghyth/modularization-arch-pattern"))
        repos.add(Repo("kotlin-starter", "github.com/isfaaghyth/kt-starter"))
        return repos
    }

}