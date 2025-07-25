// Automatically generated - do not modify!

package vscode

import js.array.ReadonlyArray

/**
 * The ranges a CommentingRangeProvider enables commenting on.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#CommentingRanges)
 */
external interface CommentingRanges {
    /**
     * Enables comments to be added to a file without a specific range.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#CommentingRanges.enableFileComments)
     */
    var enableFileComments: Boolean

    /**
     * The ranges which allow new comment threads creation.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#CommentingRanges.ranges)
     */
    var ranges: ReadonlyArray<Range>?
}
