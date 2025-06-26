// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.audio

import js.reflect.unsafeCast

sealed external interface OverSampleType {
    companion object
}

inline val OverSampleType.Companion.x2: OverSampleType
    get() = unsafeCast("2x")

inline val OverSampleType.Companion.x4: OverSampleType
    get() = unsafeCast("4x")

inline val OverSampleType.Companion.none: OverSampleType
    get() = unsafeCast("none")
