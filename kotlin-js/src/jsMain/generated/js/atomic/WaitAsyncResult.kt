package js.atomic

import js.promise.Promise
import seskar.js.JsTypeGuard

@JsTypeGuard(
    property = "async",
    value = "true",
)
sealed external class WaitAsyncResult : WaitResult {
    val value: Promise<WaitAsyncStatus>
}
