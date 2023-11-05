// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.media.key

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface MediaKeyStatus {
    companion object {
        @JsValue("expired")
        val expired: MediaKeyStatus

        @JsValue("internal-error")
        val internalError: MediaKeyStatus

        @JsValue("output-downscaled")
        val outputDownscaled: MediaKeyStatus

        @JsValue("output-restricted")
        val outputRestricted: MediaKeyStatus

        @JsValue("released")
        val released: MediaKeyStatus

        @JsValue("status-pending")
        val statusPending: MediaKeyStatus

        @JsValue("usable")
        val usable: MediaKeyStatus

        @JsValue("usable-in-future")
        val usableInFuture: MediaKeyStatus
    }
}
