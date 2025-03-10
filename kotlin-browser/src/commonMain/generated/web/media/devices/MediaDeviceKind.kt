// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package web.media.devices

import seskar.js.JsValue

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
