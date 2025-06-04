// Automatically generated - do not modify!

package web.locks

import js.core.JsAny
import js.promise.Promise
import seskar.js.JsAsync
import kotlin.js.JsName

/**
 * The **`LockManager`** interface of the Web Locks API provides methods for requesting a new Lock object and querying for an existing `Lock` object.
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/LockManager)
 */
external class LockManager
private constructor() {
    /**
     * The **`query()`** method of the LockManager interface returns a Promise that resolves with an object containing information about held and pending locks.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/LockManager/query)
     */
    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun query(): LockManagerSnapshot

    @JsName("query")
    fun queryAsync(): Promise<LockManagerSnapshot>

    /**
     * The **`request()`** method of the LockManager interface requests a Lock object with parameters specifying its name and characteristics.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/LockManager/request)
     */
    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun <T : JsAny?> request(
        name: String,
        callback: LockGrantedCallback<T>,
    ): T

    @JsName("request")
    fun <T : JsAny?> requestAsync(
        name: String,
        callback: LockGrantedCallback<T>,
    ): Promise<T>

    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun <T : JsAny?> request(
        name: String,
        options: LockOptions,
        callback: LockGrantedCallback<T>,
    ): T

    @JsName("request")
    fun <T : JsAny?> requestAsync(
        name: String,
        options: LockOptions,
        callback: LockGrantedCallback<T>,
    ): Promise<T>
}
