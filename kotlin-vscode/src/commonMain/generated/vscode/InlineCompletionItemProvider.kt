// Automatically generated - do not modify!

package vscode

/**
 * The inline completion item provider interface defines the contract between extensions and
 * the inline completion feature.
 *
 * Providers are asked for completions either explicitly by a user gesture or implicitly when typing.
 */
external interface InlineCompletionItemProvider {
    /**
     * Provides inline completion items for the given position and document.
     * If inline completions are enabled, this method will be called whenever the user stopped typing.
     * It will also be called when the user explicitly triggers inline completions or explicitly asks for the next or previous inline completion.
     * In that case, all available inline completions should be returned.
     * `context.triggerKind` can be used to distinguish between these scenarios.
     *
     * @param document The document inline completions are requested for.
     * @param position The position inline completions are requested for.
     * @param context A context object with additional information.
     * @param token A cancellation token.
     * @returns An array of completion items or a thenable that resolves to an array of completion items.
     */
    fun provideInlineCompletionItems(
        document: TextDocument,
        position: Position,
        context: InlineCompletionContext,
        token: CancellationToken,
    ): ProviderResult<Any /* InlineCompletionItem[] | InlineCompletionList */>
}
