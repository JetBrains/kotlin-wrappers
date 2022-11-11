// Automatically generated - do not modify!

package dom.html

abstract external class HTMLTableElement :
    HTMLElement {
    /** Retrieves the caption object of a table. */
    var caption: HTMLTableCaptionElement?

    /** Sets or retrieves the number of horizontal rows contained in the object. */
    val rows: HTMLCollectionOf<HTMLTableRowElement>

    /** Retrieves a collection of all tBody objects in the table. Objects in this collection are in source order. */
    val tBodies: HTMLCollectionOf<HTMLTableSectionElement>

    /** Retrieves the tFoot object of the table. */
    var tFoot: HTMLTableSectionElement?

    /** Retrieves the tHead object of the table. */
    var tHead: HTMLTableSectionElement?

    /** Creates an empty caption element in the table. */
    fun createCaption(): HTMLTableCaptionElement

    /** Creates an empty tBody element in the table. */
    fun createTBody(): HTMLTableSectionElement

    /** Creates an empty tFoot element in the table. */
    fun createTFoot(): HTMLTableSectionElement

    /** Returns the tHead element object if successful, or null otherwise. */
    fun createTHead(): HTMLTableSectionElement

    /** Deletes the caption element and its contents from the table. */
    fun deleteCaption()

    /**
     * Removes the specified row (tr) from the element and from the rows collection.
     * @param index Number that specifies the zero-based position in the rows collection of the row to remove.
     */
    fun deleteRow(index: Int)

    /** Deletes the tFoot element and its contents from the table. */
    fun deleteTFoot()

    /** Deletes the tHead element and its contents from the table. */
    fun deleteTHead()

    /**
     * Creates a new row (tr) in the table, and adds the row to the rows collection.
     * @param index Number that specifies where to insert the row in the rows collection. The default value is -1, which appends the new row to the end of the rows collection.
     */
    fun insertRow(index: Int = definedExternally): HTMLTableRowElement
}
