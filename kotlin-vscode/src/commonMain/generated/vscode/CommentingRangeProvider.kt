// Automatically generated - do not modify!

package vscode

import js.core.JsAny
import kotlin.js.JsName

/**
 * Commenting range provider for a [comment controller][CommentController].
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#CommentingRangeProvider)
 */
external interface CommentingRangeProvider {
    /**
     * Provide a list of ranges which allow new comment threads creation or null for a given document
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#CommentingRangeProvider.provideCommentingRanges)
     */
    @JsName("provideCommentingRanges")
    fun provideCommentingRangesAsync(
        document: TextDocument,
        token: CancellationToken,
    ): ProviderResult<JsAny /* Range[] | CommentingRanges */>
}
