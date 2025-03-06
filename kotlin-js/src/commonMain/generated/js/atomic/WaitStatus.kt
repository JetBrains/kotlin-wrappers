// Automatically generated - do not modify!

@file:Suppress(
    "INTERFACE_WITH_SUPERCLASS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package js.atomic

import js.core.JsAny
import seskar.js.JsValue

sealed external interface WaitStatus :
    JsAny {

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
