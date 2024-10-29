// Automatically generated - do not modify!

package web.svg

import web.animations.AnimationEvent
import web.clipboard.ClipboardEvent
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

/**
 * All of the SVG DOM interfaces that correspond directly to elements in the SVG language derive from the SVGElement interface.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGElement)
 */
open external class SVGElement
private constructor() :
    Element,
    ElementCSSInlineStyle,
    GlobalEventHandlers,
    HTMLOrSVGElement {
    val ownerSVGElement: SVGSVGElement?
    val viewportElement: SVGElement?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGElement/animationcancel_event)
     */
    @JsEvent("animationcancel")
    val animationCancelEvent: EventInstance<AnimationEvent, SVGElement /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGElement/animationend_event)
     */
    @JsEvent("animationend")
    val animationEndEvent: EventInstance<AnimationEvent, SVGElement /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGElement/animationiteration_event)
     */
    @JsEvent("animationiteration")
    val animationIterationEvent: EventInstance<AnimationEvent, SVGElement /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGElement/animationstart_event)
     */
    @JsEvent("animationstart")
    val animationStartEvent: EventInstance<AnimationEvent, SVGElement /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGElement/copy_event)
     */
    @JsEvent("copy")
    val copyEvent: EventInstance<ClipboardEvent, SVGElement /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGElement/cut_event)
     */
    @JsEvent("cut")
    val cutEvent: EventInstance<ClipboardEvent, SVGElement /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGElement/drag_event)
     */
    @JsEvent("drag")
    val dragEvent: EventInstance<DragEvent, SVGElement /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGElement/dragend_event)
     */
    @JsEvent("dragend")
    val dragEndEvent: EventInstance<DragEvent, SVGElement /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGElement/dragenter_event)
     */
    @JsEvent("dragenter")
    val dragEnterEvent: EventInstance<DragEvent, SVGElement /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGElement/dragleave_event)
     */
    @JsEvent("dragleave")
    val dragLeaveEvent: EventInstance<DragEvent, SVGElement /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGElement/dragover_event)
     */
    @JsEvent("dragover")
    val dragOverEvent: EventInstance<DragEvent, SVGElement /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGElement/dragstart_event)
     */
    @JsEvent("dragstart")
    val dragStartEvent: EventInstance<DragEvent, SVGElement /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGElement/drop_event)
     */
    @JsEvent("drop")
    val dropEvent: EventInstance<DragEvent, SVGElement /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGElement/gotpointercapture_event)
     */
    @JsEvent("gotpointercapture")
    val gotPointerCaptureEvent: EventInstance<PointerEvent, SVGElement /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGElement/lostpointercapture_event)
     */
    @JsEvent("lostpointercapture")
    val lostPointerCaptureEvent: EventInstance<PointerEvent, SVGElement /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGElement/paste_event)
     */
    @JsEvent("paste")
    val pasteEvent: EventInstance<ClipboardEvent, SVGElement /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGElement/pointercancel_event)
     */
    @JsEvent("pointercancel")
    val pointerCancelEvent: EventInstance<PointerEvent, SVGElement /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGElement/pointerdown_event)
     */
    @JsEvent("pointerdown")
    val pointerDownEvent: EventInstance<PointerEvent, SVGElement /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGElement/pointerenter_event)
     */
    @JsEvent("pointerenter")
    val pointerEnterEvent: EventInstance<PointerEvent, SVGElement /* this */, SVGElement /* this */>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGElement/pointerleave_event)
     */
    @JsEvent("pointerleave")
    val pointerLeaveEvent: EventInstance<PointerEvent, SVGElement /* this */, SVGElement /* this */>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGElement/pointermove_event)
     */
    @JsEvent("pointermove")
    val pointerMoveEvent: EventInstance<PointerEvent, SVGElement /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGElement/pointerout_event)
     */
    @JsEvent("pointerout")
    val pointerOutEvent: EventInstance<PointerEvent, SVGElement /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGElement/pointerover_event)
     */
    @JsEvent("pointerover")
    val pointerOverEvent: EventInstance<PointerEvent, SVGElement /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGElement/pointerup_event)
     */
    @JsEvent("pointerup")
    val pointerUpEvent: EventInstance<PointerEvent, SVGElement /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGElement/selectionchange_event)
     */
    @JsEvent("selectionchange")
    val selectionChangeEvent: EventInstance<Event, SVGElement /* this */, SVGElement /* this */>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGElement/selectstart_event)
     */
    @JsEvent("selectstart")
    val selectStartEvent: EventInstance<Event, SVGElement /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGElement/transitioncancel_event)
     */
    @JsEvent("transitioncancel")
    val transitionCancelEvent: EventInstance<TransitionEvent, SVGElement /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGElement/transitionend_event)
     */
    @JsEvent("transitionend")
    val transitionEndEvent: EventInstance<TransitionEvent, SVGElement /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGElement/transitionrun_event)
     */
    @JsEvent("transitionrun")
    val transitionRunEvent: EventInstance<TransitionEvent, SVGElement /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGElement/transitionstart_event)
     */
    @JsEvent("transitionstart")
    val transitionStartEvent: EventInstance<TransitionEvent, SVGElement /* this */, Node>
}
