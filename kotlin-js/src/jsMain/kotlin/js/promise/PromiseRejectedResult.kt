package js.promise

import js.core.Void
import js.errors.JsError
import seskar.js.JsTypeGuard

@JsTypeGuard(
    property = "status",
    value = "'rejected'",
)
external class PromiseRejectedResult :
    PromiseSettledResult<Void> {
    val reason: JsError
}
