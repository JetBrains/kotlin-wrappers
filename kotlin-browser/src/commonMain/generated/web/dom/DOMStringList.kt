// Automatically generated - do not modify!

package web.dom

import js.array.ArrayLike
import js.core.JsString
import js.iterable.JsIterable

/**
 * A type returned by some APIs which contains a list of DOMString (strings).
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMStringList)
 */
external class DOMStringList
private constructor() :
    ArrayLike<JsString>,
    JsIterable<JsString> {
    /**
     * Returns the number of strings in strings.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMStringList/length)
     */
    override val length: Int

    /**
     * Returns true if strings contains string, and false otherwise.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMStringList/contains)
     */
    fun contains(string: String): Boolean

    /**
     * Returns the string with index index from strings.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMStringList/item)
     */
    fun item(index: Int): String?
}
