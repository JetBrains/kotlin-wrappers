package web.locks

import js.promise.await

/**
 * The **`request()`** method of the LockManager interface requests a Lock object with parameters specifying its name and characteristics. The requested Lock is passed to a callback, while the function itself returns a Promise that resolves (or rejects) with the result of the callback after the lock is released, or rejects if the request is aborted.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/LockManager/request)
 */
suspend inline fun <T : JsAny?> LockManager.request(
    name: String,
    noinline callback: LockGrantedCallback<T>,
): T {
    return requestAsync(
        name = name,
        callback = callback,
    ).await()
}

suspend inline fun <T : JsAny?> LockManager.request(
    name: String,
    options: LockOptions,
    noinline callback: LockGrantedCallback<T>,
): T {
    return requestAsync(
        name = name,
        options = options,
        callback = callback,
    ).await()
}
