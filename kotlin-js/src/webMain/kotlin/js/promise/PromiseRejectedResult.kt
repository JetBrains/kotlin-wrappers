package js.promise

import js.core.Void
import js.errors.JsErrorLike
import kotlinx.js.JsPlainObject

@JsPlainObject
external interface PromiseRejectedResult :
    PromiseSettledResult<Void> {
    val reason: JsErrorLike?
}
