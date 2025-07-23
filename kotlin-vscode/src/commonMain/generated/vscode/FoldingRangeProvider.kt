// Automatically generated - do not modify!

package vscode

import js.array.ReadonlyArray
import js.core.Void

/**
 * The folding range provider interface defines the contract between extensions and
 * [Folding](https://code.visualstudio.com/docs/editor/codebasics#_folding) in the editor.
 */
external interface FoldingRangeProvider {
    /**
     * An optional event to signal that the folding ranges from this provider have changed.
     */
    var onDidChangeFoldingRanges: Event<Void>?

    /**
     * Returns a list of folding ranges or null and undefined if the provider
     * does not want to participate or was cancelled.
     * @param document The document in which the command was invoked.
     * @param context Additional context information (for future use)
     * @param token A cancellation token.
     */
    fun provideFoldingRanges(
        document: TextDocument,
        context: FoldingContext,
        token: CancellationToken,
    ): ProviderResult<ReadonlyArray<FoldingRange>>
}
