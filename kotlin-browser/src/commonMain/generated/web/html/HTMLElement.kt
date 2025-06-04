// Automatically generated - do not modify!

package web.html

import web.animations.AnimationEvent
import web.clipboard.ClipboardEvent
import web.components.ElementInternals
import web.cssom.ElementCSSInlineStyle
import web.cssom.TransitionEvent
import web.dom.Element
import web.dom.GlobalEventHandlers
import web.dom.HTMLOrSVGElement
import web.dom.Node
import web.events.Event
import web.events.EventInstance
import web.events.JsEvent
import web.popover.Popover
import web.popover.ToggleEvent
import web.uievents.DragEvent
import web.uievents.PointerEvent
import kotlin.js.definedExternally

/**
 * The **`HTMLElement`** interface represents any HTML element.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement)
 */
open external class HTMLElement
protected constructor() :
    Element,
    ElementCSSInlineStyle,
    ElementContentEditable,
    GlobalEventHandlers,
    HTMLOrSVGElement {
    /**
     * The **`HTMLElement.accessKey`** property sets the keystroke which a user can press to jump to a given element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/accessKey)
     */
    var accessKey: String

    /**
     * The **`HTMLElement.accessKeyLabel`** read-only property returns a string containing the element's browser-assigned access key (if any); otherwise it returns an empty string.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/accessKeyLabel)
     */
    val accessKeyLabel: String

    /**
     * The **`autocapitalize`** property of the HTMLElement interface represents the element's capitalization behavior for user input.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/autocapitalize)
     */
    var autocapitalize: AutoCapitalize

    /**
     * The **`autocorrect`** property of the HTMLElement interface controls whether or not autocorrection of editable text is enabled for spelling and/or punctuation errors.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/autocorrect)
     */
    var autocorrect: Boolean

    /**
     * The **`HTMLElement.dir`** property indicates the text writing directionality of the content of the current element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/dir)
     */
    var dir: String

    /**
     * The **`draggable`** property of the HTMLElement interface gets and sets a Boolean primitive indicating if the element is draggable.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/draggable)
     */
    var draggable: Boolean

    /**
     * The HTMLElement property **`hidden`** reflects the value of the element's `hidden` attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/hidden)
     */
    var hidden: Boolean

    /**
     * The HTMLElement property **`inert`** reflects the value of the element's `inert` attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/inert)
     */
    var inert: Boolean

    /**
     * The **`innerText`** property of the HTMLElement interface represents the rendered text content of a node and its descendants.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/innerText)
     */
    var innerText: String

    /**
     * The **`lang`** property of the HTMLElement interface indicates the base language of an element's attribute values and text content, in the form of a MISSING: RFC(5646, 'BCP 47 language identifier tag')].
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/lang)
     */
    var lang: String

    /**
     * The **`offsetHeight`** read-only property of the HTMLElement interface returns the height of an element, including vertical padding and borders, as an integer.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/offsetHeight)
     */
    val offsetHeight: Int

    /**
     * The **`offsetLeft`** read-only property of the HTMLElement interface returns the number of pixels that the _upper left corner_ of the current element is offset to the left within the HTMLElement.offsetParent node.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/offsetLeft)
     */
    val offsetLeft: Int

    /**
     * The **`HTMLElement.offsetParent`** read-only property returns a reference to the element which is the closest (nearest in the containment hierarchy) positioned ancestor element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/offsetParent)
     */
    val offsetParent: Element?

    /**
     * The **`offsetTop`** read-only property of the HTMLElement interface returns the distance from the outer border of the current element (including its margin) to the top padding edge of the HTMLelement.offsetParent, the _closest positioned_ ancestor element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/offsetTop)
     */
    val offsetTop: Int

    /**
     * The **`offsetWidth`** read-only property of the HTMLElement interface returns the layout width of an element as an integer.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/offsetWidth)
     */
    val offsetWidth: Int

    /**
     * The **`outerText`** property of the HTMLElement interface returns the same value as HTMLElement.innerText.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/outerText)
     */
    var outerText: String

    /**
     * The **`popover`** property of the HTMLElement interface gets and sets an element's popover state via JavaScript (`'auto'`, `'hint'`, or `'manual'`), and can be used for feature detection.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/popover)
     */
    var popover: Popover?

    /**
     * The **`spellcheck`** property of the HTMLElement interface represents a boolean value that controls the spell-checking hint.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/spellcheck)
     */
    var spellcheck: Boolean

    /**
     * The **`HTMLElement.title`** property represents the title of the element: the text usually displayed in a 'tooltip' popup when the mouse is over the node.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/title)
     */
    var title: String

    /**
     * The **`translate`** property of the HTMLElement interface indicates whether an element's attribute values and the values of its Text node children are to be translated when the page is localized, or whether to leave them unchanged.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/translate)
     */
    var translate: Boolean

    /**
     * The **`writingSuggestions`** property of the HTMLElement interface is a string indicating if browser-provided writing suggestions should be enabled under the scope of the element or not.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/writingSuggestions)
     */
    var writingSuggestions: String

    /**
     * The **`HTMLElement.attachInternals()`** method returns an ElementInternals object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/attachInternals)
     */
    fun attachInternals(): ElementInternals

    /**
     * The **`HTMLElement.click()`** method simulates a mouse click on an element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/click)
     */
    fun click()

    /**
     * The **`hidePopover()`** method of the HTMLElement interface hides a popover element (i.e., one that has a valid `popover` attribute) by removing it from the top layer and styling it with `display: none`.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/hidePopover)
     */
    fun hidePopover()

    /**
     * The **`showPopover()`** method of the HTMLElement interface shows a Popover_API element (i.e., one that has a valid `popover` attribute) by adding it to the top layer.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/showPopover)
     */
    fun showPopover()

    /**
     * The **`togglePopover()`** method of the HTMLElement interface toggles a Popover_API element (i.e., one that has a valid `popover` attribute) between the hidden and showing states.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/togglePopover)
     */
    fun togglePopover(options: Boolean = definedExternally): Boolean

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/animationcancel_event)
     */
    @JsEvent("animationcancel")
    val animationCancelEvent: EventInstance<AnimationEvent, HTMLElement /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/animationend_event)
     */
    @JsEvent("animationend")
    val animationEndEvent: EventInstance<AnimationEvent, HTMLElement /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/animationiteration_event)
     */
    @JsEvent("animationiteration")
    val animationIterationEvent: EventInstance<AnimationEvent, HTMLElement /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/animationstart_event)
     */
    @JsEvent("animationstart")
    val animationStartEvent: EventInstance<AnimationEvent, HTMLElement /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/beforematch_event)
     */
    @JsEvent("beforematch")
    val beforeMatchEvent: EventInstance<Event, HTMLElement /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/beforetoggle_event)
     */
    @JsEvent("beforetoggle")
    val beforeToggleEvent: EventInstance<ToggleEvent, HTMLElement /* this */, HTMLElement /* this */>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/copy_event)
     */
    @JsEvent("copy")
    val copyEvent: EventInstance<ClipboardEvent, HTMLElement /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/cut_event)
     */
    @JsEvent("cut")
    val cutEvent: EventInstance<ClipboardEvent, HTMLElement /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/drag_event)
     */
    @JsEvent("drag")
    val dragEvent: EventInstance<DragEvent, HTMLElement /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/dragend_event)
     */
    @JsEvent("dragend")
    val dragEndEvent: EventInstance<DragEvent, HTMLElement /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/dragenter_event)
     */
    @JsEvent("dragenter")
    val dragEnterEvent: EventInstance<DragEvent, HTMLElement /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/dragleave_event)
     */
    @JsEvent("dragleave")
    val dragLeaveEvent: EventInstance<DragEvent, HTMLElement /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/dragover_event)
     */
    @JsEvent("dragover")
    val dragOverEvent: EventInstance<DragEvent, HTMLElement /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/dragstart_event)
     */
    @JsEvent("dragstart")
    val dragStartEvent: EventInstance<DragEvent, HTMLElement /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/drop_event)
     */
    @JsEvent("drop")
    val dropEvent: EventInstance<DragEvent, HTMLElement /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/gotpointercapture_event)
     */
    @JsEvent("gotpointercapture")
    val gotPointerCaptureEvent: EventInstance<PointerEvent, HTMLElement /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/lostpointercapture_event)
     */
    @JsEvent("lostpointercapture")
    val lostPointerCaptureEvent: EventInstance<PointerEvent, HTMLElement /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/paste_event)
     */
    @JsEvent("paste")
    val pasteEvent: EventInstance<ClipboardEvent, HTMLElement /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/pointercancel_event)
     */
    @JsEvent("pointercancel")
    val pointerCancelEvent: EventInstance<PointerEvent, HTMLElement /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/pointerdown_event)
     */
    @JsEvent("pointerdown")
    val pointerDownEvent: EventInstance<PointerEvent, HTMLElement /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/pointerenter_event)
     */
    @JsEvent("pointerenter")
    val pointerEnterEvent: EventInstance<PointerEvent, HTMLElement /* this */, HTMLElement /* this */>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/pointerleave_event)
     */
    @JsEvent("pointerleave")
    val pointerLeaveEvent: EventInstance<PointerEvent, HTMLElement /* this */, HTMLElement /* this */>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/pointermove_event)
     */
    @JsEvent("pointermove")
    val pointerMoveEvent: EventInstance<PointerEvent, HTMLElement /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/pointerout_event)
     */
    @JsEvent("pointerout")
    val pointerOutEvent: EventInstance<PointerEvent, HTMLElement /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/pointerover_event)
     */
    @JsEvent("pointerover")
    val pointerOverEvent: EventInstance<PointerEvent, HTMLElement /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/pointerup_event)
     */
    @JsEvent("pointerup")
    val pointerUpEvent: EventInstance<PointerEvent, HTMLElement /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/selectionchange_event)
     */
    @JsEvent("selectionchange")
    val selectionChangeEvent: EventInstance<Event, HTMLElement /* this */, HTMLElement /* this */>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/selectstart_event)
     */
    @JsEvent("selectstart")
    val selectStartEvent: EventInstance<Event, HTMLElement /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/transitioncancel_event)
     */
    @JsEvent("transitioncancel")
    val transitionCancelEvent: EventInstance<TransitionEvent, HTMLElement /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/transitionend_event)
     */
    @JsEvent("transitionend")
    val transitionEndEvent: EventInstance<TransitionEvent, HTMLElement /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/transitionrun_event)
     */
    @JsEvent("transitionrun")
    val transitionRunEvent: EventInstance<TransitionEvent, HTMLElement /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/transitionstart_event)
     */
    @JsEvent("transitionstart")
    val transitionStartEvent: EventInstance<TransitionEvent, HTMLElement /* this */, Node>
}
