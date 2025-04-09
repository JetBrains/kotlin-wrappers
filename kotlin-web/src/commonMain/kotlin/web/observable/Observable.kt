package web.observable

import js.array.ReadonlyArray
import js.core.JsAny
import js.core.JsBoolean
import js.core.Void
import js.errors.JsError
import js.iterable.AsyncIterable
import js.iterable.JsIterable
import js.promise.Promise
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

    fun finally(callback: () -> Unit): Observable<T>

    fun find(
        predicate: (T) -> Boolean,
        options: SubscribeOptions? = definedExternally,
    ): Promise<T>

    fun first(options: SubscribeOptions? = definedExternally): Promise<T>

    // fun flatMap(Mapper mapper) : Observable

    fun forEach(
        action: (item: T) -> Unit,
        options: SubscribeOptions? = definedExternally,
    ): Promise<Void>

    fun inspect(inspector: ObservableInspector<T>): Observable<T>
    fun inspect(callback: (value: T) -> Unit): Observable<T>
    fun inspect(): Observable<T>

    fun last(options: SubscribeOptions? = definedExternally): Promise<T>

    fun <R : JsAny?> map(transform: (T) -> R): Observable<R>

    // fun reduce(Reducer reducer, optional any initialValue, options: SubscribeOptions? = definedExternally) : Promise<any>

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

    // fun switchMap(Mapper mapper) : Observable

    fun take(n: Int): Observable<T>

    // fun takeUntil(any value) : Observable

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
