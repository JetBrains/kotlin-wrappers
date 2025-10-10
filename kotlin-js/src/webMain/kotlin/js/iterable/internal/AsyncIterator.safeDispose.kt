package js.iterable.internal

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
        return
    } else {
        this[Symbol.asyncDispose]().await()
    }
}

private external interface HasReturn {
    fun `return`(): Promise<*>
}
