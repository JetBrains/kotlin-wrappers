// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.midi

import js.reflect.unsafeCast

sealed external interface MIDIPortType {
    companion object
}

inline val MIDIPortType.Companion.input: MIDIPortType
    get() = unsafeCast("input")

inline val MIDIPortType.Companion.output: MIDIPortType
    get() = unsafeCast("output")
