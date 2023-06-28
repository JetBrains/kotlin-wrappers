// Automatically generated - do not modify!

package web.filesystem

import js.promise.Promise
import web.file.File

/**
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystemFileHandle)
 */
sealed external class FileSystemFileHandle :
    FileSystemHandle {
    /* val kind: "file" */
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystemFileHandle/createWritable) */
    fun createWritable(options: FileSystemCreateWritableOptions = definedExternally): Promise<FileSystemWritableFileStream>

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystemFileHandle/getFile) */
    fun getFile(): Promise<File>
}
