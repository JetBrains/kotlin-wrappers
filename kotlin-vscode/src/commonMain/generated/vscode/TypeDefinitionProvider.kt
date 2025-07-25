// Automatically generated - do not modify!

package vscode

import js.core.JsAny
import kotlin.js.JsName

/**
 * The type definition provider defines the contract between extensions and
 * the go to type definition feature.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TypeDefinitionProvider)
 */
external interface TypeDefinitionProvider {
    /**
     * Provide the type definition of the symbol at the given position and document.
     *
     * @param document The document in which the command was invoked.
     * @param position The position at which the command was invoked.
     * @param token A cancellation token.
     * @returns A definition or a thenable that resolves to such. The lack of a result can be
     * signaled by returning `undefined` or `null`.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TypeDefinitionProvider.provideTypeDefinition)
     */
    @JsName("provideTypeDefinition")
    fun provideTypeDefinitionAsync(
        document: TextDocument,
        position: Position,
        token: CancellationToken,
    ): ProviderResult<JsAny /* Definition | DefinitionLink[] */>
}
