@file:Suppress(
    "WRONG_JS_INTEROP_TYPE",
)

package js.promise

import seskar.js.JsTypeGuard

@JsTypeGuard(
    property = "status",
    value = "'fulfilled'",
)
external class PromiseFulfilledResult<T>
private constructor() :
    PromiseSettledResult<T> {
    val value: T
}
