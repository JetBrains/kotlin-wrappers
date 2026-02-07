// Automatically generated - do not modify!

package vscode

import js.array.ReadonlyArray
import kotlinx.js.JsPlainObject

/**
 * Represents an event describing the change in a [text editor's selections][TextEditor.selections].
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TextEditorSelectionChangeEvent)
 */
@JsPlainObject
external interface TextEditorSelectionChangeEvent {
    /**
     * The [text editor][TextEditor] for which the selections have changed.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TextEditorSelectionChangeEvent.textEditor)
     */
    val textEditor: TextEditor

    /**
     * The new value for the [text editor's selections][TextEditor.selections].
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TextEditorSelectionChangeEvent.selections)
     */
    val selections: ReadonlyArray<Selection>

    /**
     * The [change kind][TextEditorSelectionChangeKind] which has triggered this
     * event. Can be `undefined`.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TextEditorSelectionChangeEvent.kind)
     */
    val kind: TextEditorSelectionChangeKind?
}
