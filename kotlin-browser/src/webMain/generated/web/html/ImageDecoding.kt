// Automatically generated - do not modify!

package web.html

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface ImageDecoding

inline val ImageDecoding.Companion.async: ImageDecoding
    get() = unsafeCast("async")

inline val ImageDecoding.Companion.sync: ImageDecoding
    get() = unsafeCast("sync")

inline val ImageDecoding.Companion.auto: ImageDecoding
    get() = unsafeCast("auto")
