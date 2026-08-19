// Automatically generated - do not modify!

package web.images

import js.reflect.unsafeCast
import js.union.JsUnion

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ImageData/colorSpace)
 */
@JsUnion
sealed /* union */
external interface PredefinedColorSpace

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ImageData/colorSpace#display-p3)
 */
inline val PredefinedColorSpace.Companion.displayP3: PredefinedColorSpace
    get() = unsafeCast("display-p3")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ImageData/colorSpace#srgb)
 */
inline val PredefinedColorSpace.Companion.srgb: PredefinedColorSpace
    get() = unsafeCast("srgb")
