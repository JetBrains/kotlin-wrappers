// Automatically generated - do not modify!

package vscode

import js.array.ReadonlyArray

/**
 * Represents an event describing the change in a {@link TextEditor.visibleRanges text editor's visible ranges}.
 */
external interface TextEditorVisibleRangesChangeEvent {
    /**
     * The {@link TextEditor text editor} for which the visible ranges have changed.
     */
    val textEditor: TextEditor

    /**
     * The new value for the {@link TextEditor.visibleRanges text editor's visible ranges}.
     */
    val visibleRanges: ReadonlyArray<Range>
}
