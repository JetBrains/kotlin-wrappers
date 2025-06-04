// Automatically generated - do not modify!

package web.mediasource

/**
 * When loading a media resource for use by an audio or video element, the **`TimeRanges`** interface is used for representing the time ranges of the media resource that have been buffered, the time ranges that have been played, and the time ranges that are seekable.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TimeRanges)
 */
external class TimeRanges
private constructor() {
    /**
     * The **`TimeRanges.length`** read-only property returns the number of ranges in the object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TimeRanges/length)
     */
    val length: Int

    /**
     * The **`end()`** method of the TimeRanges interface returns the time offset (in seconds) at which a specified time range ends.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TimeRanges/end)
     */
    fun end(index: Int): Double

    /**
     * The **`start()`** method of the TimeRanges interface returns the time offset (in seconds) at which a specified time range begins.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TimeRanges/start)
     */
    fun start(index: Int): Double
}
