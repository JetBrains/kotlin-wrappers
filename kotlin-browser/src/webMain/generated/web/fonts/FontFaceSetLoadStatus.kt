// Automatically generated - do not modify!

package web.fonts

import js.reflect.unsafeCast
import js.union.JsUnion

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FontFaceSet/status)
 */
@JsUnion
sealed /* union */
external interface FontFaceSetLoadStatus

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FontFaceSet/status#loaded)
 */
inline val FontFaceSetLoadStatus.Companion.loaded: FontFaceSetLoadStatus
    get() = unsafeCast("loaded")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FontFaceSet/status#loading)
 */
inline val FontFaceSetLoadStatus.Companion.loading: FontFaceSetLoadStatus
    get() = unsafeCast("loading")
