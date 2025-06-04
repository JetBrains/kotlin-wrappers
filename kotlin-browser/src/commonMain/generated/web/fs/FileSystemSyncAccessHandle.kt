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
external class FileSystemSyncAccessHandle
private constructor() {
    /**
     * The **`close()`** method of the ```js-nolint close() ``` None.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystemSyncAccessHandle/close)
     */
    fun close()

    /**
     * The **`flush()`** method of the Bear in mind that you only need to call this method if you need the changes committed to disk at a specific time, otherwise you can leave the underlying operating system to handle this when it sees fit, which should be OK in most cases.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystemSyncAccessHandle/flush)
     */
    fun flush()

    /**
     * The **`getSize()`** method of the ```js-nolint getSize() ``` None.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystemSyncAccessHandle/getSize)
     */
    fun getSize(): UInt53

    /**
     * The **`read()`** method of the ```js-nolint read(buffer, options) ``` - `buffer` - : An ArrayBuffer or `ArrayBufferView` (such as a DataView) representing the buffer that the file content should be read into.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystemSyncAccessHandle/read)
     */
    fun read(
        buffer: AllowSharedBufferSource,
        options: FileSystemReadWriteOptions = definedExternally,
    ): UInt53

    /**
     * The **`truncate()`** method of the ```js-nolint truncate(newSize) ``` - `newSize` - : The number of bytes to resize the file to.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystemSyncAccessHandle/truncate)
     */
    fun truncate(newSize: UInt53)

    /**
     * The **`write()`** method of the Files within the origin private file system are not visible to end-users, therefore are not subject to the same security checks as methods running on files within the user-visible file system.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystemSyncAccessHandle/write)
     */
    fun write(
        buffer: AllowSharedBufferSource,
        options: FileSystemReadWriteOptions = definedExternally,
    ): UInt53
}
