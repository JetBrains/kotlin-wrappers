// Automatically generated - do not modify!

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
