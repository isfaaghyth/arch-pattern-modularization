package isfaaghyth.app.gists.di

import app.isfaaghyth.network.serviceCoroutines
import dagger.Module
import dagger.Provides
import isfaaghyth.app.gists.data.AppDataManager
import isfaaghyth.app.gists.data.DataManager
import isfaaghyth.app.gists.data.GistServices
import isfaaghyth.app.gists.data.remote.GistRepository
import isfaaghyth.app.gists.data.remote.GistRepositoryImpl
import isfaaghyth.app.gists.feature.GistPresenter
import isfaaghyth.app.gists.feature.GistPresenterInteractor
import javax.inject.Singleton

@Module class GistModule {

    @GistScope @Provides
    fun provideServices(): GistServices
    = serviceCoroutines()

    @GistScope @Provides
    fun provideRepository(services: GistServices): GistRepository
    = GistRepositoryImpl(services)

    @GistScope @Provides
    fun provideDataManager(remote: GistRepository): DataManager
    = AppDataManager(remote)

    @GistScope @Provides
    fun providePresenter(dataManager: DataManager): GistPresenterInteractor
    = GistPresenter(dataManager)

}