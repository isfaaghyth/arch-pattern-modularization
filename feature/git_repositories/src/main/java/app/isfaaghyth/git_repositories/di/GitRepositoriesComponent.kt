package app.isfaaghyth.git_repositories.di

import app.isfaaghyth.git_repositories.feature.GitRepositoriesActivity
import dagger.Component

/**
 * Created by isfaaghyth on 27/04/19.
 * github: @isfaaghyth
 */
@GitRepositoriesScope
@Component(modules = [GitRepositoriesModule::class])
interface GitRepositoriesComponent {
    fun inject(activity: GitRepositoriesActivity)
}