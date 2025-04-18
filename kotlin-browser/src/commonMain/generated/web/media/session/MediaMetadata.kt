// Automatically generated - do not modify!

package web.media.session

import js.array.ReadonlyArray
import kotlin.js.definedExternally

/**
 * The **`MediaMetadata`** interface of the Media Session API allows a web page to provide rich media metadata for display in a platform UI.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaMetadata)
 */
open external class MediaMetadata(
    init: MediaMetadataInit = definedExternally,
) {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaMetadata/album)
     */
    var album: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaMetadata/artist)
     */
    var artist: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaMetadata/artwork)
     */
    var artwork: ReadonlyArray<MediaImage>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaMetadata/title)
     */
    var title: String
}
