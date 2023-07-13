// Automatically generated - do not modify!

package web.dom

import js.core.ArrayLike
import js.iterable.JsIterable

/**
 * A collection of Attr objects. Objects inside a NamedNodeMap are not in any particular order, unlike NodeList, although they may be accessed by an index as in an array.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NamedNodeMap)
 */
sealed external class NamedNodeMap :
    ArrayLike<Attr>,
    JsIterable<Attr> {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/NamedNodeMap/getNamedItem) */
    fun getNamedItem(qualifiedName: String): Attr?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/NamedNodeMap/getNamedItemNS) */
    fun getNamedItemNS(
        namespace: String?,
        localName: String,
    ): Attr?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/NamedNodeMap/item) */
    fun item(index: Int): Attr?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/NamedNodeMap/removeNamedItem) */
    fun removeNamedItem(qualifiedName: String): Attr

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/NamedNodeMap/removeNamedItemNS) */
    fun removeNamedItemNS(
        namespace: String?,
        localName: String,
    ): Attr

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/NamedNodeMap/setNamedItem) */
    fun setNamedItem(attr: Attr): Attr?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/NamedNodeMap/setNamedItemNS) */
    fun setNamedItemNS(attr: Attr): Attr?
}
