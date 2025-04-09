package web.observable

import js.array.ReadonlyArray
import js.core.JsAny
import js.iterable.AsyncIterable
import js.iterable.JsIterable
import js.promise.Promise
import kotlin.js.definedExternally

external class Observable<T : JsAny?>(
    callback: SubscribeCallback<T>,
) {
    // fun catch(CatchCallback callback) : Observable
    fun drop(n: Int): Observable<T>
    // fun every(Predicate predicate, options: SubscribeOptions? = definedExternally) : Promise<boolean>
    // fun filter(Predicate predicate) : Observable
    // fun finally(VoidFunction callback) : Observable
    // fun find(Predicate predicate, options: SubscribeOptions? = definedExternally) : Promise<any>
    // fun first(options: SubscribeOptions? = definedExternally) : Promise<any>
    // fun flatMap(Mapper mapper) : Observable
    // fun forEach(Visitor callback, options: SubscribeOptions? = definedExternally) : Promise<undefined>
    // fun inspect(optional ObservableInspectorUnion inspectorUnion = {}) : Observable
    fun last(options: SubscribeOptions? = definedExternally): Promise<T>
    // fun map(Mapper mapper) : Observable
    // fun reduce(Reducer reducer, optional any initialValue, options: SubscribeOptions? = definedExternally) : Promise<any>
    // fun some(Predicate predicate, options: SubscribeOptions? = definedExternally) : Promise<boolean>

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
