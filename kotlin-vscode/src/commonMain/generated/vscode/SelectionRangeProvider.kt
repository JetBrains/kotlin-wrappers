// Automatically generated - do not modify!

package vscode

/**
 * The selection range provider interface defines the contract between extensions and the "Expand and Shrink Selection" feature.
 */
external interface SelectionRangeProvider {
    /**
     * Provide selection ranges for the given positions.
     *
     * Selection ranges should be computed individually and independent for each position. The editor will merge
     * and deduplicate ranges but providers must return hierarchies of selection ranges so that a range
     * is {@link Range.contains contained} by its parent.
     *
     * @param document The document in which the command was invoked.
     * @param positions The positions at which the command was invoked.
     * @param token A cancellation token.
     * @returns Selection ranges or a thenable that resolves to such. The lack of a result can be
     * signaled by returning `undefined` or `null`.
     */
//  provideSelectionRanges(document: TextDocument, positions: readonly Position[], token: CancellationToken): ProviderResult<SelectionRange[]>;
}
