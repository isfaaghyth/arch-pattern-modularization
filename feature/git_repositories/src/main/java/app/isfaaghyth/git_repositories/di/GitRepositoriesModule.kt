package app.isfaaghyth.git_repositories.di

import app.isfaaghyth.git_repositories.data.AppDataManager
import app.isfaaghyth.git_repositories.data.DataManager
import app.isfaaghyth.git_repositories.data.remote.RemoteRepository
import app.isfaaghyth.git_repositories.data.remote.RemoteRepositoryImpl
import app.isfaaghyth.git_repositories.feature.GitRepositoriesPresenter
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by isfaaghyth on 27/04/19.
 * github: @isfaaghyth
 */
@Module
class GitRepositoriesModule {

    @Provides
    @GitRepositoriesScope
    fun provideRemoteRepository(): RemoteRepository {
        return RemoteRepositoryImpl()
    }

    @Provides
    @GitRepositoriesScope
    fun provideDataManager(remoteRepository: RemoteRepository): DataManager {
        return AppDataManager(remoteRepository)
    }

    @Provides
    @GitRepositoriesScope
    fun provideGitRepositoriesPresenter(dataManager: DataManager): GitRepositoriesPresenter {
        return GitRepositoriesPresenter(dataManager)
    }

}