// Automatically generated - do not modify!

package web.media.source

/**
 * Used to represent a set of time ranges, primarily for the purpose of tracking which portions of media have been buffered when loading it for use by the <audio> and <video> elements.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TimeRanges)
 */
sealed external class TimeRanges {
    /**
     * Returns the number of ranges in the object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TimeRanges/length)
     */
    val length: Int

    /**
     * Returns the time for the end of the range with the given index.
     *
     * Throws an "IndexSizeError" DOMException if the index is out of range.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TimeRanges/end)
     */
    fun end(index: Int): Number

    /**
     * Returns the time for the start of the range with the given index.
     *
     * Throws an "IndexSizeError" DOMException if the index is out of range.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TimeRanges/start)
     */
    fun start(index: Int): Number
}
