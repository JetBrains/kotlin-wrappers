// Automatically generated - do not modify!

package vscode

/**
 * Assumes a {@link TerminalLocation} of editor and allows specifying a {@link ViewColumn} and
 * {@link TerminalEditorLocationOptions.preserveFocus preserveFocus } property
 */
external interface TerminalEditorLocationOptions {
    /**
     * A view column in which the {@link Terminal terminal} should be shown in the editor area.
     * The default is the {@link ViewColumn.Active active}. Columns that do not exist
     * will be created as needed up to the maximum of {@linkcode ViewColumn.Nine}.
     * Use {@linkcode ViewColumn.Beside} to open the editor to the side of the currently
     * active one.
     */
    var viewColumn: ViewColumn

    /**
     * An optional flag that when `true` will stop the {@link Terminal} from taking focus.
     */
    var preserveFocus: Boolean?
}
