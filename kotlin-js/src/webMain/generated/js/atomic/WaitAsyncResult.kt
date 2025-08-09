package js.atomic

import js.objects.JsPlainObject
import js.promise.Promise

@JsPlainObject
external interface WaitAsyncResult :
    WaitResult {
    val value: Promise<WaitAsyncStatus>
}
