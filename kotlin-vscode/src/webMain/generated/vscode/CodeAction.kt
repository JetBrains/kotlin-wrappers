// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

import js.array.ReadonlyArray
import kotlin.js.JsModule
import kotlin.js.definedExternally

/**
 * A code action represents a change that can be performed in code, e.g. to fix a problem or
 * to refactor code.
 *
 * A CodeAction must set either [edit} and/or a {@linkcode CodeAction.command command][CodeAction.edit]. If both are supplied, the `edit` is applied first, then the command is executed.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#CodeAction)
 */
open external class CodeAction {
    /**
     * A short, human-readable, title for this code action.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#CodeAction.title)
     */
    var title: String

    /**
     * A [workspace edit][WorkspaceEdit] this code action performs.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#CodeAction.edit)
     */
    var edit: WorkspaceEdit?

    /**
     * [Diagnostics][Diagnostic] that this code action resolves.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#CodeAction.diagnostics)
     */
    var diagnostics: ReadonlyArray<Diagnostic>?

    /**
     * A [Command] this code action executes.
     *
     * If this command throws an exception, the editor displays the exception message to users in the editor at the
     * current cursor position.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#CodeAction.command)
     */
    var command: Command?

    /**
     * [Kind][CodeActionKind] of the code action.
     *
     * Used to filter code actions.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#CodeAction.kind)
     */
    var kind: CodeActionKind?

    /**
     * Marks this as a preferred action. Preferred actions are used by the `auto fix` command and can be targeted
     * by keybindings.
     *
     * A quick fix should be marked preferred if it properly addresses the underlying error.
     * A refactoring should be marked preferred if it is the most reasonable choice of actions to take.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#CodeAction.isPreferred)
     */
    var isPreferred: Boolean?

    /**
     * Marks that the code action cannot currently be applied.
     *
     * - Disabled code actions are not shown in automatic [lightbulb](https://code.visualstudio.com/docs/editor/editingevolved#_code-action)
     * code action menu.
     *
     * - Disabled actions are shown as faded out in the code action menu when the user request a more specific type
     * of code action, such as refactorings.
     *
     * - If the user has a [keybinding](https://code.visualstudio.com/docs/editor/refactoring#_keybindings-for-code-actions)
     * that auto applies a code action and only a disabled code actions are returned, the editor will show the user an
     * error message with `reason` in the editor.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#CodeAction.disabled)
     */
    /*
    disabled?: {
        /**
         * Human readable description of why the code action is currently disabled.
         *
         * This is displayed in the code actions UI.
         */
        readonly reason: string;
    }
    */

    /**
     * Creates a new code action.
     *
     * A code action must have at least a [title} and {@link CodeAction.edit edits][CodeAction.title]
     * and/or a [command][CodeAction.command].
     *
     * @param title The title of the code action.
     * @param kind The kind of the code action.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#CodeAction.constructor)
     */
    constructor(
        title: String,
        kind: CodeActionKind = definedExternally,
    )
}
