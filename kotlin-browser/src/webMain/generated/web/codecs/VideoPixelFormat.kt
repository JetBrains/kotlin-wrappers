// Automatically generated - do not modify!

package web.codecs

import js.reflect.unsafeCast
import js.union.JsUnion

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoFrame/format)
 */
@JsUnion
sealed /* union */
external interface VideoPixelFormat

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoFrame/format#BGRA)
 */
inline val VideoPixelFormat.Companion.BGRA: VideoPixelFormat
    get() = unsafeCast("BGRA")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoFrame/format#BGRX)
 */
inline val VideoPixelFormat.Companion.BGRX: VideoPixelFormat
    get() = unsafeCast("BGRX")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoFrame/format#I420)
 */
inline val VideoPixelFormat.Companion.I420: VideoPixelFormat
    get() = unsafeCast("I420")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoFrame/format#I420A)
 */
inline val VideoPixelFormat.Companion.I420A: VideoPixelFormat
    get() = unsafeCast("I420A")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoFrame/format#I422)
 */
inline val VideoPixelFormat.Companion.I422: VideoPixelFormat
    get() = unsafeCast("I422")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoFrame/format#I444)
 */
inline val VideoPixelFormat.Companion.I444: VideoPixelFormat
    get() = unsafeCast("I444")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoFrame/format#NV12)
 */
inline val VideoPixelFormat.Companion.NV12: VideoPixelFormat
    get() = unsafeCast("NV12")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoFrame/format#RGBA)
 */
inline val VideoPixelFormat.Companion.RGBA: VideoPixelFormat
    get() = unsafeCast("RGBA")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoFrame/format#RGBX)
 */
inline val VideoPixelFormat.Companion.RGBX: VideoPixelFormat
    get() = unsafeCast("RGBX")
