// Automatically generated - do not modify!

package web.storage

import web.filesystem.FileSystemDirectoryHandle
import kotlin.js.Promise

sealed external class StorageManager {
    fun estimate(): Promise<StorageEstimate>
    fun getDirectory(): Promise<FileSystemDirectoryHandle>
    fun persist(): Promise<Boolean>
    fun persisted(): Promise<Boolean>
}
