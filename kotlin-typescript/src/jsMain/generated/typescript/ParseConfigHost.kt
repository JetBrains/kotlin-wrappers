// Automatically generated - do not modify!

package typescript

import js.core.ReadonlyArray

sealed external interface ParseConfigHost {
    var useCaseSensitiveFileNames: Boolean
    fun readDirectory(
        rootDir: String,
        extensions: ReadonlyArray<String>,
        excludes: ReadonlyArray<String>?,
        includes: ReadonlyArray<String>,
        depth: Int = definedExternally,
    ): ReadonlyArray<String>

    /**
     * Gets a value indicating whether the specified path exists and is a file.
     * @param path The path to test.
     */
    fun fileExists(path: String): Boolean
    fun readFile(path: String): String?
    val trace: ((s: String) -> Unit)?
}
