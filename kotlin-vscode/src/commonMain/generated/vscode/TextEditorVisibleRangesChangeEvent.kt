// Automatically generated - do not modify!

package vscode

import js.array.ReadonlyArray

/**
 * Represents an event describing the change in a [text editor's visible ranges][TextEditor.visibleRanges].
 */
external interface TextEditorVisibleRangesChangeEvent {
    /**
     * The [text editor][TextEditor] for which the visible ranges have changed.
     */
    val textEditor: TextEditor

    /**
     * The new value for the [text editor's visible ranges][TextEditor.visibleRanges].
     */
    val visibleRanges: ReadonlyArray<Range>
}
