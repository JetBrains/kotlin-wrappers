// Automatically generated - do not modify!

package web.fs

import js.promise.Promise
import js.promise.internal.awaitPromiseLike
import js.serialization.Serializable
import seskar.js.JsAsync
import web.file.File
import kotlin.js.JsName
import kotlin.js.definedExternally

/**
 * The **`FileSystemFileHandle`** interface of the File System API represents a handle to a file system entry.
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystemFileHandle)
 */
external class FileSystemFileHandle
private constructor() :
    FileSystemHandle,
    Serializable {
    override val kind: FileSystemHandleKind.file

    /**
     * The **`createSyncAccessHandle()`** method of the that can be used to synchronously read from and write to a file.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystemFileHandle/createSyncAccessHandle)
     */
    @JsName("createSyncAccessHandle")
    fun createSyncAccessHandleAsync(): Promise<FileSystemSyncAccessHandle>

    /**
     * The **`createWritable()`** method of the FileSystemFileHandle interface creates a FileSystemWritableFileStream that can be used to write to a file.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystemFileHandle/createWritable)
     */
    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun createWritable(options: FileSystemCreateWritableOptions = definedExternally): FileSystemWritableFileStream

    @JsName("createWritable")
    fun createWritableAsync(options: FileSystemCreateWritableOptions = definedExternally): Promise<FileSystemWritableFileStream>

    /**
     * The **`getFile()`** method of the If the file on disk changes or is removed after this method is called, the returned ```js-nolint getFile() ``` None.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystemFileHandle/getFile)
     */
    @JsName("getFile")
    fun getFileAsync(): Promise<File>
}

/**
 * The **`createSyncAccessHandle()`** method of the that can be used to synchronously read from and write to a file.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystemFileHandle/createSyncAccessHandle)
 */
suspend inline fun FileSystemFileHandle.createSyncAccessHandle(): FileSystemSyncAccessHandle {
    return awaitPromiseLike(createSyncAccessHandleAsync())
}

/**
 * The **`getFile()`** method of the If the file on disk changes or is removed after this method is called, the returned ```js-nolint getFile() ``` None.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystemFileHandle/getFile)
 */
suspend inline fun FileSystemFileHandle.getFile(): File {
    return awaitPromiseLike(getFileAsync())
}
