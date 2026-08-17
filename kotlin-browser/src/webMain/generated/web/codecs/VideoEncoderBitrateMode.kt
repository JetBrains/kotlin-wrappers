// Automatically generated - do not modify!

package web.codecs

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface VideoEncoderBitrateMode

inline val VideoEncoderBitrateMode.Companion.constant: VideoEncoderBitrateMode
    get() = unsafeCast("constant")

inline val VideoEncoderBitrateMode.Companion.quantizer: VideoEncoderBitrateMode
    get() = unsafeCast("quantizer")

inline val VideoEncoderBitrateMode.Companion.variable: VideoEncoderBitrateMode
    get() = unsafeCast("variable")
