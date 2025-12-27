// Automatically generated - do not modify!

package node.repl

sealed external interface REPLServerSetupHistoryOptions {
    var filePath: String?
    var size: Double?
    var removeHistoryDuplicates: Boolean?
    var onHistoryFileLoaded: ((err: js.errors.JsError?, repl: REPLServer) -> Unit)?
}
