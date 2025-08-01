// Automatically generated - do not modify!

package vscode

import js.array.ReadonlyArray
import js.objects.JsPlainObject

/**
 * Contains additional diagnostic information about the context in which
 * a [code action][CodeActionProvider.provideCodeActions] is run.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#CodeActionContext)
 */
@JsPlainObject
external interface CodeActionContext {
    /**
     * The reason why code actions were requested.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#CodeActionContext.triggerKind)
     */
    val triggerKind: CodeActionTriggerKind

    /**
     * An array of diagnostics.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#CodeActionContext.diagnostics)
     */
    val diagnostics: ReadonlyArray<Diagnostic>

    /**
     * Requested kind of actions to return.
     *
     * Actions not of this kind are filtered out before being shown by the [lightbulb](https://code.visualstudio.com/docs/editor/editingevolved#_code-action).
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#CodeActionContext.only)
     */
    val only: CodeActionKind?
}
