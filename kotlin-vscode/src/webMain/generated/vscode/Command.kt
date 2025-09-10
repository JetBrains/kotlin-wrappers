// Automatically generated - do not modify!

package vscode

import js.array.ReadonlyArray
import js.objects.JsPlainObject
import kotlin.js.JsAny

/**
 * Represents a reference to a command. Provides a title which
 * will be used to represent a command in the UI and, optionally,
 * an array of arguments which will be passed to the command handler
 * function when invoked.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#Command)
 */
@JsPlainObject
external interface Command {
    /**
     * Title of the command, like `save`.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#Command.title)
     */
    var title: String

    /**
     * The identifier of the actual command handler.
     * @see [commands.registerCommand]
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#Command.command)
     */
    var command: String

    /**
     * A tooltip for the command, when represented in the UI.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#Command.tooltip)
     */
    var tooltip: String?

    /**
     * Arguments that the command handler should be
     * invoked with.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#Command.arguments)
     */
    var arguments: ReadonlyArray<JsAny?>?
}
