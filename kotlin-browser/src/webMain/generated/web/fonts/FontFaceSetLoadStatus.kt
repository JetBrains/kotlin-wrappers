// Automatically generated - do not modify!

package web.fonts

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface FontFaceSetLoadStatus

inline val FontFaceSetLoadStatus.Companion.loaded: FontFaceSetLoadStatus
    get() = unsafeCast("loaded")

inline val FontFaceSetLoadStatus.Companion.loading: FontFaceSetLoadStatus
    get() = unsafeCast("loading")
