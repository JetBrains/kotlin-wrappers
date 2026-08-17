// Automatically generated - do not modify!

package web.fonts

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface FontFaceLoadStatus

inline val FontFaceLoadStatus.Companion.error: FontFaceLoadStatus
    get() = unsafeCast("error")

inline val FontFaceLoadStatus.Companion.loaded: FontFaceLoadStatus
    get() = unsafeCast("loaded")

inline val FontFaceLoadStatus.Companion.loading: FontFaceLoadStatus
    get() = unsafeCast("loading")

inline val FontFaceLoadStatus.Companion.unloaded: FontFaceLoadStatus
    get() = unsafeCast("unloaded")
