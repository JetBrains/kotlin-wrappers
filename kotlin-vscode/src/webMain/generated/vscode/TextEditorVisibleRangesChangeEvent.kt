// Automatically generated - do not modify!

package vscode

import js.array.ReadonlyArray
import js.objects.JsPlainObject

/**
 * Represents an event describing the change in a [text editor's visible ranges][TextEditor.visibleRanges].
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TextEditorVisibleRangesChangeEvent)
 */
@JsPlainObject
external interface TextEditorVisibleRangesChangeEvent {
    /**
     * The [text editor][TextEditor] for which the visible ranges have changed.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TextEditorVisibleRangesChangeEvent.textEditor)
     */
    val textEditor: TextEditor

    /**
     * The new value for the [text editor's visible ranges][TextEditor.visibleRanges].
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TextEditorVisibleRangesChangeEvent.visibleRanges)
     */
    val visibleRanges: ReadonlyArray<Range>
}
