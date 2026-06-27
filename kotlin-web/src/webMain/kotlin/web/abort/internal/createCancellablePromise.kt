package web.abort.internal

import js.coroutines.internal.safePromise
import js.internal.InternalApi
import js.promise.Promise
import kotlinx.coroutines.CoroutineScope
import web.abort.AbortSignal
import web.abort.asCoroutineScope

@InternalApi
fun <T : JsAny?> createCancellablePromise(
    signal: AbortSignal,
    block: suspend CoroutineScope.() -> T,
): Promise<T> =
    signal.asCoroutineScope()
        .safePromise(block)
