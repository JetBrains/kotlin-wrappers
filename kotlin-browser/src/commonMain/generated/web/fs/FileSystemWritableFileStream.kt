// Automatically generated - do not modify!

package web.fs

import js.core.Int53
import js.core.Void
import js.promise.Promise
import seskar.js.JsAsync
import web.streams.WritableStream
import kotlin.js.JsName

/**
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystemWritableFileStream)
 */
external class FileSystemWritableFileStream
private constructor() :
    WritableStream<FileSystemWriteChunkType> {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystemWritableFileStream/seek)
     */
    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun seek(position: Int53)

    @JsName("seek")
    fun seekAsync(position: Int53): Promise<Void>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystemWritableFileStream/truncate)
     */
    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun truncate(size: Int53)

    @JsName("truncate")
    fun truncateAsync(size: Int53): Promise<Void>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystemWritableFileStream/write)
     */
    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun write(data: FileSystemWriteChunkType)

    @JsName("write")
    fun writeAsync(data: FileSystemWriteChunkType): Promise<Void>
}
