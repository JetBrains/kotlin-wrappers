// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.midi

import js.reflect.unsafeCast

sealed external interface MIDIPortConnectionState {
    companion object
}

inline val MIDIPortConnectionState.Companion.closed: MIDIPortConnectionState
    get() = unsafeCast("closed")

inline val MIDIPortConnectionState.Companion.open: MIDIPortConnectionState
    get() = unsafeCast("open")

inline val MIDIPortConnectionState.Companion.pending: MIDIPortConnectionState
    get() = unsafeCast("pending")
