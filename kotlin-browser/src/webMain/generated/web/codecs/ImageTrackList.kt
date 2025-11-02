// Automatically generated - do not modify!

package web.codecs

import js.array.ArrayLike
import js.core.Void
import js.iterable.JsIterable
import js.promise.Promise

/**
 * The **`ImageTrackList`** interface of the WebCodecs API represents a list of image tracks.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ImageTrackList)
 */
open external class ImageTrackList
private constructor() :
    ArrayLike<ImageTrack>,
    JsIterable<ImageTrack> {
    /**
     * The **`length`** property of the ImageTrackList interface returns the length of the ImageTrackList.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ImageTrackList/length)
     */
    override val length: Int

    /**
     * The **`ready`** property of the ImageTrackList interface returns a Promise that resolves when the ImageTrackList is populated with tracks.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ImageTrackList/ready)
     */
    val ready: Promise<Void>

    /**
     * The **`selectedIndex`** property of the ImageTrackList interface returns the index of the selected track.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ImageTrackList/selectedIndex)
     */
    val selectedIndex: Int

    /**
     * The **`selectedTrack`** property of the ImageTrackList interface returns an ImageTrack object representing the currently selected track.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ImageTrackList/selectedTrack)
     */
    val selectedTrack: ImageTrack?
}
