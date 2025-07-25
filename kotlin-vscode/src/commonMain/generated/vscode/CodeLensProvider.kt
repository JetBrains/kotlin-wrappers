// Automatically generated - do not modify!

package vscode

import js.array.ReadonlyArray
import js.core.Void

/**
 * A code lens provider adds [commands][Command] to source text. The commands will be shown
 * as dedicated horizontal lines in between the source text.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#CodeLensProvider)
 */
external interface CodeLensProvider<T : CodeLens> {
    /**
     * An optional event to signal that the code lenses from this provider have changed.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#CodeLensProvider.onDidChangeCodeLenses)
     */
    var onDidChangeCodeLenses: Event<Void>?

    /**
     * Compute a list of [lenses][CodeLens]. This call should return as fast as possible and if
     * computing the commands is expensive implementors should only return code lens objects with the
     * range set and implement [resolve][CodeLensProvider.resolveCodeLens].
     *
     * @param document The document in which the command was invoked.
     * @param token A cancellation token.
     * @returns An array of code lenses or a thenable that resolves to such. The lack of a result can be
     * signaled by returning `undefined`, `null`, or an empty array.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#CodeLensProvider.provideCodeLenses)
     */
    fun provideCodeLenses(
        document: TextDocument,
        token: CancellationToken,
    ): ProviderResult<ReadonlyArray<T>>

    /**
     * This function will be called for each visible code lens, usually when scrolling and after
     * calls to [compute][CodeLensProvider.provideCodeLenses]-lenses.
     *
     * @param codeLens Code lens that must be resolved.
     * @param token A cancellation token.
     * @returns The given, resolved code lens or thenable that resolves to such.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#CodeLensProvider.resolveCodeLens)
     */
    var resolveCodeLens: ((
        codeLens: T,
        token: CancellationToken,
    ) -> ProviderResult<T>)?
}
