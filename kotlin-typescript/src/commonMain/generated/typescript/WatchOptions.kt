// Automatically generated - do not modify!

package typescript

sealed external interface WatchOptions {
    var watchFile: WatchFileKind?
    var watchDirectory: WatchDirectoryKind?
    var fallbackPolling: PollingWatchKind?
    var synchronousWatchDirectory: Boolean?
    var excludeDirectories: js.array.ReadonlyArray<String>?
    var excludeFiles: js.array.ReadonlyArray<String>?

    @seskar.js.JsNativeGetter
    operator fun get(key: String): CompilerOptionsValue

    @seskar.js.JsNativeSetter
    operator fun set(
        key: String,
        value: CompilerOptionsValue,
    )
}
