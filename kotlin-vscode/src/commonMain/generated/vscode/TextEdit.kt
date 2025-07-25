// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

import kotlin.js.JsModule

/**
 * A text edit represents edits that should be applied
 * to a document.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TextEdit)
 */
open external class TextEdit {
    /**
     * The range this edit applies to.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TextEdit.range)
     */
    var range: Range

    /**
     * The string this edit will insert.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TextEdit.newText)
     */
    var newText: String

    /**
     * The eol-sequence used in the document.
     *
     * *Note* that the eol-sequence will be applied to the
     * whole document.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TextEdit.newEol)
     */
    var newEol: EndOfLine?

    /**
     * Create a new TextEdit.
     *
     * @param range A range.
     * @param newText A string.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TextEdit.constructor)
     */
    constructor(
        range: Range,
        newText: String,
    )

    companion object {
        /**
         * Utility to create a replace edit.
         *
         * @param range A range.
         * @param newText A string.
         * @returns A new text edit object.
         *
         * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TextEdit.replace)
         */
        fun replace(
            range: Range,
            newText: String,
        ): TextEdit

        /**
         * Utility to create an insert edit.
         *
         * @param position A position, will become an empty range.
         * @param newText A string.
         * @returns A new text edit object.
         *
         * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TextEdit.insert)
         */
        fun insert(
            position: Position,
            newText: String,
        ): TextEdit

        /**
         * Utility to create a delete edit.
         *
         * @param range A range.
         * @returns A new text edit object.
         *
         * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TextEdit.delete)
         */
        fun delete(range: Range): TextEdit

        /**
         * Utility to create an eol-edit.
         *
         * @param eol An eol-sequence
         * @returns A new text edit object.
         *
         * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TextEdit.setEndOfLine)
         */
        fun setEndOfLine(eol: EndOfLine): TextEdit
    }
}
