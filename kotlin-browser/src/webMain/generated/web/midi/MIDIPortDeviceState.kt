// Automatically generated - do not modify!

package web.midi

import js.reflect.unsafeCast
import js.union.JsUnion

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MIDIPort/state)
 */
@JsUnion
sealed /* union */
external interface MIDIPortDeviceState

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MIDIPort/state#connected)
 */
inline val MIDIPortDeviceState.Companion.connected: MIDIPortDeviceState
    get() = unsafeCast("connected")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MIDIPort/state#disconnected)
 */
inline val MIDIPortDeviceState.Companion.disconnected: MIDIPortDeviceState
    get() = unsafeCast("disconnected")
