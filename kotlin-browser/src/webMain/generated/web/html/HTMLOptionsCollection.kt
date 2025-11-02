// Automatically generated - do not modify!

package web.html

import kotlin.js.definedExternally

/**
 * The **`HTMLOptionsCollection`** interface represents a collection of <option> HTML elements (in document order) and offers methods and properties for selecting from the list as well as optionally altering its items. This object is returned only by the options property of select.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLOptionsCollection)
 */
open external class HTMLOptionsCollection
private constructor() :
    HTMLCollection<HTMLOptionElement> {
    /**
     * The **`length`** property of the HTMLOptionsCollection interface returns the number of <option> elements in the collection. The property can get or set the size of the collection.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLOptionsCollection/length)
     */
    override var length: Int

    /**
     * The **`selectedIndex`** property of the HTMLOptionsCollection interface is the numeric index of the first selected <option> element, if any, or −1 if no <option> is selected. Setting this property selects the option at that index and deselects all other options in this collection, while setting it to -1 deselects any currently selected elements. It is exactly equivalent to the selectedIndex property of the HTMLSelectElement that owns this collection.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLOptionsCollection/selectedIndex)
     */
    var selectedIndex: Int

    /**
     * The **`add()`** method of the HTMLOptionsCollection interface adds an HTMLOptionElement or HTMLOptGroupElement to this HTMLOptionsCollection.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLOptionsCollection/add)
     */
    fun add(
        element: HTMLOptionElement,
        before: HTMLElement? = definedExternally,
    )

    fun add(
        element: HTMLOptionElement,
        before: Int?,
    )

    fun add(
        element: HTMLOptGroupElement,
        before: HTMLElement? = definedExternally,
    )

    fun add(
        element: HTMLOptGroupElement,
        before: Int?,
    )

    /**
     * The **`remove()`** method of the HTMLOptionsCollection interface removes the <option> element specified by the index from this collection.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLOptionsCollection/remove)
     */
    fun remove(index: Int)
}
