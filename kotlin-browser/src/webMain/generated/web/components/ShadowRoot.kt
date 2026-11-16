// Automatically generated - do not modify!

package web.components

import js.array.ReadonlyArray
import web.animations.Animation
import web.cssom.CSSStyleSheet
import web.cssom.StyleSheetList
import web.dom.*
import web.events.Event
import web.events.EventHandler
import web.html.HtmlSource
import web.html.SetHTMLUnsafeOptions
import web.trustedtypes.TrustedHTML

/**
 * The **`ShadowRoot`** interface of the Shadow DOM API is the root node of a DOM subtree that is rendered separately from a document's main DOM tree.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ShadowRoot)
 */
open external class ShadowRoot
private constructor() :
    DocumentFragment,
    DocumentOrShadowRoot {
    /**
     * The **`clonable`** read-only property of the ShadowRoot interface returns true if the shadow root is clonable, and false otherwise.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ShadowRoot/clonable)
     */
    open val clonable: Boolean

    /**
     * The **`delegatesFocus`** read-only property of the ShadowRoot interface returns true if the shadow root delegates focus, and false otherwise.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ShadowRoot/delegatesFocus)
     */
    open val delegatesFocus: Boolean

    /**
     * The **`host`** read-only property of the ShadowRoot returns a reference to the DOM element the ShadowRoot is attached to.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ShadowRoot/host)
     */
    open val host: Element

    /**
     * The **`innerHTML`** property of the ShadowRoot interface gets or sets the HTML markup to the DOM tree inside the ShadowRoot.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ShadowRoot/innerHTML)
     */
    open var innerHTML: HtmlSource

    /**
     * The **`mode`** read-only property of the ShadowRoot specifies its mode — either open or closed. This defines whether or not the shadow root's internal features are accessible from JavaScript.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ShadowRoot/mode)
     */
    open val mode: ShadowRootMode
    open var onslotchange: EventHandler<Event, ShadowRoot, Node>?

    /**
     * The **`serializable`** read-only property of the ShadowRoot interface returns true if the shadow root is serializable.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ShadowRoot/serializable)
     */
    open val serializable: Boolean

    /**
     * The read-only **`slotAssignment`** property of the ShadowRoot interface returns the slot assignment mode for the shadow DOM tree. Nodes are either automatically assigned based on name matching (named) or manually assigned (manual).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ShadowRoot/slotAssignment)
     */
    open val slotAssignment: SlotAssignmentMode

    /**
     * The **`getHTML()`** method of the ShadowRoot interface is used to serialize a shadow root's DOM to an HTML string.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ShadowRoot/getHTML)
     */
    open fun getHTML(options: GetHTMLOptions = definedExternally): String

    /**
     * The **`setHTML()`** method of the ShadowRoot interface provides an XSS-safe method to parse and sanitize a string of HTML, which then replaces the existing tree in the Shadow DOM.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ShadowRoot/setHTML)
     */
    open fun setHTML(
        html: String,
        options: SetHTMLOptions = definedExternally,
    )

    /**
     * The **`setHTMLUnsafe()`** method of the ShadowRoot interface can be used to parse HTML input into a DocumentFragment, optionally filtering out unwanted elements and attributes, and then use it to replace the existing tree in the Shadow DOM.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ShadowRoot/setHTMLUnsafe)
     */
    open fun setHTMLUnsafe(
        html: TrustedHTML,
        options: SetHTMLUnsafeOptions = definedExternally,
    )

    /**
     * The **`setHTMLUnsafe()`** method of the ShadowRoot interface can be used to parse HTML input into a DocumentFragment, optionally filtering out unwanted elements and attributes, and then use it to replace the existing tree in the Shadow DOM.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ShadowRoot/setHTMLUnsafe)
     */
    open fun setHTMLUnsafe(
        html: String,
        options: SetHTMLUnsafeOptions = definedExternally,
    )

    /* `DocumentOrShadowRoot` overrides */

    override val activeElement: Element?
    override var adoptedStyleSheets: ReadonlyArray<CSSStyleSheet>
    override val customElementRegistry: CustomElementRegistry?
    override val fullscreenElement: Element?
    override val pictureInPictureElement: Element?
    override val pointerLockElement: Element?
    override val styleSheets: StyleSheetList
    override fun elementFromPoint(
        x: Double,
        y: Double,
    ): Element?

    override fun elementsFromPoint(
        x: Double,
        y: Double,
    ): ReadonlyArray<Element>

    override fun getAnimations(): ReadonlyArray<Animation>
}
