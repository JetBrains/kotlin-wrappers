// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.audio

import js.reflect.unsafeCast

sealed external interface DistanceModelType {
    companion object
}

inline val DistanceModelType.Companion.exponential: DistanceModelType
    get() = unsafeCast("exponential")

inline val DistanceModelType.Companion.inverse: DistanceModelType
    get() = unsafeCast("inverse")

inline val DistanceModelType.Companion.linear: DistanceModelType
    get() = unsafeCast("linear")
