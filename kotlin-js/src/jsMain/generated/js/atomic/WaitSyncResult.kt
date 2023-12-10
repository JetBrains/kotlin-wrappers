package js.atomic

import seskar.js.JsTypeGuard

@JsTypeGuard(
    property = "async",
    value = "false",
)
external class WaitSyncResult
protected constructor() :
    WaitResult {
    val value: WaitSyncStatus
}
