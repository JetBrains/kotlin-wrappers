// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package web.midi

import seskar.js.JsValue

sealed external interface MIDIPortDeviceState {
    companion object {
        @JsValue("connected")
        val connected: MIDIPortDeviceState

        @JsValue("disconnected")
        val disconnected: MIDIPortDeviceState
    }
}
