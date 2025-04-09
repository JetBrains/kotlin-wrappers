package web.observable

import js.core.JsAny
import js.errors.JsError
import js.iterable.AsyncIterable
import js.iterable.JsIterable
import kotlin.js.definedExternally

external class Observable<T : JsAny?>(
    callback: SubscribeCallback<T>,
) {
    /**
     * Subscribes to the sequence with an observer
     */
    fun subscribe(
        observer: Observer<T>,
    ): Subscription

    /**
     * Subscribes to the sequence with callbacks
     */
    fun subscribe(
        onNext: (value: T) -> Unit,
        onError: ((error: JsError) -> Unit)? = definedExternally,
        onComplete: (() -> Unit)? = definedExternally,
    ): Subscription

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
