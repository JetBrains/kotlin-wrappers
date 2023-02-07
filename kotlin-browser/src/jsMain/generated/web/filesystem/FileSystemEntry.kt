// Automatically generated - do not modify!

package web.filesystem

sealed external class FileSystemEntry {
    val filesystem: FileSystem
    val fullPath: String
    val isDirectory: Boolean
    val isFile: Boolean
    val name: String
    fun getParent(
        successCallback: FileSystemEntryCallback = definedExternally,
        errorCallback: ErrorCallback = definedExternally,
    )
}
