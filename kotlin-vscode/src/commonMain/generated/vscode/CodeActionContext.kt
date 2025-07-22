// Automatically generated - do not modify!

package vscode

/**
 * Contains additional diagnostic information about the context in which
 * a {@link CodeActionProvider.provideCodeActions code action} is run.
 */
external interface CodeActionContext {
    /**
    // ORIGINAL SOURCE

    /**
     * The reason why code actions were requested.
    */
    readonly triggerKind: CodeActionTriggerKind;

    /**
     * An array of diagnostics.
    */
    readonly diagnostics: readonly Diagnostic[];

    /**
     * Requested kind of actions to return.
     *
     * Actions not of this kind are filtered out before being shown by the [lightbulb](https://code.visualstudio.com/docs/editor/editingevolved#_code-action).
    */
    readonly only: CodeActionKind | undefined;

    // ORIGINAL SOURCE
     **/
}
