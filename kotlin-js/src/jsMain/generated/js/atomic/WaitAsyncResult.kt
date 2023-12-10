package js.atomic

import js.promise.Promise
import seskar.js.JsTypeGuard

@JsTypeGuard(
    property = "async",
    value = "true",
)
external class WaitAsyncResult
protected constructor() :
    WaitResult {
    val value: Promise<WaitAsyncStatus>
}
