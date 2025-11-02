// Automatically generated - do not modify!

package web.fs

import js.core.UInt53
import js.core.Void
import js.promise.Promise
import js.promise.await
import web.streams.WritableStream
import kotlin.js.JsName

/**
 * The **`FileSystemWritableFileStream`** interface of the File System API is a WritableStream object with additional convenience methods, which operates on a single file on disk. The interface is accessed through the FileSystemFileHandle.createWritable() method.
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystemWritableFileStream)
 */
open external class FileSystemWritableFileStream
private constructor() :
    WritableStream<FileSystemWriteChunkType> {
    /**
     * The **`seek()`** method of the FileSystemWritableFileStream interface updates the current file cursor offset to the position (in bytes) specified when calling the method.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystemWritableFileStream/seek)
     */
    @JsName("seek")
    fun seekAsync(position: UInt53): Promise<Void>

    /**
     * The **`truncate()`** method of the FileSystemWritableFileStream interface resizes the file associated with the stream to the specified size in bytes.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystemWritableFileStream/truncate)
     */
    @JsName("truncate")
    fun truncateAsync(size: UInt53): Promise<Void>

    /**
     * The **`write()`** method of the FileSystemWritableFileStream interface writes content into the file the method is called on, at the current file cursor offset.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystemWritableFileStream/write)
     */
    @JsName("write")
    fun writeAsync(data: FileSystemWriteChunkType): Promise<Void>
}

/**
 * The **`seek()`** method of the FileSystemWritableFileStream interface updates the current file cursor offset to the position (in bytes) specified when calling the method.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystemWritableFileStream/seek)
 */
suspend inline fun FileSystemWritableFileStream.seek(position: UInt53) {
    seekAsync(
        position = position,
    ).await()
}

/**
 * The **`truncate()`** method of the FileSystemWritableFileStream interface resizes the file associated with the stream to the specified size in bytes.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystemWritableFileStream/truncate)
 */
suspend inline fun FileSystemWritableFileStream.truncate(size: UInt53) {
    truncateAsync(
        size = size,
    ).await()
}

/**
 * The **`write()`** method of the FileSystemWritableFileStream interface writes content into the file the method is called on, at the current file cursor offset.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystemWritableFileStream/write)
 */
suspend inline fun FileSystemWritableFileStream.write(data: FileSystemWriteChunkType) {
    writeAsync(
        data = data,
    ).await()
}
