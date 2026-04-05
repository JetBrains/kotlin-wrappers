// Automatically generated - do not modify!

package node.childProcess

// TODO: Just Plain Wrong™ (see also nodejs/node#57392)
@Suppress("INTERFACE_WITH_SUPERCLASS")
external interface ExecException : js.errors.JsError {
    var cmd: String?
    var killed: Boolean?
    var code: Double?
    var signal: node.process.Signals?
    var stdout: String?
    var stderr: String?
}
