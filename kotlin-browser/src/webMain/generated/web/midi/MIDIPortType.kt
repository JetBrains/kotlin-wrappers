// Automatically generated - do not modify!

package web.midi

import js.reflect.unsafeCast
import js.union.JsUnion

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MIDIPort/type)
 */
@JsUnion
sealed /* union */
external interface MIDIPortType

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MIDIPort/type#input)
 */
inline val MIDIPortType.Companion.input: MIDIPortType
    get() = unsafeCast("input")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MIDIPort/type#output)
 */
inline val MIDIPortType.Companion.output: MIDIPortType
    get() = unsafeCast("output")
