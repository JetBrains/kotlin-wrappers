// Automatically generated - do not modify!

package web.locks

import js.core.JsAny
import js.promise.Promise
import js.promise.await
import kotlin.js.JsName

/**
 * The **`LockManager`** interface of the Web Locks API provides methods for requesting a new Lock object and querying for an existing `Lock` object.
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/LockManager)
 */
open external class LockManager
private constructor() {
    /**
     * The **`query()`** method of the LockManager interface returns a Promise that resolves with an object containing information about held and pending locks.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/LockManager/query)
     */
    @JsName("query")
    fun queryAsync(): Promise<LockManagerSnapshot>

    /**
     * The **`request()`** method of the LockManager interface requests a Lock object with parameters specifying its name and characteristics.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/LockManager/request)
     */
    @JsName("request")
    fun <T : JsAny?> requestAsync(
        name: String,
        callback: LockGrantedCallback<T>,
    ): Promise<T>

    @JsName("request")
    fun <T : JsAny?> requestAsync(
        name: String,
        options: LockOptions,
        callback: LockGrantedCallback<T>,
    ): Promise<T>
}

/**
 * The **`query()`** method of the LockManager interface returns a Promise that resolves with an object containing information about held and pending locks.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/LockManager/query)
 */
suspend inline fun LockManager.query(): LockManagerSnapshot {
    return queryAsync().await()
}

/**
 * The **`request()`** method of the LockManager interface requests a Lock object with parameters specifying its name and characteristics.
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
