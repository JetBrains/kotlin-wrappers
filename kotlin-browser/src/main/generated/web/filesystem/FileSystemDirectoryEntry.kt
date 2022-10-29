// Automatically generated - do not modify!

package web.filesystem

sealed external class FileSystemDirectoryEntry :
    FileSystemEntry {
    fun createReader(): FileSystemDirectoryReader
    fun getDirectory(
        path: String? = definedExternally,
        options: FileSystemFlags = definedExternally,
        successCallback: FileSystemEntryCallback = definedExternally,
        errorCallback: ErrorCallback = definedExternally,
    )

    fun getFile(
        path: String? = definedExternally,
        options: FileSystemFlags = definedExternally,
        successCallback: FileSystemEntryCallback = definedExternally,
        errorCallback: ErrorCallback = definedExternally,
    )
}
