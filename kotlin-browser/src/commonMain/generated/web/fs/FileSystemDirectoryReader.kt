// Automatically generated - do not modify!

package web.fs

import kotlin.js.definedExternally

/**
 * The `FileSystemDirectoryReader` interface of the File and Directory Entries API lets you access the FileSystemFileEntry-based objects (generally FileSystemFileEntry or FileSystemDirectoryEntry) representing each entry in a directory.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystemDirectoryReader)
 */
external class FileSystemDirectoryReader
private constructor() {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystemDirectoryReader/readEntries)
     */
    fun readEntries(
        successCallback: FileSystemEntriesCallback,
        errorCallback: ErrorCallback = definedExternally,
    )
}
