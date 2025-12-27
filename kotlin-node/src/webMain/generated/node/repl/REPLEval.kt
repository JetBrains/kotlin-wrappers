// Automatically generated - do not modify!

package node.repl

import node.vm.Context

typealias REPLEval = (/* this: REPLServer, */ evalCmd: String, context: Context, file: String, cb: (err: js.errors.JsError?, result: Any?) -> Unit) -> Unit
