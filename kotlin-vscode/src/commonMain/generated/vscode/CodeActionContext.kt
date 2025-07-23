// Automatically generated - do not modify!

package vscode

import js.array.ReadonlyArray

/**
 * Contains additional diagnostic information about the context in which
 * a {@link CodeActionProvider.provideCodeActions code action} is run.
 */
external interface CodeActionContext {
    /**
     * The reason why code actions were requested.
     */
    val triggerKind: CodeActionTriggerKind

    /**
     * An array of diagnostics.
     */
    val diagnostics: ReadonlyArray<Diagnostic>

    /**
     * Requested kind of actions to return.
     *
     * Actions not of this kind are filtered out before being shown by the [lightbulb](https://code.visualstudio.com/docs/editor/editingevolved#_code-action).
     */
    val only: CodeActionKind?
}
