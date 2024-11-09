// Automatically generated - do not modify!

package web.fs

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystemEntry)
 */
open external class FileSystemEntry
private constructor() {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystemEntry/filesystem)
     */
    val filesystem: FileSystem

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystemEntry/fullPath)
     */
    val fullPath: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystemEntry/isDirectory)
     */
    val isDirectory: Boolean

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystemEntry/isFile)
     */
    val isFile: Boolean

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystemEntry/name)
     */
    val name: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystemEntry/getParent)
     */
    fun getParent(
        successCallback: FileSystemEntryCallback = definedExternally,
        errorCallback: ErrorCallback = definedExternally,
    )
}
