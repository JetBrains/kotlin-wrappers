// Automatically generated - do not modify!

package js.intl

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface YearFormat

inline val YearFormat.Companion.numeric: YearFormat
    get() = unsafeCast("numeric")

inline val YearFormat.Companion.twoDigit: YearFormat
    get() = unsafeCast("2-digit")
