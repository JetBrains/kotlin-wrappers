package js.atomic

import js.promise.Promise
import kotlinx.js.JsPlainObject

@JsPlainObject
external interface WaitAsyncResult :
    WaitResult {
    val value: Promise<WaitAsyncStatus>
}
