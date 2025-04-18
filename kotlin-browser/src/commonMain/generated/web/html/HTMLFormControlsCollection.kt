// Automatically generated - do not modify!

package web.html

import js.core.JsAny
import web.dom.Element

/**
 * The **`HTMLFormControlsCollection`** interface represents a _collection_ of HTML _form control elements_, returned by the HTMLFormElement interface's HTMLFormElement.elements property.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLFormControlsCollection)
 */
external class HTMLFormControlsCollection
private constructor() :
    HTMLCollectionBase<Element> {
    override val length: Int
    override fun item(index: Int): Element?

    /**
     * Returns the item with ID or name name from the collection.
     *
     * If there are multiple matching items, then a RadioNodeList object containing all those elements is returned.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLFormControlsCollection/namedItem)
     */
    fun namedItem(name: String): JsAny? /* RadioNodeList | Element */
}
