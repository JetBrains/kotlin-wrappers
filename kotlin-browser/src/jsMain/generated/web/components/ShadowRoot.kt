// Automatically generated - do not modify!

package web.components

import web.dom.DocumentFragment
import web.dom.DocumentOrShadowRoot
import web.dom.Element
import web.dom.InnerHTML
import web.events.Event
import web.events.EventHandler

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ShadowRoot)
 */
sealed external class ShadowRoot :
    DocumentFragment,
    DocumentOrShadowRoot,
    InnerHTML {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ShadowRoot/delegatesFocus)
     */
    val delegatesFocus: Boolean

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ShadowRoot/host)
     */
    val host: Element

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ShadowRoot/mode)
     */
    val mode: ShadowRootMode
    var onslotchange: EventHandler<Event<ShadowRoot>>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ShadowRoot/slotAssignment)
     */
    val slotAssignment: SlotAssignmentMode
    fun setHTMLUnsafe(html: String)
}
