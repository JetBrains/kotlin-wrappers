// Automatically generated - do not modify!

package web.filesystem

import js.core.Void
import web.streams.WritableStream
import kotlin.js.Promise

sealed external class FileSystemWritableFileStream :
    WritableStream<FileSystemWriteChunkType> {
    fun seek(position: Number): Promise<Void>
    fun truncate(size: Number): Promise<Void>
    fun write(data: FileSystemWriteChunkType): Promise<Void>
}
