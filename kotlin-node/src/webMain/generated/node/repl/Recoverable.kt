// Automatically generated - do not modify!

@file:JsModule("node:repl")

package node.repl

/**
 * Indicates a recoverable error that a `REPLServer` can use to support multi-line input.
 *
 * @see https://nodejs.org/dist/latest-v24.x/docs/api/repl.html#repl_recoverable_errors
 */
external class Recoverable : js.errors.SyntaxError {
    constructor (err: js.errors.JsError)

    var err: js.errors.JsError
}
