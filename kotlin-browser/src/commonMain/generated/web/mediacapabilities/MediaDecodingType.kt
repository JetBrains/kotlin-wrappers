// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.mediacapabilities

import js.reflect.unsafeCast

sealed external interface MediaDecodingType {
    companion object
}

inline val MediaDecodingType.Companion.file: MediaDecodingType
    get() = unsafeCast("file")

inline val MediaDecodingType.Companion.mediaSource: MediaDecodingType
    get() = unsafeCast("media-source")

inline val MediaDecodingType.Companion.webrtc: MediaDecodingType
    get() = unsafeCast("webrtc")
