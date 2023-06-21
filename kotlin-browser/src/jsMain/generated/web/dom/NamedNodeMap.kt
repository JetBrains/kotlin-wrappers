// Automatically generated - do not modify!

package web.dom

import js.core.ArrayLike
import js.core.JsIterable

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
