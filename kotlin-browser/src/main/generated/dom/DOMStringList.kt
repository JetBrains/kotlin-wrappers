// Automatically generated - do not modify!

package dom

import js.core.ArrayLike

sealed external class DOMStringList :
    ArrayLike<String> {
    /** Returns true if strings contains string, and false otherwise. */
    fun contains(string: String): Boolean

    /** Returns the string with index index from strings. */
    fun item(index: Int): String?
}
