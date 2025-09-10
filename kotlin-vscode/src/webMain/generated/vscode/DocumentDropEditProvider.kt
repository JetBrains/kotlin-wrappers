// Automatically generated - do not modify!

package vscode

import kotlin.js.JsAny

/**
 * Provider which handles dropping of resources into a text editor.
 *
 * This allows users to drag and drop resources (including resources from external apps) into the editor. While dragging
 * and dropping files, users can hold down `shift` to drop the file into the editor instead of opening it.
 * Requires `editor.dropIntoEditor.enabled` to be on.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#DocumentDropEditProvider)
 */
external interface DocumentDropEditProvider<T : DocumentDropEdit> {
    /**
     * Provide edits which inserts the content being dragged and dropped into the document.
     *
     * @param document The document in which the drop occurred.
     * @param position The position in the document where the drop occurred.
     * @param dataTransfer A [DataTransfer] object that holds data about what is being dragged and dropped.
     * @param token A cancellation token.
     *
     * @returns A [DocumentDropEdit] or a thenable that resolves to such. The lack of a result can be
     * signaled by returning `undefined` or `null`.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#DocumentDropEditProvider.provideDocumentDropEdits)
     */
    fun provideDocumentDropEdits(
        document: TextDocument,
        position: Position,
        dataTransfer: DataTransfer,
        token: CancellationToken,
    ): ProviderResult<JsAny /* T | T[] */>

    /**
     * Optional method which fills in the {@linkcode DocumentDropEdit.additionalEdit} before the edit is applied.
     *
     * This is called once per edit and should be used if generating the complete edit may take a long time.
     * Resolve can only be used to change [DocumentDropEdit.additionalEdit].
     *
     * @param edit The {@linkcode DocumentDropEdit} to resolve.
     * @param token A cancellation token.
     *
     * @returns The resolved edit or a thenable that resolves to such. It is OK to return the given
     * `edit`. If no result is returned, the given `edit` is used.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#DocumentDropEditProvider.resolveDocumentDropEdit)
     */
    var resolveDocumentDropEdit: ((
        edit: T,
        token: CancellationToken,
    ) -> ProviderResult<T>)?
}
