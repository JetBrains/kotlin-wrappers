// Automatically generated - do not modify!

package web.media.source

sealed external class TimeRanges {
    /** Returns the number of ranges in the object. */
    val length: Int

    /**
     * Returns the time for the end of the range with the given index.
     *
     * Throws an "IndexSizeError" DOMException if the index is out of range.
     */
    fun end(index: Int): Number

    /**
     * Returns the time for the start of the range with the given index.
     *
     * Throws an "IndexSizeError" DOMException if the index is out of range.
     */
    fun start(index: Int): Number
}
