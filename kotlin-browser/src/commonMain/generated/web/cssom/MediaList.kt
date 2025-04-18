// Automatically generated - do not modify!

package web.cssom

import js.array.ArrayLike
import js.iterable.JsIterable

/**
 * The **`MediaList`** interface represents the media queries of a stylesheet, e.g., those set using a link element's `media` attribute.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaList)
 */
external class MediaList
private constructor() :
    ArrayLike<MediaQuery>,
    JsIterable<MediaQuery> {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaList/length)
     */
    override val length: Int

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaList/mediaText)
     */
    var mediaText: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaList/appendMedium)
     */
    fun appendMedium(medium: MediaQuery)

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaList/deleteMedium)
     */
    fun deleteMedium(medium: MediaQuery)

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaList/item)
     */
    fun item(index: Int): MediaQuery?
}
