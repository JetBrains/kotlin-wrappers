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
     * The **`estimate()`** method of the StorageManager interface asks the Storage Manager for how much storage the current origin takes up (`usage`), and how much space is available (`quota`).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/StorageManager/estimate)
     */
    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun estimate(): StorageEstimate

    @JsName("estimate")
    fun estimateAsync(): Promise<StorageEstimate>

    /**
     * The **`getDirectory()`** method of the StorageManager interface is used to obtain a reference to a FileSystemDirectoryHandle object allowing access to a directory and its contents, stored in the origin private file system (OPFS).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/StorageManager/getDirectory)
     */
    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun getDirectory(): FileSystemDirectoryHandle

    @JsName("getDirectory")
    fun getDirectoryAsync(): Promise<FileSystemDirectoryHandle>

    /**
     * The **`persist()`** method of the StorageManager interface requests permission to use persistent storage, and returns a Promise that resolves to `true` if permission is granted and bucket mode is persistent, and `false` otherwise.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/StorageManager/persist)
     */
    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun persist(): Boolean

    @JsName("persist")
    fun persistAsync(): Promise<JsBoolean>

    /**
     * The **`persisted()`** method of the StorageManager interface returns a Promise that resolves to `true` if your site's storage bucket is persistent.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/StorageManager/persisted)
     */
    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun persisted(): Boolean

    @JsName("persisted")
    fun persistedAsync(): Promise<JsBoolean>
}
