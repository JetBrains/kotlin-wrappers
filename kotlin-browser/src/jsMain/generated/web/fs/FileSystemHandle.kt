// Automatically generated - do not modify!

package web.fs

import js.promise.Promise
import seskar.js.JsAsync

/**
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystemHandle)
 */
open external class FileSystemHandle
private constructor() {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystemHandle/kind)
     */
    open val kind: FileSystemHandleKind

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystemHandle/name)
     */
    val name: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystemHandle/isSameEntry)
     */
    @JsAsync
    suspend fun isSameEntry(other: FileSystemHandle): Boolean

    @JsName("isSameEntry")
    fun isSameEntryAsync(other: FileSystemHandle): Promise<Boolean>
}
