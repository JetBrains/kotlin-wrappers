// Automatically generated - do not modify!

package node.workerThreads

import js.promise.Promise

sealed external interface LockManager {
    @JsName("query")
    fun queryAsync(): Promise<LockManagerSnapshot>

    @seskar.js.JsAsync
    suspend fun query(): LockManagerSnapshot

    @JsName("request")
    fun <T> requestAsync(
        name: String,
        callback: LockGrantedCallback<T>,
    ): Promise<T>

    @seskar.js.JsAsync
    suspend fun <T> request(
        name: String,
        callback: LockGrantedCallback<T>,
    ): T

    @JsName("request")
    fun <T> requestAsync(
        name: String,
        options: LockOptions,
        callback: LockGrantedCallback<T>,
    ): Promise<T>

    @seskar.js.JsAsync
    suspend fun <T> request(
        name: String,
        options: LockOptions,
        callback: LockGrantedCallback<T>,
    ): T
}
