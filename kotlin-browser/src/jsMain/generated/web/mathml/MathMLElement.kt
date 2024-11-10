// Automatically generated - do not modify!

package web.mathml

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
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MathMLElement)
 */
open external class MathMLElement
private constructor() :
    Element,
    ElementCSSInlineStyle,
    GlobalEventHandlers,
    HTMLOrSVGElement {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MathMLElement/animationcancel_event)
     */
    @JsEvent("animationcancel")
    val animationCancelEvent: EventInstance<AnimationEvent, MathMLElement /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MathMLElement/animationend_event)
     */
    @JsEvent("animationend")
    val animationEndEvent: EventInstance<AnimationEvent, MathMLElement /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MathMLElement/animationiteration_event)
     */
    @JsEvent("animationiteration")
    val animationIterationEvent: EventInstance<AnimationEvent, MathMLElement /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MathMLElement/animationstart_event)
     */
    @JsEvent("animationstart")
    val animationStartEvent: EventInstance<AnimationEvent, MathMLElement /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MathMLElement/copy_event)
     */
    @JsEvent("copy")
    val copyEvent: EventInstance<ClipboardEvent, MathMLElement /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MathMLElement/cut_event)
     */
    @JsEvent("cut")
    val cutEvent: EventInstance<ClipboardEvent, MathMLElement /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MathMLElement/drag_event)
     */
    @JsEvent("drag")
    val dragEvent: EventInstance<DragEvent, MathMLElement /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MathMLElement/dragend_event)
     */
    @JsEvent("dragend")
    val dragEndEvent: EventInstance<DragEvent, MathMLElement /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MathMLElement/dragenter_event)
     */
    @JsEvent("dragenter")
    val dragEnterEvent: EventInstance<DragEvent, MathMLElement /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MathMLElement/dragleave_event)
     */
    @JsEvent("dragleave")
    val dragLeaveEvent: EventInstance<DragEvent, MathMLElement /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MathMLElement/dragover_event)
     */
    @JsEvent("dragover")
    val dragOverEvent: EventInstance<DragEvent, MathMLElement /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MathMLElement/dragstart_event)
     */
    @JsEvent("dragstart")
    val dragStartEvent: EventInstance<DragEvent, MathMLElement /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MathMLElement/drop_event)
     */
    @JsEvent("drop")
    val dropEvent: EventInstance<DragEvent, MathMLElement /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MathMLElement/gotpointercapture_event)
     */
    @JsEvent("gotpointercapture")
    val gotPointerCaptureEvent: EventInstance<PointerEvent, MathMLElement /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MathMLElement/lostpointercapture_event)
     */
    @JsEvent("lostpointercapture")
    val lostPointerCaptureEvent: EventInstance<PointerEvent, MathMLElement /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MathMLElement/paste_event)
     */
    @JsEvent("paste")
    val pasteEvent: EventInstance<ClipboardEvent, MathMLElement /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MathMLElement/pointercancel_event)
     */
    @JsEvent("pointercancel")
    val pointerCancelEvent: EventInstance<PointerEvent, MathMLElement /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MathMLElement/pointerdown_event)
     */
    @JsEvent("pointerdown")
    val pointerDownEvent: EventInstance<PointerEvent, MathMLElement /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MathMLElement/pointerenter_event)
     */
    @JsEvent("pointerenter")
    val pointerEnterEvent: EventInstance<PointerEvent, MathMLElement /* this */, MathMLElement /* this */>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MathMLElement/pointerleave_event)
     */
    @JsEvent("pointerleave")
    val pointerLeaveEvent: EventInstance<PointerEvent, MathMLElement /* this */, MathMLElement /* this */>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MathMLElement/pointermove_event)
     */
    @JsEvent("pointermove")
    val pointerMoveEvent: EventInstance<PointerEvent, MathMLElement /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MathMLElement/pointerout_event)
     */
    @JsEvent("pointerout")
    val pointerOutEvent: EventInstance<PointerEvent, MathMLElement /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MathMLElement/pointerover_event)
     */
    @JsEvent("pointerover")
    val pointerOverEvent: EventInstance<PointerEvent, MathMLElement /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MathMLElement/pointerup_event)
     */
    @JsEvent("pointerup")
    val pointerUpEvent: EventInstance<PointerEvent, MathMLElement /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MathMLElement/selectionchange_event)
     */
    @JsEvent("selectionchange")
    val selectionChangeEvent: EventInstance<Event, MathMLElement /* this */, MathMLElement /* this */>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MathMLElement/selectstart_event)
     */
    @JsEvent("selectstart")
    val selectStartEvent: EventInstance<Event, MathMLElement /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MathMLElement/transitioncancel_event)
     */
    @JsEvent("transitioncancel")
    val transitionCancelEvent: EventInstance<TransitionEvent, MathMLElement /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MathMLElement/transitionend_event)
     */
    @JsEvent("transitionend")
    val transitionEndEvent: EventInstance<TransitionEvent, MathMLElement /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MathMLElement/transitionrun_event)
     */
    @JsEvent("transitionrun")
    val transitionRunEvent: EventInstance<TransitionEvent, MathMLElement /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MathMLElement/transitionstart_event)
     */
    @JsEvent("transitionstart")
    val transitionStartEvent: EventInstance<TransitionEvent, MathMLElement /* this */, Node>
}
