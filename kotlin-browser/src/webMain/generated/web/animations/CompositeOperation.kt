// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.animations

import js.reflect.unsafeCast

sealed external interface CompositeOperation {
    companion object
}

inline val CompositeOperation.Companion.accumulate: CompositeOperation
    get() = unsafeCast("accumulate")

inline val CompositeOperation.Companion.add: CompositeOperation
    get() = unsafeCast("add")

inline val CompositeOperation.Companion.replace: CompositeOperation
    get() = unsafeCast("replace")
