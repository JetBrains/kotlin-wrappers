// Automatically generated - do not modify!

package web.html

import web.dom.Element

open external class HTMLCollection<T : Element>
private constructor() :
    HTMLCollectionBase<T> {
    override val length: Int
    override fun item(index: Int): T?

    /**
     * Retrieves a select object or an object from an options collection.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLCollection/namedItem)
     */
    fun namedItem(name: String): T?
}
