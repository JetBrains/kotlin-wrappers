package js.promise

import js.core.Void
import js.errors.JsErrorLike
import seskar.js.JsTypeGuard

@JsTypeGuard(
    property = "status",
    value = "'rejected'",
)
external class PromiseRejectedResult
private constructor() :
    PromiseSettledResult<Void> {
    val reason: JsErrorLike?
}
