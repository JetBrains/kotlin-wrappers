// Automatically generated - do not modify!

package vscode

import js.array.ReadonlyArray
import js.core.JsAny

/**
 * Represents a reference to a command. Provides a title which
 * will be used to represent a command in the UI and, optionally,
 * an array of arguments which will be passed to the command handler
 * function when invoked.
 */
external interface Command {
    /**
     * Title of the command, like `save`.
     */
    var title: String

    /**
     * The identifier of the actual command handler.
     * @see [commands.registerCommand]
     */
    var command: String

    /**
     * A tooltip for the command, when represented in the UI.
     */
    var tooltip: String?

    /**
     * Arguments that the command handler should be
     * invoked with.
     */
    var arguments: ReadonlyArray<JsAny?>?
}
