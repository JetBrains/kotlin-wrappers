// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.midi

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface MIDIPortDeviceState {
    companion object {
        @JsValue("connected")
        val connected: MIDIPortDeviceState

        @JsValue("disconnected")
        val disconnected: MIDIPortDeviceState
    }
}
