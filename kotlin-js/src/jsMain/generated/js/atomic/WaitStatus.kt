// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package js.atomic

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface WaitStatus {
    companion object {

        @JsValue("ok")
        val ok: ok

        @JsValue("not-equal")
        val notEqual: notEqual

        @JsValue("timed-out")
        val timedOut: timedOut
    }

    sealed interface ok : WaitAsyncStatus
    sealed interface notEqual : WaitSyncStatus
    sealed interface timedOut : WaitAsyncStatus, WaitSyncStatus
}

sealed external interface WaitAsyncStatus : WaitStatus
sealed external interface WaitSyncStatus : WaitStatus
