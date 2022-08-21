// Automatically generated - do not modify!

package node.childProcess

sealed external interface ExecException /* : Error */ {
    var cmd: String?
    var killed: Boolean?
    var code: Number?
    var signal: node.process.Signals?
}
