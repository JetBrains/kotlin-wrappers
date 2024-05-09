// Automatically generated - do not modify!

package web.locks

import js.core.Void
import js.promise.Promise

/**
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/LockManager)
 */
sealed external class LockManager {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/LockManager/query)
     */
    suspend fun query(): LockManagerSnapshot

    @JsName("query")
    fun queryAsync(): Promise<LockManagerSnapshot>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/LockManager/request)
     */
    suspend fun request(
        name: String,
        callback: LockGrantedCallback,
    )

    @JsName("request")
    fun requestAsync(
        name: String,
        callback: LockGrantedCallback,
    ): Promise<Void>

    suspend fun request(
        name: String,
        options: LockOptions,
        callback: LockGrantedCallback,
    )

    @JsName("request")
    fun requestAsync(
        name: String,
        options: LockOptions,
        callback: LockGrantedCallback,
    ): Promise<Void>
}
