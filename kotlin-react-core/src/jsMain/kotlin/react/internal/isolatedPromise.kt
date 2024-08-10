package react.internal

import js.coroutines.internal.IsolatedCoroutineScope
import js.coroutines.promise
import js.promise.Promise
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.CoroutineStart

internal fun <T> isolatedPromise(
    block: suspend CoroutineScope.() -> T,
): Promise<T> =
    IsolatedCoroutineScope()
        .promise(
            start = CoroutineStart.UNDISPATCHED,
            block = block,
        )
