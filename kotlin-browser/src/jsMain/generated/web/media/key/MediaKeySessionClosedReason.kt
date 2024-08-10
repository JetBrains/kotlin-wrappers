// Automatically generated - do not modify!

package web.media.key

import seskar.js.JsValue

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
