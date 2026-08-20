// Automatically generated - do not modify!

package web.audio

import js.reflect.unsafeCast
import js.union.JsUnion

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WaveShaperNode/oversample)
 */
@JsUnion
sealed /* union */
external interface OverSampleType

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WaveShaperNode/oversample#2x)
 */
inline val OverSampleType.Companion.x2: OverSampleType
    get() = unsafeCast("2x")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WaveShaperNode/oversample#4x)
 */
inline val OverSampleType.Companion.x4: OverSampleType
    get() = unsafeCast("4x")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WaveShaperNode/oversample#none)
 */
inline val OverSampleType.Companion.none: OverSampleType
    get() = unsafeCast("none")
