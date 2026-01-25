// Automatically generated - do not modify!

package web.svg

import web.animations.AnimationEvent
import web.clipboard.ClipboardEvent
import web.csp.SecurityPolicyViolationEvent
import web.cssom.ElementCSSInlineStyle
import web.cssom.TransitionEvent
import web.dnd.DragEvent
import web.dom.Element
import web.dom.GlobalEventHandlers
import web.dom.HTMLOrSVGElement
import web.dom.Node
import web.events.Event
import web.events.EventInstance
import web.pointer.PointerEvent
import web.xr.XRSessionEvent

/**
 * All of the SVG DOM interfaces that correspond directly to elements in the SVG language derive from the **`SVGElement`** interface.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGElement)
 */
open external class SVGElement
private constructor() :
    Element,
    ElementCSSInlineStyle,
    GlobalEventHandlers,
    HTMLOrSVGElement {
    /**
     * The **`ownerSVGElement`** property of the SVGElement interface reflects the nearest ancestor <svg> element. null if the given element is the outermost <svg> element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGElement/ownerSVGElement)
     */
    val ownerSVGElement: SVGSVGElement?

    /**
     * The **`viewportElement`** property of the SVGElement interface represents the SVGElement which established the current viewport. Often the nearest ancestor <svg> element. null if the given element is the outermost <svg> element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGElement/viewportElement)
     */
    val viewportElement: SVGElement?
}

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGElement/animationcancel_event)
 */
inline val <C : SVGElement> C.animationCancelEvent: EventInstance<AnimationEvent, C, Node>
    get() = EventInstance(this, "animationcancel")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGElement/animationend_event)
 */
inline val <C : SVGElement> C.animationEndEvent: EventInstance<AnimationEvent, C, Node>
    get() = EventInstance(this, "animationend")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGElement/animationiteration_event)
 */
inline val <C : SVGElement> C.animationIterationEvent: EventInstance<AnimationEvent, C, Node>
    get() = EventInstance(this, "animationiteration")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGElement/animationstart_event)
 */
inline val <C : SVGElement> C.animationStartEvent: EventInstance<AnimationEvent, C, Node>
    get() = EventInstance(this, "animationstart")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGElement/beforexrselect_event)
 */
inline val <C : SVGElement> C.beforeXrSelectEvent: EventInstance<XRSessionEvent, C, Node>
    get() = EventInstance(this, "beforexrselect")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGElement/copy_event)
 */
inline val <C : SVGElement> C.copyEvent: EventInstance<ClipboardEvent, C, Node>
    get() = EventInstance(this, "copy")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGElement/cut_event)
 */
inline val <C : SVGElement> C.cutEvent: EventInstance<ClipboardEvent, C, Node>
    get() = EventInstance(this, "cut")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGElement/drag_event)
 */
inline val <C : SVGElement> C.dragEvent: EventInstance<DragEvent, C, Node>
    get() = EventInstance(this, "drag")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGElement/dragend_event)
 */
inline val <C : SVGElement> C.dragEndEvent: EventInstance<DragEvent, C, Node>
    get() = EventInstance(this, "dragend")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGElement/dragenter_event)
 */
inline val <C : SVGElement> C.dragEnterEvent: EventInstance<DragEvent, C, Node>
    get() = EventInstance(this, "dragenter")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGElement/dragleave_event)
 */
inline val <C : SVGElement> C.dragLeaveEvent: EventInstance<DragEvent, C, Node>
    get() = EventInstance(this, "dragleave")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGElement/dragover_event)
 */
inline val <C : SVGElement> C.dragOverEvent: EventInstance<DragEvent, C, Node>
    get() = EventInstance(this, "dragover")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGElement/dragstart_event)
 */
inline val <C : SVGElement> C.dragStartEvent: EventInstance<DragEvent, C, Node>
    get() = EventInstance(this, "dragstart")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGElement/drop_event)
 */
