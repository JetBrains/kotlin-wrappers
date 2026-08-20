// Automatically generated - do not modify!

package web.fonts

import js.reflect.unsafeCast
import js.union.JsUnion

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FontFace/display)
 */
@JsUnion
sealed /* union */
external interface FontDisplay

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FontFace/display#auto)
 */
inline val FontDisplay.Companion.auto: FontDisplay
    get() = unsafeCast("auto")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FontFace/display#block)
 */
inline val FontDisplay.Companion.block: FontDisplay
    get() = unsafeCast("block")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FontFace/display#fallback)
 */
inline val FontDisplay.Companion.fallback: FontDisplay
    get() = unsafeCast("fallback")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FontFace/display#optional)
 */
inline val FontDisplay.Companion.optional: FontDisplay
    get() = unsafeCast("optional")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FontFace/display#swap)
 */
inline val FontDisplay.Companion.swap: FontDisplay
    get() = unsafeCast("swap")
