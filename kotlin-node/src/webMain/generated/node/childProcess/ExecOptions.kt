// Automatically generated - do not modify!

package node.childProcess

import web.abort.AbortSignal

@kotlinx.js.JsPlainObject
sealed external interface ExecOptions : CommonOptions {
    var shell: String?
    var signal: AbortSignal?
    var maxBuffer: Double?
    var killSignal: Any? // NodeJS.Signals | number | undefined
    var encoding: String?
}
