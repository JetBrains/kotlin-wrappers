// Automatically generated - do not modify!

package vscode

import js.array.ReadonlyArray

/**
 * Represents an event describing the change in a {@link TextEditor.selections text editor's selections}.
 */
external interface TextEditorSelectionChangeEvent {
    /**
     * The {@link TextEditor text editor} for which the selections have changed.
     */
    val textEditor: TextEditor

    /**
     * The new value for the {@link TextEditor.selections text editor's selections}.
     */
    val selections: ReadonlyArray<Selection>

    /**
     * The {@link TextEditorSelectionChangeKind change kind} which has triggered this
     * event. Can be `undefined`.
     */
    val kind: TextEditorSelectionChangeKind
}
