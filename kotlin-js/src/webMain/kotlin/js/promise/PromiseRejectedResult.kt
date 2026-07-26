package js.promise

import js.errors.JsErrorLike
import js.void.Void
import kotlinx.js.JsPlainObject

@JsPlainObject
external interface PromiseRejectedResult :
    PromiseSettledResult<Void> {
    val reason: JsErrorLike?
}
