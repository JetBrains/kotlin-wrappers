package js.promise

import js.core.JsAny
import seskar.js.JsTypeGuard

@JsTypeGuard(
    property = "status",
    value = "'fulfilled'",
)
external class PromiseFulfilledResult<T : JsAny?>
private constructor() :
    PromiseSettledResult<T> {
    val value: T
}
