// Automatically generated - do not modify!

package dom

import kotlinx.js.ArrayLike

sealed external class NamedNodeMap :
    ArrayLike<Attr> {
    fun getNamedItem(qualifiedName: String): Attr?
    fun getNamedItemNS(
        namespace: String?,
        localName: String,
    ): Attr?

    fun item(index: Number): Attr?
    fun removeNamedItem(qualifiedName: String): Attr
    fun removeNamedItemNS(
        namespace: String?,
        localName: String,
    ): Attr

    fun setNamedItem(attr: Attr): Attr?
    fun setNamedItemNS(attr: Attr): Attr?
}
