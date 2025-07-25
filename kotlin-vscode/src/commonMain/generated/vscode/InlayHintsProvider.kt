// Automatically generated - do not modify!

package vscode

import js.array.ReadonlyArray
import js.core.Void

/**
 * The inlay hints provider interface defines the contract between extensions and
 * the inlay hints feature.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#InlayHintsProvider)
 */
external interface InlayHintsProvider<T : InlayHint> {
    /**
     * An optional event to signal that inlay hints from this provider have changed.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#InlayHintsProvider.onDidChangeInlayHints)
     */
    var onDidChangeInlayHints: Event<Void>?

    /**
     * Provide inlay hints for the given range and document.
     *
     * *Note* that inlay hints that are not [contained][Range.contains] by the given range are ignored.
     *
     * @param document The document in which the command was invoked.
     * @param range The range for which inlay hints should be computed.
     * @param token A cancellation token.
     * @returns An array of inlay hints or a thenable that resolves to such.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#InlayHintsProvider.provideInlayHints)
     */
    fun provideInlayHints(
        document: TextDocument,
        range: Range,
        token: CancellationToken,
    ): ProviderResult<ReadonlyArray<T>>

    /**
     * Given an inlay hint fill in [tooltip}, {@link InlayHint.textEdits text edits][InlayHint.tooltip],
     * or complete label [parts][InlayHintLabelPart].
     *
     * *Note* that the editor will resolve an inlay hint at most once.
     *
     * @param hint An inlay hint.
     * @param token A cancellation token.
     * @returns The resolved inlay hint or a thenable that resolves to such. It is OK to return the given `item`. When no result is returned, the given `item` will be used.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#InlayHintsProvider.resolveInlayHint)
     */
    var resolveInlayHint: ((
        hint: T,
        token: CancellationToken,
    ) -> ProviderResult<T>)?
}
