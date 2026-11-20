// Automatically generated - do not modify!

package web.html

import js.reflect.unsafeCast
import js.union.JsUnion

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLImageElement/decoding#value)
 */
@JsUnion
sealed /* union */
external interface ImageDecoding

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLImageElement/decoding#:~:text=sync)
 */
inline val ImageDecoding.Companion.sync: ImageDecoding
    get() = unsafeCast("sync")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLImageElement/decoding#:~:text=async)
 */
inline val ImageDecoding.Companion.async: ImageDecoding
    get() = unsafeCast("async")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLImageElement/decoding#:~:text=auto)
 */
inline val ImageDecoding.Companion.auto: ImageDecoding
    get() = unsafeCast("auto")
