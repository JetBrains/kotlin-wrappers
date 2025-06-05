// Automatically generated - do not modify!

package web.components

import web.dom.*
import web.events.Event
import web.events.EventHandler
import kotlin.js.definedExternally

/**
 * The **`ShadowRoot`** interface of the Shadow DOM API is the root node of a DOM subtree that is rendered separately from a document's main DOM tree.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ShadowRoot)
 */
external class ShadowRoot
private constructor() :
    DocumentFragment,
    DocumentOrShadowRoot {
    /**
     * The **`clonable`** read-only property of the ShadowRoot interface returns `true` if the shadow root is clonable, and `false` otherwise.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ShadowRoot/clonable)
     */
    val clonable: Boolean

    /**
     * The **`delegatesFocus`** read-only property of the ShadowRoot interface returns `true` if the shadow root delegates focus, and `false` otherwise.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ShadowRoot/delegatesFocus)
     */
    val delegatesFocus: Boolean

    /**
     * The **`host`** read-only property of the ShadowRoot returns a reference to the DOM element the `ShadowRoot` is attached to.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ShadowRoot/host)
     */
    val host: Element

    /**
     * The **`innerHTML`** property of the ShadowRoot interface sets gets or sets the HTML markup to the DOM tree inside the `ShadowRoot`.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ShadowRoot/innerHTML)
     */
    var innerHTML: String

    /**
     * The **`mode`** read-only property of the ShadowRoot specifies its mode — either `open` or `closed`.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ShadowRoot/mode)
     */
    val mode: ShadowRootMode
    var onslotchange: EventHandler<Event, ShadowRoot, Node>?

    /**
     * The **`serializable`** read-only property of the ShadowRoot interface returns `true` if the shadow root is serializable.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ShadowRoot/serializable)
     */
    val serializable: Boolean

    /**
     * The read-only **`slotAssignment`** property of the ShadowRoot interface returns the _slot assignment mode_ for the shadow DOM tree.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ShadowRoot/slotAssignment)
     */
    val slotAssignment: SlotAssignmentMode

    /**
     * The **`getHTML()`** method of the ShadowRoot interface is used to serialize a shadow root's DOM to an HTML string.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ShadowRoot/getHTML)
     */
    fun getHTML(options: GetHTMLOptions = definedExternally): String

    /**
     * The **`setHTMLUnsafe()`** method of the ShadowRoot interface is used to parse a string of HTML into a DocumentFragment, which then replaces the element's subtree in the DOM.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ShadowRoot/setHTMLUnsafe)
     */
    fun setHTMLUnsafe(html: String)
}
