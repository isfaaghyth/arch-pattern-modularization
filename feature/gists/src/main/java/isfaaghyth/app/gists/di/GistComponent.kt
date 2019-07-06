package isfaaghyth.app.gists.di

import dagger.Component
import isfaaghyth.app.gists.feature.GistActivity
import javax.inject.Singleton

@GistScope
@Component(modules = [GistModule::class])
interface GistComponent {
    fun inject(activity: GistActivity)
}