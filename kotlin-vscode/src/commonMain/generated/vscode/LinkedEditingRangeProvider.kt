// Automatically generated - do not modify!

package vscode

/**
// ORIGINAL SOURCE

/**
 * The linked editing range provider interface defines the contract between extensions and
 * the linked editing feature.
*/
export interface LinkedEditingRangeProvider {
/**
 * For a given position in a document, returns the range of the symbol at the position and all ranges
 * that have the same content. A change to one of the ranges can be applied to all other ranges if the new content
 * is valid. An optional word pattern can be returned with the result to describe valid contents.
 * If no result-specific word pattern is provided, the word pattern from the language configuration is used.
 *
 * @param document The document in which the provider was invoked.
 * @param position The position at which the provider was invoked.
 * @param token A cancellation token.
 * @returns A list of ranges that can be edited together
*/
provideLinkedEditingRanges(document: TextDocument, position: Position, token: CancellationToken): ProviderResult<LinkedEditingRanges>;
}

// ORIGINAL SOURCE
 **/
