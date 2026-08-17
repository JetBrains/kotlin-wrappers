// Automatically generated - do not modify!

package web.midi

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface MIDIPortDeviceState

inline val MIDIPortDeviceState.Companion.connected: MIDIPortDeviceState
    get() = unsafeCast("connected")

inline val MIDIPortDeviceState.Companion.disconnected: MIDIPortDeviceState
    get() = unsafeCast("disconnected")
