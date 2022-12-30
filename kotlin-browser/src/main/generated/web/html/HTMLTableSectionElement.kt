// Automatically generated - do not modify!

package web.html

abstract external class HTMLTableSectionElement :
    HTMLElement {
    /** Sets or retrieves the number of horizontal rows contained in the object. */
    val rows: HTMLCollectionOf<HTMLTableRowElement>

    /**
     * Removes the specified row (tr) from the element and from the rows collection.
     * @param index Number that specifies the zero-based position in the rows collection of the row to remove.
     */
    fun deleteRow(index: Int)

    /**
     * Creates a new row (tr) in the table, and adds the row to the rows collection.
     * @param index Number that specifies where to insert the row in the rows collection. The default value is -1, which appends the new row to the end of the rows collection.
     */
    fun insertRow(index: Int = definedExternally): HTMLTableRowElement
}
