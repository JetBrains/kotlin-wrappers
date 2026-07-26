package js.string

import js.hacks.safeCall
import js.string.JsStrings.toKotlinString
import js.symbol.Symbol

external interface ToStringSymbolHolder

fun ToStringSymbolHolder.`[@@toStringTag]`(): String =
    safeCall<_, JsString>(Symbol.toStringTag).toKotlinString()
