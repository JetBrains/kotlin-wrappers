// Automatically generated - do not modify!

package vscode

/**
 * A complex edit that will be applied in one transaction on a TextEditor.
 * This holds a description of the edits and if the edits are valid (i.e. no overlapping regions, document was not changed in the meantime, etc.)
 * they can be applied on a [document} associated with a {@link TextEditor text editor][TextDocument].
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TextEditorEdit)
 */
external interface TextEditorEdit {
    /**
     * Replace a certain text region with a new value.
     * You can use `\r\n` or `\n` in `value` and they will be normalized to the current [document][TextDocument].
     *
     * @param location The range this operation should remove.
     * @param value The new text this operation should insert after removing `location`.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TextEditorEdit.replace)
     */
    fun replace(
        location: Position,
        value: String,
    )

    fun replace(
        location: Range,
        value: String,
    )

    fun replace(
        location: Selection,
        value: String,
    )

    /**
     * Insert text at a location.
     * You can use `\r\n` or `\n` in `value` and they will be normalized to the current [document][TextDocument].
     * Although the equivalent text edit can be made with [replace][TextEditorEdit.replace], `insert` will produce a different resulting selection (it will get moved).
     *
     * @param location The position where the new text should be inserted.
     * @param value The new text this operation should insert.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TextEditorEdit.insert)
     */
    fun insert(
        location: Position,
        value: String,
    )

    /**
     * Delete a certain text region.
     *
     * @param location The range this operation should remove.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TextEditorEdit.delete)
     */
    fun delete(location: Range)

    fun delete(location: Selection)

    /**
     * Set the end of line sequence.
     *
     * @param endOfLine The new end of line for the [document][TextDocument].
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TextEditorEdit.setEndOfLine)
     */
    fun setEndOfLine(endOfLine: EndOfLine)
}
