// Automatically generated - do not modify!

package vscode

/**
 * The declaration provider interface defines the contract between extensions and
 * the go to declaration feature.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#DeclarationProvider)
 */
external interface DeclarationProvider {
    /**
     * Provide the declaration of the symbol at the given position and document.
     *
     * @param document The document in which the command was invoked.
     * @param position The position at which the command was invoked.
     * @param token A cancellation token.
     * @returns A declaration or a thenable that resolves to such. The lack of a result can be
     * signaled by returning `undefined` or `null`.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#DeclarationProvider.provideDeclaration)
     */
    fun provideDeclaration(
        document: TextDocument,
        position: Position,
        token: CancellationToken,
    ): ProviderResult<Declaration>
}
