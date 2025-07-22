// Automatically generated - do not modify!

package vscode

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
//  title: string

    /**
     * The identifier of the actual command handler.
     * @see {@link commands.registerCommand}
     */
//  command: string

    /**
     * A tooltip for the command, when represented in the UI.
     */
//  tooltip?: string

    /**
     * Arguments that the command handler should be
     * invoked with.
     */
//  arguments?: any[]
}
