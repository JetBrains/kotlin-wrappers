// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

/**
 * A text edit represents edits that should be applied
 * to a document.
 */
open external class TextEdit {
    /**
    // ORIGINAL SOURCE


    /**
     * Utility to create a replace edit.
     *
     * @param range A range.
     * @param newText A string.
     * @returns A new text edit object.
    */
    static replace(range: Range, newText: string): TextEdit;

    /**
     * Utility to create an insert edit.
     *
     * @param position A position, will become an empty range.
     * @param newText A string.
     * @returns A new text edit object.
    */
    static insert(position: Position, newText: string): TextEdit;

    /**
     * Utility to create a delete edit.
     *
     * @param range A range.
     * @returns A new text edit object.
    */
    static delete(range: Range): TextEdit;

    /**
     * Utility to create an eol-edit.
     *
     * @param eol An eol-sequence
     * @returns A new text edit object.
    */
    static setEndOfLine(eol: EndOfLine): TextEdit;

    /**
     * The range this edit applies to.
    */
    range: Range;

    /**
     * The string this edit will insert.
    */
    newText: string;

    /**
     * The eol-sequence used in the document.
     *
     * *Note* that the eol-sequence will be applied to the
     * whole document.
    */
    newEol?: EndOfLine;

    /**
     * Create a new TextEdit.
     *
     * @param range A range.
     * @param newText A string.
    */
    constructor(range: Range, newText: string);

    // ORIGINAL SOURCE
     **/
}
