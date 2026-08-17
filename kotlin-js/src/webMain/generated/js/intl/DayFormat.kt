// Automatically generated - do not modify!

package js.intl

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface DayFormat

inline val DayFormat.Companion.numeric: DayFormat
    get() = unsafeCast("numeric")

inline val DayFormat.Companion.twoDigit: DayFormat
    get() = unsafeCast("2-digit")
