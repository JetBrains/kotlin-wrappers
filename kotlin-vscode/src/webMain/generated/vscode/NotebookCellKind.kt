// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

/**
 * A notebook cell kind.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#NotebookCellKind)
 */
/* enum */
external class NotebookCellKind
private constructor() {

    /**
     * A markup-cell is formatted source that is used for display.
     */
    val Markup: NotebookCellKind // 1

    /**
     * A code-cell is source that can be {@link NotebookController executed} and that
     * produces {@link NotebookCellOutput output}.
     */
    val Code: NotebookCellKind // 2
}
