package app.isfaaghyth.abstraction.base

import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable

/**
 * Created by isfaaghyth on 11/04/19.
 * github: @isfaaghyth
 */
open class BasePresenter<V: BaseView>: BasePresenterIntr<V> {

    private val compositeDisposable = CompositeDisposable()
    protected lateinit var view: V

    override fun attachView(view: V?) {
        if (view != null) {
            this.view = view
        } else {
            throw NullPointerException("presenter: please attach your view on onCreate() method.")
        }
    }

    /**
     * adding a new task (as a disposable) into compositeDisposable
     * @param: disposable
     */
    protected fun subscribe(job: () -> Disposable) {
        compositeDisposable.add(job())
    }

    override fun dettachView() {
        compositeDisposable.clear()
    }

}