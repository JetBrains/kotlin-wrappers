// Automatically generated - do not modify!

package web.fs

import js.promise.Promise
import js.promise.await
import js.serialization.Serializable
import web.file.File
import kotlin.js.JsName
import kotlin.js.definedExternally

/**
 * The **`FileSystemFileHandle`** interface of the File System API represents a handle to a file system entry. The interface is accessed through the window.showOpenFilePicker() method.
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystemFileHandle)
 */
open external class FileSystemFileHandle
private constructor() :
    FileSystemHandle,
    Serializable {
    override val kind: FileSystemHandleKind.file

    /**
     * The **`createSyncAccessHandle()`** method of the FileSystemFileHandle interface returns a Promise which resolves to a FileSystemSyncAccessHandle object that can be used to synchronously read from and write to a file. The synchronous nature of this method brings performance advantages, but it is only usable inside dedicated Web Workers for files within the origin private file system.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystemFileHandle/createSyncAccessHandle)
     */
    @JsName("createSyncAccessHandle")
    fun createSyncAccessHandleAsync(): Promise<FileSystemSyncAccessHandle>

    /**
     * The **`createWritable()`** method of the FileSystemFileHandle interface creates a FileSystemWritableFileStream that can be used to write to a file. The method returns a Promise which resolves to this created stream.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystemFileHandle/createWritable)
     */
    @JsName("createWritable")
    fun createWritableAsync(options: FileSystemCreateWritableOptions = definedExternally): Promise<FileSystemWritableFileStream>

    /**
     * The **`getFile()`** method of the FileSystemFileHandle interface returns a Promise which resolves to a File object representing the state on disk of the entry represented by the handle.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystemFileHandle/getFile)
     */
    @JsName("getFile")
    fun getFileAsync(): Promise<File>
}

/**
 * The **`createSyncAccessHandle()`** method of the FileSystemFileHandle interface returns a Promise which resolves to a FileSystemSyncAccessHandle object that can be used to synchronously read from and write to a file. The synchronous nature of this method brings performance advantages, but it is only usable inside dedicated Web Workers for files within the origin private file system.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystemFileHandle/createSyncAccessHandle)
 */
suspend inline fun FileSystemFileHandle.createSyncAccessHandle(): FileSystemSyncAccessHandle {
    return createSyncAccessHandleAsync().await()
}

/**
 * The **`createWritable()`** method of the FileSystemFileHandle interface creates a FileSystemWritableFileStream that can be used to write to a file. The method returns a Promise which resolves to this created stream.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystemFileHandle/createWritable)
 */
suspend inline fun FileSystemFileHandle.createWritable(): FileSystemWritableFileStream {
    return createWritableAsync().await()
}

/**
 * The **`createWritable()`** method of the FileSystemFileHandle interface creates a FileSystemWritableFileStream that can be used to write to a file. The method returns a Promise which resolves to this created stream.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystemFileHandle/createWritable)
 */
suspend inline fun FileSystemFileHandle.createWritable(options: FileSystemCreateWritableOptions): FileSystemWritableFileStream {
    return createWritableAsync(
        options = options,
    ).await()
}

/**
 * The **`getFile()`** method of the FileSystemFileHandle interface returns a Promise which resolves to a File object representing the state on disk of the entry represented by the handle.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystemFileHandle/getFile)
 */
suspend inline fun FileSystemFileHandle.getFile(): File {
    return getFileAsync().await()
}
