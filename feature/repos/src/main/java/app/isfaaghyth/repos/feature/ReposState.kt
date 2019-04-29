package app.isfaaghyth.repos.feature

/**
 * Created by isfaaghyth on 29/04/19.
 * github: @isfaaghyth
 */
sealed class ReposState {
    object Progress: ReposState()
    object Complete: ReposState()
}