// Automatically generated - do not modify!

package web.storage

import js.core.JsBoolean
import js.promise.Promise
import seskar.js.JsAsync
import web.fs.FileSystemDirectoryHandle
import kotlin.js.JsName

/**
 * The **`StorageManager`** interface of the Storage API provides an interface for managing persistence permissions and estimating available storage.
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
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun estimate(): StorageEstimate

    @JsName("estimate")
    fun estimateAsync(): Promise<StorageEstimate>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/StorageManager/getDirectory)
     */
    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun getDirectory(): FileSystemDirectoryHandle

    @JsName("getDirectory")
    fun getDirectoryAsync(): Promise<FileSystemDirectoryHandle>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/StorageManager/persist)
     */
    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun persist(): Boolean

    @JsName("persist")
    fun persistAsync(): Promise<JsBoolean>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/StorageManager/persisted)
     */
    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun persisted(): Boolean

    @JsName("persisted")
    fun persistedAsync(): Promise<JsBoolean>
}
