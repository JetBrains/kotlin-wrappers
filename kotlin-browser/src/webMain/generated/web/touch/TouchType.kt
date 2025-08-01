// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.touch

import js.reflect.unsafeCast

sealed external interface TouchType {
    companion object
}

inline val TouchType.Companion.direct: TouchType
    get() = unsafeCast("direct")

inline val TouchType.Companion.stylus: TouchType
    get() = unsafeCast("stylus")
