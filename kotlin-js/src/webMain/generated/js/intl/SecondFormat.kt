// Automatically generated - do not modify!

package js.intl

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface SecondFormat

inline val SecondFormat.Companion.numeric: SecondFormat
    get() = unsafeCast("numeric")

inline val SecondFormat.Companion.twoDigit: SecondFormat
    get() = unsafeCast("2-digit")
