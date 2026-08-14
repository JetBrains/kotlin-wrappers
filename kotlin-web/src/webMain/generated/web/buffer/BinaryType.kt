// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.buffer

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface BinaryType {
    companion object
}

inline val BinaryType.Companion.arraybuffer: BinaryType
    get() = unsafeCast("arraybuffer")

inline val BinaryType.Companion.blob: BinaryType
    get() = unsafeCast("blob")
