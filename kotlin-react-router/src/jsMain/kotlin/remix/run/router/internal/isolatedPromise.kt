package remix.run.router.internal

import js.coroutines.internal.IsolatedCoroutineScope
import js.coroutines.promise
import js.promise.Promise
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.CoroutineStart
import remix.run.router.DataFunctionArgs

internal fun <T> isolatedPromise(
    args: DataFunctionArgs<*>,
    block: suspend CoroutineScope.() -> T,
): Promise<T> =
    IsolatedCoroutineScope()
        .promise(
            start = CoroutineStart.UNDISPATCHED,
            block = block,
        )
