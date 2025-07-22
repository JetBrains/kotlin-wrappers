// Automatically generated - do not modify!

package vscode

import js.array.ReadonlyArray

/**
 * The ranges a CommentingRangeProvider enables commenting on.
 */
external interface CommentingRanges {
    /**
     * Enables comments to be added to a file without a specific range.
     */
    var enableFileComments: Boolean

    /**
     * The ranges which allow new comment threads creation.
     */
    var ranges: ReadonlyArray<Range>?
}
