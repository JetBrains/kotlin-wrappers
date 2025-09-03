package web.coroutines

import js.coroutines.internal.IsolatedCoroutineScope
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.cancel
import web.abort.AbortSignal
import web.abort.AbortableLike
import web.abort.abortEvent
import web.events.addHandler

fun CoroutineScope(
    signal: AbortSignal,
): CoroutineScope {
    val scope = IsolatedCoroutineScope()

    signal.abortEvent.addHandler {
        scope.cancel()
    }

    return scope
}

fun CoroutineScope(
    abortable: AbortableLike,
): CoroutineScope =
    CoroutineScope(abortable.signal)
