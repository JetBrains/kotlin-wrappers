// Automatically generated - do not modify!

package web.filesystem

import kotlin.js.Promise

sealed external class FileSystemHandle {
    val kind: FileSystemHandleKind
    val name: String
    fun isSameEntry(other: FileSystemHandle): Promise<Boolean>
}
