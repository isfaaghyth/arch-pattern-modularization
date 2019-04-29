package app.isfaaghyth.repos.di

import app.isfaaghyth.abstraction.utils.rx.AppSchedulerProvider
import app.isfaaghyth.abstraction.utils.rx.SchedulerProvider
import app.isfaaghyth.network.services
import app.isfaaghyth.repos.data.AppDataManager
import app.isfaaghyth.repos.data.DataManager
import app.isfaaghyth.repos.data.ReposServices
import app.isfaaghyth.repos.data.remote.RemoteRepository
import app.isfaaghyth.repos.data.remote.RemoteRepositoryImpl
import app.isfaaghyth.repos.feature.ReposPresenter
import app.isfaaghyth.repos.feature.ReposPresenterInteractor
import dagger.Module
import dagger.Provides

/**
 * Created by isfaaghyth on 28/04/19.
 * github: @isfaaghyth
 */
@Module class ReposModule {

    /**
     * providing route of services for retrofit consume
     */
    @Provides @ReposScope
    fun provideReposService(): ReposServices {
        return services()
    }

    /**
     * scheduler provider for async data stream trough IO / mainthread
     */
    @Provides @ReposScope
    fun provideAppSchedulerProvider(): AppSchedulerProvider {
        return AppSchedulerProvider()
    }

    /**
     * scheduler provider for async data stream trough IO / mainthread
     * @purpose: unit testing and mocking purpose for trampoline data stream
     */
    @Provides @ReposScope
    fun provideSchedulerProvider(schedulerProvider: AppSchedulerProvider): SchedulerProvider {
        return schedulerProvider
    }

    /**
     * providing remote repository
     */
    @Provides @ReposScope
    fun provideRemoteReposityImpl(services: ReposServices): RemoteRepositoryImpl {
        return RemoteRepositoryImpl(services)
    }

    /**
     * providing remote repository
     * @purpose: unit testing and mocking purpose for remote repository
     */
    @Provides @ReposScope
    fun provideRemoteRepository(remoteRepositoryImpl: RemoteRepositoryImpl): RemoteRepository {
        return remoteRepositoryImpl
    }

    /**
     * providing data manager
     */
    @Provides @ReposScope
    fun provideDataManager(dataManager: AppDataManager): DataManager {
        return dataManager
    }

    /**
     * providing feature presenter
     */
    @Provides @ReposScope
    fun providerReposPresenter(presenter: ReposPresenter): ReposPresenterInteractor {
        return presenter
    }

    /**
     * providing feature presenter
     * @purpose: unit testing and mocking purpose for presenter
     */
    @Provides @ReposScope
    fun provideReposPresenter(dataManager: DataManager, schedulerProvider: SchedulerProvider): ReposPresenter {
        return ReposPresenter(dataManager, schedulerProvider)
    }

}