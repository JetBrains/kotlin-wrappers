// Automatically generated - do not modify!

package web.file

import js.core.ArrayLike
import js.core.JsIterable

sealed external class FileList :
    ArrayLike<File>,
    JsIterable<File> {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileList/item) */
    fun item(index: Int): File?
}
