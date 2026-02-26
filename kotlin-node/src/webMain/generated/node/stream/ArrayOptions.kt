// Automatically generated - do not modify!

package node.stream

sealed external interface ArrayOptions {
    /**
     * The maximum concurrent invocations of `fn` to call on the stream at once.
     * @default 1
     */
    var concurrency: Double?

    /** Allows destroying the stream if the signal is aborted. */
    var signal: web.abort.AbortSignal?
}
