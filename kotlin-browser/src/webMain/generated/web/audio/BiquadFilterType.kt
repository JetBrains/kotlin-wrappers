// Automatically generated - do not modify!

package web.audio

import js.reflect.unsafeCast
import js.union.JsUnion

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/BiquadFilterNode/type)
 */
@JsUnion
sealed /* union */
external interface BiquadFilterType

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/BiquadFilterNode/type#allpass)
 */
inline val BiquadFilterType.Companion.allpass: BiquadFilterType
    get() = unsafeCast("allpass")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/BiquadFilterNode/type#bandpass)
 */
inline val BiquadFilterType.Companion.bandpass: BiquadFilterType
    get() = unsafeCast("bandpass")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/BiquadFilterNode/type#highpass)
 */
inline val BiquadFilterType.Companion.highpass: BiquadFilterType
    get() = unsafeCast("highpass")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/BiquadFilterNode/type#highshelf)
 */
inline val BiquadFilterType.Companion.highshelf: BiquadFilterType
    get() = unsafeCast("highshelf")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/BiquadFilterNode/type#lowpass)
 */
inline val BiquadFilterType.Companion.lowpass: BiquadFilterType
    get() = unsafeCast("lowpass")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/BiquadFilterNode/type#lowshelf)
 */
inline val BiquadFilterType.Companion.lowshelf: BiquadFilterType
    get() = unsafeCast("lowshelf")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/BiquadFilterNode/type#notch)
 */
inline val BiquadFilterType.Companion.notch: BiquadFilterType
    get() = unsafeCast("notch")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/BiquadFilterNode/type#peaking)
 */
inline val BiquadFilterType.Companion.peaking: BiquadFilterType
    get() = unsafeCast("peaking")
