// Automatically generated - do not modify!

package typescript

import js.core.ReadonlyArray

sealed external interface WatchOptions {
    var watchFile: WatchFileKind?
    var watchDirectory: WatchDirectoryKind?
    var fallbackPolling: PollingWatchKind?
    var synchronousWatchDirectory: Boolean?
    var excludeDirectories: ReadonlyArray<String>?
    var excludeFiles: ReadonlyArray<String>?
    // [option: string]: CompilerOptionsValue | undefined
}
