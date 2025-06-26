// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package js.intl

import js.reflect.unsafeCast

sealed external interface YearFormat {
    companion object
}

inline val YearFormat.Companion.numeric: YearFormat
    get() = unsafeCast("numeric")

inline val YearFormat.Companion.twoDigit: YearFormat
    get() = unsafeCast("twoDigit")
