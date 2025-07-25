// Automatically generated - do not modify!

package vscode

import js.array.ReadonlyArray
import js.core.JsAny
import js.core.JsBoolean
import js.objects.JsPlainObject
import js.promise.PromiseLike
import kotlin.js.JsName
import kotlin.js.definedExternally

/**
 * Represents an editor that is attached to a [document][TextDocument].
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TextEditor)
 */
external interface TextEditor {
    /**
     * The document associated with this text editor. The document will be the same for the entire lifetime of this text editor.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TextEditor.document)
     */
    val document: TextDocument

    /**
     * The primary selection on this text editor. Shorthand for `TextEditor.selections[0]`.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TextEditor.selection)
     */
    var selection: Selection

    /**
     * The selections in this text editor. The primary selection is always at index 0.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TextEditor.selections)
     */
    var selections: ReadonlyArray<Selection>

    /**
     * The current visible ranges in the editor (vertically).
     * This accounts only for vertical scrolling, and not for horizontal scrolling.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TextEditor.visibleRanges)
     */
    val visibleRanges: ReadonlyArray<Range>

    /**
     * Text editor options.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TextEditor.options)
     */
    var options: TextEditorOptions

    /**
     * The column in which this editor shows. Will be `undefined` in case this
     * isn't one of the main editors, e.g. an embedded editor, or when the editor
     * column is larger than three.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TextEditor.viewColumn)
     */
    val viewColumn: ViewColumn?

    /**
     * Perform an edit on the document associated with this text editor.
     *
     * The given callback-function is invoked with an [edit-builder][TextEditorEdit] which must
     * be used to make edits. Note that the edit-builder is only valid while the
     * callback executes.
     *
     * @param callback A function which can create edits using an [edit-builder][TextEditorEdit].
     * @param options The undo/redo behavior around this edit. By default, undo stops will be created before and after this edit.
     * @returns A promise that resolves with a value indicating if the edits could be applied.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TextEditor.edit)
     */
    @JsName("edit")
    fun editAsync(
        callback: (editBuilder: TextEditorEdit) -> Unit,
        options: EditOptions = definedExternally,
    ): PromiseLike<JsBoolean>


    @JsPlainObject
    interface EditOptions {
        /**
         * Add undo stop before making the edits.
         *
         * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#EditOptions.undoStopBefore)
         */
        val undoStopBefore: Boolean

        /**
         * Add undo stop after making the edits.
         *
         * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#EditOptions.undoStopAfter)
         */
        val undoStopAfter: Boolean
    }

    /**
     * Insert a [snippet][SnippetString] and put the editor into snippet mode. "Snippet mode"
     * means the editor adds placeholders and additional cursors so that the user can complete
     * or accept the snippet.
     *
     * @param snippet The snippet to insert in this edit.
     * @param location Position or range at which to insert the snippet, defaults to the current editor selection or selections.
     * @param options The undo/redo behavior around this edit. By default, undo stops will be created before and after this edit.
     * @returns A promise that resolves with a value indicating if the snippet could be inserted. Note that the promise does not signal
     * that the snippet is completely filled-in or accepted.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TextEditor.insertSnippet)
     */
    @JsName("insertSnippet")
    fun insertSnippetAsync(
        snippet: SnippetString,
        location: JsAny /* Position | Range | readonly Position[] | readonly Range[] */ = definedExternally,
        options: InsertSnippetOptions = definedExternally,
    ): PromiseLike<JsBoolean>


    @JsPlainObject
    interface InsertSnippetOptions {
        /**
         * Add undo stop before making the edits.
         *
         * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#InsertSnippetOptions.undoStopBefore)
         */
        val undoStopBefore: Boolean

        /**
         * Add undo stop after making the edits.
         *
         * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#InsertSnippetOptions.undoStopAfter)
         */
        val undoStopAfter: Boolean

        /**
         * Keep whitespace of the [SnippetString.value] as is.
         *
         * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#InsertSnippetOptions.keepWhitespace)
         */
        val keepWhitespace: Boolean?
    }

    /**
     * Adds a set of decorations to the text editor. If a set of decorations already exists with
     * the given [decoration type][TextEditorDecorationType], they will be replaced. If
     * `rangesOrOptions` is empty, the existing decorations with the given [decoration type][TextEditorDecorationType]
     * will be removed.
     *
     * @see [createTextEditorDecorationType][window.createTextEditorDecorationType].
     *
     * @param decorationType A decoration type.
     * @param rangesOrOptions Either [ranges} or more detailed {@link DecorationOptions options][Range].
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TextEditor.setDecorations)
     */
    fun setDecorations(
        decorationType: TextEditorDecorationType,
        rangesOrOptions: JsAny, /* Range[] | readonly DecorationOptions[] */
    )

    /**
     * Scroll as indicated by `revealType` in order to reveal the given range.
     *
     * @param range A range.
     * @param revealType The scrolling strategy for revealing `range`.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TextEditor.revealRange)
     */
    fun revealRange(
        range: Range,
        revealType: TextEditorRevealType = definedExternally,
    )
}
