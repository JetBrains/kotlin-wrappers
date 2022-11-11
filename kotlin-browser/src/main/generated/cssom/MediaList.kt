// Automatically generated - do not modify!

package cssom

import kotlinx.js.ArrayLike

sealed external class MediaList :
    ArrayLike<String> {
    var mediaText: String
    fun appendMedium(medium: String)
    fun deleteMedium(medium: String)
    fun item(index: Int): String?
}
