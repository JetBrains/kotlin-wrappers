// Automatically generated - do not modify!

package vscode

/**
 * Commenting range provider for a {@link CommentController comment controller}.
 */
external interface CommentingRangeProvider {
    /**
     * Provide a list of ranges which allow new comment threads creation or null for a given document
     */
    fun provideCommentingRanges(
        document: TextDocument,
        token: CancellationToken,
    ): ProviderResult<Any /* Range[] | CommentingRanges */>
}
