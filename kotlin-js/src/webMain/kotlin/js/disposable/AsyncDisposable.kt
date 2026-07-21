package js.disposable

import js.core.Void
import js.hacks.safeCall
import js.promise.PromiseLike
import js.symbol.Symbol

external interface AsyncDisposable

fun AsyncDisposable.`[@@asyncDispose]`(): PromiseLike<Void> =
    safeCall(Symbol.asyncDispose)
