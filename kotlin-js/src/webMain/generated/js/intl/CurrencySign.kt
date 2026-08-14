// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package js.intl

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface CurrencySign {
    companion object
}

inline val CurrencySign.Companion.standard: CurrencySign
    get() = unsafeCast("standard")

inline val CurrencySign.Companion.accounting: CurrencySign
    get() = unsafeCast("accounting")
