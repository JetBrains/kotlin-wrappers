// Automatically generated - do not modify!

package web.fonts

import js.reflect.unsafeCast
import js.union.JsUnion

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FontFace/status)
 */
@JsUnion
sealed /* union */
external interface FontFaceLoadStatus

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FontFace/status#error)
 */
inline val FontFaceLoadStatus.Companion.error: FontFaceLoadStatus
    get() = unsafeCast("error")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FontFace/status#loaded)
 */
inline val FontFaceLoadStatus.Companion.loaded: FontFaceLoadStatus
    get() = unsafeCast("loaded")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FontFace/status#loading)
 */
inline val FontFaceLoadStatus.Companion.loading: FontFaceLoadStatus
    get() = unsafeCast("loading")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FontFace/status#unloaded)
 */
inline val FontFaceLoadStatus.Companion.unloaded: FontFaceLoadStatus
    get() = unsafeCast("unloaded")
