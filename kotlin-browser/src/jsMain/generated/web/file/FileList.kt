// Automatically generated - do not modify!

package web.file

import js.core.ArrayLike
import js.core.JsIterable

/**
 * An object of this type is returned by the files property of the HTML <input> element; this lets you access the list of files selected with the <input type="file"> element. It's also used for a list of files dropped into web content when using the drag and drop API; see the DataTransfer object for details on this usage.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileList)
 */
sealed external class FileList :
    ArrayLike<File>,
    JsIterable<File> {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileList/item) */
    fun item(index: Int): File?
}
