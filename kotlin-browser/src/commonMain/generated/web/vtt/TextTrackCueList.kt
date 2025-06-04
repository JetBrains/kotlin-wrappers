// Automatically generated - do not modify!

package web.vtt

import js.array.ArrayLike
import js.iterable.JsIterable

/**
 * The **`TextTrackCueList`** interface of the WebVTT API is an array-like object that represents a dynamically updating list of TextTrackCue objects.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextTrackCueList)
 */
external class TextTrackCueList
private constructor() :
    ArrayLike<TextTrackCue>,
    JsIterable<TextTrackCue> {
    /**
     * The **`length`** read-only property of the TextTrackCueList interface returns the number of cues in the list.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextTrackCueList/length)
     */
    override val length: Int

    /**
     * The **`getCueById()`** method of the TextTrackCueList interface returns the first VTTCue in the list represented by the `TextTrackCueList` object whose identifier matches the value of `id`.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextTrackCueList/getCueById)
     */
    fun getCueById(id: String): TextTrackCue?
}
