// Automatically generated - do not modify!

package web.codecs

import js.array.ArrayLike
import js.core.Void
import js.iterable.JsIterable
import js.promise.Promise

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ImageTrackList)
 */
external class ImageTrackList
private constructor() :
    ArrayLike<ImageTrack>,
    JsIterable<ImageTrack> {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ImageTrackList/length)
     */
    override val length: Int

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ImageTrackList/ready)
     */
    val ready: Promise<Void>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ImageTrackList/selectedIndex)
     */
    val selectedIndex: Int

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ImageTrackList/selectedTrack)
     */
    val selectedTrack: ImageTrack?
}
