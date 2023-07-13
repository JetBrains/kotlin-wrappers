// Automatically generated - do not modify!

package web.dom

import js.core.ArrayLike
import js.iterable.JsIterable

/**
 * A type returned by some APIs which contains a list of DOMString (strings).
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMStringList)
 */
sealed external class DOMStringList :
    ArrayLike<String>,
    JsIterable<String> {
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