inline val <C : SVGElement> C.dropEvent: EventInstance<DragEvent, C, Node>
    get() = EventInstance(this, "drop")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGElement/gotpointercapture_event)
 */
inline val <C : SVGElement> C.gotPointerCaptureEvent: EventInstance<PointerEvent, C, Node>
    get() = EventInstance(this, "gotpointercapture")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGElement/lostpointercapture_event)
 */
inline val <C : SVGElement> C.lostPointerCaptureEvent: EventInstance<PointerEvent, C, Node>
    get() = EventInstance(this, "lostpointercapture")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGElement/paste_event)
 */
inline val <C : SVGElement> C.pasteEvent: EventInstance<ClipboardEvent, C, Node>
    get() = EventInstance(this, "paste")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGElement/pointercancel_event)
 */
inline val <C : SVGElement> C.pointerCancelEvent: EventInstance<PointerEvent, C, Node>
    get() = EventInstance(this, "pointercancel")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGElement/pointerdown_event)
 */
inline val <C : SVGElement> C.pointerDownEvent: EventInstance<PointerEvent, C, Node>
    get() = EventInstance(this, "pointerdown")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGElement/pointerenter_event)
 */
inline val <C : SVGElement> C.pointerEnterEvent: EventInstance<PointerEvent, C, C>
    get() = EventInstance(this, "pointerenter")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGElement/pointerleave_event)
 */
inline val <C : SVGElement> C.pointerLeaveEvent: EventInstance<PointerEvent, C, C>
    get() = EventInstance(this, "pointerleave")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGElement/pointermove_event)
 */
inline val <C : SVGElement> C.pointerMoveEvent: EventInstance<PointerEvent, C, Node>
    get() = EventInstance(this, "pointermove")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGElement/pointerout_event)
 */
inline val <C : SVGElement> C.pointerOutEvent: EventInstance<PointerEvent, C, Node>
    get() = EventInstance(this, "pointerout")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGElement/pointerover_event)
 */
inline val <C : SVGElement> C.pointerOverEvent: EventInstance<PointerEvent, C, Node>
    get() = EventInstance(this, "pointerover")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGElement/pointerrawupdate_event)
 */
inline val <C : SVGElement> C.pointerRawUpdateEvent: EventInstance<PointerEvent, C, Node>
    get() = EventInstance(this, "pointerrawupdate")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGElement/pointerup_event)
 */
inline val <C : SVGElement> C.pointerUpEvent: EventInstance<PointerEvent, C, Node>
    get() = EventInstance(this, "pointerup")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGElement/securitypolicyviolation_event)
 */
inline val <C : SVGElement> C.securityPolicyViolationEvent: EventInstance<SecurityPolicyViolationEvent, C, Node>
    get() = EventInstance(this, "securitypolicyviolation")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGElement/selectionchange_event)
 */
inline val <C : SVGElement> C.selectionChangeEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, "selectionchange")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGElement/selectstart_event)
 */
inline val <C : SVGElement> C.selectStartEvent: EventInstance<Event, C, Node>
    get() = EventInstance(this, "selectstart")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGElement/transitioncancel_event)
 */
inline val <C : SVGElement> C.transitionCancelEvent: EventInstance<TransitionEvent, C, Node>
    get() = EventInstance(this, "transitioncancel")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGElement/transitionend_event)
 */
inline val <C : SVGElement> C.transitionEndEvent: EventInstance<TransitionEvent, C, Node>
    get() = EventInstance(this, "transitionend")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGElement/transitionrun_event)
 */
inline val <C : SVGElement> C.transitionRunEvent: EventInstance<TransitionEvent, C, Node>
    get() = EventInstance(this, "transitionrun")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGElement/transitionstart_event)
 */
inline val <C : SVGElement> C.transitionStartEvent: EventInstance<TransitionEvent, C, Node>
    get() = EventInstance(this, "transitionstart")
