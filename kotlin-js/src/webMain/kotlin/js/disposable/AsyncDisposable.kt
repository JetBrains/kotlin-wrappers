@file:Suppress(
    "EXPECTED_EXTERNAL_DECLARATION",
    "INTERFACE_WITH_SUPERCLASS",
)

package js.disposable

import js.core.Void
import js.hacks.safeCall
import js.promise.PromiseLike
import js.symbol.Symbol

expect external interface AsyncDisposable :
    JsAny {

    interface Mixin :
        AsyncDisposable
}

fun AsyncDisposable.`[@@asyncDispose]`(): PromiseLike<Void> =
    safeCall(Symbol.asyncDispose)
