// Automatically generated - do not modify!

package web.intl

sealed external interface SegmentData {
    /** A string containing the segment extracted from the original input string. */
    var segment: String

    /** The code unit index in the original input string at which the segment begins. */
    var index: Int

    /** The complete input string that was segmented. */
    var input: String

    /**
     * A boolean value only if granularity is "word"; otherwise, undefined.
     * If granularity is "word", then isWordLike is true when the segment is word-like (i.e., consists of letters/numbers/ideographs/etc.); otherwise, false.
     */
    var isWordLike: Boolean?
}
