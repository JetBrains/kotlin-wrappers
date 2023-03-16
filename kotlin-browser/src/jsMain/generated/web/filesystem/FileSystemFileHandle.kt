// Automatically generated - do not modify!

package web.filesystem

import web.file.File
import kotlin.js.Promise

sealed external class FileSystemFileHandle :
    FileSystemHandle {
    /* val kind: "file" */
    fun createWritable(options: FileSystemCreateWritableOptions = definedExternally): Promise<FileSystemWritableFileStream>
    fun getFile(): Promise<File>
}
