package js.disposable

import js.core.Void
import js.hacks.safeMethod
import js.promise.PromiseLike
import js.symbol.Symbol

external interface AsyncDisposable

operator fun AsyncDisposable.get(
    key: Symbol.asyncDispose,
): () -> PromiseLike<Void> =
    safeMethod(Symbol.asyncDispose)
