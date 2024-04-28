package js.atomic

import seskar.js.JsTypeGuard

@JsTypeGuard(
    property = "async",
    value = "false",
)
external class WaitSyncResult
private constructor() :
    WaitResult {
    val value: WaitSyncStatus
}
