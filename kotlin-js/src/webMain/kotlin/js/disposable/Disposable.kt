@file:Suppress(
    "EXPECTED_EXTERNAL_DECLARATION",
    "INTERFACE_WITH_SUPERCLASS",
)

package js.disposable

import js.core.Void
import js.hacks.safeCall
import js.symbol.Symbol

expect external interface Disposable :
    JsAny {

    interface Mixin :
        Disposable
}

fun Disposable.`[@@dispose]`(): Void =
    safeCall(Symbol.dispose)
