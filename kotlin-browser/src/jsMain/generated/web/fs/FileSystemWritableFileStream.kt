// Automatically generated - do not modify!

package web.fs

import js.core.JsLong
import js.core.Void
import js.promise.Promise
import web.streams.WritableStream

/**
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystemWritableFileStream)
 */
sealed external class FileSystemWritableFileStream :
    WritableStream<FileSystemWriteChunkType> {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystemWritableFileStream/seek)
     */
    fun seek(position: JsLong): Promise<Void>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystemWritableFileStream/truncate)
     */
    fun truncate(size: JsLong): Promise<Void>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystemWritableFileStream/write)
     */
    fun write(data: FileSystemWriteChunkType): Promise<Void>
}
