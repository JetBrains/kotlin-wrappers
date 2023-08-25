// Automatically generated - do not modify!

package node.childProcess

import node.events.Abortable

sealed external interface CommonSpawnOptions : CommonOptions, MessagingOptions, Abortable {
    var argv0: String?

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
    var shell: Any? /* boolean | string */
    var windowsVerbatimArguments: Boolean?
}
