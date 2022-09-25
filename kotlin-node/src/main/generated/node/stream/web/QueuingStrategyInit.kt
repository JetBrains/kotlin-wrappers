// Automatically generated - do not modify!

package node.stream.web

sealed external interface QueuingStrategyInit {
    /**
     * Creates a new ByteLengthQueuingStrategy with the provided high water
     * mark.
     *
     * Note that the provided high water mark will not be validated ahead of
     * time. Instead, if it is negative, NaN, or not a number, the resulting
     * ByteLengthQueuingStrategy will cause the corresponding stream
     * constructor to throw.
     */
    var highWaterMark: Number
}
