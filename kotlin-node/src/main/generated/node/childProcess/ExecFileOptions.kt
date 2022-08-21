// Automatically generated - do not modify!

package node.childProcess

import node.AbortSignal
import node.events.Abortable

sealed external interface ExecFileOptions : CommonOptions, Abortable {
    var maxBuffer: Number?
    var killSignal: Any? /* NodeJS.Signals | number */
    var windowsVerbatimArguments: Boolean?
    var shell: Any? /* boolean | string */
    override var signal: AbortSignal?
}
