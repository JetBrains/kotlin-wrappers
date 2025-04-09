package web.observable

import js.core.JsAny
import js.errors.JsError

external interface SubscriptionObserver<T : JsAny?> {
    /**
     * Sends the next value in the sequence
     */
    fun next(value: T)

    /**
     * Sends the sequence error
     */
    fun error(error: JsError)

    /**
     * Sends the completion notification
     */
    fun complete()

    /**
     * A boolean value indicating whether the subscription is closed
     */
    val closed: Boolean
}
