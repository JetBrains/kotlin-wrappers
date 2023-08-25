// Automatically generated - do not modify!

package node.childProcess

sealed external interface CommonExecOptions : CommonOptions {
    var input: Any? /* string | NodeJS.ArrayBufferView */

    /**
     * Can be set to 'pipe', 'inherit', 'overlapped', or 'ignore', or an array of these strings.
     * If passed as an array, the first element is used for `stdin`, the second for
     * `stdout`, and the third for `stderr`. A fourth element can be used to
     * specify the `stdio` behavior beyond the standard streams. See
     * {@link ChildProcess.stdio} for more information.
     *
     * @default 'pipe'
     */
    var stdio: StdioOptions?
    var killSignal: Any? /* NodeJS.Signals | number */
    var maxBuffer: Number?
    var encoding: Any? /* BufferEncoding | 'buffer' */
}
