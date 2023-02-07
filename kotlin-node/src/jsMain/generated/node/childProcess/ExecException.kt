// Automatically generated - do not modify!

package node.childProcess

import node.process.Signals

sealed external interface ExecException /* : Error */ {
    var cmd: String?
    var killed: Boolean?
    var code: Number?
    var signal: Signals?
}
