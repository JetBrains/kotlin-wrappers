package js.coroutines.internal

import js.internal.InternalApi
import js.promise.Promise
import kotlinx.coroutines.CoroutineScope
import kotlin.js.JsAny

@InternalApi
fun <R : JsAny?> createIsolatedPromise(
    block: suspend CoroutineScope.() -> R,
): Promise<R> =
    IsolatedCoroutineScope()
        .safePromise(block)
