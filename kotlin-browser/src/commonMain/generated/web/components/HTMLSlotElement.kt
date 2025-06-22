// Automatically generated - do not modify!

package web.components

import js.array.ReadonlyArray
import web.dom.Element
import web.dom.Node
import web.dom.Text
import web.events.Event
import web.events.EventInstance
import web.html.HTMLElement
import kotlin.js.definedExternally

/**
 * The **`HTMLSlotElement`** interface of the Shadow DOM API enables access to the name and assigned nodes of an HTML slot element.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLSlotElement)
 */
open external class HTMLSlotElement
protected constructor() :
    HTMLElement {
    /**
     * The **`name`** property of the HTMLSlotElement interface returns or sets the slot name.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLSlotElement/name)
     */
    var name: String

    /**
     * The **`assign()`** method of the HTMLSlotElement interface sets the slot's _manually assigned nodes_ to an ordered set of slottables.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLSlotElement/assign)
     */
    fun assign(vararg nodes: Element)
    fun assign(vararg nodes: Text)

    /**
     * The **`assignedElements()`** method of the HTMLSlotElement interface returns a sequence of the elements assigned to this slot (and no other nodes).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLSlotElement/assignedElements)
     */
    fun assignedElements(options: AssignedNodesOptions = definedExternally): ReadonlyArray<Element>

    /**
     * The **`assignedNodes()`** method of the HTMLSlotElement interface returns a sequence of the nodes assigned to this slot.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLSlotElement/assignedNodes)
     */
    fun assignedNodes(options: AssignedNodesOptions = definedExternally): ReadonlyArray<Node>
}

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLSlotElement/slotchange_event)
 */
inline val <C : HTMLSlotElement> C.slotChangeEvent: EventInstance<Event, C, Node>
    get() = EventInstance(this, "slotchange")
