// Automatically generated - do not modify!

package web.midi

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface MIDIPortConnectionState

inline val MIDIPortConnectionState.Companion.closed: MIDIPortConnectionState
    get() = unsafeCast("closed")

inline val MIDIPortConnectionState.Companion.open: MIDIPortConnectionState
    get() = unsafeCast("open")

inline val MIDIPortConnectionState.Companion.pending: MIDIPortConnectionState
    get() = unsafeCast("pending")
