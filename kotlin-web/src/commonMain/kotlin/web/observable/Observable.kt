package web.observable

import js.array.ReadonlyArray
import js.core.JsAny
import js.core.JsBoolean
import js.core.Void
import js.errors.JsError
import js.iterable.AsyncIterable
import js.iterable.JsIterable
import js.promise.Promise
import web.function.VoidFunction
import kotlin.js.definedExternally

external class Observable<T : JsAny?>(
    callback: SubscribeCallback<T>,
) {
    fun catch(callback: (JsError) -> T): Observable<T>

    fun drop(n: Int): Observable<T>

    fun every(
        predicate: (T) -> Boolean,
        options: SubscribeOptions? = definedExternally,
    ): Promise<JsBoolean>

    fun filter(predicate: (T) -> Boolean): Observable<T>

    fun finally(callback: VoidFunction): Observable<T>

    fun find(
        predicate: (T) -> Boolean,
        options: SubscribeOptions? = definedExternally,
    ): Promise<T>

    fun first(options: SubscribeOptions? = definedExternally): Promise<T>

    fun <R : JsAny?> flatMap(transform: (T) -> ReadonlyArray<R>): Observable<R>
    fun <R : JsAny?> flatMap(transform: (T) -> Observable<R>): Observable<R>

    fun forEach(
        action: (item: T) -> Unit,
        options: SubscribeOptions? = definedExternally,
    ): Promise<Void>

    fun inspect(inspector: ObservableInspector<T>): Observable<T>
    fun inspect(callback: (value: T) -> Unit): Observable<T>
    fun inspect(): Observable<T>

    fun last(options: SubscribeOptions? = definedExternally): Promise<T>

    fun <R : JsAny?> map(transform: (T) -> R): Observable<R>

    fun <U : JsAny?> reduce(
        operation: (previousValue: U, currentValue: T, currentIndex: Int) -> U,
        initialValue: U,
        options: SubscribeOptions? = definedExternally,
    ): Promise<U>

    fun some(
        predicate: (T) -> Boolean,
        options: SubscribeOptions? = definedExternally,
    ): Promise<JsBoolean>

    /**
     * Subscribes to the sequence with an observer
     */
    fun subscribe(
        observer: SubscriptionObserver<T>,
        options: SubscribeOptions? = definedExternally,
    )

    /**
     * Subscribes to the sequence with callbacks
     */
    fun subscribe(
        callback: (value: T) -> Unit,
        options: SubscribeOptions? = definedExternally,
    )

    fun <R : JsAny?> switchMap(transform: (T) -> ReadonlyArray<R>): Observable<R>
    fun <R : JsAny?> switchMap(transform: (T) -> Observable<R>): Observable<R>

    fun take(n: Int): Observable<T>

    fun takeUntil(notifier: Promise<*>): Observable<T>
    fun takeUntil(notifier: JsIterable<*>): Observable<T>
    fun takeUntil(notifier: AsyncIterable<*>): Observable<T>
    fun takeUntil(notifier: Observable<*>): Observable<T>

    fun toArray(options: SubscribeOptions? = definedExternally): Promise<ReadonlyArray<T>>

    companion object {
        /**
         * Converts an iterable to an Observable
         */
        fun <T : JsAny?> from(
            source: JsIterable<T>,
        ): Observable<T>

        /**
         * Converts an async iterable to an Observable
         */
        fun <T : JsAny?> from(
            source: AsyncIterable<T>,
        ): Observable<T>
    }
}
