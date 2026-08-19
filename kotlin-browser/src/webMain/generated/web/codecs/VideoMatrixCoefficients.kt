// Automatically generated - do not modify!

package web.codecs

import js.reflect.unsafeCast
import js.union.JsUnion

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoColorSpace/matrix)
 */
@JsUnion
sealed /* union */
external interface VideoMatrixCoefficients

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoColorSpace/matrix#bt470bg)
 */
inline val VideoMatrixCoefficients.Companion.bt470bg: VideoMatrixCoefficients
    get() = unsafeCast("bt470bg")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoColorSpace/matrix#bt709)
 */
inline val VideoMatrixCoefficients.Companion.bt709: VideoMatrixCoefficients
    get() = unsafeCast("bt709")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoColorSpace/matrix#rgb)
 */
inline val VideoMatrixCoefficients.Companion.rgb: VideoMatrixCoefficients
    get() = unsafeCast("rgb")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoColorSpace/matrix#smpte170m)
 */
inline val VideoMatrixCoefficients.Companion.smpte170m: VideoMatrixCoefficients
    get() = unsafeCast("smpte170m")
