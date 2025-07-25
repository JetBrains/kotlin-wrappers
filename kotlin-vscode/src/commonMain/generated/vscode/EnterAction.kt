// Automatically generated - do not modify!

package vscode

/**
 * Describes what to do when pressing Enter.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#EnterAction)
 */
external interface EnterAction {
    /**
     * Describe what to do with the indentation.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#EnterAction.indentAction)
     */
    var indentAction: IndentAction

    /**
     * Describes text to be appended after the new line and after the indentation.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#EnterAction.appendText)
     */
    var appendText: String?

    /**
     * Describes the number of characters to remove from the new line's indentation.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#EnterAction.removeText)
     */
    var removeText: Int?
}
