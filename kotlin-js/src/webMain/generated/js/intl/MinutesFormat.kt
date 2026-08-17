// Automatically generated - do not modify!

package js.intl

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface MinutesFormat

inline val MinutesFormat.Companion.long: MinutesFormat
    get() = unsafeCast("long")

inline val MinutesFormat.Companion.short: MinutesFormat
    get() = unsafeCast("short")

inline val MinutesFormat.Companion.narrow: MinutesFormat
    get() = unsafeCast("narrow")

inline val MinutesFormat.Companion.numeric: MinutesFormat
    get() = unsafeCast("numeric")

inline val MinutesFormat.Companion.twoDigit: MinutesFormat
    get() = unsafeCast("2-digit")
