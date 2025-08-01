// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.fs

import js.reflect.unsafeCast

sealed external interface WriteCommandType {
    companion object
}

inline val WriteCommandType.Companion.seek: WriteCommandType
    get() = unsafeCast("seek")

inline val WriteCommandType.Companion.truncate: WriteCommandType
    get() = unsafeCast("truncate")

inline val WriteCommandType.Companion.write: WriteCommandType
    get() = unsafeCast("write")
