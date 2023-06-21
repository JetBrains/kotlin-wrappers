// Automatically generated - do not modify!

package web.filesystem

import web.file.File
import kotlin.js.Promise

sealed external class FileSystemFileHandle :
    FileSystemHandle {
    /* val kind: "file" */
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystemFileHandle/createWritable) */
    fun createWritable(options: FileSystemCreateWritableOptions = definedExternally): Promise<FileSystemWritableFileStream>

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystemFileHandle/getFile) */
    fun getFile(): Promise<File>
}
