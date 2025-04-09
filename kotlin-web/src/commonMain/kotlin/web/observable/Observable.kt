package web.observable

import js.core.JsAny
import js.iterable.AsyncIterable
import js.iterable.JsIterable
import kotlin.js.definedExternally

external class Observable<T : JsAny?>(
    callback: SubscribeCallback<T>,
) {
    // fun catch(CatchCallback callback) : Observable
    fun drop(n: Int): Observable<T>
    // fun every(Predicate predicate, optional SubscribeOptions options = {}) : Promise<boolean>
    // fun filter(Predicate predicate) : Observable
    // fun finally(VoidFunction callback) : Observable
    // fun find(Predicate predicate, optional SubscribeOptions options = {}) : Promise<any>
    // fun first(optional SubscribeOptions options = {}) : Promise<any>
    // fun flatMap(Mapper mapper) : Observable
    // fun forEach(Visitor callback, optional SubscribeOptions options = {}) : Promise<undefined>
    // fun inspect(optional ObservableInspectorUnion inspectorUnion = {}) : Observable
    // fun last(optional SubscribeOptions options = {}) : Promise<any>
    // fun map(Mapper mapper) : Observable
    // fun reduce(Reducer reducer, optional any initialValue, optional SubscribeOptions options = {}) : Promise<any>
    // fun some(Predicate predicate, optional SubscribeOptions options = {}) : Promise<boolean>

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
    // fun toArray(optional SubscribeOptions options = {}) : Promise<sequence<any>>

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
