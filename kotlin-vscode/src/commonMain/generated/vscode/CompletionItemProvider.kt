// Automatically generated - do not modify!

package vscode

import js.core.JsAny

/**
 * The completion item provider interface defines the contract between extensions and
 * [IntelliSense](https://code.visualstudio.com/docs/editor/intellisense).
 *
 * Providers can delay the computation of the {@linkcode CompletionItem.detail detail}
 * and {@linkcode CompletionItem.documentation documentation} properties by implementing the
 * {@linkcode CompletionItemProvider.resolveCompletionItem resolveCompletionItem}-function. However, properties that
 * are needed for the initial sorting and filtering, like `sortText`, `filterText`, `insertText`, and `range`, must
 * not be changed during resolve.
 *
 * Providers are asked for completions either explicitly by a user gesture or -depending on the configuration-
 * implicitly when typing words or trigger characters.
 */
external interface CompletionItemProvider<T : CompletionItem> {
    /**
     * Provide completion items for the given position and document.
     *
     * @param document The document in which the command was invoked.
     * @param position The position at which the command was invoked.
     * @param token A cancellation token.
     * @param context How the completion was triggered.
     *
     * @returns An array of completions, a [completion list][CompletionList], or a thenable that resolves to either.
     * The lack of a result can be signaled by returning `undefined`, `null`, or an empty array.
     */
    fun provideCompletionItems(
        document: TextDocument,
        position: Position,
        token: CancellationToken,
        context: CompletionContext,
    ): ProviderResult<JsAny /* T[] | CompletionList<T> */>

    /**
     * Given a completion item fill in more data, like [doc-comment][CompletionItem.documentation]
     * or [details][CompletionItem.detail].
     *
     * The editor will only resolve a completion item once.
     *
     * *Note* that this function is called when completion items are already showing in the UI or when an item has been
     * selected for insertion. Because of that, no property that changes the presentation (label, sorting, filtering etc)
     * or the (primary) insert behaviour ([insertText][CompletionItem.insertText]) can be changed.
     *
     * This function may fill in [additionalTextEdits][CompletionItem.additionalTextEdits]. However, that means an item might be
     * inserted *before* resolving is done and in that case the editor will do a best effort to still apply those additional
     * text edits.
     *
     * @param item A completion item currently active in the UI.
     * @param token A cancellation token.
     * @returns The resolved completion item or a thenable that resolves to of such. It is OK to return the given
     * `item`. When no result is returned, the given `item` will be used.
     */
    var resolveCompletionItem: ((
        item: T,
        token: CancellationToken,
    ) -> ProviderResult<T>)?
}
