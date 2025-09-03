package web.abort.internal

import js.core.JsAny
import js.coroutines.internal.safePromise
import js.internal.InternalApi
import js.promise.Promise
import kotlinx.coroutines.CoroutineScope
import web.abort.AbortableLike
import web.coroutines.CoroutineScope

@InternalApi
fun <T : JsAny?> createCancellablePromise(
    abortable: AbortableLike,
    block: suspend CoroutineScope.() -> T,
): Promise<T> =
    CoroutineScope(abortable)
        .safePromise(block)
