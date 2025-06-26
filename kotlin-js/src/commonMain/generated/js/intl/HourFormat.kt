// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package js.intl

import js.reflect.unsafeCast

sealed external interface HourFormat {
    companion object
}

inline val HourFormat.Companion.numeric: HourFormat
    get() = unsafeCast("numeric")

inline val HourFormat.Companion.twoDigit: HourFormat
    get() = unsafeCast("twoDigit")
