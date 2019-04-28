package app.isfaaghyth.repos.di

import app.isfaaghyth.network.services
import app.isfaaghyth.repos.data.AppDataManager
import app.isfaaghyth.repos.data.DataManager
import app.isfaaghyth.repos.data.ReposServices
import app.isfaaghyth.repos.data.remote.RemoteRepository
import app.isfaaghyth.repos.data.remote.RemoteRepositoryImpl
import app.isfaaghyth.repos.feature.ReposPresenter
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by isfaaghyth on 28/04/19.
 * github: @isfaaghyth
 */
@Module class ReposModule {

    @Provides @ReposScope @Singleton
    fun provideReposService(): ReposServices {
        return services()
    }

    @Provides @ReposScope @Singleton
    fun provideRemoteRepository(remoteRepositoryImpl: RemoteRepositoryImpl): RemoteRepository {
        return remoteRepositoryImpl
    }

    @Provides @ReposScope @Singleton
    fun provideDataManager(dataManager: AppDataManager): DataManager {
        return dataManager
    }

    @Provides @ReposScope
    fun provideReposPresenter(dataManager: DataManager): ReposPresenter {
        return ReposPresenter(dataManager)
    }

}