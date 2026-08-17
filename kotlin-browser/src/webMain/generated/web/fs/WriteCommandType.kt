// Automatically generated - do not modify!

package web.fs

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface WriteCommandType

inline val WriteCommandType.Companion.seek: WriteCommandType
    get() = unsafeCast("seek")

inline val WriteCommandType.Companion.truncate: WriteCommandType
    get() = unsafeCast("truncate")

inline val WriteCommandType.Companion.write: WriteCommandType
    get() = unsafeCast("write")
