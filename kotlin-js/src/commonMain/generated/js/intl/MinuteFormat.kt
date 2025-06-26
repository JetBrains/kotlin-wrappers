// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package js.intl

import js.reflect.unsafeCast

sealed external interface MinuteFormat {
    companion object
}

inline val MinuteFormat.Companion.numeric: MinuteFormat
    get() = unsafeCast("numeric")

inline val MinuteFormat.Companion.twoDigit: MinuteFormat
    get() = unsafeCast("2-digit")
