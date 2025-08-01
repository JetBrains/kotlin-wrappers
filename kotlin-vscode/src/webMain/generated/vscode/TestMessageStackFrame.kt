// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

import kotlin.js.JsModule
import kotlin.js.definedExternally

/**
 * A stack frame found in the [TestMessage.stackTrace].
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TestMessageStackFrame)
 */
open external class TestMessageStackFrame {
    /**
     * The location of this stack frame. This should be provided as a URI if the
     * location of the call frame can be accessed by the editor.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TestMessageStackFrame.uri)
     */
    var uri: Uri?

    /**
     * Position of the stack frame within the file.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TestMessageStackFrame.position)
     */
    var position: Position?

    /**
     * The name of the stack frame, typically a method or function name.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TestMessageStackFrame.label)
     */
    var label: String

    /**
     * @param label The name of the stack frame
     * @param file The file URI of the stack frame
     * @param position The position of the stack frame within the file
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TestMessageStackFrame.constructor)
     */
    constructor(
        label: String,
        uri: Uri = definedExternally,
        position: Position = definedExternally,
    )
}
