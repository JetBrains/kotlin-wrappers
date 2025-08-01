// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.midi

import js.reflect.unsafeCast

sealed external interface MIDIPortDeviceState {
    companion object
}

inline val MIDIPortDeviceState.Companion.connected: MIDIPortDeviceState
    get() = unsafeCast("connected")

inline val MIDIPortDeviceState.Companion.disconnected: MIDIPortDeviceState
    get() = unsafeCast("disconnected")
