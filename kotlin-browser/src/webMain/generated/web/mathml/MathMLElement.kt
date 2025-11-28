// Automatically generated - do not modify!

package web.mathml

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

/**
 * The **`MathMLElement`** interface represents any MathML element.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MathMLElement)
 */
open external class MathMLElement
private constructor() :
    Element,
    ElementCSSInlineStyle,
    GlobalEventHandlers,
    HTMLOrSVGElement

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MathMLElement/animationcancel_event)
 */
inline val <C : MathMLElement> C.animationCancelEvent: EventInstance<AnimationEvent, C, Node>
    get() = EventInstance(this, "animationcancel")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MathMLElement/animationend_event)
 */
inline val <C : MathMLElement> C.animationEndEvent: EventInstance<AnimationEvent, C, Node>
    get() = EventInstance(this, "animationend")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MathMLElement/animationiteration_event)
 */
inline val <C : MathMLElement> C.animationIterationEvent: EventInstance<AnimationEvent, C, Node>
    get() = EventInstance(this, "animationiteration")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MathMLElement/animationstart_event)
 */
inline val <C : MathMLElement> C.animationStartEvent: EventInstance<AnimationEvent, C, Node>
    get() = EventInstance(this, "animationstart")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MathMLElement/copy_event)
 */
inline val <C : MathMLElement> C.copyEvent: EventInstance<ClipboardEvent, C, Node>
    get() = EventInstance(this, "copy")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MathMLElement/cut_event)
 */
inline val <C : MathMLElement> C.cutEvent: EventInstance<ClipboardEvent, C, Node>
    get() = EventInstance(this, "cut")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MathMLElement/drag_event)
 */
inline val <C : MathMLElement> C.dragEvent: EventInstance<DragEvent, C, Node>
    get() = EventInstance(this, "drag")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MathMLElement/dragend_event)
 */
inline val <C : MathMLElement> C.dragEndEvent: EventInstance<DragEvent, C, Node>
    get() = EventInstance(this, "dragend")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MathMLElement/dragenter_event)
 */
inline val <C : MathMLElement> C.dragEnterEvent: EventInstance<DragEvent, C, Node>
    get() = EventInstance(this, "dragenter")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MathMLElement/dragleave_event)
 */
inline val <C : MathMLElement> C.dragLeaveEvent: EventInstance<DragEvent, C, Node>
    get() = EventInstance(this, "dragleave")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MathMLElement/dragover_event)
 */
inline val <C : MathMLElement> C.dragOverEvent: EventInstance<DragEvent, C, Node>
    get() = EventInstance(this, "dragover")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MathMLElement/dragstart_event)
 */
inline val <C : MathMLElement> C.dragStartEvent: EventInstance<DragEvent, C, Node>
    get() = EventInstance(this, "dragstart")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MathMLElement/drop_event)
 */
inline val <C : MathMLElement> C.dropEvent: EventInstance<DragEvent, C, Node>
    get() = EventInstance(this, "drop")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MathMLElement/gotpointercapture_event)
 */
inline val <C : MathMLElement> C.gotPointerCaptureEvent: EventInstance<PointerEvent, C, Node>
    get() = EventInstance(this, "gotpointercapture")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MathMLElement/lostpointercapture_event)
 */
inline val <C : MathMLElement> C.lostPointerCaptureEvent: EventInstance<PointerEvent, C, Node>
    get() = EventInstance(this, "lostpointercapture")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MathMLElement/paste_event)
 */
inline val <C : MathMLElement> C.pasteEvent: EventInstance<ClipboardEvent, C, Node>
    get() = EventInstance(this, "paste")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MathMLElement/pointercancel_event)
 */
inline val <C : MathMLElement> C.pointerCancelEvent: EventInstance<PointerEvent, C, Node>
    get() = EventInstance(this, "pointercancel")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MathMLElement/pointerdown_event)
 */
inline val <C : MathMLElement> C.pointerDownEvent: EventInstance<PointerEvent, C, Node>
    get() = EventInstance(this, "pointerdown")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MathMLElement/pointerenter_event)
 */
inline val <C : MathMLElement> C.pointerEnterEvent: EventInstance<PointerEvent, C, C>
    get() = EventInstance(this, "pointerenter")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MathMLElement/pointerleave_event)
 */
inline val <C : MathMLElement> C.pointerLeaveEvent: EventInstance<PointerEvent, C, C>
    get() = EventInstance(this, "pointerleave")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MathMLElement/pointermove_event)
 */
inline val <C : MathMLElement> C.pointerMoveEvent: EventInstance<PointerEvent, C, Node>
    get() = EventInstance(this, "pointermove")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MathMLElement/pointerout_event)
 */
inline val <C : MathMLElement> C.pointerOutEvent: EventInstance<PointerEvent, C, Node>
    get() = EventInstance(this, "pointerout")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MathMLElement/pointerover_event)
 */
inline val <C : MathMLElement> C.pointerOverEvent: EventInstance<PointerEvent, C, Node>
    get() = EventInstance(this, "pointerover")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MathMLElement/pointerrawupdate_event)
 */
inline val <C : MathMLElement> C.pointerRawUpdateEvent: EventInstance<PointerEvent, C, Node>
    get() = EventInstance(this, "pointerrawupdate")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MathMLElement/pointerup_event)
 */
inline val <C : MathMLElement> C.pointerUpEvent: EventInstance<PointerEvent, C, Node>
    get() = EventInstance(this, "pointerup")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MathMLElement/securitypolicyviolation_event)
 */
inline val <C : MathMLElement> C.securityPolicyViolationEvent: EventInstance<SecurityPolicyViolationEvent, C, Node>
    get() = EventInstance(this, "securitypolicyviolation")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MathMLElement/selectionchange_event)
 */
inline val <C : MathMLElement> C.selectionChangeEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, "selectionchange")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MathMLElement/selectstart_event)
 */
inline val <C : MathMLElement> C.selectStartEvent: EventInstance<Event, C, Node>
    get() = EventInstance(this, "selectstart")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MathMLElement/transitioncancel_event)
 */
inline val <C : MathMLElement> C.transitionCancelEvent: EventInstance<TransitionEvent, C, Node>
    get() = EventInstance(this, "transitioncancel")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MathMLElement/transitionend_event)
 */
inline val <C : MathMLElement> C.transitionEndEvent: EventInstance<TransitionEvent, C, Node>
    get() = EventInstance(this, "transitionend")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MathMLElement/transitionrun_event)
 */
inline val <C : MathMLElement> C.transitionRunEvent: EventInstance<TransitionEvent, C, Node>
    get() = EventInstance(this, "transitionrun")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MathMLElement/transitionstart_event)
 */
inline val <C : MathMLElement> C.transitionStartEvent: EventInstance<TransitionEvent, C, Node>
    get() = EventInstance(this, "transitionstart")
