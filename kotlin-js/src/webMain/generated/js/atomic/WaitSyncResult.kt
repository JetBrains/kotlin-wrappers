package js.atomic

import js.objects.JsPlainObject

@JsPlainObject
external interface WaitSyncResult :
    WaitResult {
    val value: WaitSyncStatus
}
