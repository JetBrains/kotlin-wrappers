package web.locks.internal

import kotlinx.coroutines.CoroutineScope
import web.abort.AbortableLike
import web.abort.internal.createCancellablePromise
import web.locks.Lock
import web.locks.LockGrantedCallback

internal fun <T : JsAny?> LockGrantedCallback(
    abortable: AbortableLike,
    block: suspend CoroutineScope.(lock: Lock?) -> T,
): LockGrantedCallback<T> = { lock ->
    createCancellablePromise(abortable) {
        block(lock)
    }
}
