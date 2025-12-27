// Automatically generated - do not modify!

package node.childProcess

// TODO: execFile exceptions can take many forms... this accurately describes none of them
@Suppress("INTERFACE_WITH_SUPERCLASS")
sealed external interface ExecFileException : js.errors.JsError {
    var cmd: String?
    var killed: Boolean?
    var signal: node.process.Signals?
    var stdout: String?
    var stderr: String?
    var errno: Double?
    var path: String?
    var syscall: String?
    var code: Any? // string | number | null
}
