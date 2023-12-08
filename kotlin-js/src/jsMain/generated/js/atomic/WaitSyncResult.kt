package js.atomic

import seskar.js.JsTypeGuard

@JsTypeGuard(
    property = "async",
    value = "false",
)
sealed external class WaitSyncResult : WaitResult {
    val value: WaitSyncStatus
}
