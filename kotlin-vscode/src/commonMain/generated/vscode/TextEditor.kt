// Automatically generated - do not modify!

package vscode

import js.array.ReadonlyArray

/**
 * Represents an editor that is attached to a {@link TextDocument document}.
 */
external interface TextEditor {
    /**
     * The document associated with this text editor. The document will be the same for the entire lifetime of this text editor.
     */
    val document: TextDocument

    /**
     * The primary selection on this text editor. Shorthand for `TextEditor.selections[0]`.
     */
    var selection: Selection

    /**
     * The selections in this text editor. The primary selection is always at index 0.
     */
    var selections: ReadonlyArray<Selection>

    /**
     * The current visible ranges in the editor (vertically).
     * This accounts only for vertical scrolling, and not for horizontal scrolling.
     */
    val visibleRanges: ReadonlyArray<Range>

    /**
     * Text editor options.
     */
    var options: TextEditorOptions

    /**
     * The column in which this editor shows. Will be `undefined` in case this
     * isn't one of the main editors, e.g. an embedded editor, or when the editor
     * column is larger than three.
     */
    val viewColumn: ViewColumn

    /**
     * Perform an edit on the document associated with this text editor.
     *
     * The given callback-function is invoked with an {@link TextEditorEdit edit-builder} which must
     * be used to make edits. Note that the edit-builder is only valid while the
     * callback executes.
     *
     * @param callback A function which can create edits using an {@link TextEditorEdit edit-builder}.
     * @param options The undo/redo behavior around this edit. By default, undo stops will be created before and after this edit.
     * @returns A promise that resolves with a value indicating if the edits could be applied.
     */
    /*
    edit(callback: (editBuilder: TextEditorEdit) => void, options?: {
        /**
         * Add undo stop before making the edits.
         */
        readonly undoStopBefore: boolean;
        /**
         * Add undo stop after making the edits.
         */
        readonly undoStopAfter: boolean;
    }): Thenable<boolean>
    */

    /**
     * Insert a {@link SnippetString snippet} and put the editor into snippet mode. "Snippet mode"
     * means the editor adds placeholders and additional cursors so that the user can complete
     * or accept the snippet.
     *
     * @param snippet The snippet to insert in this edit.
     * @param location Position or range at which to insert the snippet, defaults to the current editor selection or selections.
     * @param options The undo/redo behavior around this edit. By default, undo stops will be created before and after this edit.
     * @returns A promise that resolves with a value indicating if the snippet could be inserted. Note that the promise does not signal
     * that the snippet is completely filled-in or accepted.
     */
    /*
    insertSnippet(snippet: SnippetString, location?: Position | Range | readonly Position[] | readonly Range[], options?: {
        /**
         * Add undo stop before making the edits.
         */
        readonly undoStopBefore: boolean;
        /**
         * Add undo stop after making the edits.
         */
        readonly undoStopAfter: boolean;
        /**
         * Keep whitespace of the {@link SnippetString.value} as is.
         */
        readonly keepWhitespace?: boolean;
    }): Thenable<boolean>
    */

    /**
     * Adds a set of decorations to the text editor. If a set of decorations already exists with
     * the given {@link TextEditorDecorationType decoration type}, they will be replaced. If
     * `rangesOrOptions` is empty, the existing decorations with the given {@link TextEditorDecorationType decoration type}
     * will be removed.
     *
     * @see {@link window.createTextEditorDecorationType createTextEditorDecorationType}.
     *
     * @param decorationType A decoration type.
     * @param rangesOrOptions Either {@link Range ranges} or more detailed {@link DecorationOptions options}.
     */
//  setDecorations(decorationType: TextEditorDecorationType, rangesOrOptions: readonly Range[] | readonly DecorationOptions[]): void

    /**
     * Scroll as indicated by `revealType` in order to reveal the given range.
     *
     * @param range A range.
     * @param revealType The scrolling strategy for revealing `range`.
     */
//  revealRange(range: Range, revealType?: TextEditorRevealType): void

    /**
     * Show the text editor.
     *
     * @deprecated Use {@link window.showTextDocument} instead.
     *
     * @param column The {@link ViewColumn column} in which to show this editor.
     * This method shows unexpected behavior and will be removed in the next major update.
     */
//  show(column?: ViewColumn): void

    /**
     * Hide the text editor.
     *
     * @deprecated Use the command `workbench.action.closeActiveEditor` instead.
     * This method shows unexpected behavior and will be removed in the next major update.
     */
//  hide(): void
}
