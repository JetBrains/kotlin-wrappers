// Automatically generated - do not modify!

package web.html

import dom.Element

sealed external class HTMLFormControlsCollection :
    HTMLCollectionBase<Element> {
    /**
     * Returns the item with ID or name name from the collection.
     *
     * If there are multiple matching items, then a RadioNodeList object containing all those elements is returned.
     */
    fun namedItem(name: String): Any? /* RadioNodeList | Element */
}
