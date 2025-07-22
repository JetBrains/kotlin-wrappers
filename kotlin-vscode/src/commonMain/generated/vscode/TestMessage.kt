// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

/**
 * Message associated with the test state. Can be linked to a specific
 * source range -- useful for assertion failures, for example.
 */
open external class TestMessage {
    /**
     * Human-readable message text to display.
     */
//  message: string | MarkdownString;

    /**
     * Expected test output. If given with {@link TestMessage.actualOutput actualOutput }, a diff view will be shown.
     */
//  expectedOutput?: string;

    /**
     * Actual test output. If given with {@link TestMessage.expectedOutput expectedOutput }, a diff view will be shown.
     */
//  actualOutput?: string;

    /**
     * Associated file location.
     */
//  location?: Location;

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
     * - `test`: the {@link TestItem} the message is associated with, *if* it
     *    is still present in the {@link TestController.items} collection.
     * - `message`: the {@link TestMessage} instance.
     */
//  contextValue?: string;

    /**
     * The stack trace associated with the message or failure.
     */
//  stackTrace?: TestMessageStackFrame[];

    /**
     * Creates a new TestMessage that will present as a diff in the editor.
     * @param message Message to display to the user.
     * @param expected Expected output.
     * @param actual Actual output.
     */
//  static diff(message: string | MarkdownString, expected: string, actual: string): TestMessage;

    /**
     * Creates a new TestMessage instance.
     * @param message The message to show to the user.
     */
//  constructor(message: string | MarkdownString);
}
