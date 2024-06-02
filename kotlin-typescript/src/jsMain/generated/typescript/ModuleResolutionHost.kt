// Automatically generated - do not modify!

package typescript

import js.array.ReadonlyArray

sealed external interface ModuleResolutionHost {
    fun fileExists(path: String): Boolean
    fun readFile(path: String): String?
    val trace: ((s: String) -> Unit)?
    val directoryExists: ((directoryName: String) -> Boolean)?

    /**
     * Resolve a symbolic link.
     * @see https://nodejs.org/api/fs.html#fs_fs_realpathsync_path_options
     */
    val realpath: ((path: String) -> String)?
    val getCurrentDirectory: (() -> String)?
    val getDirectories: ((path: String) -> ReadonlyArray<String>)?
    var useCaseSensitiveFileNames: dynamic? /* boolean | (() => boolean) */?
}
