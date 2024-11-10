// Automatically generated - do not modify!

package web.storage

import js.promise.Promise
import seskar.js.JsAsync
import web.fs.FileSystemDirectoryHandle

/**
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/StorageManager)
 */
external class StorageManager
private constructor() {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/StorageManager/estimate)
     */
    @JsAsync
    suspend fun estimate(): StorageEstimate

    @JsName("estimate")
    fun estimateAsync(): Promise<StorageEstimate>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/StorageManager/getDirectory)
     */
    @JsAsync
    suspend fun getDirectory(): FileSystemDirectoryHandle

    @JsName("getDirectory")
    fun getDirectoryAsync(): Promise<FileSystemDirectoryHandle>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/StorageManager/persist)
     */
    @JsAsync
    suspend fun persist(): Boolean

    @JsName("persist")
    fun persistAsync(): Promise<Boolean>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/StorageManager/persisted)
     */
    @JsAsync
    suspend fun persisted(): Boolean

    @JsName("persisted")
    fun persistedAsync(): Promise<Boolean>
}
