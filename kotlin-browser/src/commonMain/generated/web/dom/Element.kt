// Automatically generated - do not modify!

package web.dom

import js.array.ReadonlyArray
import js.core.JsString
import js.core.Void
import js.promise.Promise
import seskar.js.JsAsync
import web.aria.ARIAMixin
import web.components.ShadowRoot
import web.components.ShadowRootInit
import web.components.Slottable
import web.cssom.ClassName
import web.cssom.StylePropertyMapReadOnly
import web.events.Event
import web.events.EventHandler
import web.events.EventInstance
import web.events.JsEvent
import web.fullscreen.FullscreenOptions
import web.geometry.DOMRect
import web.geometry.DOMRectList
import web.html.HTMLCollection
import web.html.HTMLElement
import web.html.HtmlTagName
import web.mathml.MATHML_NAMESPACE
import web.mathml.MathMLElement
import web.mathml.MathMLTagName
import web.scroll.ScrollIntoViewOptions
import web.scroll.ScrollToOptions
import web.svg.SVGElement
import web.svg.SVG_NAMESPACE
import web.svg.SvgTagName
import web.uievents.*
import kotlin.js.JsName
import kotlin.js.definedExternally

/**
 * **`Element`** is the most general base class from which all element objects (i.e., objects that represent elements) in a Document inherit.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element)
 */
