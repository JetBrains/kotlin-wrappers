// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

import kotlin.js.JsModule

/**
 * A text edit represents edits that should be applied
 * to a document.
 */
open external class TextEdit {
    /**
     * The range this edit applies to.
     */
    var range: Range

    /**
     * The string this edit will insert.
     */
    var newText: String

    /**
     * The eol-sequence used in the document.
     *
     * *Note* that the eol-sequence will be applied to the
     * whole document.
     */
    var newEol: EndOfLine?

    /**
     * Create a new TextEdit.
     *
     * @param range A range.
     * @param newText A string.
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
         */
        fun delete(range: Range): TextEdit

        /**
         * Utility to create an eol-edit.
         *
         * @param eol An eol-sequence
         * @returns A new text edit object.
         */
        fun setEndOfLine(eol: EndOfLine): TextEdit
    }
}
