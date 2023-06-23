// Automatically generated - do not modify!

package web.filesystem

import js.core.Void
import web.streams.WritableStream
import kotlin.js.Promise

/**
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystemWritableFileStream)
 */
sealed external class FileSystemWritableFileStream :
    WritableStream<FileSystemWriteChunkType> {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystemWritableFileStream/seek) */
    fun seek(position: Number): Promise<Void>

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystemWritableFileStream/truncate) */
    fun truncate(size: Number): Promise<Void>

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystemWritableFileStream/write) */
    fun write(data: FileSystemWriteChunkType): Promise<Void>
}
