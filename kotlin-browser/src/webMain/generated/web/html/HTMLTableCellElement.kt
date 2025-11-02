// Automatically generated - do not modify!

package web.html

/**
 * The **`HTMLTableCellElement`** interface provides special properties and methods (beyond the regular HTMLElement interface it also has available to it by inheritance) for manipulating the layout and presentation of table cells, either header cells (<th>) or data cells (<td>), in an HTML document.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableCellElement)
 */
open external class HTMLTableCellElement
protected constructor() :
    HTMLElement {
    /**
     * The **`abbr`** property of the HTMLTableCellElement interface indicates an abbreviation associated with the cell. If the cell does not represent a header cell <th>, it is ignored.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableCellElement/abbr)
     */
    var abbr: String

    /**
     * The **`cellIndex`** read-only property of the HTMLTableCellElement interface represents the position of a cell within its row (<tr>). The first cell has an index of 0.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableCellElement/cellIndex)
     */
    val cellIndex: Int

    /**
     * The **`colSpan`** property of the HTMLTableCellElement interface represents the number of columns this cell must span; this lets the cell occupy space across multiple columns of the table. It reflects the colspan attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableCellElement/colSpan)
     */
    var colSpan: Int

    /**
     * The **`headers`** property of the HTMLTableCellElement interface contains a list of IDs of <th> elements that are headers for this specific cell.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableCellElement/headers)
     */
    var headers: String

    /**
     * The **`rowSpan`** property of the HTMLTableCellElement interface represents the number of rows this cell must span; this lets the cell occupy space across multiple rows of the table. It reflects the rowspan attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableCellElement/rowSpan)
     */
    var rowSpan: Int

    /**
     * The **`scope`** property of the HTMLTableCellElement interface indicates the scope of a <th> cell.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableCellElement/scope)
     */
    var scope: String
}
