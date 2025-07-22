// Automatically generated - do not modify!

package vscode

/**
 * A code lens provider adds {@link Command commands} to source text. The commands will be shown
 * as dedicated horizontal lines in between the source text.
 */
external interface CodeLensProvider<T : CodeLens> {
    /**
     * An optional event to signal that the code lenses from this provider have changed.
     */
//  onDidChangeCodeLenses?: Event<void>

    /**
     * Compute a list of {@link CodeLens lenses}. This call should return as fast as possible and if
     * computing the commands is expensive implementors should only return code lens objects with the
     * range set and implement {@link CodeLensProvider.resolveCodeLens resolve}.
     *
     * @param document The document in which the command was invoked.
     * @param token A cancellation token.
     * @returns An array of code lenses or a thenable that resolves to such. The lack of a result can be
     * signaled by returning `undefined`, `null`, or an empty array.
     */
//  provideCodeLenses(document: TextDocument, token: CancellationToken): ProviderResult<T[]>

    /**
     * This function will be called for each visible code lens, usually when scrolling and after
     * calls to {@link CodeLensProvider.provideCodeLenses compute}-lenses.
     *
     * @param codeLens Code lens that must be resolved.
     * @param token A cancellation token.
     * @returns The given, resolved code lens or thenable that resolves to such.
     */
//  resolveCodeLens?(codeLens: T, token: CancellationToken): ProviderResult<T>
}
