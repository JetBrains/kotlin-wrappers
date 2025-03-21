// Automatically generated - do not modify!

package web.locks

import js.core.Void
import js.promise.Promise
import seskar.js.JsAsync
import kotlin.js.JsName

/**
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/LockManager)
 */
external class LockManager
private constructor() {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/LockManager/query)
     */
    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun query(): LockManagerSnapshot

    @JsName("query")
    fun queryAsync(): Promise<LockManagerSnapshot>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/LockManager/request)
     */
    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun request(
        name: String,
        callback: LockGrantedCallback,
    )

    @JsName("request")
    fun requestAsync(
        name: String,
        callback: LockGrantedCallback,
    ): Promise<Void>

    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
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
