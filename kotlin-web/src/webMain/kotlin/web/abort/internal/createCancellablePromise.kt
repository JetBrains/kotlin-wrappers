package web.abort.internal

import js.core.JsAny
import js.coroutines.internal.IsolatedCoroutineScope
import js.coroutines.promise
import js.internal.InternalApi
import js.promise.Promise
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.CoroutineStart.UNDISPATCHED
import kotlinx.coroutines.cancel
import web.abort.AbortableLike
import web.abort.abortEvent
import web.events.addHandler

@InternalApi
fun <T : JsAny?> createCancellablePromise(
    abortable: AbortableLike,
    block: suspend CoroutineScope.() -> T,
): Promise<T> {
    val scope = IsolatedCoroutineScope()

    abortable.signal.abortEvent.addHandler {
        scope.cancel()
    }

    return scope.promise(
        start = UNDISPATCHED,
        block = block,
    )
}
