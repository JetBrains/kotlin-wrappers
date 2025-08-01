// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.http

import js.reflect.unsafeCast

sealed external interface RequestPriority {
    companion object
}

inline val RequestPriority.Companion.auto: RequestPriority
    get() = unsafeCast("auto")

inline val RequestPriority.Companion.high: RequestPriority
    get() = unsafeCast("high")

inline val RequestPriority.Companion.low: RequestPriority
    get() = unsafeCast("low")
