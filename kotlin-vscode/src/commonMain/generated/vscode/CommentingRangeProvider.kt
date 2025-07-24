// Automatically generated - do not modify!

package vscode

import js.core.JsAny

/**
 * Commenting range provider for a [comment controller][CommentController].
 */
external interface CommentingRangeProvider {
    /**
     * Provide a list of ranges which allow new comment threads creation or null for a given document
     */
    fun provideCommentingRanges(
        document: TextDocument,
        token: CancellationToken,
    ): ProviderResult<JsAny /* Range[] | CommentingRanges */>
}
