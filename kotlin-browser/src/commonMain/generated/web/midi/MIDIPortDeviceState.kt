// Automatically generated - do not modify!

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
