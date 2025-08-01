// Automatically generated - do not modify!

package web.html

import kotlin.js.definedExternally

/**
 * The **`HTMLTableElement`** interface provides special properties and methods (beyond the regular HTMLElement object interface it also has available to it by inheritance) for manipulating the layout and presentation of tables in an HTML document.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableElement)
 */
open external class HTMLTableElement
protected constructor() :
    HTMLElement {
    /**
     * The **`HTMLTableElement.caption`** property represents the table caption.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableElement/caption)
     */
    var caption: HTMLTableCaptionElement?

    /**
     * The read-only HTMLTableElement property **`rows`** returns a live HTMLCollection of all the rows in the table, including the rows contained within any thead, tfoot, and tbody elements.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableElement/rows)
     */
    val rows: HTMLCollection<HTMLTableRowElement>

    /**
     * The **`HTMLTableElement.tBodies`** read-only property returns a live HTMLCollection of the bodies in a table.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableElement/tBodies)
     */
    val tBodies: HTMLCollection<HTMLTableSectionElement>

    /**
     * The **`HTMLTableElement.tFoot`** property represents the tfoot element of a table.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableElement/tFoot)
     */
    var tFoot: HTMLTableSectionElement?

    /**
     * The **`HTMLTableElement.tHead`** represents the thead element of a table.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableElement/tHead)
     */
    var tHead: HTMLTableSectionElement?

    /**
     * The **`HTMLTableElement.createCaption()`** method returns the caption element associated with a given table.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableElement/createCaption)
     */
    fun createCaption(): HTMLTableCaptionElement

    /**
     * The **`createTBody()`** method of HTMLTableElement objects creates and returns a new tbody element associated with a given table.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableElement/createTBody)
     */
    fun createTBody(): HTMLTableSectionElement

    /**
     * The **`createTFoot()`** method of HTMLTableElement objects returns the tfoot element associated with a given table.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableElement/createTFoot)
     */
    fun createTFoot(): HTMLTableSectionElement

    /**
     * The **`createTHead()`** method of HTMLTableElement objects returns the thead element associated with a given table.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableElement/createTHead)
     */
    fun createTHead(): HTMLTableSectionElement

    /**
     * The **`HTMLTableElement.deleteCaption()`** method removes the caption element from a given table.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableElement/deleteCaption)
     */
    fun deleteCaption()

    /**
     * The **`HTMLTableElement.deleteRow()`** method removes a specific row (tr) from a given table.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableElement/deleteRow)
     */
    fun deleteRow(index: Int)

    /**
     * The **`HTMLTableElement.deleteTFoot()`** method removes the tfoot element from a given table.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableElement/deleteTFoot)
     */
    fun deleteTFoot()

    /**
     * The **`HTMLTableElement.deleteTHead()`** removes the thead element from a given table.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableElement/deleteTHead)
     */
    fun deleteTHead()

    /**
     * The **`insertRow()`** method of the HTMLTableElement interface inserts a new row (tr) in a given table, and returns a reference to the new row.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableElement/insertRow)
     */
    fun insertRow(index: Int = definedExternally): HTMLTableRowElement
}
