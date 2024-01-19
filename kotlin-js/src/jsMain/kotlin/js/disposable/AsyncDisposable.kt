@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package js.disposable

import js.core.Void
import js.promise.PromiseLike
import js.symbol.Symbol
import seskar.js.JsNative

external interface AsyncDisposable {
    @JsNative
    operator fun get(
        key: Symbol.asyncDispose,
    ): () -> PromiseLike<Void> = definedExternally
}
