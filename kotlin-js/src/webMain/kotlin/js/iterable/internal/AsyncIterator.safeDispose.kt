package js.iterable.internal

import js.disposable.internal.safeAwait
import js.iterable.AsyncIterator
import js.promise.Promise
import js.promise.await
import js.reflect.Reflect
import js.reflect.unsafeCast
import js.symbol.Symbol
import kotlin.js.JsAny

internal suspend fun <T : JsAny?> AsyncIterator<T>.safeDispose() {
    if (Reflect.has(this, "return")) {
        unsafeCast<HasReturn>(this).`return`().await()
    } else {
        safeAwait(Symbol.asyncDispose)
    }
}

private external interface HasReturn {
    fun `return`(): Promise<*>
}
