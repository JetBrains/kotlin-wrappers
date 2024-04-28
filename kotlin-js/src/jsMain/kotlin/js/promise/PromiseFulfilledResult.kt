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
