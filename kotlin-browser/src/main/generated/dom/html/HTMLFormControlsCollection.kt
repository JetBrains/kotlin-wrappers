// Automatically generated - do not modify!

package dom.html

sealed external class HTMLFormControlsCollection :
    HTMLCollectionBase {
    /**
     * Returns the item with ID or name name from the collection.
     *
     * If there are multiple matching items, then a RadioNodeList object containing all those elements is returned.
     */
    fun namedItem(name: String): Any? /* RadioNodeList | Element */
}
