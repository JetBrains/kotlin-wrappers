// Automatically generated - do not modify!

package actions.exec

import js.objects.Record
import kotlinx.js.JsPlainObject
import node.buffer.Buffer

@JsPlainObject
external interface ExecOptions {
    /** optional working directory.  defaults to current */
    val cwd: String?

    /** optional envvar dictionary.  defaults to current process's env */
    val env: Record<String, String>?

    /** optional.  defaults to false */
    val silent: Boolean?

    /** optional out stream to use. Defaults to process.stdout */
    val outStream: node.stream.Writable?

    /** optional err stream to use. Defaults to process.stderr */
    val errStream: node.stream.Writable?

    /** optional. whether to skip quoting/escaping arguments if needed.  defaults to false. */
    val windowsVerbatimArguments: Boolean?

    /** optional.  whether to fail if output to stderr.  defaults to false */
    val failOnStdErr: Boolean?

    /** optional.  defaults to failing on non zero.  ignore will not fail leaving it up to the caller */
    val ignoreReturnCode: Boolean?

    /** optional. How long in ms to wait for STDIO streams to close after the exit event of the process before terminating. defaults to 10000 */
    val delay: Number?

    /** optional. input to write to the process on STDIN. */
    val input: Buffer?

    /** optional. Listeners for output. Callback functions that will be called on these events */
    val listeners: ExecListeners?
}
