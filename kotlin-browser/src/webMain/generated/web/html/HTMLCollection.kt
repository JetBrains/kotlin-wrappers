// Automatically generated - do not modify!

package web.html

import web.dom.Element

open external class HTMLCollection<T : Element>
private constructor() :
    HTMLCollectionBase<T> {
    override val length: Int
    override fun item(index: Int): T?

    /**
     * The **`namedItem()`** method of the HTMLCollection interface returns the first Element in the collection whose `id` or `name` attribute match the specified name, or `null` if no element matches.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLCollection/namedItem)
     */
    fun namedItem(name: String): T?
}
