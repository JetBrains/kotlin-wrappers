package js.coroutines.internal

import js.core.JsAny
import js.coroutines.promise
import js.internal.InternalApi
import js.promise.Promise
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.CoroutineStart.UNDISPATCHED

@InternalApi
fun <R : JsAny?> createIsolatedPromise(
    block: suspend CoroutineScope.() -> R,
): Promise<R> =
    IsolatedCoroutineScope()
        .promise(
            start = UNDISPATCHED,
            block = block,
        )
