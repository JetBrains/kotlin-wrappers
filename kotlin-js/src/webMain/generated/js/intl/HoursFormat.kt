// Automatically generated - do not modify!

package js.intl

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface HoursFormat

inline val HoursFormat.Companion.long: HoursFormat
    get() = unsafeCast("long")

inline val HoursFormat.Companion.short: HoursFormat
    get() = unsafeCast("short")

inline val HoursFormat.Companion.narrow: HoursFormat
    get() = unsafeCast("narrow")

inline val HoursFormat.Companion.numeric: HoursFormat
    get() = unsafeCast("numeric")

inline val HoursFormat.Companion.twoDigit: HoursFormat
    get() = unsafeCast("2-digit")
