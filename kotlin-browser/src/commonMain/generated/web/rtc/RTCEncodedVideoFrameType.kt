// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.rtc

import js.reflect.unsafeCast

sealed external interface RTCEncodedVideoFrameType {
    companion object
}

inline val RTCEncodedVideoFrameType.Companion.delta: RTCEncodedVideoFrameType
    get() = unsafeCast("delta")

inline val RTCEncodedVideoFrameType.Companion.empty: RTCEncodedVideoFrameType
    get() = unsafeCast("empty")

inline val RTCEncodedVideoFrameType.Companion.key: RTCEncodedVideoFrameType
    get() = unsafeCast("key")
