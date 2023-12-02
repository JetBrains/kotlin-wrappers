// Automatically generated - do not modify!

package web.html

/**
 * Provides special properties and methods (beyond the regular HTMLElement object interface it also has available to it by inheritance) for manipulating the layout and presentation of tables in an HTML document.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableElement)
 */
open external class HTMLTableElement
protected constructor() : HTMLElement {
    /**
     * Retrieves the caption object of a table.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableElement/caption)
     */
    var caption: HTMLTableCaptionElement?

    /**
     * Sets or retrieves the number of horizontal rows contained in the object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableElement/rows)
     */
    val rows: HTMLCollectionOf<HTMLTableRowElement>

    /**
     * Retrieves a collection of all tBody objects in the table. Objects in this collection are in source order.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableElement/tBodies)
     */
    val tBodies: HTMLCollectionOf<HTMLTableSectionElement>

    /**
     * Retrieves the tFoot object of the table.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableElement/tFoot)
     */
    var tFoot: HTMLTableSectionElement?

    /**
     * Retrieves the tHead object of the table.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableElement/tHead)
     */
    var tHead: HTMLTableSectionElement?

    /**
     * Creates an empty caption element in the table.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableElement/createCaption)
     */
    fun createCaption(): HTMLTableCaptionElement

    /**
     * Creates an empty tBody element in the table.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableElement/createTBody)
     */
    fun createTBody(): HTMLTableSectionElement

    /**
     * Creates an empty tFoot element in the table.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableElement/createTFoot)
     */
    fun createTFoot(): HTMLTableSectionElement

    /**
     * Returns the tHead element object if successful, or null otherwise.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableElement/createTHead)
     */
    fun createTHead(): HTMLTableSectionElement

    /**
     * Deletes the caption element and its contents from the table.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableElement/deleteCaption)
     */
    fun deleteCaption()

    /**
     * Removes the specified row (tr) from the element and from the rows collection.
     * @param index Number that specifies the zero-based position in the rows collection of the row to remove.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableElement/deleteRow)
     */
    fun deleteRow(index: Int)

    /**
     * Deletes the tFoot element and its contents from the table.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableElement/deleteTFoot)
     */
    fun deleteTFoot()

    /**
     * Deletes the tHead element and its contents from the table.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableElement/deleteTHead)
     */
    fun deleteTHead()

    /**
     * Creates a new row (tr) in the table, and adds the row to the rows collection.
     * @param index Number that specifies where to insert the row in the rows collection. The default value is -1, which appends the new row to the end of the rows collection.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableElement/insertRow)
     */
    fun insertRow(index: Int = definedExternally): HTMLTableRowElement
}
