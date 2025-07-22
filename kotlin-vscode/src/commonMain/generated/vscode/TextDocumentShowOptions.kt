// Automatically generated - do not modify!

package vscode

/**
 * Represents options to configure the behavior of showing a {@link TextDocument document} in an {@link TextEditor editor}.
 */
external interface TextDocumentShowOptions {
    /**
     * An optional view column in which the {@link TextEditor editor} should be shown.
     * The default is the {@link ViewColumn.Active active}. Columns that do not exist
     * will be created as needed up to the maximum of {@linkcode ViewColumn.Nine}.
     * Use {@linkcode ViewColumn.Beside} to open the editor to the side of the currently
     * active one.
     */
//  viewColumn?: ViewColumn

    /**
     * An optional flag that when `true` will stop the {@link TextEditor editor} from taking focus.
     */
//  preserveFocus?: boolean

    /**
     * An optional flag that controls if an {@link TextEditor editor}-tab shows as preview. Preview tabs will
     * be replaced and reused until set to stay - either explicitly or through editing.
     *
     * *Note* that the flag is ignored if a user has disabled preview editors in settings.
     */
//  preview?: boolean

    /**
     * An optional selection to apply for the document in the {@link TextEditor editor}.
     */
//  selection?: Range
}
