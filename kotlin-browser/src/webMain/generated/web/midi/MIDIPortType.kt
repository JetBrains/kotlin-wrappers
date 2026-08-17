// Automatically generated - do not modify!

package web.midi

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface MIDIPortType

inline val MIDIPortType.Companion.input: MIDIPortType
    get() = unsafeCast("input")

inline val MIDIPortType.Companion.output: MIDIPortType
    get() = unsafeCast("output")
