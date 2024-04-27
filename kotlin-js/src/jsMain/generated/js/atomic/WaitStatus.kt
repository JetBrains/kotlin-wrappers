// Automatically generated - do not modify!

package js.atomic

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
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
