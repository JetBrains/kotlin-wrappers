// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package js.intl

import js.reflect.unsafeCast

sealed external interface MonthFormat {
    companion object
}

inline val MonthFormat.Companion.numeric: MonthFormat
    get() = unsafeCast("numeric")

inline val MonthFormat.Companion.twoDigit: MonthFormat
    get() = unsafeCast("2-digit")

inline val MonthFormat.Companion.long: MonthFormat
    get() = unsafeCast("long")

inline val MonthFormat.Companion.short: MonthFormat
    get() = unsafeCast("short")

inline val MonthFormat.Companion.narrow: MonthFormat
    get() = unsafeCast("narrow")
