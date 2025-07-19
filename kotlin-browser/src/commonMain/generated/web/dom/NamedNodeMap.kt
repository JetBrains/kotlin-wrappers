// Automatically generated - do not modify!

package web.dom

import js.array.ArrayLike
import js.iterable.JsIterable

/**
 * The **`NamedNodeMap`** interface represents a collection of Attr objects.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NamedNodeMap)
 */
open external class NamedNodeMap
private constructor() :
    ArrayLike<Attr>,
    JsIterable<Attr> {
    /**
     * The read-only **`length`** property of the NamedNodeMap interface is the number of objects stored in the map.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NamedNodeMap/length)
     */
    override val length: Int

    /**
     * The **`getNamedItem()`** method of the NamedNodeMap interface returns the Attr corresponding to the given name, or `null` if there is no corresponding attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NamedNodeMap/getNamedItem)
     */
    fun getNamedItem(qualifiedName: String): Attr?

    /**
     * The **`getNamedItemNS()`** method of the NamedNodeMap interface returns the Attr corresponding to the given local name in the given namespace, or `null` if there is no corresponding attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NamedNodeMap/getNamedItemNS)
     */
    fun getNamedItemNS(
        namespace: String?,
        localName: String,
    ): Attr?

    /**
     * The **`item()`** method of the NamedNodeMap interface returns the item in the map matching the index.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NamedNodeMap/item)
     */
    fun item(index: Int): Attr?

    /**
     * The **`removeNamedItem()`** method of the NamedNodeMap interface removes the Attr corresponding to the given name from the map.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NamedNodeMap/removeNamedItem)
     */
    fun removeNamedItem(qualifiedName: String): Attr

    /**
     * The **`removeNamedItemNS()`** method of the NamedNodeMap interface removes the Attr corresponding to the given namespace and local name from the map.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NamedNodeMap/removeNamedItemNS)
     */
    fun removeNamedItemNS(
        namespace: String?,
        localName: String,
    ): Attr

    /**
     * The **`setNamedItem()`** method of the NamedNodeMap interface puts the Attr identified by its name in the map.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NamedNodeMap/setNamedItem)
     */
    fun setNamedItem(attr: Attr): Attr?

    /**
     * The **`setNamedItemNS()`** method of the NamedNodeMap interface puts the Attr identified by its name in the map.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NamedNodeMap/setNamedItemNS)
     */
    fun setNamedItemNS(attr: Attr): Attr?
}
