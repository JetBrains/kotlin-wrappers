// Automatically generated - do not modify!

package vscode

import js.array.ReadonlyArray

/**
 * Metadata about the type of code actions that a [CodeActionProvider] provides.
 */
external interface CodeActionProviderMetadata {
    /**
     * List of [CodeActionKinds][CodeActionKind] that a [CodeActionProvider] may return.
     *
     * This list is used to determine if a given `CodeActionProvider` should be invoked or not.
     * To avoid unnecessary computation, every `CodeActionProvider` should list use `providedCodeActionKinds`. The
     * list of kinds may either be generic, such as `[CodeActionKind.Refactor]`, or list out every kind provided,
     * such as `[CodeActionKind.Refactor.Extract.append('function'), CodeActionKind.Refactor.Extract.append('constant'), ...]`.
     */
    val providedCodeActionKinds: ReadonlyArray<CodeActionKind>?

    /**
     * Static documentation for a class of code actions.
     *
     * Documentation from the provider is shown in the code actions menu if either:
     *
     * - Code actions of `kind` are requested by the editor. In this case, the editor will show the documentation that
     *   most closely matches the requested code action kind. For example, if a provider has documentation for
     *   both `Refactor` and `RefactorExtract`, when the user requests code actions for `RefactorExtract`,
     *   the editor will use the documentation for `RefactorExtract` instead of the documentation for `Refactor`.
     *
     * - Any code actions of `kind` are returned by the provider.
     *
     * At most one documentation entry will be shown per provider.
     */
    /*
    readonly documentation?: ReadonlyArray<{
        /**
         * The kind of the code action being documented.
         *
         * If the kind is generic, such as `CodeActionKind.Refactor`, the documentation will be shown whenever any
         * refactorings are returned. If the kind if more specific, such as `CodeActionKind.RefactorExtract`, the
         * documentation will only be shown when extract refactoring code actions are returned.
         */
        readonly kind: CodeActionKind;

        /**
         * Command that displays the documentation to the user.
         *
         * This can display the documentation directly in the editor or open a website using {@linkcode env.openExternal};
         *
         * The title of this documentation code action is taken from {@linkcode Command.title}
         */
        readonly command: Command;
    }>
    */
}
