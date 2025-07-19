// Automatically generated - do not modify!

package web.fs

/**
 * The File and Directory Entries API interface **`FileSystem`** is used to represent a file system.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystem)
 */
open external class FileSystem
private constructor() {
    /**
     * The read-only **`name`** property of the string is unique among all file systems currently exposed by the File and Directory Entries API.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystem/name)
     */
    val name: String

    /**
     * The read-only **`root`** property of the object representing the root directory of the file system, for use with the File and Directory Entries API.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystem/root)
     */
    val root: FileSystemDirectoryEntry
}
