package js.disposable

import js.core.Void
import js.hacks.safeCall
import js.symbol.Symbol

external interface Disposable {

    interface Mixin :
        Disposable
}

fun Disposable.`[@@dispose]`(): Void =
    safeCall(Symbol.dispose)
