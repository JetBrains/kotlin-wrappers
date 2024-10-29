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
import web.uievents.DragEvent
import web.uievents.PointerEvent
import web.uievents.ToggleEvent

/**
 * Any HTML element. Some elements directly implement this interface, while others implement it via an interface that inherits it.
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
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/accessKey)
     */
    var accessKey: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/accessKeyLabel)
     */
    val accessKeyLabel: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/autocapitalize)
     */
    var autocapitalize: AutoCapitalize

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/dir)
     */
    var dir: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/draggable)
     */
    var draggable: Boolean

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/hidden)
     */
    var hidden: Boolean

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/inert)
     */
    var inert: Boolean

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/innerText)
     */
    var innerText: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/lang)
     */
    var lang: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/offsetHeight)
     */
    val offsetHeight: Int

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/offsetLeft)
     */
    val offsetLeft: Int

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/offsetParent)
     */
    val offsetParent: Element?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/offsetTop)
     */
    val offsetTop: Int

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/offsetWidth)
     */
    val offsetWidth: Int

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/outerText)
     */
    var outerText: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/popover)
     */
    var popover: String?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/spellcheck)
     */
    var spellcheck: Boolean

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/title)
     */
    var title: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/translate)
     */
    var translate: Boolean
    var writingSuggestions: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/attachInternals)
     */
    fun attachInternals(): ElementInternals

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/click)
     */
    fun click()

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/hidePopover)
     */
    fun hidePopover()

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/showPopover)
     */
    fun showPopover()

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/togglePopover)
     */
    fun togglePopover(force: Boolean = definedExternally): Boolean

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
