// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package js.intl

import js.reflect.unsafeCast

sealed external interface SecondFormat {
    companion object
}

inline val SecondFormat.Companion.numeric: SecondFormat
    get() = unsafeCast("numeric")

inline val SecondFormat.Companion.twoDigit: SecondFormat
    get() = unsafeCast("twoDigit")
