package react.internal

import js.promise.Promise
import js.promise.promise
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
