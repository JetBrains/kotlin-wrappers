// Automatically generated - do not modify!

package typescript

sealed external interface ModuleResolutionHost {
    fun fileExists(fileName: String): Boolean

    fun readFile(fileName: String): String?

    val trace: ((s: String) -> Unit)?
    val directoryExists: ((directoryName: String) -> Boolean)?

    /**
     * Resolve a symbolic link.
     * @see https://nodejs.org/api/fs.html#fs_fs_realpathsync_path_options
     */
    val realpath: ((path: String) -> String)?
    val getCurrentDirectory: (() -> String)?
    val getDirectories: ((path: String) -> js.array.ReadonlyArray<String>)?
    var useCaseSensitiveFileNames: Any? // boolean | (() => boolean) | undefined
}
