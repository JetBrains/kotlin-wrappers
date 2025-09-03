package js.coroutines.internal

import js.core.JsAny
import js.internal.InternalApi
import js.promise.Promise
import kotlinx.coroutines.CoroutineScope

@InternalApi
fun <R : JsAny?> createIsolatedPromise(
    block: suspend CoroutineScope.() -> R,
): Promise<R> =
    IsolatedCoroutineScope()
        .safePromise(block)
