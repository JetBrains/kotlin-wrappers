// Automatically generated - do not modify!

package web.media.source

/**
 * When loading a media resource for use by an audio or video element, the **`TimeRanges`** interface is used for representing the time ranges of the media resource that have been buffered, the time ranges that have been played, and the time ranges that are seekable.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TimeRanges)
 */
external class TimeRanges
private constructor() {
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
    fun end(index: Int): Double

    /**
     * Returns the time for the start of the range with the given index.
     *
     * Throws an "IndexSizeError" DOMException if the index is out of range.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TimeRanges/start)
     */
    fun start(index: Int): Double
}
