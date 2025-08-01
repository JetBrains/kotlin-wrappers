// Automatically generated - do not modify!

package web.html

import js.core.JsAny
import web.dom.Element

/**
 * The **`HTMLFormControlsCollection`** interface represents a _collection_ of HTML _form control elements_, returned by the HTMLFormElement interface's HTMLFormElement.elements property.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLFormControlsCollection)
 */
open external class HTMLFormControlsCollection
private constructor() :
    HTMLCollectionBase<Element> {
    override val length: Int
    override fun item(index: Int): Element?

    /**
     * The **`HTMLFormControlsCollection.namedItem()`** method returns the RadioNodeList or the Element in the collection whose `name` or `id` match the specified name, or `null` if no node matches.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLFormControlsCollection/namedItem)
     */
    fun namedItem(name: String): JsAny? /* RadioNodeList | Element */
}
