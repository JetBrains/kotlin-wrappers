// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.media.key

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface MediaKeySessionClosedReason {
    companion object {
        @JsValue("closed-by-application")
        val closedByApplication: MediaKeySessionClosedReason

        @JsValue("hardware-context-reset")
        val hardwareContextReset: MediaKeySessionClosedReason

        @JsValue("internal-error")
        val internalError: MediaKeySessionClosedReason

        @JsValue("release-acknowledged")
        val releaseAcknowledged: MediaKeySessionClosedReason

        @JsValue("resource-evicted")
        val resourceEvicted: MediaKeySessionClosedReason
    }
}
