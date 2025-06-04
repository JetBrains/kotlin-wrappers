// Automatically generated - do not modify!

package web.fs

import js.core.JsBoolean
import js.promise.Promise
import js.serialization.Serializable
import seskar.js.JsAsync
import kotlin.js.JsName

/**
 * The **`FileSystemHandle`** interface of the File System API is an object which represents a file or directory entry.
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystemHandle)
 */
open external class FileSystemHandle
private constructor() :
    Serializable {
    /**
     * The **`kind`** read-only property of the `'file'` if the associated entry is a file or `'directory'`.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystemHandle/kind)
     */
    open val kind: FileSystemHandleKind

    /**
     * The **`name`** read-only property of the handle.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystemHandle/name)
     */
    val name: String

    /**
     * The **`isSameEntry()`** method of the ```js-nolint isSameEntry(fileSystemHandle) ``` - FileSystemHandle - : The `FileSystemHandle` to match against the handle on which the method is invoked.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystemHandle/isSameEntry)
     */
    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun isSameEntry(other: FileSystemHandle): Boolean

    @JsName("isSameEntry")
    fun isSameEntryAsync(other: FileSystemHandle): Promise<JsBoolean>
}
