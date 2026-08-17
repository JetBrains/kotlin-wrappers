// Automatically generated - do not modify!

package js.intl

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface MinuteFormat

inline val MinuteFormat.Companion.numeric: MinuteFormat
    get() = unsafeCast("numeric")

inline val MinuteFormat.Companion.twoDigit: MinuteFormat
    get() = unsafeCast("2-digit")
