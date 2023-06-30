package electron.core

import kotlin.js.Promise


external interface NetLog {
// Docs: https://electronjs.org/docs/api/net-log
    /**
     * resolves when the net log has begun recording.
     *
     * Starts recording network events to `path`.
     */
    fun startLogging(path: String, options: StartLoggingOptions = definedExternally): Promise<Unit>

    /**
     * resolves when the net log has been flushed to disk.
     *
     * Stops recording network events. If not called, net logging will automatically
     * end when app quits.
     */
    fun stopLogging(): Promise<Unit>

    /**
     * A `boolean` property that indicates whether network logs are currently being
     * recorded.
     *
     */
    val currentlyLogging: Boolean
}
