// Automatically generated - do not modify!

package electron.core

external interface NetLog {
// Docs: https://electronjs.org/docs/api/net-log
    /**
     * resolves when the net log has begun recording.
     *
     * Starts recording network events to `path`.
     */
    fun startLogging(
        path: String,
        options: StartLoggingOptions = definedExternally,
    ): js.promise.Promise<js.core.Void>

    /**
     * resolves when the net log has been flushed to disk.
     *
     * Stops recording network events. If not called, net logging will automatically
     * end when app quits.
     */
    fun stopLogging(): js.promise.Promise<js.core.Void>

    /**
     * A `boolean` property that indicates whether network logs are currently being
     * recorded.
     *
     */
    val currentlyLogging: Boolean
}
