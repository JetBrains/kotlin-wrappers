// Automatically generated - do not modify!

package web.html

import kotlin.js.definedExternally

/**
 * The **`HTMLTableRowElement`** interface provides special properties and methods (beyond the HTMLElement interface it also has available to it by inheritance) for manipulating the layout and presentation of rows in an HTML table.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableRowElement)
 */
open external class HTMLTableRowElement
protected constructor() :
    HTMLElement {
    /**
     * The **`cells`** read-only property of the HTMLTableRowElement interface returns a live HTMLCollection containing the cells in the row.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableRowElement/cells)
     */
    val cells: HTMLCollection<HTMLTableCellElement>

    /**
     * The **`rowIndex`** read-only property of the HTMLTableRowElement interface represents the position of a row within the whole table.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableRowElement/rowIndex)
     */
    val rowIndex: Int

    /**
     * The **`sectionRowIndex`** read-only property of the HTMLTableRowElement interface represents the position of a row within the current section (thead, tbody, or tfoot).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableRowElement/sectionRowIndex)
     */
    val sectionRowIndex: Int

    /**
     * The **`deleteCell()`** method of the HTMLTableRowElement interface removes a specific row cell from a given tr.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableRowElement/deleteCell)
     */
    fun deleteCell(index: Int)

    /**
     * The **`insertCell()`** method of the HTMLTableRowElement interface inserts a new cell (td) into a table row (tr) and returns a reference to the cell.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableRowElement/insertCell)
     */
    fun insertCell(index: Int = definedExternally): HTMLTableCellElement
}
