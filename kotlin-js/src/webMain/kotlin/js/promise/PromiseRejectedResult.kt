package js.promise

import js.core.Void
import js.errors.JsErrorLike
import js.objects.JsPlainObject

@JsPlainObject
external interface PromiseRejectedResult :
    PromiseSettledResult<Void> {
    val reason: JsErrorLike?
}
