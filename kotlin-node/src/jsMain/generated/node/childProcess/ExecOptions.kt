package node.childProcess

import web.abort.AbortSignal


sealed external interface ExecOptions : CommonOptions {
    var shell: String?
    var signal: AbortSignal?
    var maxBuffer: Double?
    var killSignal: Any? /* NodeJS.Signals | number | undefined */
}
