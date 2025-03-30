// Automatically generated - do not modify!

package typescript

sealed external interface ParseConfigHost : ModuleResolutionHost {
    @Suppress("VAR_TYPE_MISMATCH_ON_OVERRIDE")
    override var useCaseSensitiveFileNames: Boolean
    fun readDirectory(
        rootDir: String,
        extensions: js.array.ReadonlyArray<String>,
        excludes: (js.array.ReadonlyArray<String>)?,
        includes: js.array.ReadonlyArray<String>,
        depth: Double = definedExternally,
    ): js.array.ReadonlyArray<String>

    /**
     * Gets a value indicating whether the specified path exists and is a file.
     * @param path The path to test.
     */
    override fun fileExists(fileName: String): Boolean
    override fun readFile(fileName: String): String?
    override val trace: ((s: String) -> Unit)?
}
