// Automatically generated - do not modify!

package web.html

import web.dom.DocumentFragment
import web.dom.DocumentOrShadowRoot
import web.dom.Element
import web.dom.InnerHTML
import web.events.Event
import web.events.EventHandler

sealed external class ShadowRoot :
    DocumentFragment,
    DocumentOrShadowRoot,
    InnerHTML {
    val delegatesFocus: Boolean
    val host: Element
    val mode: ShadowRootMode
    var onslotchange: EventHandler<Event>?
    val slotAssignment: SlotAssignmentMode
}
