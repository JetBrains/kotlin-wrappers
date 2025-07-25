// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

import kotlin.js.JsModule

/**
 * Represents a part of a chat response that is a button that executes a command.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#ChatResponseCommandButtonPart)
 */
open external class ChatResponseCommandButtonPart {
    /**
     * The command that will be executed when the button is clicked.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#ChatResponseCommandButtonPart.value)
     */
    var value: Command

    /**
     * Create a new ChatResponseCommandButtonPart.
     * @param value A Command that will be executed when the button is clicked.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#ChatResponseCommandButtonPart.constructor)
     */
    constructor(value: Command)
}
