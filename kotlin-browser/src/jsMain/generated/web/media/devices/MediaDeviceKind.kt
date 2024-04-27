// Automatically generated - do not modify!

package web.media.devices

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
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
