// Automatically generated - do not modify!

package web.fs

import js.core.JsBoolean
import js.core.JsPrimitives.toBoolean
import js.promise.Promise
import js.promise.await
import js.serialization.Serializable
import kotlin.js.JsName

/**
 * The **`FileSystemHandle`** interface of the File System API is an object which represents a file or directory entry.
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystemHandle)
 */
open external class FileSystemHandle
private constructor() :
    StartInDirectory,
    Serializable {
    /**
     * The **`kind`** read-only property of the FileSystemHandle interface returns the type of entry.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystemHandle/kind)
     */
    open val kind: FileSystemHandleKind

    /**
     * The **`name`** read-only property of the FileSystemHandle interface returns the name of the entry represented by handle.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystemHandle/name)
     */
    val name: String

    /**
     * The **`isSameEntry()`** method of the FileSystemHandle interface compares two FileSystemHandle to see if the associated entries (either a file or directory) match.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystemHandle/isSameEntry)
     */
    @JsName("isSameEntry")
    fun isSameEntryAsync(other: FileSystemHandle): Promise<JsBoolean>
}

/**
 * The **`isSameEntry()`** method of the FileSystemHandle interface compares two FileSystemHandle to see if the associated entries (either a file or directory) match.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystemHandle/isSameEntry)
 */
suspend inline fun FileSystemHandle.isSameEntry(other: FileSystemHandle): Boolean {
    return isSameEntryAsync(
        other = other,
    ).await().toBoolean()
}
