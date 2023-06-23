// Automatically generated - do not modify!

package web.html

import web.dom.Element

/**
 * A collection of HTML form control elements.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLFormControlsCollection)
 */
sealed external class HTMLFormControlsCollection :
    HTMLCollectionBase<Element> {
    /**
     * Returns the item with ID or name name from the collection.
     *
     * If there are multiple matching items, then a RadioNodeList object containing all those elements is returned.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLFormControlsCollection/namedItem)
     */
    fun namedItem(name: String): Any? /* RadioNodeList | Element */
}
