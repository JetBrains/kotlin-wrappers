// Automatically generated - do not modify!

package node.vm

sealed external interface RunningScriptOptions : BaseOptions {
    /**
     * When `true`, if an `Error` occurs while compiling the `code`, the line of code causing the error is attached to the stack trace.
     * Default: `true`.
     */
    var displayErrors: Boolean?

    /**
     * Specifies the number of milliseconds to execute code before terminating execution.
     * If execution is terminated, an `Error` will be thrown. This value must be a strictly positive integer.
     */
    var timeout: Number?

    /**
     * If `true`, the execution will be terminated when `SIGINT` (Ctrl+C) is received.
     * Existing handlers for the event that have been attached via `process.on('SIGINT')` will be disabled during script execution, but will continue to work after that.
     * If execution is terminated, an `Error` will be thrown.
     * Default: `false`.
     */
    var breakOnSigint: Boolean?
}
