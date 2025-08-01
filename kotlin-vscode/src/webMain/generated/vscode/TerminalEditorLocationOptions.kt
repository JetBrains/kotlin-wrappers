// Automatically generated - do not modify!

package vscode

import js.objects.JsPlainObject

/**
 * Assumes a [TerminalLocation] of editor and allows specifying a [ViewColumn] and
 * [preserveFocus ][TerminalEditorLocationOptions.preserveFocus] property
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TerminalEditorLocationOptions)
 */
@JsPlainObject
external interface TerminalEditorLocationOptions {
    /**
     * A view column in which the [terminal][Terminal] should be shown in the editor area.
     * The default is the [active][ViewColumn.Active]. Columns that do not exist
     * will be created as needed up to the maximum of {@linkcode ViewColumn.Nine}.
     * Use {@linkcode ViewColumn.Beside} to open the editor to the side of the currently
     * active one.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TerminalEditorLocationOptions.viewColumn)
     */
    var viewColumn: ViewColumn

    /**
     * An optional flag that when `true` will stop the [Terminal] from taking focus.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TerminalEditorLocationOptions.preserveFocus)
     */
    var preserveFocus: Boolean?
}
