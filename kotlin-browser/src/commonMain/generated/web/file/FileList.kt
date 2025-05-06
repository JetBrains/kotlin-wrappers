// Automatically generated - do not modify!

package web.file

import js.array.ArrayLike
import js.iterable.JsIterable
import js.serializable.Serializable

/**
 * The **`FileList`** interface represents an object of this type returned by the `files` property of the HTML input element; this lets you access the list of files selected with the `<input type='file'>` element.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileList)
 */
external class FileList
private constructor() :
    ArrayLike<File>,
    JsIterable<File>,
    Serializable {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileList/length)
     */
    override val length: Int

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileList/item)
     */
    fun item(index: Int): File?
}
