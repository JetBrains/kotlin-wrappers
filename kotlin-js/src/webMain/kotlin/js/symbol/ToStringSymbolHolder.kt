package js.symbol

import js.hacks.safeCall
import js.string.JsStrings.toKotlinString

external interface ToStringSymbolHolder

fun ToStringSymbolHolder.`[@@toStringTag]`(): String =
    safeCall<_, JsString>(Symbol.toStringTag).toKotlinString()
