// Automatically generated - do not modify!

package web.audio

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface OscillatorType

inline val OscillatorType.Companion.custom: OscillatorType
    get() = unsafeCast("custom")

inline val OscillatorType.Companion.sawtooth: OscillatorType
    get() = unsafeCast("sawtooth")

inline val OscillatorType.Companion.sine: OscillatorType
    get() = unsafeCast("sine")

inline val OscillatorType.Companion.square: OscillatorType
    get() = unsafeCast("square")

inline val OscillatorType.Companion.triangle: OscillatorType
    get() = unsafeCast("triangle")
