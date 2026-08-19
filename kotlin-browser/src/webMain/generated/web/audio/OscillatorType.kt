// Automatically generated - do not modify!

package web.audio

import js.reflect.unsafeCast
import js.union.JsUnion

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/OscillatorNode/type)
 */
@JsUnion
sealed /* union */
external interface OscillatorType

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/OscillatorNode/type#custom)
 */
inline val OscillatorType.Companion.custom: OscillatorType
    get() = unsafeCast("custom")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/OscillatorNode/type#sawtooth)
 */
inline val OscillatorType.Companion.sawtooth: OscillatorType
    get() = unsafeCast("sawtooth")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/OscillatorNode/type#sine)
 */
inline val OscillatorType.Companion.sine: OscillatorType
    get() = unsafeCast("sine")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/OscillatorNode/type#square)
 */
inline val OscillatorType.Companion.square: OscillatorType
    get() = unsafeCast("square")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/OscillatorNode/type#triangle)
 */
inline val OscillatorType.Companion.triangle: OscillatorType
    get() = unsafeCast("triangle")
