// Automatically generated - do not modify!

package web.cssom

import js.core.ArrayLike
import js.core.JsIterable

sealed external class MediaList :
    ArrayLike<String>,
    JsIterable<String> {
    var mediaText: String
    fun appendMedium(medium: String)
    fun deleteMedium(medium: String)
    fun item(index: Int): String?
}
