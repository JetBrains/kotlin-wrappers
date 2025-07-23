// Automatically generated - do not modify!

package vscode

import js.array.ReadonlyArray

/**
 * The document formatting provider interface defines the contract between extensions and
 * the formatting-feature.
 */
external interface DocumentFormattingEditProvider {
    /**
     * Provide formatting edits for a whole document.
     *
     * @param document The document in which the command was invoked.
     * @param options Options controlling formatting.
     * @param token A cancellation token.
     * @returns A set of text edits or a thenable that resolves to such. The lack of a result can be
     * signaled by returning `undefined`, `null`, or an empty array.
     */
    fun provideDocumentFormattingEdits(
        document: TextDocument,
        options: FormattingOptions,
        token: CancellationToken,
    ): ProviderResult<ReadonlyArray<TextEdit>>
}
