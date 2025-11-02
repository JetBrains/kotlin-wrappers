// Automatically generated - do not modify!

package web.html

import kotlin.js.definedExternally

/**
 * The **`HTMLTableSectionElement`** interface provides special properties and methods (beyond the HTMLElement interface it also has available to it by inheritance) for manipulating the layout and presentation of sections, that is headers, footers and bodies (<thead>, <tfoot>, and <tbody>, respectively) in an HTML table.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableSectionElement)
 */
open external class HTMLTableSectionElement
protected constructor() :
    HTMLElement {
    /**
     * The **`rows`** read-only property of the HTMLTableSectionElement interface returns a live HTMLCollection containing the rows in the section. The HTMLCollection is live and is automatically updated when rows are added or removed.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableSectionElement/rows)
     */
    val rows: HTMLCollection<HTMLTableRowElement>

    /**
     * The **`deleteRow()`** method of the HTMLTableSectionElement interface removes a specific row (<tr>) from a given <section>.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableSectionElement/deleteRow)
     */
    fun deleteRow(index: Int)

    /**
     * The **`insertRow()`** method of the HTMLTableSectionElement interface inserts a new row (<tr>) in the given table sectioning element (<thead>, <tfoot>, or <tbody>), then returns a reference to this new row.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableSectionElement/insertRow)
     */
    fun insertRow(index: Int = definedExternally): HTMLTableRowElement
}