open external class Element
private constructor() :
    Node,
    ARIAMixin,
    Animatable,
    ChildNode,
    NonDocumentTypeChildNode,
    ParentNode,
    Slottable {
    /**
     * The **`Element.attributes`** property returns a live collection of all attribute nodes registered to the specified node.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/attributes)
     */
    val attributes: NamedNodeMap

    /**
     * The **`Element.classList`** is a read-only property that returns a live DOMTokenList collection of the `class` attributes of the element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/classList)
     */
    val classList: DOMTokenList<ClassName>

    /**
     * The **`className`** property of the of the specified element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/className)
     */
    var className: ClassName

    /**
     * The **`clientHeight`** read-only property of the Element interface is zero for elements with no CSS or inline layout boxes; otherwise, it's the inner height of an element in pixels.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/clientHeight)
     */
    val clientHeight: Int

    /**
     * The **`clientLeft`** read-only property of the Element interface returns the width of the left border of an element in pixels.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/clientLeft)
     */
    val clientLeft: Int

    /**
     * The **`clientTop`** read-only property of the Element interface returns the width of the top border of an element in pixels.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/clientTop)
     */
    val clientTop: Int

    /**
     * The **`clientWidth`** read-only property of the Element interface is zero for inline elements and elements with no CSS; otherwise, it's the inner width of an element in pixels.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/clientWidth)
     */
    val clientWidth: Int

    /**
     * The **`currentCSSZoom`** read-only property of the Element interface provides the 'effective' CSS `zoom` of an element, taking into account the zoom applied to the element and all its parent elements.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/currentCSSZoom)
     */
    val currentCSSZoom: Double

    /**
     * The **`id`** property of the Element interface represents the element's identifier, reflecting the **`id`** global attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/id)
     */
    var id: ElementId

    /**
     * The **`innerHTML`** property of the Element interface gets or sets the HTML or XML markup contained within the element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/innerHTML)
     */
    var innerHTML: String

    /**
     * The **`Element.localName`** read-only property returns the local part of the qualified name of an element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/localName)
     */
    val localName: String

    /**
     * The **`Element.namespaceURI`** read-only property returns the namespace URI of the element, or `null` if the element is not in a namespace.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/namespaceURI)
     */
    val namespaceURI: String?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/fullscreenchange_event)
     */
    var onfullscreenchange: EventHandler<Event, Element, Node>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/fullscreenerror_event)
     */
    var onfullscreenerror: EventHandler<Event, Element, Node>?

    /**
     * The **`outerHTML`** attribute of the Element DOM interface gets the serialized HTML fragment describing the element including its descendants.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/outerHTML)
     */
    var outerHTML: String
    override val ownerDocument: Document

    /**
     * The **`part`** property of the Element interface represents the part identifier(s) of the element (i.e., set using the `part` attribute), returned as a DOMTokenList.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/part)
     */
    val part: DOMTokenList<JsString>

    /**
     * The **`Element.prefix`** read-only property returns the namespace prefix of the specified element, or `null` if no prefix is specified.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/prefix)
     */
    val prefix: String?

    /**
     * The **`scrollHeight`** read-only property of the Element interface is a measurement of the height of an element's content, including content not visible on the screen due to overflow.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/scrollHeight)
     */
    val scrollHeight: Int

    /**
     * The **`scrollLeft`** property of the Element interface gets or sets the number of pixels by which an element's content is scrolled from its left edge.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/scrollLeft)
     */
    var scrollLeft: Double

    /**
     * The **`scrollTop`** property of the Element interface gets or sets the number of pixels by which an element's content is scrolled from its top edge.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/scrollTop)
     */
    var scrollTop: Double

    /**
     * The **`scrollWidth`** read-only property of the Element interface is a measurement of the width of an element's content, including content not visible on the screen due to overflow.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/scrollWidth)
     */
    val scrollWidth: Int

    /**
     * The `Element.shadowRoot` read-only property represents the shadow root hosted by the element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/shadowRoot)
     */
    val shadowRoot: ShadowRoot?

    /**
     * The **`slot`** property of the Element interface returns the name of the shadow DOM slot the element is inserted in.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/slot)
     */
    var slot: String

    /**
     * The **`tagName`** read-only property of the Element interface returns the tag name of the element on which it's called.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/tagName)
     */
    val tagName: String

    /**
     * The **`Element.attachShadow()`** method attaches a shadow DOM tree to the specified element and returns a reference to its ShadowRoot.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/attachShadow)
     */
    fun attachShadow(init: ShadowRootInit): ShadowRoot

    /**
     * The **`checkVisibility()`** method of the Element interface checks whether the element is visible.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/checkVisibility)
     */
    fun checkVisibility(options: CheckVisibilityOptions = definedExternally): Boolean

    /**
     * The **`closest()`** method of the Element interface traverses the element and its parents (heading toward the document root) until it finds a node that matches the specified CSS selector.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/closest)
     */
    fun <T : HTMLElement> closest(selector: HtmlTagName<T>): T?
    fun <T : SVGElement> closest(selector: SvgTagName<T>): T?
    fun <T : MathMLElement> closest(selector: MathMLTagName<T>): T?
    fun closest(selector: String): Element?

    /**
     * The **`computedStyleMap()`** method of the Element interface returns a StylePropertyMapReadOnly interface which provides a read-only representation of a CSS declaration block that is an alternative to CSSStyleDeclaration.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/computedStyleMap)
     */
    fun computedStyleMap(): StylePropertyMapReadOnly

    /**
     * The **`getAttribute()`** method of the element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/getAttribute)
     */
    fun getAttribute(qualifiedName: String): String?

    /**
     * The **`getAttributeNS()`** method of the Element interface returns the string value of the attribute with the specified namespace and name.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/getAttributeNS)
     */
    fun getAttributeNS(
        namespace: String?,
        localName: String,
    ): String?

    /**
     * The **`getAttributeNames()`** method of the array.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/getAttributeNames)
     */
    fun getAttributeNames(): ReadonlyArray<JsString>

    /**
     * Returns the specified attribute of the specified element, as an Attr node.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/getAttributeNode)
     */
    fun getAttributeNode(qualifiedName: String): Attr?

    /**
     * The **`getAttributeNodeNS()`** method of the Element interface returns the namespaced Attr node of an element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/getAttributeNodeNS)
     */
    fun getAttributeNodeNS(
        namespace: String?,
        localName: String,
    ): Attr?

    /**
     * The **`Element.getBoundingClientRect()`** method returns a position relative to the viewport.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/getBoundingClientRect)
     */
    fun getBoundingClientRect(): DOMRect

    /**
     * The **`getClientRects()`** method of the Element interface returns a collection of DOMRect objects that indicate the bounding rectangles for each CSS border box in a client.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/getClientRects)
     */
    fun getClientRects(): DOMRectList

    /**
     * The Element method **`getElementsByClassName()`** returns a live specified class name or names.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/getElementsByClassName)
     */
    fun getElementsByClassName(classNames: ClassName): HTMLCollection<Element>

    /**
     * The **`Element.getElementsByTagName()`** method returns a live All descendants of the specified element are searched, but not the element itself.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/getElementsByTagName)
     */
    fun <T : HTMLElement> getElementsByTagName(qualifiedName: HtmlTagName<T>): HTMLCollection<T>
    fun <T : SVGElement> getElementsByTagName(qualifiedName: SvgTagName<T>): HTMLCollection<T>
    fun <T : MathMLElement> getElementsByTagName(qualifiedName: MathMLTagName<T>): HTMLCollection<T>
    fun getElementsByTagName(qualifiedName: String): HTMLCollection<Element>
    fun <T : SVGElement> getElementsByTagNameNS(
        namespaceURI: SVG_NAMESPACE,
        localName: SvgTagName<T>,
    ): HTMLCollection<T>

    fun <T : MathMLElement> getElementsByTagNameNS(
        namespaceURI: MATHML_NAMESPACE,
        localName: MathMLTagName<T>,
    ): HTMLCollection<T>

    fun getElementsByTagNameNS(
        namespace: String?,
        localName: String,
    ): HTMLCollection<Element>

    /**
     * The **`getHTML()`** method of the Element interface is used to serialize an element's DOM to an HTML string.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/getHTML)
     */
    fun getHTML(options: GetHTMLOptions = definedExternally): String

    /**
     * The **`Element.hasAttribute()`** method returns a **Boolean** value indicating whether the specified element has the specified attribute or not.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/hasAttribute)
     */
    fun hasAttribute(qualifiedName: String): Boolean

    /**
     * The **`hasAttributeNS()`** method of the Element interface returns a boolean value indicating whether the current element has the specified attribute with the specified namespace.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/hasAttributeNS)
     */
    fun hasAttributeNS(
        namespace: String?,
        localName: String,
    ): Boolean

    /**
     * The **`hasAttributes()`** method of the Element interface returns a boolean value indicating whether the current element has any attributes or not.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/hasAttributes)
     */
    fun hasAttributes(): Boolean

    /**
     * The **`hasPointerCapture()`** method of the pointer capture for the pointer identified by the given pointer ID.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/hasPointerCapture)
     */
    fun hasPointerCapture(pointerId: Int): Boolean

    /**
     * The **`insertAdjacentElement()`** method of the relative to the element it is invoked upon.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/insertAdjacentElement)
     */
    fun insertAdjacentElement(
        where: InsertPosition,
        element: Element,
    ): Element?

    /**
     * The **`insertAdjacentHTML()`** method of the the resulting nodes into the DOM tree at a specified position.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/insertAdjacentHTML)
     */
    fun insertAdjacentHTML(
        position: InsertPosition,
        string: String,
    )

    /**
     * The **`insertAdjacentText()`** method of the Element interface, given a relative position and a string, inserts a new text node at the given position relative to the element it is called from.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/insertAdjacentText)
     */
    fun insertAdjacentText(
        where: InsertPosition,
        data: String,
    )

    /**
     * The **`matches()`** method of the Element interface tests whether the element would be selected by the specified CSS selector.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/matches)
     */
    fun matches(selectors: String): Boolean

    /**
     * The **`releasePointerCapture()`** method of the previously set for a specific (PointerEvent) _pointer_.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/releasePointerCapture)
     */
    fun releasePointerCapture(pointerId: Int)

    /**
     * The Element method **`removeAttribute()`** removes the attribute with the specified name from the element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/removeAttribute)
     */
    fun removeAttribute(qualifiedName: String)

    /**
     * The **`removeAttributeNS()`** method of the If you are working with HTML and you don't need to specify the requested attribute as being part of a specific namespace, use the Element.removeAttribute() method instead.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/removeAttributeNS)
     */
    fun removeAttributeNS(
        namespace: String?,
        localName: String,
    )

    /**
     * The **`removeAttributeNode()`** method of the Element interface removes the specified Attr node from the element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/removeAttributeNode)
     */
    fun removeAttributeNode(attr: Attr): Attr

    /**
     * The **`Element.requestFullscreen()`** method issues an asynchronous request to make the element be displayed in fullscreen mode.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/requestFullscreen)
     */
    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun requestFullscreen(options: FullscreenOptions = definedExternally)

    @JsName("requestFullscreen")
    fun requestFullscreenAsync(options: FullscreenOptions = definedExternally): Promise<Void>

    /**
     * The **`requestPointerLock()`** method of the Element interface lets you asynchronously ask for the pointer to be locked on the given element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/requestPointerLock)
     */
    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun requestPointerLock(options: PointerLockOptions = definedExternally)

    @JsName("requestPointerLock")
    fun requestPointerLockAsync(options: PointerLockOptions = definedExternally): Promise<Void>

    /**
     * The **`scroll()`** method of the Element interface scrolls the element to a particular set of coordinates inside a given element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/scroll)
     */
    fun scroll(options: ScrollToOptions = definedExternally)
    fun scroll(
        x: Double,
        y: Double,
    )

    /**
     * The **`scrollBy()`** method of the Element interface scrolls an element by the given amount.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/scrollBy)
     */
    fun scrollBy(options: ScrollToOptions = definedExternally)
    fun scrollBy(
        x: Double,
        y: Double,
    )

    /**
     * The Element interface's **`scrollIntoView()`** method scrolls the element's ancestor containers such that the element on which `scrollIntoView()` is called is visible to the user.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/scrollIntoView)
     */
    fun scrollIntoView(options: ScrollIntoViewOptions = definedExternally)

    /**
     * The **`scrollTo()`** method of the Element interface scrolls to a particular set of coordinates inside a given element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/scrollTo)
     */
    fun scrollTo(options: ScrollToOptions = definedExternally)
    fun scrollTo(
        x: Double,
        y: Double,
    )

    /**
     * The **`setAttribute()`** method of the Element interface sets the value of an attribute on the specified element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/setAttribute)
     */
    fun setAttribute(
        qualifiedName: String,
        value: String,
    )

    /**
     * `setAttributeNS` adds a new attribute or changes the value of an attribute with the given namespace and name.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/setAttributeNS)
     */
    fun setAttributeNS(
        namespace: String?,
        qualifiedName: String,
        value: String,
    )

    /**
     * The **`setAttributeNode()`** method of the Element interface adds a new Attr node to the specified element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/setAttributeNode)
     */
    fun setAttributeNode(attr: Attr): Attr?

    /**
     * The **`setAttributeNodeNS()`** method of the Element interface adds a new namespaced Attr node to an element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/setAttributeNodeNS)
     */
    fun setAttributeNodeNS(attr: Attr): Attr?

    /**
     * The **`setHTMLUnsafe()`** method of the Element interface is used to parse a string of HTML into a DocumentFragment, which then replaces the element's subtree in the DOM.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/setHTMLUnsafe)
     */
    fun setHTMLUnsafe(html: String)

    /**
     * The **`setPointerCapture()`** method of the _capture target_ of future pointer events.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/setPointerCapture)
     */
    fun setPointerCapture(pointerId: Int)

    /**
     * The **`toggleAttribute()`** method of the present and adding it if it is not present) on the given element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/toggleAttribute)
     */
    fun toggleAttribute(
        qualifiedName: String,
        force: Boolean = definedExternally,
    ): Boolean

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/abort_event)
     */
    @JsEvent("abort")
    open val abortEvent: EventInstance<Event, Element /* this */, Element /* this */>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/auxclick_event)
     */
    @JsEvent("auxclick")
    open val auxClickEvent: EventInstance<MouseEvent, Element /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/beforeinput_event)
     */
    @JsEvent("beforeinput")
    open val beforeInputEvent: EventInstance<InputEvent, Element /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/blur_event)
     */
    @JsEvent("blur")
    open val blurEvent: EventInstance<FocusEvent, Element /* this */, Element /* this */>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/click_event)
     */
    @JsEvent("click")
    open val clickEvent: EventInstance<MouseEvent, Element /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/compositionend_event)
     */
    @JsEvent("compositionend")
    open val compositionEndEvent: EventInstance<CompositionEvent, Element /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/compositionstart_event)
     */
    @JsEvent("compositionstart")
    open val compositionStartEvent: EventInstance<CompositionEvent, Element /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/compositionupdate_event)
     */
    @JsEvent("compositionupdate")
    open val compositionUpdateEvent: EventInstance<CompositionEvent, Element /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/contextmenu_event)
     */
    @JsEvent("contextmenu")
    open val contextMenuEvent: EventInstance<MouseEvent, Element /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/dblclick_event)
     */
    @JsEvent("dblclick")
    open val dblClickEvent: EventInstance<MouseEvent, Element /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/error_event)
     */
    @JsEvent("error")
    open val errorEvent: EventInstance<Event, Element /* this */, Element /* this */>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/focus_event)
     */
    @JsEvent("focus")
    open val focusEvent: EventInstance<FocusEvent, Element /* this */, Element /* this */>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/focusin_event)
     */
    @JsEvent("focusin")
    open val focusInEvent: EventInstance<FocusEvent, Element /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/focusout_event)
     */
    @JsEvent("focusout")
    open val focusOutEvent: EventInstance<FocusEvent, Element /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/fullscreenchange_event)
     */
    @JsEvent("fullscreenchange")
    open val fullscreenChangeEvent: EventInstance<Event, Element /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/fullscreenerror_event)
     */
    @JsEvent("fullscreenerror")
    open val fullscreenErrorEvent: EventInstance<Event, Element /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/input_event)
     */
    @JsEvent("input")
    open val inputEvent: EventInstance<InputEvent, Element /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/keydown_event)
     */
    @JsEvent("keydown")
    open val keyDownEvent: EventInstance<KeyboardEvent, Element /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/keypress_event)
     */
    @JsEvent("keypress")
    open val keyPressEvent: EventInstance<KeyboardEvent, Element /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/keyup_event)
     */
    @JsEvent("keyup")
    open val keyUpEvent: EventInstance<KeyboardEvent, Element /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/load_event)
     */
    @JsEvent("load")
    open val loadEvent: EventInstance<Event, Element /* this */, Element /* this */>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/mousedown_event)
     */
    @JsEvent("mousedown")
    open val mouseDownEvent: EventInstance<MouseEvent, Element /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/mouseenter_event)
     */
    @JsEvent("mouseenter")
    open val mouseEnterEvent: EventInstance<MouseEvent, Element /* this */, Element /* this */>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/mouseleave_event)
     */
    @JsEvent("mouseleave")
    open val mouseLeaveEvent: EventInstance<MouseEvent, Element /* this */, Element /* this */>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/mousemove_event)
     */
    @JsEvent("mousemove")
    open val mouseMoveEvent: EventInstance<MouseEvent, Element /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/mouseout_event)
     */
    @JsEvent("mouseout")
    open val mouseOutEvent: EventInstance<MouseEvent, Element /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/mouseover_event)
     */
    @JsEvent("mouseover")
    open val mouseOverEvent: EventInstance<MouseEvent, Element /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/mouseup_event)
     */
    @JsEvent("mouseup")
    open val mouseUpEvent: EventInstance<MouseEvent, Element /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/scroll_event)
     */
    @JsEvent("scroll")
    open val scrollEvent: EventInstance<Event, Element /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/scrollend_event)
     */
    @JsEvent("scrollend")
    open val scrollEndEvent: EventInstance<Event, Element /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/select_event)
     */
    @JsEvent("select")
    open val selectEvent: EventInstance<Event, Element /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/touchcancel_event)
     */
    @JsEvent("touchcancel")
    open val touchCancelEvent: EventInstance<TouchEvent, Element /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/touchend_event)
     */
    @JsEvent("touchend")
    open val touchEndEvent: EventInstance<TouchEvent, Element /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/touchmove_event)
     */
    @JsEvent("touchmove")
    open val touchMoveEvent: EventInstance<TouchEvent, Element /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/touchstart_event)
     */
    @JsEvent("touchstart")
    open val touchStartEvent: EventInstance<TouchEvent, Element /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/unload_event)
     */
    @JsEvent("unload")
    open val unloadEvent: EventInstance<Event, Element /* this */, Element /* this */>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/wheel_event)
     */
    @JsEvent("wheel")
    open val wheelEvent: EventInstance<WheelEvent, Element /* this */, Node>
}
