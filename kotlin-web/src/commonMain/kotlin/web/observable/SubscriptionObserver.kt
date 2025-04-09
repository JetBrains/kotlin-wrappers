package web.observable

import js.core.JsAny
import js.errors.JsError
import js.objects.JsPlainObject

@JsPlainObject
external interface SubscriptionObserver<T : JsAny?> {
    /**
     * Receives the next value in the sequence
     */
    val next: ((value: T) -> Unit)?

    /**
     * Receives the sequence error
     */
    val error: ((error: JsError) -> Unit)?

    /**
     * Receives a completion notification
     */
    val complete: (() -> Unit)?
}
