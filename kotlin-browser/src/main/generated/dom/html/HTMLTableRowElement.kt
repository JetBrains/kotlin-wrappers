// Automatically generated - do not modify!

package dom.html

sealed external class HTMLTableRowElement :
    HTMLElement {
    /** Retrieves a collection of all cells in the table row. */
    val cells: HTMLCollectionOf<HTMLTableCellElement>

    /** Retrieves the position of the object in the rows collection for the table. */
    val rowIndex: Int

    /** Retrieves the position of the object in the collection. */
    val sectionRowIndex: Int

    /**
     * Removes the specified cell from the table row, as well as from the cells collection.
     * @param index Number that specifies the zero-based position of the cell to remove from the table row. If no value is provided, the last cell in the cells collection is deleted.
     */
    fun deleteCell(index: Number)

    /**
     * Creates a new cell in the table row, and adds the cell to the cells collection.
     * @param index Number that specifies where to insert the cell in the tr. The default value is -1, which appends the new cell to the end of the cells collection.
     */
    fun insertCell(index: Number = definedExternally): HTMLTableCellElement
}
