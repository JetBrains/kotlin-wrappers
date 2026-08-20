// Automatically generated - do not modify!

package web.codecs

import js.reflect.unsafeCast
import js.union.JsUnion

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioData/format)
 */
@JsUnion
sealed /* union */
external interface AudioSampleFormat

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioData/format#f32)
 */
inline val AudioSampleFormat.Companion.f32: AudioSampleFormat
    get() = unsafeCast("f32")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioData/format#f32-planar)
 */
inline val AudioSampleFormat.Companion.f32Planar: AudioSampleFormat
    get() = unsafeCast("f32-planar")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioData/format#s16)
 */
inline val AudioSampleFormat.Companion.s16: AudioSampleFormat
    get() = unsafeCast("s16")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioData/format#s16-planar)
 */
inline val AudioSampleFormat.Companion.s16Planar: AudioSampleFormat
    get() = unsafeCast("s16-planar")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioData/format#s32)
 */
inline val AudioSampleFormat.Companion.s32: AudioSampleFormat
    get() = unsafeCast("s32")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioData/format#s32-planar)
 */
inline val AudioSampleFormat.Companion.s32Planar: AudioSampleFormat
    get() = unsafeCast("s32-planar")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioData/format#u8)
 */
inline val AudioSampleFormat.Companion.u8: AudioSampleFormat
    get() = unsafeCast("u8")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioData/format#u8-planar)
 */
inline val AudioSampleFormat.Companion.u8Planar: AudioSampleFormat
    get() = unsafeCast("u8-planar")
