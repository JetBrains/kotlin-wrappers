// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package js.intl

import js.reflect.unsafeCast

sealed external interface Notation {
    companion object
}

inline val Notation.Companion.standard: Notation
    get() = unsafeCast("standard")

inline val Notation.Companion.scientific: Notation
    get() = unsafeCast("scientific")

inline val Notation.Companion.engineering: Notation
    get() = unsafeCast("engineering")

inline val Notation.Companion.compact: Notation
    get() = unsafeCast("compact")
