// Automatically generated - do not modify!

package web.html

import web.dom.Element
import kotlin.js.JsAny

/**
 * The **`HTMLFormControlsCollection`** interface represents a collection of HTML form control elements, returned by the HTMLFormElement interface's elements property.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLFormControlsCollection)
 */
open external class HTMLFormControlsCollection
private constructor() :
    HTMLCollectionBase<Element> {
    override val length: Int
    override fun item(index: Int): Element?

    /**
     * The **`HTMLFormControlsCollection.namedItem()`** method returns the RadioNodeList or the Element in the collection whose name or id match the specified name, or null if no node matches.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLFormControlsCollection/namedItem)
     */
    fun namedItem(name: String): JsAny? /* RadioNodeList | Element */
}
