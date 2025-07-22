// Automatically generated - do not modify!

package vscode

/**
 * Represents a {@link TextEditor text editor}'s {@link TextEditor.options options}.
 */
external interface TextEditorOptions {
    /**
     * The size in spaces a tab takes. This is used for two purposes:
     *  - the rendering width of a tab character;
     *  - the number of spaces to insert when {@link TextEditorOptions.insertSpaces insertSpaces} is true
     *    and `indentSize` is set to `"tabSize"`.
     *
     * When getting a text editor's options, this property will always be a number (resolved).
     * When setting a text editor's options, this property is optional and it can be a number or `"auto"`.
     */
    var tabSize: Any /* number | string */?

    /**
     * The number of spaces to insert when {@link TextEditorOptions.insertSpaces insertSpaces} is true.
     *
     * When getting a text editor's options, this property will always be a number (resolved).
     * When setting a text editor's options, this property is optional and it can be a number or `"tabSize"`.
     */
    var indentSize: Any /* number | string */?

    /**
     * When pressing Tab insert {@link TextEditorOptions.tabSize n} spaces.
     * When getting a text editor's options, this property will always be a boolean (resolved).
     * When setting a text editor's options, this property is optional and it can be a boolean or `"auto"`.
     */
    var insertSpaces: Any /* boolean | string */?

    /**
     * The rendering style of the cursor in this editor.
     * When getting a text editor's options, this property will always be present.
     * When setting a text editor's options, this property is optional.
     */
    var cursorStyle: TextEditorCursorStyle?

    /**
     * Render relative line numbers w.r.t. the current line number.
     * When getting a text editor's options, this property will always be present.
     * When setting a text editor's options, this property is optional.
     */
    var lineNumbers: TextEditorLineNumbersStyle?
}
