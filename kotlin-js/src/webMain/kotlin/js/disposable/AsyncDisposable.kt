@file:Suppress(
    "EXPECTED_EXTERNAL_DECLARATION",
    "INTERFACE_WITH_SUPERCLASS",
)

package js.disposable

import js.hacks.safeCall
import js.internal.InternalApi
import js.promise.PromiseLike
import js.symbol.Symbol
import js.void.Void

expect external interface AsyncDisposable :
    JsAny {

    @SubclassOptInRequired(InternalApi::class)
    interface Mixin :
        AsyncDisposable
}

// false positive
@Suppress("EXTENSION_SHADOWED_BY_MEMBER")
fun AsyncDisposable.`[@@asyncDispose]`(): PromiseLike<Void> =
    safeCall(Symbol.asyncDispose)
