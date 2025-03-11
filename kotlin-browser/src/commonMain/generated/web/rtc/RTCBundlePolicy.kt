// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.rtc

import seskar.js.JsValue

sealed external interface RTCBundlePolicy {
    companion object {
        @JsValue("balanced")
        val balanced: RTCBundlePolicy

        @JsValue("max-bundle")
        val maxBundle: RTCBundlePolicy

        @JsValue("max-compat")
        val maxCompat: RTCBundlePolicy
    }
}
