// Automatically generated - do not modify!

package web.fs

import js.promise.Promise
import seskar.js.JsAsync
import web.file.File

/**
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystemFileHandle)
 */
sealed external class FileSystemFileHandle :
    FileSystemHandle {
    override val kind: FileSystemHandleKind.file

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystemFileHandle/createSyncAccessHandle)
     */
    @JsAsync
    suspend fun createSyncAccessHandle(): FileSystemSyncAccessHandle

    @JsName("createSyncAccessHandle")
    fun createSyncAccessHandleAsync(): Promise<FileSystemSyncAccessHandle>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystemFileHandle/createWritable)
     */
    @JsAsync
    suspend fun createWritable(options: FileSystemCreateWritableOptions = definedExternally): FileSystemWritableFileStream

    @JsName("createWritable")
    fun createWritableAsync(options: FileSystemCreateWritableOptions = definedExternally): Promise<FileSystemWritableFileStream>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystemFileHandle/getFile)
     */
    @JsAsync
    suspend fun getFile(): File

    @JsName("getFile")
    fun getFileAsync(): Promise<File>
}
