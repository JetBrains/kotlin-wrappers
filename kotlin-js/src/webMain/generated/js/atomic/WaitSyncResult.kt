package js.atomic

import kotlinx.js.JsPlainObject

@JsPlainObject
external interface WaitSyncResult :
    WaitResult {
    val value: WaitSyncStatus
}
