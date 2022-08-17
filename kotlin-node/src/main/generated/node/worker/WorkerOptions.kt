// Automatically generated - do not modify!

package node.worker

import kotlinx.js.ReadonlyArray

sealed external interface WorkerOptions {
    /**
     * List of arguments which would be stringified and appended to
     * `process.argv` in the worker. This is mostly similar to the `workerData`
     * but the values will be available on the global `process.argv` as if they
     * were passed as CLI options to the script.
     */
    var argv: ReadonlyArray<Any>?
    var env: Any? /* NodeJS.Dict<string> | typeof SHARE_ENV */
    var eval: Boolean?
    var workerData: Any?
    var stdin: Boolean?
    var stdout: Boolean?
    var stderr: Boolean?
    var execArgv: ReadonlyArray<String>?
    var resourceLimits: ResourceLimits?

    /**
     * Additional data to send in the first worker message.
     */
    var transferList: ReadonlyArray<TransferListItem>?

    /**
     * @default true
     */
    var trackUnmanagedFds: Boolean?
}
