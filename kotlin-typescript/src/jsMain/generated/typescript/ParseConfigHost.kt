// Automatically generated - do not modify!

package typescript

import js.array.ReadonlyArray

sealed external interface ParseConfigHost : ModuleResolutionHost {
    override var useCaseSensitiveFileNames: Boolean
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
    override fun fileExists(path: String): Boolean
    override fun readFile(path: String): String?
    override val trace: ((s: String) -> Unit)?
}
