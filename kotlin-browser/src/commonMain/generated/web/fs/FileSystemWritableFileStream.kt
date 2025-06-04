// Automatically generated - do not modify!

package web.fs

import js.core.UInt53
import js.core.Void
import js.promise.Promise
import seskar.js.JsAsync
import web.streams.WritableStream
import kotlin.js.JsName

/**
 * The **`FileSystemWritableFileStream`** interface of the File System API is a WritableStream object with additional convenience methods, which operates on a single file on disk.
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystemWritableFileStream)
 */
external class FileSystemWritableFileStream
private constructor() :
    WritableStream<FileSystemWriteChunkType> {
    /**
     * The **`seek()`** method of the FileSystemWritableFileStream interface updates the current file cursor offset to the position (in bytes) specified when calling the method.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystemWritableFileStream/seek)
     */
    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun seek(position: UInt53)

    @JsName("seek")
    fun seekAsync(position: UInt53): Promise<Void>

    /**
     * The **`truncate()`** method of the FileSystemWritableFileStream interface resizes the file associated with the stream to the specified size in bytes.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystemWritableFileStream/truncate)
     */
    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun truncate(size: UInt53)

    @JsName("truncate")
    fun truncateAsync(size: UInt53): Promise<Void>

    /**
     * The **`write()`** method of the FileSystemWritableFileStream interface writes content into the file the method is called on, at the current file cursor offset.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystemWritableFileStream/write)
     */
    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun write(data: FileSystemWriteChunkType)

    @JsName("write")
    fun writeAsync(data: FileSystemWriteChunkType): Promise<Void>
}
