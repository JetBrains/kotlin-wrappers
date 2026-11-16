// Automatically generated - do not modify!

package web.html

import web.errors.DOMExceptionType.IndexSizeError
import web.errors.JsThrows

/**
 * The **`HTMLTableElement`** interface provides special properties and methods (beyond the regular HTMLElement object interface it also has available to it by inheritance) for manipulating the layout and presentation of tables in an HTML document.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableElement)
 */
open external class HTMLTableElement
protected constructor() :
    HTMLElement {
    /**
     * The **`caption`** property of the HTMLTableElement interface represents the first <caption> element child of the given <table>, or null if no such element exists.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableElement/caption)
     */
    open var caption: HTMLTableCaptionElement?

    /**
     * The **`rows`** read-only property of the HTMLTableElement interface returns a live HTMLCollection of all <tr> elements that are a child of the given <table> element, or a child of one of the table's <thead>, <tbody>, and <tfoot> children. The members of the <thead> appear first, followed by members of the <tbody> and the table itself, and members of the <tfoot> come last, sorted by tree order within each group.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableElement/rows)
     */
    open val rows: HTMLCollection<HTMLTableRowElement>

    /**
     * The **`tBodies`** read-only property of the HTMLTableElement interface returns a live HTMLCollection of all <tbody> element children of the given <table>.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableElement/tBodies)
     */
    open val tBodies: HTMLCollection<HTMLTableSectionElement>

    /**
     * The **`tFoot`** property of the HTMLTableElement interface represents the first <tfoot> element child of the given <table>, or null if no such element exists.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableElement/tFoot)
     */
    open var tFoot: HTMLTableSectionElement?

    /**
     * The **`tHead`** property of the HTMLTableElement interface represents the first <thead> element child of the given <table>, or null if no such element exists.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableElement/tHead)
     */
    open var tHead: HTMLTableSectionElement?

    /**
     * The **`createCaption()`** method of the HTMLTableElement interface creates a <caption> element, inserts it as the first child of the given <table>, and returns it. If the table already has a <caption> element child, this method returns the first such child without creating one.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableElement/createCaption)
     */
    open fun createCaption(): HTMLTableCaptionElement

    /**
     * The **`createTBody()`** method of the HTMLTableElement interface creates a <tbody> element, inserts it immediately after the last <tbody> element child of the given <table>, or as the last child if there is no such element, and returns it.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableElement/createTBody)
     */
    open fun createTBody(): HTMLTableSectionElement

    /**
     * The **`createTFoot()`** method of the HTMLTableElement interface creates a <tfoot> element, inserts it as the last child of the given <table>, and returns it. If the table already has a <tfoot> element child, this method returns the first such child without creating one.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableElement/createTFoot)
     */
    open fun createTFoot(): HTMLTableSectionElement

    /**
     * The **`createTHead()`** method of the HTMLTableElement interface creates a <thead> element, inserts it before the first element child of the given <table> that's neither a <caption> nor a <colgroup>, or as the last child if no such insertion location is found, and returns it. If the table already has a <thead> element child, this method returns the first such child without creating one.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableElement/createTHead)
     */
    open fun createTHead(): HTMLTableSectionElement

    /**
     * The **`deleteCaption()`** method of the HTMLTableElement interface removes the first <caption> element child from a given <table>, if any.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableElement/deleteCaption)
     */
    open fun deleteCaption()

    /**
     * The **`deleteRow()`** method of the HTMLTableElement interface removes a specific row (<tr>) from a given <table>.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableElement/deleteRow)
     */
    @JsThrows(IndexSizeError::class)
    open fun deleteRow(index: Int)

    /**
     * The **`deleteTFoot()`** method of the HTMLTableElement interface removes the first <tfoot> element child from a given <table>, if any.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableElement/deleteTFoot)
     */
    open fun deleteTFoot()

    /**
     * The **`deleteTHead()`** method of the HTMLTableElement interface removes the first <thead> element child from a given <table>, if any.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableElement/deleteTHead)
     */
    open fun deleteTHead()

    /**
     * The **`insertRow()`** method of the HTMLTableElement interface creates a <tr> element, inserts it at the specified position in the rows collection, and returns it. If the rows collection is empty and the table also has no <tbody> elements, a <tbody> element is first created and inserted.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableElement/insertRow)
     */
    @JsThrows(IndexSizeError::class)
    open fun insertRow(index: Int = definedExternally): HTMLTableRowElement
}
