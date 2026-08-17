// Automatically generated - do not modify!

package web.mediacapabilities

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface MediaEncodingType

inline val MediaEncodingType.Companion.record: MediaEncodingType
    get() = unsafeCast("record")

inline val MediaEncodingType.Companion.webrtc: MediaEncodingType
    get() = unsafeCast("webrtc")
