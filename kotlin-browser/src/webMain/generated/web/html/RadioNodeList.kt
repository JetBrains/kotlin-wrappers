// Automatically generated - do not modify!

package web.html

import web.dom.NodeList

/**
 * The **`RadioNodeList`** interface represents a collection of elements in a <form> returned by a call to HTMLFormControlsCollection.namedItem().
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RadioNodeList)
 */
sealed /* final */
external class RadioNodeList
protected /* private */ constructor() :
    NodeList<HTMLInputElement> {
    /**
     * If the underlying element collection contains radio buttons, the **`RadioNodeList.value`** property represents the checked radio button. On retrieving the value property, the value of the currently checked radio button is returned as a string. If the collection does not contain any radio buttons or none of the radio buttons in the collection is in checked state, the empty string is returned. On setting the value property, the first radio button input element whose value property is equal to the new value will be set to checked.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RadioNodeList/value)
     */
    var value: String
}
