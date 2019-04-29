package app.isfaaghyth.abstraction.utils.rx

import io.reactivex.Completable
import io.reactivex.Maybe
import io.reactivex.Single

/**
 * Created by isfaaghyth on 29/04/19.
 * github: @isfaaghyth
 */

/**
 * Use SchedulerProvider configuration for Observable
 */
fun Completable.with(schedulerProvider: SchedulerProvider): Completable =
    this.observeOn(schedulerProvider.mainThread()).subscribeOn(schedulerProvider.io())

/**
 * Use SchedulerProvider configuration for Single
 */
fun <T> Single<T>.with(schedulerProvider: SchedulerProvider): Single<T> =
    this.observeOn(schedulerProvider.mainThread()).subscribeOn(schedulerProvider.io())

/**
 * Use SchedulerProvider configuration for Maybe
 */
fun <T> Maybe<T>.with(schedulerProvider: SchedulerProvider): Maybe<T> =
    this.observeOn(schedulerProvider.mainThread()).subscribeOn(schedulerProvider.io())