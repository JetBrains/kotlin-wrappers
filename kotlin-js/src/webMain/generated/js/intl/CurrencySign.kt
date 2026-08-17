// Automatically generated - do not modify!

package js.intl

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface CurrencySign

inline val CurrencySign.Companion.standard: CurrencySign
    get() = unsafeCast("standard")

inline val CurrencySign.Companion.accounting: CurrencySign
    get() = unsafeCast("accounting")
