package web.abort.internal

import js.coroutines.internal.safePromise
import js.internal.InternalApi
import js.promise.Promise
import kotlinx.coroutines.CoroutineScope
import web.abort.AbortableLike
import web.abort.asCoroutineScope

@InternalApi
fun <T : JsAny?> createCancellablePromise(
    abortable: AbortableLike,
    block: suspend CoroutineScope.() -> T,
): Promise<T> =
    abortable.asCoroutineScope()
        .safePromise(block)
