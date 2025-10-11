// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

import js.array.ReadonlyArray
import kotlin.js.JsAny
import kotlin.js.JsModule

/**
 * Message associated with the test state. Can be linked to a specific
 * source range -- useful for assertion failures, for example.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TestMessage)
 */
open external class TestMessage {
    /**
     * Human-readable message text to display.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TestMessage.message)
     */
    var message: JsAny /* string | MarkdownString */

    /**
     * Expected test output. If given with [actualOutput ][TestMessage.actualOutput], a diff view will be shown.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TestMessage.expectedOutput)
     */
    var expectedOutput: String?

    /**
     * Actual test output. If given with [expectedOutput ][TestMessage.expectedOutput], a diff view will be shown.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TestMessage.actualOutput)
     */
    var actualOutput: String?

    /**
     * Associated file location.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TestMessage.location)
     */
    var location: Location?

    /**
     * Context value of the test item. This can be used to contribute message-
     * specific actions to the test peek view. The value set here can be found
     * in the `testMessage` property of the following `menus` contribution points:
     *
     * - `testing/message/context` - context menu for the message in the results tree
     * - `testing/message/content` - a prominent button overlaying editor content where
     *    the message is displayed.
     *
     * For example:
     *
     * ```json
     * "contributes": {
     *   "menus": {
     *     "testing/message/content": [
     *       {
     *         "command": "extension.deleteCommentThread",
     *         "when": "testMessage == canApplyRichDiff"
     *       }
     *     ]
     *   }
     * }
     * ```
     *
     * The command will be called with an object containing:
     * - `test`: the [TestItem] the message is associated with, *if* it
     *    is still present in the [TestController.items] collection.
     * - `message`: the [TestMessage] instance.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TestMessage.contextValue)
     */
    var contextValue: String?

    /**
     * The stack trace associated with the message or failure.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TestMessage.stackTrace)
     */
    var stackTrace: ReadonlyArray<TestMessageStackFrame>?

    /**
     * Creates a new TestMessage instance.
     * @param message The message to show to the user.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TestMessage.constructor)
     */
    constructor(message: String)

    constructor(message: MarkdownString)

    companion object {
        /**
         * Creates a new TestMessage that will present as a diff in the editor.
         * @param message Message to display to the user.
         * @param expected Expected output.
         * @param actual Actual output.
         *
         * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TestMessage.diff)
         */
        fun diff(
            message: String,
            expected: String,
            actual: String,
        ): TestMessage

        fun diff(
            message: MarkdownString,
            expected: String,
            actual: String,
        ): TestMessage
    }
}
