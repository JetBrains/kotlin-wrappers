package js.promise

import seskar.js.JsTypeGuard

@JsTypeGuard(
    property = "status",
    value = "'fulfilled'",
)
external class PromiseFulfilledResult<T>
protected constructor() :
    PromiseSettledResult<T> {
    val value: T
}
