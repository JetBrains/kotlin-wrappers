// Automatically generated - do not modify!

package web.cssom

import js.core.ArrayLike
import js.core.JsIterable

sealed external class MediaList :
    ArrayLike<MediaQuery>,
    JsIterable<MediaQuery> {
    var mediaText: String
    fun appendMedium(medium: MediaQuery)
    fun deleteMedium(medium: MediaQuery)
    fun item(index: Int): MediaQuery?
}
