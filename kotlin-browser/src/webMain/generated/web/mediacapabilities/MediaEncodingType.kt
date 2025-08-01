// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.mediacapabilities

import js.reflect.unsafeCast

sealed external interface MediaEncodingType {
    companion object
}

inline val MediaEncodingType.Companion.record: MediaEncodingType
    get() = unsafeCast("record")

inline val MediaEncodingType.Companion.webrtc: MediaEncodingType
    get() = unsafeCast("webrtc")
