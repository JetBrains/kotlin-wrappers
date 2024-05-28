// Automatically generated - do not modify!

package web.fs

import js.core.JsLong
import js.core.Void
import js.promise.Promise
import seskar.js.JsAsync
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
    @JsAsync
    suspend fun seek(position: JsLong)

    @JsName("seek")
    fun seekAsync(position: JsLong): Promise<Void>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystemWritableFileStream/truncate)
     */
    @JsAsync
    suspend fun truncate(size: JsLong)

    @JsName("truncate")
    fun truncateAsync(size: JsLong): Promise<Void>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystemWritableFileStream/write)
     */
    @JsAsync
    suspend fun write(data: FileSystemWriteChunkType)

    @JsName("write")
    fun writeAsync(data: FileSystemWriteChunkType): Promise<Void>
}
