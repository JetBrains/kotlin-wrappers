// Automatically generated - do not modify!

package actions.exec

import js.core.Record
import node.buffer.Buffer

sealed external interface ExecOptions {
    /** optional working directory.  defaults to current */
    var cwd: String?

    /** optional envvar dictionary.  defaults to current process's env */
    var env: Record<String, String>?

    /** optional.  defaults to false */
    var silent: Boolean?

    /** optional out stream to use. Defaults to process.stdout */
    var outStream: node.stream.Writable?

    /** optional err stream to use. Defaults to process.stderr */
    var errStream: node.stream.Writable?

    /** optional. whether to skip quoting/escaping arguments if needed.  defaults to false. */
    var windowsVerbatimArguments: Boolean?

    /** optional.  whether to fail if output to stderr.  defaults to false */
    var failOnStdErr: Boolean?

    /** optional.  defaults to failing on non zero.  ignore will not fail leaving it up to the caller */
    var ignoreReturnCode: Boolean?

    /** optional. How long in ms to wait for STDIO streams to close after the exit event of the process before terminating. defaults to 10000 */
    var delay: Number?

    /** optional. input to write to the process on STDIN. */
    var input: Buffer?

    /** optional. Listeners for output. Callback functions that will be called on these events */
    var listeners: ExecListeners?
}
