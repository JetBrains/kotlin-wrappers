// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.codecs

import js.reflect.unsafeCast

sealed external interface AudioSampleFormat {
    companion object
}

inline val AudioSampleFormat.Companion.f32: AudioSampleFormat
    get() = unsafeCast("f32")

inline val AudioSampleFormat.Companion.f32Planar: AudioSampleFormat
    get() = unsafeCast("f32-planar")

inline val AudioSampleFormat.Companion.s16: AudioSampleFormat
    get() = unsafeCast("s16")

inline val AudioSampleFormat.Companion.s16Planar: AudioSampleFormat
    get() = unsafeCast("s16-planar")

inline val AudioSampleFormat.Companion.s32: AudioSampleFormat
    get() = unsafeCast("s32")

inline val AudioSampleFormat.Companion.s32Planar: AudioSampleFormat
    get() = unsafeCast("s32-planar")

inline val AudioSampleFormat.Companion.u8: AudioSampleFormat
    get() = unsafeCast("u8")

inline val AudioSampleFormat.Companion.u8Planar: AudioSampleFormat
    get() = unsafeCast("u8-planar")
