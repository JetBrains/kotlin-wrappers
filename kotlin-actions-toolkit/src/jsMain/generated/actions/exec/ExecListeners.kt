// Automatically generated - do not modify!

package actions.exec

import kotlinx.js.JsPlainObject
import node.buffer.Buffer

@JsPlainObject
external interface ExecListeners {
    /** A call back for each buffer of stdout */
    val stdout: ((data: Buffer) -> Unit)?

    /** A call back for each buffer of stderr */
    val stderr: ((data: Buffer) -> Unit)?

    /** A call back for each line of stdout */
    val stdline: ((data: String) -> Unit)?

    /** A call back for each line of stderr */
    val errline: ((data: String) -> Unit)?

    /** A call back for each debug log */
    val debug: ((data: String) -> Unit)?
}
