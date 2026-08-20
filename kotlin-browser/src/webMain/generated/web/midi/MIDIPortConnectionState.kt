// Automatically generated - do not modify!

package web.midi

import js.reflect.unsafeCast
import js.union.JsUnion

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MIDIPort/connection)
 */
@JsUnion
sealed /* union */
external interface MIDIPortConnectionState

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MIDIPort/connection#closed)
 */
inline val MIDIPortConnectionState.Companion.closed: MIDIPortConnectionState
    get() = unsafeCast("closed")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MIDIPort/connection#open)
 */
inline val MIDIPortConnectionState.Companion.open: MIDIPortConnectionState
    get() = unsafeCast("open")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MIDIPort/connection#pending)
 */
inline val MIDIPortConnectionState.Companion.pending: MIDIPortConnectionState
    get() = unsafeCast("pending")
