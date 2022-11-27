// Automatically generated - do not modify!

package dom

import js.core.ArrayLike

sealed external class NamedNodeMap :
    ArrayLike<Attr> {
    fun getNamedItem(qualifiedName: String): Attr?
    fun getNamedItemNS(
        namespace: String?,
        localName: String,
    ): Attr?

    fun item(index: Int): Attr?
    fun removeNamedItem(qualifiedName: String): Attr
    fun removeNamedItemNS(
        namespace: String?,
        localName: String,
    ): Attr

    fun setNamedItem(attr: Attr): Attr?
    fun setNamedItemNS(attr: Attr): Attr?
}
