// Automatically generated - do not modify!

package web.storage

import js.core.JsBoolean
import js.core.JsPrimitives.toBoolean
import js.promise.Promise
import js.promise.await
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
    @JsName("estimate")
    fun estimateAsync(): Promise<StorageEstimate>

    /**
     * The **`getDirectory()`** method of the StorageManager interface is used to obtain a reference to a FileSystemDirectoryHandle object allowing access to a directory and its contents, stored in the origin private file system (OPFS).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/StorageManager/getDirectory)
     */
    @JsName("getDirectory")
    fun getDirectoryAsync(): Promise<FileSystemDirectoryHandle>

    /**
     * The **`persist()`** method of the StorageManager interface requests permission to use persistent storage, and returns a Promise that resolves to `true` if permission is granted and bucket mode is persistent, and `false` otherwise.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/StorageManager/persist)
     */
    @JsName("persist")
    fun persistAsync(): Promise<JsBoolean>

    /**
     * The **`persisted()`** method of the StorageManager interface returns a Promise that resolves to `true` if your site's storage bucket is persistent.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/StorageManager/persisted)
     */
    @JsName("persisted")
    fun persistedAsync(): Promise<JsBoolean>
}

/**
 * The **`estimate()`** method of the StorageManager interface asks the Storage Manager for how much storage the current origin takes up (`usage`), and how much space is available (`quota`).
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/StorageManager/estimate)
 */
suspend inline fun StorageManager.estimate(): StorageEstimate {
    return estimateAsync().await()
}

/**
 * The **`getDirectory()`** method of the StorageManager interface is used to obtain a reference to a FileSystemDirectoryHandle object allowing access to a directory and its contents, stored in the origin private file system (OPFS).
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/StorageManager/getDirectory)
 */
suspend inline fun StorageManager.getDirectory(): FileSystemDirectoryHandle {
    return getDirectoryAsync().await()
}

/**
 * The **`persist()`** method of the StorageManager interface requests permission to use persistent storage, and returns a Promise that resolves to `true` if permission is granted and bucket mode is persistent, and `false` otherwise.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/StorageManager/persist)
 */
suspend inline fun StorageManager.persist(): Boolean {
    return persistAsync().await().toBoolean()
}

/**
 * The **`persisted()`** method of the StorageManager interface returns a Promise that resolves to `true` if your site's storage bucket is persistent.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/StorageManager/persisted)
 */
suspend inline fun StorageManager.persisted(): Boolean {
    return persistedAsync().await().toBoolean()
}
