// Automatically generated - do not modify!

package web.codecs

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface VideoMatrixCoefficients

inline val VideoMatrixCoefficients.Companion.bt470bg: VideoMatrixCoefficients
    get() = unsafeCast("bt470bg")

inline val VideoMatrixCoefficients.Companion.bt709: VideoMatrixCoefficients
    get() = unsafeCast("bt709")

inline val VideoMatrixCoefficients.Companion.rgb: VideoMatrixCoefficients
    get() = unsafeCast("rgb")

inline val VideoMatrixCoefficients.Companion.smpte170m: VideoMatrixCoefficients
    get() = unsafeCast("smpte170m")
