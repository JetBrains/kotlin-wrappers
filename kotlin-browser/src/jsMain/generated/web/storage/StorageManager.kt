// Automatically generated - do not modify!

package web.storage

import web.filesystem.FileSystemDirectoryHandle
import kotlin.js.Promise

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
