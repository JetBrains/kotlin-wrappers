// Automatically generated - do not modify!

package web.html

/**
 * Provides special properties and methods (beyond the regular HTMLElement interface it also has available to it by inheritance) for manipulating the layout and presentation of table cells, either header or data cells, in an HTML document.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableCellElement)
 */
open external class HTMLTableCellElement
protected constructor() : HTMLElement {
    /**
     * Sets or retrieves abbreviated text for the object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableCellElement/abbr)
     */
    var abbr: String

    /**
     * Retrieves the position of the object in the cells collection of a row.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableCellElement/cellIndex)
     */
    val cellIndex: Int

    /**
     * Sets or retrieves the number columns in the table that the object should span.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableCellElement/colSpan)
     */
    var colSpan: Int

    /**
     * Sets or retrieves a list of header cells that provide information for the object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableCellElement/headers)
     */
    var headers: String

    /**
     * Sets or retrieves how many rows in a table the cell should span.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableCellElement/rowSpan)
     */
    var rowSpan: Int

    /**
     * Sets or retrieves the group of cells in a table to which the object's information applies.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableCellElement/scope)
     */
    var scope: String
}
