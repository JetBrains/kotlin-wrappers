package js.observable

import js.core.JsAny
import js.errors.JsError
import js.iterable.JsIterable
import kotlin.js.definedExternally

external class Observable<T : JsAny?>(
    subscriber: SubscriberFunction<T>,
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
         * Converts items to an Observable
         */
        fun <T : JsAny?> of(
            vararg items: T,
        ): Observable<T>

        /**
         * Converts an observable or iterable to an Observable
         */
        fun <T : JsAny?> from(
            source: JsIterable<JsAny?>,
        ): Observable<T>
    }
}
