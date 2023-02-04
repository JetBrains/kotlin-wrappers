// Automatically generated - do not modify!

package actions.exec

import node.buffer.Buffer

sealed external interface ExecListeners {
    /** A call back for each buffer of stdout */
    var stdout: ((data: Buffer) -> Unit)?

    /** A call back for each buffer of stderr */
    var stderr: ((data: Buffer) -> Unit)?

    /** A call back for each line of stdout */
    var stdline: ((data: String) -> Unit)?

    /** A call back for each line of stderr */
    var errline: ((data: String) -> Unit)?

    /** A call back for each debug log */
    var debug: ((data: String) -> Unit)?
}
