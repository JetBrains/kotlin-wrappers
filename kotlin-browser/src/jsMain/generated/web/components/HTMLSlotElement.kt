// Automatically generated - do not modify!

package web.components

import js.array.ReadonlyArray
import web.dom.Element
import web.dom.Node
import web.events.Event
import web.events.EventInstance
import web.events.JsEvent
import web.html.HTMLElement

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLSlotElement)
 */
open external class HTMLSlotElement
protected constructor() :
    HTMLElement {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLSlotElement/name)
     */
    var name: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLSlotElement/assign)
     */
    fun assign(vararg nodes: Element /* | Text */)

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLSlotElement/assignedElements)
     */
    fun assignedElements(options: AssignedNodesOptions = definedExternally): ReadonlyArray<Element>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLSlotElement/assignedNodes)
     */
    fun assignedNodes(options: AssignedNodesOptions = definedExternally): ReadonlyArray<Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLSlotElement/slotchange_event)
     */
    @JsEvent("slotchange")
    val slotChangeEvent: EventInstance<Event, HTMLSlotElement /* this */, Node>
}
