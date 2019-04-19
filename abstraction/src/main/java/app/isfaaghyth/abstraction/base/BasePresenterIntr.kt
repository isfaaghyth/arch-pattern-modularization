package app.isfaaghyth.abstraction.base

/**
 * Created by isfaaghyth on 19/04/19.
 * github: @isfaaghyth
 */
interface BasePresenterIntr<V: BaseView> {
    fun attachView(view: V?)
    fun dettachView()
}