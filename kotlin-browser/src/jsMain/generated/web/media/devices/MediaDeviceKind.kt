// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.media.devices

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface MediaDeviceKind {
    companion object {
        @JsValue("audioinput")
        val audioinput: MediaDeviceKind

        @JsValue("audiooutput")
        val audiooutput: MediaDeviceKind

        @JsValue("videoinput")
        val videoinput: MediaDeviceKind
    }
}
