// Automatically generated - do not modify!

package web.fs

import js.buffer.AllowSharedBufferSource
import js.core.UInt53
import kotlin.js.definedExternally

/**
 * The **`FileSystemSyncAccessHandle`** interface of the File System API represents a synchronous handle to a file system entry.
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystemSyncAccessHandle)
 */
open external class FileSystemSyncAccessHandle
private constructor() {
    /**
     * The **`close()`** method of the FileSystemSyncAccessHandle interface closes an open synchronous file handle, disabling any further operations on it and releasing the exclusive lock previously put on the file associated with the file handle.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystemSyncAccessHandle/close)
     */
    fun close()

    /**
     * The **`flush()`** method of the FileSystemSyncAccessHandle interface persists any changes made to the file associated with the handle via the FileSystemSyncAccessHandle.write method to disk.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystemSyncAccessHandle/flush)
     */
    fun flush()

    /**
     * The **`getSize()`** method of the FileSystemSyncAccessHandle interface returns the size of the file associated with the handle in bytes.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystemSyncAccessHandle/getSize)
     */
    fun getSize(): UInt53

    /**
     * The **`read()`** method of the FileSystemSyncAccessHandle interface reads the content of the file associated with the handle into a specified buffer, optionally at a given offset.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystemSyncAccessHandle/read)
     */
    fun read(
        buffer: AllowSharedBufferSource,
        options: FileSystemReadWriteOptions = definedExternally,
    ): UInt53

    /**
     * The **`truncate()`** method of the FileSystemSyncAccessHandle interface resizes the file associated with the handle to a specified number of bytes.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystemSyncAccessHandle/truncate)
     */
    fun truncate(newSize: UInt53)

    /**
     * The **`write()`** method of the FileSystemSyncAccessHandle interface writes the content of a specified buffer to the file associated with the handle, optionally at a given offset.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystemSyncAccessHandle/write)
     */
    fun write(
        buffer: AllowSharedBufferSource,
        options: FileSystemReadWriteOptions = definedExternally,
    ): UInt53
}
