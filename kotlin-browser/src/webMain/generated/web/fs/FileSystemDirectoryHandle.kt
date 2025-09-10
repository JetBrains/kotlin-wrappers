// Automatically generated - do not modify!

package web.fs

import js.array.ReadonlyArray
import js.collections.AsyncMapLike
import js.core.Void
import js.promise.Promise
import js.promise.await
import js.serialization.Serializable
import kotlin.js.JsName
import kotlin.js.JsString
import kotlin.js.definedExternally

/**
 * The **`FileSystemDirectoryHandle`** interface of the File System API provides a handle to a file system directory.
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystemDirectoryHandle)
 */
sealed /* final */
external class FileSystemDirectoryHandle
protected /* private */ constructor() :
    FileSystemHandle,
    AsyncMapLike<JsString, FileSystemHandle>,
    Serializable {
    override val kind: FileSystemHandleKind.directory

    /**
     * The **`getDirectoryHandle()`** method of the FileSystemDirectoryHandle interface returns a FileSystemDirectoryHandle for a subdirectory with the specified name within the directory handle on which the method is called.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystemDirectoryHandle/getDirectoryHandle)
     */
    @JsName("getDirectoryHandle")
    fun getDirectoryHandleAsync(
        name: String,
        options: FileSystemGetDirectoryOptions = definedExternally,
    ): Promise<FileSystemDirectoryHandle>

    /**
     * The **`getFileHandle()`** method of the FileSystemDirectoryHandle interface returns a FileSystemFileHandle for a file with the specified name, within the directory the method is called.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystemDirectoryHandle/getFileHandle)
     */
    @JsName("getFileHandle")
    fun getFileHandleAsync(
        name: String,
        options: FileSystemGetFileOptions = definedExternally,
    ): Promise<FileSystemFileHandle>

    /**
     * The **`removeEntry()`** method of the FileSystemDirectoryHandle interface attempts to remove an entry if the directory handle contains a file or directory called the name specified.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystemDirectoryHandle/removeEntry)
     */
    @JsName("removeEntry")
    fun removeEntryAsync(
        name: String,
        options: FileSystemRemoveOptions = definedExternally,
    ): Promise<Void>

    /**
     * The **`resolve()`** method of the FileSystemDirectoryHandle interface returns an Array of directory names from the parent handle to the specified child entry, with the name of the child entry as the last array item.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystemDirectoryHandle/resolve)
     */
    @JsName("resolve")
    fun resolveAsync(possibleDescendant: FileSystemHandle): Promise<ReadonlyArray<JsString>?>
}

/**
 * The **`getDirectoryHandle()`** method of the FileSystemDirectoryHandle interface returns a FileSystemDirectoryHandle for a subdirectory with the specified name within the directory handle on which the method is called.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystemDirectoryHandle/getDirectoryHandle)
 */
suspend inline fun FileSystemDirectoryHandle.getDirectoryHandle(
    name: String,
    options: FileSystemGetDirectoryOptions,
): FileSystemDirectoryHandle {
    return getDirectoryHandleAsync(
        name = name,
        options = options,
    ).await()
}

/**
 * The **`getDirectoryHandle()`** method of the FileSystemDirectoryHandle interface returns a FileSystemDirectoryHandle for a subdirectory with the specified name within the directory handle on which the method is called.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystemDirectoryHandle/getDirectoryHandle)
 */
suspend inline fun FileSystemDirectoryHandle.getDirectoryHandle(
    name: String,
): FileSystemDirectoryHandle {
    return getDirectoryHandleAsync(
        name = name,
    ).await()
}

/**
 * The **`getFileHandle()`** method of the FileSystemDirectoryHandle interface returns a FileSystemFileHandle for a file with the specified name, within the directory the method is called.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystemDirectoryHandle/getFileHandle)
 */
suspend inline fun FileSystemDirectoryHandle.getFileHandle(
    name: String,
    options: FileSystemGetFileOptions,
): FileSystemFileHandle {
    return getFileHandleAsync(
        name = name,
        options = options,
    ).await()
}

/**
 * The **`getFileHandle()`** method of the FileSystemDirectoryHandle interface returns a FileSystemFileHandle for a file with the specified name, within the directory the method is called.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystemDirectoryHandle/getFileHandle)
 */
suspend inline fun FileSystemDirectoryHandle.getFileHandle(
    name: String,
): FileSystemFileHandle {
    return getFileHandleAsync(
        name = name,
    ).await()
}

/**
 * The **`removeEntry()`** method of the FileSystemDirectoryHandle interface attempts to remove an entry if the directory handle contains a file or directory called the name specified.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystemDirectoryHandle/removeEntry)
 */
suspend inline fun FileSystemDirectoryHandle.removeEntry(
    name: String,
    options: FileSystemRemoveOptions,
) {
    removeEntryAsync(
        name = name,
        options = options,
    ).await()
}

/**
 * The **`removeEntry()`** method of the FileSystemDirectoryHandle interface attempts to remove an entry if the directory handle contains a file or directory called the name specified.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystemDirectoryHandle/removeEntry)
 */
suspend inline fun FileSystemDirectoryHandle.removeEntry(
    name: String,
) {
    removeEntryAsync(
        name = name,
    ).await()
}

/**
 * The **`resolve()`** method of the FileSystemDirectoryHandle interface returns an Array of directory names from the parent handle to the specified child entry, with the name of the child entry as the last array item.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystemDirectoryHandle/resolve)
 */
suspend inline fun FileSystemDirectoryHandle.resolve(possibleDescendant: FileSystemHandle): ReadonlyArray<JsString>? {
    return resolveAsync(
        possibleDescendant = possibleDescendant,
    ).await()
}
