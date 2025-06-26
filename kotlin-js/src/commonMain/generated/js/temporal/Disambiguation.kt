// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package js.temporal

import js.reflect.unsafeCast

sealed external interface Disambiguation {
    companion object
}

inline val Disambiguation.Companion.compatible: Disambiguation
    get() = unsafeCast("compatible")

inline val Disambiguation.Companion.earlier: Disambiguation
    get() = unsafeCast("earlier")

inline val Disambiguation.Companion.later: Disambiguation
    get() = unsafeCast("later")

inline val Disambiguation.Companion.reject: Disambiguation
    get() = unsafeCast("reject")
