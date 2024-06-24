// Automatically generated - do not modify!

package typescript

/** Host that has watch functionality used in --watch mode */
sealed external interface WatchHost {
    /** If provided, called with Diagnostic message that informs about change in watch status */
    val onWatchStatusChange: ((diagnostic: Diagnostic, newLine: String, options: CompilerOptions, errorCount: Double? /* use undefined for default */) -> Unit)?

    /** Used to watch changes in source files, missing files needed to update the program or config file */
    fun watchFile(
        path: String,
        callback: FileWatcherCallback,
        pollingInterval: Double = definedExternally,
        options: WatchOptions = definedExternally,
    ): FileWatcher

    /** Used to watch resolved module's failed lookup locations, config file specs, type roots where auto type reference directives are added */
    fun watchDirectory(
        path: String,
        callback: DirectoryWatcherCallback,
        recursive: Boolean = definedExternally,
        options: WatchOptions = definedExternally,
    ): FileWatcher

    /** If provided, will be used to set delayed compilation, so that multiple changes in short span are compiled together */
    val setTimeout: (Function<Any?> /* setTimeout?(callback: (...args: any[]) => void, ms: number, ...args: any[]): any; */)?

    /** If provided, will be used to reset existing delayed compilation */
    val clearTimeout: ((timeoutId: Any?) -> Unit)?
}
