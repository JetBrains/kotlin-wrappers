package web.observable

import js.errors.JsError
import kotlinx.js.JsPlainObject
import web.experimental.ExperimentalWebApi
import web.function.VoidFunction
import kotlin.js.JsAny

@JsPlainObject
@ExperimentalWebApi
external interface SubscriptionObserver<in T : JsAny?> {
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
    val complete: VoidFunction?
}
