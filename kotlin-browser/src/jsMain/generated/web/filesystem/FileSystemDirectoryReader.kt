// Automatically generated - do not modify!

package web.filesystem

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystemDirectoryReader) */
sealed external class FileSystemDirectoryReader {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystemDirectoryReader/readEntries) */
    fun readEntries(
        successCallback: FileSystemEntriesCallback,
        errorCallback: ErrorCallback = definedExternally,
    )
}
