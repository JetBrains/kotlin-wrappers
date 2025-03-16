// Automatically generated - do not modify!

package web.fs

import js.buffer.AllowSharedBufferSource
import js.core.Int53
import kotlin.js.definedExternally

/**
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystemSyncAccessHandle)
 */
external class FileSystemSyncAccessHandle
private constructor() {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystemSyncAccessHandle/close)
     */
    fun close()

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystemSyncAccessHandle/flush)
     */
    fun flush()

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystemSyncAccessHandle/getSize)
     */
    fun getSize(): Int53

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystemSyncAccessHandle/read)
     */
    fun read(
        buffer: AllowSharedBufferSource,
        options: FileSystemReadWriteOptions = definedExternally,
    ): Int53

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystemSyncAccessHandle/truncate)
     */
    fun truncate(newSize: Int53)

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystemSyncAccessHandle/write)
     */
    fun write(
        buffer: AllowSharedBufferSource,
        options: FileSystemReadWriteOptions = definedExternally,
    ): Int53
}
