// Automatically generated - do not modify!

package vscode

import js.array.ReadonlyArray
import js.core.JsAny
import kotlin.js.JsName

/**
 * Provides contextual actions for code. Code actions typically either fix problems or beautify/refactor code.
 *
 * Code actions are surfaced to users in a few different ways:
 *
 * - The [lightbulb](https://code.visualstudio.com/docs/editor/editingevolved#_code-action) feature, which shows
 *   a list of code actions at the current cursor position. The lightbulb's list of actions includes both quick fixes
 *   and refactorings.
 * - As commands that users can run, such as `Refactor`. Users can run these from the command palette or with keybindings.
 * - As source actions, such `Organize Imports`.
 * - [Quick fixes][CodeActionKind.QuickFix] are shown in the problems view.
 * - Change applied on save by the `editor.codeActionsOnSave` setting.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#CodeActionProvider)
 */
external interface CodeActionProvider<T : CodeAction> {
    /**
     * Get code actions for a given range in a document.
     *
     * Only return code actions that are relevant to user for the requested range. Also keep in mind how the
     * returned code actions will appear in the UI. The lightbulb widget and `Refactor` commands for instance show
     * returned code actions as a list, so do not return a large number of code actions that will overwhelm the user.
     *
     * @param document The document in which the command was invoked.
     * @param range The selector or range for which the command was invoked. This will always be a
     * [selection][Selection] if the actions are being requested in the currently active editor.
     * @param context Provides additional information about what code actions are being requested. You can use this
     * to see what specific type of code actions are being requested by the editor in order to return more relevant
     * actions and avoid returning irrelevant code actions that the editor will discard.
     * @param token A cancellation token.
     *
     * @returns An array of code actions, such as quick fixes or refactorings. The lack of a result can be signaled
     * by returning `undefined`, `null`, or an empty array.
     *
     * We also support returning `Command` for legacy reasons, however all new extensions should return
     * `CodeAction` object instead.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#CodeActionProvider.provideCodeActions)
     */
    @JsName("provideCodeActions")
    fun provideCodeActionsAsync(
        document: TextDocument,
        range: JsAny, /* Range | Selection */
        context: CodeActionContext,
        token: CancellationToken,
    ): ProviderResult<ReadonlyArray<JsAny /* Command | T */>>

    /**
     * Given a code action fill in its {@linkcode CodeAction.edit edit}-property. Changes to
     * all other properties, like title, are ignored. A code action that has an edit
     * will not be resolved.
     *
     * *Note* that a code action provider that returns commands, not code actions, cannot successfully
     * implement this function. Returning commands is deprecated and instead code actions should be
     * returned.
     *
     * @param codeAction A code action.
     * @param token A cancellation token.
     * @returns The resolved code action or a thenable that resolves to such. It is OK to return the given
     * `item`. When no result is returned, the given `item` will be used.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#CodeActionProvider.resolveCodeAction)
     */
    var resolveCodeAction: ((
        codeAction: T,
        token: CancellationToken,
    ) -> ProviderResult<T>)?
}
