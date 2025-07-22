// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

/**
 * A snippet edit represents an interactive edit that is performed by
 * the editor.
 *
 * *Note* that a snippet edit can always be performed as a normal {@link TextEdit text edit}.
 * This will happen when no matching editor is open or when a {@link WorkspaceEdit workspace edit}
 * contains snippet edits for multiple files. In that case only those that match the active editor
 * will be performed as snippet edits and the others as normal text edits.
 */
open external class SnippetTextEdit {
    /**
     * Utility to create a replace snippet edit.
     *
     * @param range A range.
     * @param snippet A snippet string.
     * @returns A new snippet edit object.
     */
//  static replace(range: Range, snippet: SnippetString): SnippetTextEdit

    /**
     * Utility to create an insert snippet edit.
     *
     * @param position A position, will become an empty range.
     * @param snippet A snippet string.
     * @returns A new snippet edit object.
     */
//  static insert(position: Position, snippet: SnippetString): SnippetTextEdit

    /**
     * The range this edit applies to.
     */
    var range: Range

    /**
     * The {@link SnippetString snippet} this edit will perform.
     */
    var snippet: SnippetString

    /**
     * Whether the snippet edit should be applied with existing whitespace preserved.
     */
    var keepWhitespace: Boolean?

    /**
     * Create a new snippet edit.
     *
     * @param range A range.
     * @param snippet A snippet string.
     */
    constructor(
        range: Range,
        snippet: SnippetString,
    )
}
