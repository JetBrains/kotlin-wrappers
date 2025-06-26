// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package js.intl

import js.reflect.unsafeCast

sealed external interface RoundingPriority {
    companion object
}

inline val RoundingPriority.Companion.auto: RoundingPriority
    get() = unsafeCast("auto")

inline val RoundingPriority.Companion.morePrecision: RoundingPriority
    get() = unsafeCast("morePrecision")

inline val RoundingPriority.Companion.lessPrecision: RoundingPriority
    get() = unsafeCast("lessPrecision")
