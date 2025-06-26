// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.http

import js.reflect.unsafeCast

sealed external interface FetchPriority {
    companion object
}

inline val FetchPriority.Companion.auto: FetchPriority
    get() = unsafeCast("auto")

inline val FetchPriority.Companion.high: FetchPriority
    get() = unsafeCast("high")

inline val FetchPriority.Companion.low: FetchPriority
    get() = unsafeCast("low")
