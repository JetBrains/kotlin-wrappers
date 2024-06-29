// Automatically generated - do not modify!

package web.components

import web.dom.*
import web.events.Event
import web.events.EventHandler

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
    var onslotchange: EventHandler<Event, ShadowRoot, Node>?
    val serializable: Boolean

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ShadowRoot/slotAssignment)
     */
    val slotAssignment: SlotAssignmentMode
    fun getHTML(options: GetHTMLOptions = definedExternally): String
    fun setHTMLUnsafe(html: String)
}
