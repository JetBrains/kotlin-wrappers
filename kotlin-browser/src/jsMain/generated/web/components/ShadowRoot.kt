// Automatically generated - do not modify!

package web.components

import web.dom.DocumentFragment
import web.dom.DocumentOrShadowRoot
import web.dom.Element
import web.dom.GetHTMLOptions
import web.events.Event
import web.events.EventHandler
import web.events.EventTarget

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ShadowRoot)
 */
sealed external class ShadowRoot :
    DocumentFragment,
    DocumentOrShadowRoot {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ShadowRoot/clonable)
     */
    val clonable: Boolean

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ShadowRoot/delegatesFocus)
     */
    val delegatesFocus: Boolean

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ShadowRoot/host)
     */
    val host: Element

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ShadowRoot/innerHTML)
     */
    var innerHTML: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ShadowRoot/mode)
     */
    val mode: ShadowRootMode
    var onslotchange: EventHandler<Event, ShadowRoot, EventTarget>?
    val serializable: Boolean

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ShadowRoot/slotAssignment)
     */
    val slotAssignment: SlotAssignmentMode
    fun getHTML(options: GetHTMLOptions = definedExternally): String
    fun setHTMLUnsafe(html: String)
}
