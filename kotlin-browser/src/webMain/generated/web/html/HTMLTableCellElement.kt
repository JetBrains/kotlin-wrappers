// Automatically generated - do not modify!

package web.html

/**
 * The **`HTMLTableCellElement`** interface provides special properties and methods (beyond the regular HTMLElement interface it also has available to it by inheritance) for manipulating the layout and presentation of table cells, either header cells (th) or data cells (td), in an HTML document.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableCellElement)
 */
open external class HTMLTableCellElement
protected constructor() :
    HTMLElement {
    /**
     * The **`abbr`** property of the HTMLTableCellElement interface indicates an abbreviation associated with the cell.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableCellElement/abbr)
     */
    var abbr: String

    /**
     * The **`cellIndex`** read-only property of the HTMLTableCellElement interface represents the position of a cell within its row (tr).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableCellElement/cellIndex)
     */
    val cellIndex: Int

    /**
     * The **`colSpan`** read-only property of the HTMLTableCellElement interface represents the number of columns this cell must span; this lets the cell occupy space across multiple columns of the table.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableCellElement/colSpan)
     */
    var colSpan: Int

    /**
     * The **`headers`** property of the HTMLTableCellElement interface contains a list of IDs of th elements that are _headers_ for this specific cell.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableCellElement/headers)
     */
    var headers: String

    /**
     * The **`rowSpan`** read-only property of the HTMLTableCellElement interface represents the number of rows this cell must span; this lets the cell occupy space across multiple rows of the table.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableCellElement/rowSpan)
     */
    var rowSpan: Int

    /**
     * The **`scope`** property of the HTMLTableCellElement interface indicates the scope of a th cell.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableCellElement/scope)
     */
    var scope: String
}
