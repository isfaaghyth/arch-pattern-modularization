package app.isfaaghyth.repos.di

import app.isfaaghyth.repos.feature.ReposActivity
import dagger.Component

/**
 * Created by isfaaghyth on 28/04/19.
 * github: @isfaaghyth
 */
@ReposScope @Component(modules = [ReposModule::class])
interface ReposComponent {
    fun inject(activity: ReposActivity)
}