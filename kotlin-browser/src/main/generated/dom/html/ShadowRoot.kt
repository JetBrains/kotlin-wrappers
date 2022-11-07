// Automatically generated - do not modify!

package dom.html

import dom.DocumentFragment
import dom.DocumentOrShadowRoot
import dom.Element
import dom.InnerHTML
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
