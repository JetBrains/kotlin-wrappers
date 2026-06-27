package web.locks

import kotlinx.coroutines.CoroutineScope
import web.abort.unsafeAbortable
import web.coroutines.await
import web.function.async

/**
 * The **`request()`** method of the LockManager interface requests a Lock object with parameters specifying its name and characteristics. The requested Lock is passed to a callback, while the function itself returns a Promise that resolves (or rejects) with the result of the callback after the lock is released, or rejects if the request is aborted.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/LockManager/request)
 */
suspend fun <T : JsAny?> LockManager.request(
    name: String,
    block: suspend CoroutineScope.(lock: Lock?) -> T,
): T =
    await { signal ->
        requestAsync(
            name = name,
            options = unsafeAbortable(signal),
            callback = async(signal, block),
        )
    }

/**
 * The **`request()`** method of the LockManager interface requests a Lock object with parameters specifying its name and characteristics. The requested Lock is passed to a callback, while the function itself returns a Promise that resolves (or rejects) with the result of the callback after the lock is released, or rejects if the request is aborted.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/LockManager/request)
 */
suspend fun <T : JsAny?> LockManager.request(
    name: String,
    options: LockOptions,
    block: suspend CoroutineScope.(lock: Lock?) -> T,
): T =
    await { signal ->
        requestAsync(
            name = name,
            options = unsafeAbortable(options, signal),
            callback = async(signal, block),
        )
    }
