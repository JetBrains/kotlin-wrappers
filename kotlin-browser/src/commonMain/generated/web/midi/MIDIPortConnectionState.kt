// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package web.midi

import seskar.js.JsValue

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
