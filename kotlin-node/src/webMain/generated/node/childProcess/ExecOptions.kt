// Automatically generated - do not modify!

package node.childProcess

@kotlinx.js.JsPlainObject
sealed external interface ExecOptions : CommonOptions {
    var shell: String?
    var signal: web.abort.AbortSignal?
    var maxBuffer: Double?
    var killSignal: Any? // NodeJS.Signals | number | undefined
    var encoding: String?
}
