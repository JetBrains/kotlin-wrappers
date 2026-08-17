// Automatically generated - do not modify!

package js.intl

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface HourFormat

inline val HourFormat.Companion.numeric: HourFormat
    get() = unsafeCast("numeric")

inline val HourFormat.Companion.twoDigit: HourFormat
    get() = unsafeCast("2-digit")
