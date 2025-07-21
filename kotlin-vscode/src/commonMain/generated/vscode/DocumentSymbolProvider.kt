// Automatically generated - do not modify!

package vscode

/**
// ORIGINAL SOURCE

/**
 * The document symbol provider interface defines the contract between extensions and
 * the [go to symbol](https://code.visualstudio.com/docs/editor/editingevolved#_go-to-symbol)-feature.
*/
export interface DocumentSymbolProvider {

/**
 * Provide symbol information for the given document.
 *
 * @param document The document in which the command was invoked.
 * @param token A cancellation token.
 * @returns An array of document highlights or a thenable that resolves to such. The lack of a result can be
 * signaled by returning `undefined`, `null`, or an empty array.
*/
provideDocumentSymbols(document: TextDocument, token: CancellationToken): ProviderResult<SymbolInformation[] | DocumentSymbol[]>;
}

// ORIGINAL SOURCE
 **/
