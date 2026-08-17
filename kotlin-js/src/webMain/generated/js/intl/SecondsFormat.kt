// Automatically generated - do not modify!

package js.intl

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface SecondsFormat

inline val SecondsFormat.Companion.long: SecondsFormat
    get() = unsafeCast("long")

inline val SecondsFormat.Companion.short: SecondsFormat
    get() = unsafeCast("short")

inline val SecondsFormat.Companion.narrow: SecondsFormat
    get() = unsafeCast("narrow")

inline val SecondsFormat.Companion.numeric: SecondsFormat
    get() = unsafeCast("numeric")

inline val SecondsFormat.Companion.twoDigit: SecondsFormat
    get() = unsafeCast("2-digit")
