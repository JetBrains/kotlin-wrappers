// Automatically generated - do not modify!

package web.images

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface ImageOrientation

inline val ImageOrientation.Companion.flipY: ImageOrientation
    get() = unsafeCast("flipY")

inline val ImageOrientation.Companion.fromImage: ImageOrientation
    get() = unsafeCast("from-image")

inline val ImageOrientation.Companion.none: ImageOrientation
    get() = unsafeCast("none")
