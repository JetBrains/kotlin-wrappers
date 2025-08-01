// Automatically generated - do not modify!

package web.cssom

import js.array.ArrayLike
import js.iterable.JsIterable

/**
 * The **`MediaList`** interface represents the media queries of a stylesheet, e.g., those set using a link element's `media` attribute.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaList)
 */
open external class MediaList
private constructor() :
    ArrayLike<MediaQuery>,
    JsIterable<MediaQuery> {
    /**
     * The read-only **`length`** property of the MediaList interface returns the number of media queries in the list.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaList/length)
     */
    override val length: Int

    /**
     * The **`mediaText`** property of the MediaList interface is a stringifier that returns a string representing the `MediaList` as text, and also allows you to set a new `MediaList`.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaList/mediaText)
     */
    var mediaText: String

    /**
     * The `appendMedium()` method of the MediaList interface adds a media query to the list.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaList/appendMedium)
     */
    fun appendMedium(medium: MediaQuery)

    /**
     * The `deleteMedium()` method of the MediaList interface removes from this `MediaList` the given media query.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaList/deleteMedium)
     */
    fun deleteMedium(medium: MediaQuery)

    /**
     * The **`item()`** method of the MediaList interface returns the media query at the specified `index`, or `null` if the specified `index` doesn't exist.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaList/item)
     */
    fun item(index: Int): MediaQuery?
}
