// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.serviceworker

import js.reflect.unsafeCast

sealed external interface FrameType {
    companion object
}

inline val FrameType.Companion.auxiliary: FrameType
    get() = unsafeCast("auxiliary")

inline val FrameType.Companion.nested: FrameType
    get() = unsafeCast("nested")

inline val FrameType.Companion.none: FrameType
    get() = unsafeCast("none")

inline val FrameType.Companion.topLevel: FrameType
    get() = unsafeCast("top-level")
