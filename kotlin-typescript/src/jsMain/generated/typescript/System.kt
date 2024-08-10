// Automatically generated - do not modify!

package typescript

import js.date.Date

sealed external interface System {
    var args: js.array.ReadonlyArray<String>
    var newLine: String
    var useCaseSensitiveFileNames: Boolean
    fun write(s: String): Unit
    val writeOutputIsTTY: (() -> Boolean)?
    val getWidthOfTerminal: (() -> Double)?
    fun readFile(path: String, encoding: String = definedExternally): String?
    val getFileSize: ((path: String) -> Double)?
    fun writeFile(path: String, data: String, writeByteOrderMark: Boolean = definedExternally): Unit

    /**
     * @pollingInterval - this parameter is used in polling-based watchers and ignored in watchers that
     * use native OS file watching
     */
    val watchFile: ((path: String, callback: FileWatcherCallback, pollingInterval: Double? /* use undefined for default */, options: WatchOptions? /* use undefined for default */) -> FileWatcher)?
    val watchDirectory: ((path: String, callback: DirectoryWatcherCallback, recursive: Boolean? /* use undefined for default */, options: WatchOptions? /* use undefined for default */) -> FileWatcher)?
    fun resolvePath(path: String): String
    fun fileExists(path: String): Boolean
    fun directoryExists(path: String): Boolean
    fun createDirectory(path: String): Unit
    fun getExecutingFilePath(): String
    fun getCurrentDirectory(): String
    fun getDirectories(path: String): js.array.ReadonlyArray<String>
    fun readDirectory(
        path: String,
        extensions: js.array.ReadonlyArray<String> = definedExternally,
        exclude: js.array.ReadonlyArray<String> = definedExternally,
        include: js.array.ReadonlyArray<String> = definedExternally,
        depth: Double = definedExternally,
    ): js.array.ReadonlyArray<String>

    val getModifiedTime: ((path: String) -> Date?)?
    val setModifiedTime: ((path: String, time: Date) -> Unit)?
    val deleteFile: ((path: String) -> Unit)?

    /**
     * A good implementation is node.js' `crypto.createHash`. (https://nodejs.org/api/crypto.html#crypto_crypto_createhash_algorithm)
     */
    val createHash: ((data: String) -> String)?

    /** This must be cryptographically secure. Only implement this method using `crypto.createHash("sha256")`. */
    val createSHA256Hash: ((data: String) -> String)?
    val getMemoryUsage: (() -> Double)?
    fun exit(exitCode: Double = definedExternally): Unit
    val realpath: ((path: String) -> String)?
    val setTimeout: (Function<Any?> /* setTimeout?(callback: (...args: any[]) => void, ms: number, ...args: any[]): any; */)?
    val clearTimeout: ((timeoutId: Any?) -> Unit)?
    val clearScreen: (() -> Unit)?
    val base64decode: ((input: String) -> String)?
    val base64encode: ((input: String) -> String)?
}
