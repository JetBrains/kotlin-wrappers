// Automatically generated - do not modify!

package web.svg

import web.animations.AnimationEvent
import web.clipboard.ClipboardEvent
import web.cssom.TransitionEvent
import web.dom.Node
import web.dom.selectStart
import web.dom.selectionChange
import web.events.Event
import web.events.EventInstance
import web.uievents.DragEvent
import web.uievents.PointerEvent

inline val <C : SVGElement> C.animationCancelEvent: EventInstance<AnimationEvent, C, Node>
    get() = EventInstance(this, AnimationEvent.animationCancel())

inline val <C : SVGElement> C.animationEndEvent: EventInstance<AnimationEvent, C, Node>
    get() = EventInstance(this, AnimationEvent.animationEnd())

inline val <C : SVGElement> C.animationIterationEvent: EventInstance<AnimationEvent, C, Node>
    get() = EventInstance(this, AnimationEvent.animationIteration())

inline val <C : SVGElement> C.animationStartEvent: EventInstance<AnimationEvent, C, Node>
    get() = EventInstance(this, AnimationEvent.animationStart())

inline val <C : SVGElement> C.copyEvent: EventInstance<ClipboardEvent, C, Node>
    get() = EventInstance(this, ClipboardEvent.copy())

inline val <C : SVGElement> C.cutEvent: EventInstance<ClipboardEvent, C, Node>
    get() = EventInstance(this, ClipboardEvent.cut())

inline val <C : SVGElement> C.dragEvent: EventInstance<DragEvent, C, Node>
    get() = EventInstance(this, DragEvent.drag())

inline val <C : SVGElement> C.dragEndEvent: EventInstance<DragEvent, C, Node>
    get() = EventInstance(this, DragEvent.dragEnd())

inline val <C : SVGElement> C.dragEnterEvent: EventInstance<DragEvent, C, Node>
    get() = EventInstance(this, DragEvent.dragEnter())

inline val <C : SVGElement> C.dragLeaveEvent: EventInstance<DragEvent, C, Node>
    get() = EventInstance(this, DragEvent.dragLeave())

inline val <C : SVGElement> C.dragOverEvent: EventInstance<DragEvent, C, Node>
    get() = EventInstance(this, DragEvent.dragOver())

inline val <C : SVGElement> C.dragStartEvent: EventInstance<DragEvent, C, Node>
    get() = EventInstance(this, DragEvent.dragStart())

inline val <C : SVGElement> C.dropEvent: EventInstance<DragEvent, C, Node>
    get() = EventInstance(this, DragEvent.drop())

inline val <C : SVGElement> C.gotPointerCaptureEvent: EventInstance<PointerEvent, C, Node>
    get() = EventInstance(this, PointerEvent.gotPointerCapture())

inline val <C : SVGElement> C.lostPointerCaptureEvent: EventInstance<PointerEvent, C, Node>
    get() = EventInstance(this, PointerEvent.lostPointerCapture())

inline val <C : SVGElement> C.pasteEvent: EventInstance<ClipboardEvent, C, Node>
    get() = EventInstance(this, ClipboardEvent.paste())

inline val <C : SVGElement> C.pointerCancelEvent: EventInstance<PointerEvent, C, Node>
    get() = EventInstance(this, PointerEvent.pointerCancel())

inline val <C : SVGElement> C.pointerDownEvent: EventInstance<PointerEvent, C, Node>
    get() = EventInstance(this, PointerEvent.pointerDown())

inline val <C : SVGElement> C.pointerEnterEvent: EventInstance<PointerEvent, C, C>
    get() = EventInstance(this, PointerEvent.pointerEnter())

inline val <C : SVGElement> C.pointerLeaveEvent: EventInstance<PointerEvent, C, C>
    get() = EventInstance(this, PointerEvent.pointerLeave())

inline val <C : SVGElement> C.pointerMoveEvent: EventInstance<PointerEvent, C, Node>
    get() = EventInstance(this, PointerEvent.pointerMove())

inline val <C : SVGElement> C.pointerOutEvent: EventInstance<PointerEvent, C, Node>
    get() = EventInstance(this, PointerEvent.pointerOut())

inline val <C : SVGElement> C.pointerOverEvent: EventInstance<PointerEvent, C, Node>
    get() = EventInstance(this, PointerEvent.pointerOver())

inline val <C : SVGElement> C.pointerUpEvent: EventInstance<PointerEvent, C, Node>
    get() = EventInstance(this, PointerEvent.pointerUp())

inline val <C : SVGElement> C.selectionChangeEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.selectionChange())

inline val <C : SVGElement> C.selectStartEvent: EventInstance<Event, C, Node>
    get() = EventInstance(this, Event.selectStart())

inline val <C : SVGElement> C.transitionCancelEvent: EventInstance<TransitionEvent, C, Node>
    get() = EventInstance(this, TransitionEvent.transitionCancel())

inline val <C : SVGElement> C.transitionEndEvent: EventInstance<TransitionEvent, C, Node>
    get() = EventInstance(this, TransitionEvent.transitionEnd())

inline val <C : SVGElement> C.transitionRunEvent: EventInstance<TransitionEvent, C, Node>
    get() = EventInstance(this, TransitionEvent.transitionRun())

inline val <C : SVGElement> C.transitionStartEvent: EventInstance<TransitionEvent, C, Node>
    get() = EventInstance(this, TransitionEvent.transitionStart())
