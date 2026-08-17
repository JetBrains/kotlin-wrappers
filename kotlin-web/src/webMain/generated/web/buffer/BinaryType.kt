// Automatically generated - do not modify!

package web.buffer

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface BinaryType

inline val BinaryType.Companion.arraybuffer: BinaryType
    get() = unsafeCast("arraybuffer")

inline val BinaryType.Companion.blob: BinaryType
    get() = unsafeCast("blob")
