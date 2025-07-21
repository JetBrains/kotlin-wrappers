// Automatically generated - do not modify!

package vscode

/**
// ORIGINAL SOURCE

/**
 * The type definition provider defines the contract between extensions and
 * the go to type definition feature.
*/
export interface TypeDefinitionProvider {

/**
 * Provide the type definition of the symbol at the given position and document.
 *
 * @param document The document in which the command was invoked.
 * @param position The position at which the command was invoked.
 * @param token A cancellation token.
 * @returns A definition or a thenable that resolves to such. The lack of a result can be
 * signaled by returning `undefined` or `null`.
*/
provideTypeDefinition(document: TextDocument, position: Position, token: CancellationToken): ProviderResult<Definition | DefinitionLink[]>;
}

// ORIGINAL SOURCE
 **/
