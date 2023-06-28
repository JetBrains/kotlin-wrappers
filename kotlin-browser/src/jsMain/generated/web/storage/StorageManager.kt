// Automatically generated - do not modify!

package web.storage

import js.promise.Promise
import web.filesystem.FileSystemDirectoryHandle

/**
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/StorageManager)
 */
sealed external class StorageManager {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/StorageManager/estimate) */
    fun estimate(): Promise<StorageEstimate>

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/StorageManager/getDirectory) */
    fun getDirectory(): Promise<FileSystemDirectoryHandle>

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/StorageManager/persist) */
    fun persist(): Promise<Boolean>

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/StorageManager/persisted) */
    fun persisted(): Promise<Boolean>
}
