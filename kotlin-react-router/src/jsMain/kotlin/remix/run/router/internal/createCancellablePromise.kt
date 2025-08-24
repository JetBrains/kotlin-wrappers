package remix.run.router.internal

import js.coroutines.internal.IsolatedCoroutineScope
import js.coroutines.promise
import js.promise.Promise
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.CoroutineStart.UNDISPATCHED
import kotlinx.coroutines.cancel
import remix.run.router.DataFunctionArgs
import web.abort.abortEvent
import web.events.addHandler

internal fun <T> createCancellablePromise(
    args: DataFunctionArgs<*>,
    block: suspend CoroutineScope.() -> T,
): Promise<T> {
    val scope = IsolatedCoroutineScope()

    args.request.signal.abortEvent.addHandler {
        scope.cancel()
    }

    return scope.promise(
        start = UNDISPATCHED,
        block = block,
    )
}
