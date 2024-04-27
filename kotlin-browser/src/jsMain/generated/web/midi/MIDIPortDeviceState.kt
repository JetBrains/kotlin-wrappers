// Automatically generated - do not modify!

package web.midi

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface MIDIPortDeviceState {
    companion object {
        @JsValue("connected")
        val connected: MIDIPortDeviceState

        @JsValue("disconnected")
        val disconnected: MIDIPortDeviceState
    }
}
