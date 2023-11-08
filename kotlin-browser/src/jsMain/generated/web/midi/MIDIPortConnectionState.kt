// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.midi

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface MIDIPortConnectionState {
    companion object {
        @JsValue("closed")
        val closed: MIDIPortConnectionState

        @JsValue("open")
        val open: MIDIPortConnectionState

        @JsValue("pending")
        val pending: MIDIPortConnectionState
    }
}
