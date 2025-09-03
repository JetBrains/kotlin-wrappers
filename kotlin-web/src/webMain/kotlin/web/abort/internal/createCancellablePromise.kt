package web.abort.internal

import js.core.JsAny
import js.coroutines.promise
import js.internal.InternalApi
import js.promise.Promise
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.CoroutineStart.UNDISPATCHED
import web.abort.AbortableLike
import web.coroutines.CoroutineScope

@InternalApi
fun <T : JsAny?> createCancellablePromise(
    abortable: AbortableLike,
    block: suspend CoroutineScope.() -> T,
): Promise<T> =
    CoroutineScope(abortable)
        .promise(
            start = UNDISPATCHED,
            block = block,
        )
