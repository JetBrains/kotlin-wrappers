// Automatically generated - do not modify!

package web.mediacapabilities

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface MediaDecodingType

inline val MediaDecodingType.Companion.file: MediaDecodingType
    get() = unsafeCast("file")

inline val MediaDecodingType.Companion.mediaSource: MediaDecodingType
    get() = unsafeCast("media-source")

inline val MediaDecodingType.Companion.webrtc: MediaDecodingType
    get() = unsafeCast("webrtc")
