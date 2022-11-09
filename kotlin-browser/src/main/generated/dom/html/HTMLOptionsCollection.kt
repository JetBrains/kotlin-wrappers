// Automatically generated - do not modify!

package dom.html

sealed external class HTMLOptionsCollection :
    HTMLCollectionOf<HTMLOptionElement> {
    /**
     * Returns the number of elements in the collection.
     *
     * When set to a smaller number, truncates the number of option elements in the corresponding container.
     *
     * When set to a greater number, adds new blank option elements to that container.
     */
    override var length: Int

    /**
     * Returns the index of the first selected item, if any, or −1 if there is no selected item.
     *
     * Can be set, to change the selection.
     */
    var selectedIndex: Int

    /**
     * Inserts element before the node given by before.
     *
     * The before argument can be a number, in which case element is inserted before the item with that number, or an element from the collection, in which case element is inserted before that element.
     *
     * If before is omitted, null, or a number out of range, then element will be added at the end of the list.
     *
     * This method will throw a "HierarchyRequestError" DOMException if element is an ancestor of the element into which it is to be inserted.
     */
    fun add(
        element: HTMLElement, /* HTMLOptionElement | HTMLOptGroupElement */
        before: Any? /* HTMLElement | number */ = definedExternally,
    )

    /** Removes the item with index index from the collection. */
    fun remove(index: Number)
}
