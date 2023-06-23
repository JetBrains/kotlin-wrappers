// Automatically generated - do not modify!

package web.filesystem

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystemDirectoryEntry) */
sealed external class FileSystemDirectoryEntry :
    FileSystemEntry {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystemDirectoryEntry/createReader) */
    fun createReader(): FileSystemDirectoryReader

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystemDirectoryEntry/getDirectory) */
    fun getDirectory(
        path: String? = definedExternally,
        options: FileSystemFlags = definedExternally,
        successCallback: FileSystemEntryCallback = definedExternally,
        errorCallback: ErrorCallback = definedExternally,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystemDirectoryEntry/getFile) */
    fun getFile(
        path: String? = definedExternally,
        options: FileSystemFlags = definedExternally,
        successCallback: FileSystemEntryCallback = definedExternally,
        errorCallback: ErrorCallback = definedExternally,
    )
}
