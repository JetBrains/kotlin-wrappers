// Automatically generated - do not modify!

package vscode

import js.objects.JsPlainObject

/**
 * Represents options to configure the behavior of showing a [document} in an {@link TextEditor editor][TextDocument].
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TextDocumentShowOptions)
 */
@JsPlainObject
external interface TextDocumentShowOptions {
    /**
     * An optional view column in which the [editor][TextEditor] should be shown.
     * The default is the [active][ViewColumn.Active]. Columns that do not exist
     * will be created as needed up to the maximum of {@linkcode ViewColumn.Nine}.
     * Use {@linkcode ViewColumn.Beside} to open the editor to the side of the currently
     * active one.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TextDocumentShowOptions.viewColumn)
     */
    var viewColumn: ViewColumn?

    /**
     * An optional flag that when `true` will stop the [editor][TextEditor] from taking focus.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TextDocumentShowOptions.preserveFocus)
     */
    var preserveFocus: Boolean?

    /**
     * An optional flag that controls if an [editor][TextEditor]-tab shows as preview. Preview tabs will
     * be replaced and reused until set to stay - either explicitly or through editing.
     *
     * *Note* that the flag is ignored if a user has disabled preview editors in settings.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TextDocumentShowOptions.preview)
     */
    var preview: Boolean?

    /**
     * An optional selection to apply for the document in the [editor][TextEditor].
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TextDocumentShowOptions.selection)
     */
    var selection: Range?
}
