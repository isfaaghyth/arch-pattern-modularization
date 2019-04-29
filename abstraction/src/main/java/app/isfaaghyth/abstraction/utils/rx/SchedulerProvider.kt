package app.isfaaghyth.abstraction.utils.rx

import io.reactivex.Scheduler

/**
 * Created by isfaaghyth on 29/04/19.
 * github: @isfaaghyth
 */
interface SchedulerProvider {
    fun mainThread(): Scheduler
    fun computation(): Scheduler
    fun trampoline(): Scheduler
    fun newThread(): Scheduler
    fun io(): Scheduler
}