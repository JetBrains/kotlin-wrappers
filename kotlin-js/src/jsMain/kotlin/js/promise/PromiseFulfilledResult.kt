package js.promise

import seskar.js.JsTypeGuard

@JsTypeGuard(
    property = "status",
    value = "'fulfilled'",
)
external class PromiseFulfilledResult<T>
    : PromiseSettledResult<T> {
    val value: T
}
