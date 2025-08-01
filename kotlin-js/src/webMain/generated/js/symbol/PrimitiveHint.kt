// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package js.symbol

import js.reflect.unsafeCast

sealed external interface PrimitiveHint {
    companion object
}

inline val PrimitiveHint.Companion.number: PrimitiveHint
    get() = unsafeCast("number")

inline val PrimitiveHint.Companion.string: PrimitiveHint
    get() = unsafeCast("string")

inline val PrimitiveHint.Companion.default: PrimitiveHint
    get() = unsafeCast("default")
