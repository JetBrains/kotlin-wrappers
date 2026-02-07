// Automatically generated - do not modify!

package vscode

import kotlinx.js.JsPlainObject
import kotlin.js.JsAny

/**
 * Represents a [text editor}'s {@link TextEditor.options options][TextEditor].
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TextEditorOptions)
 */
@JsPlainObject
external interface TextEditorOptions {
    /**
     * The size in spaces a tab takes. This is used for two purposes:
     *  - the rendering width of a tab character;
     *  - the number of spaces to insert when [insertSpaces][TextEditorOptions.insertSpaces] is true
     *    and `indentSize` is set to `"tabSize"`.
     *
     * When getting a text editor's options, this property will always be a number (resolved).
     * When setting a text editor's options, this property is optional and it can be a number or `"auto"`.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TextEditorOptions.tabSize)
     */
    var tabSize: JsAny /* number | string */?

    /**
     * The number of spaces to insert when [insertSpaces][TextEditorOptions.insertSpaces] is true.
     *
     * When getting a text editor's options, this property will always be a number (resolved).
     * When setting a text editor's options, this property is optional and it can be a number or `"tabSize"`.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TextEditorOptions.indentSize)
     */
    var indentSize: JsAny /* number | string */?

    /**
     * When pressing Tab insert [n][TextEditorOptions.tabSize] spaces.
     * When getting a text editor's options, this property will always be a boolean (resolved).
     * When setting a text editor's options, this property is optional and it can be a boolean or `"auto"`.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TextEditorOptions.insertSpaces)
     */
    var insertSpaces: JsAny /* boolean | string */?

    /**
     * The rendering style of the cursor in this editor.
     * When getting a text editor's options, this property will always be present.
     * When setting a text editor's options, this property is optional.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TextEditorOptions.cursorStyle)
     */
    var cursorStyle: TextEditorCursorStyle?

    /**
     * Render relative line numbers w.r.t. the current line number.
     * When getting a text editor's options, this property will always be present.
     * When setting a text editor's options, this property is optional.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TextEditorOptions.lineNumbers)
     */
    var lineNumbers: TextEditorLineNumbersStyle?
}
