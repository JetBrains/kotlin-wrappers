// Automatically generated - do not modify!

package web.html

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
import web.uievents.ToggleEvent

inline val <C : HTMLElement> C.animationCancelEvent: EventInstance<AnimationEvent, C, Node>
    get() = EventInstance(this, AnimationEvent.animationCancel())

inline val <C : HTMLElement> C.animationEndEvent: EventInstance<AnimationEvent, C, Node>
    get() = EventInstance(this, AnimationEvent.animationEnd())

inline val <C : HTMLElement> C.animationIterationEvent: EventInstance<AnimationEvent, C, Node>
    get() = EventInstance(this, AnimationEvent.animationIteration())

inline val <C : HTMLElement> C.animationStartEvent: EventInstance<AnimationEvent, C, Node>
    get() = EventInstance(this, AnimationEvent.animationStart())

inline val <C : HTMLElement> C.beforeToggleEvent: EventInstance<ToggleEvent, C, C>
    get() = EventInstance(this, ToggleEvent.beforeToggle())

inline val <C : HTMLElement> C.copyEvent: EventInstance<ClipboardEvent, C, Node>
    get() = EventInstance(this, ClipboardEvent.copy())

inline val <C : HTMLElement> C.cutEvent: EventInstance<ClipboardEvent, C, Node>
    get() = EventInstance(this, ClipboardEvent.cut())

inline val <C : HTMLElement> C.dragEvent: EventInstance<DragEvent, C, Node>
    get() = EventInstance(this, DragEvent.drag())

inline val <C : HTMLElement> C.dragEndEvent: EventInstance<DragEvent, C, Node>
    get() = EventInstance(this, DragEvent.dragEnd())

inline val <C : HTMLElement> C.dragEnterEvent: EventInstance<DragEvent, C, Node>
    get() = EventInstance(this, DragEvent.dragEnter())

inline val <C : HTMLElement> C.dragLeaveEvent: EventInstance<DragEvent, C, Node>
    get() = EventInstance(this, DragEvent.dragLeave())

inline val <C : HTMLElement> C.dragOverEvent: EventInstance<DragEvent, C, Node>
    get() = EventInstance(this, DragEvent.dragOver())

inline val <C : HTMLElement> C.dragStartEvent: EventInstance<DragEvent, C, Node>
    get() = EventInstance(this, DragEvent.dragStart())

inline val <C : HTMLElement> C.dropEvent: EventInstance<DragEvent, C, Node>
    get() = EventInstance(this, DragEvent.drop())

inline val <C : HTMLElement> C.gotPointerCaptureEvent: EventInstance<PointerEvent, C, Node>
    get() = EventInstance(this, PointerEvent.gotPointerCapture())

inline val <C : HTMLElement> C.lostPointerCaptureEvent: EventInstance<PointerEvent, C, Node>
    get() = EventInstance(this, PointerEvent.lostPointerCapture())

inline val <C : HTMLElement> C.pasteEvent: EventInstance<ClipboardEvent, C, Node>
    get() = EventInstance(this, ClipboardEvent.paste())

inline val <C : HTMLElement> C.pointerCancelEvent: EventInstance<PointerEvent, C, Node>
    get() = EventInstance(this, PointerEvent.pointerCancel())

inline val <C : HTMLElement> C.pointerDownEvent: EventInstance<PointerEvent, C, Node>
    get() = EventInstance(this, PointerEvent.pointerDown())

inline val <C : HTMLElement> C.pointerEnterEvent: EventInstance<PointerEvent, C, C>
    get() = EventInstance(this, PointerEvent.pointerEnter())

inline val <C : HTMLElement> C.pointerLeaveEvent: EventInstance<PointerEvent, C, C>
    get() = EventInstance(this, PointerEvent.pointerLeave())

inline val <C : HTMLElement> C.pointerMoveEvent: EventInstance<PointerEvent, C, Node>
    get() = EventInstance(this, PointerEvent.pointerMove())

inline val <C : HTMLElement> C.pointerOutEvent: EventInstance<PointerEvent, C, Node>
    get() = EventInstance(this, PointerEvent.pointerOut())

inline val <C : HTMLElement> C.pointerOverEvent: EventInstance<PointerEvent, C, Node>
    get() = EventInstance(this, PointerEvent.pointerOver())

inline val <C : HTMLElement> C.pointerUpEvent: EventInstance<PointerEvent, C, Node>
    get() = EventInstance(this, PointerEvent.pointerUp())

inline val <C : HTMLElement> C.selectionChangeEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.selectionChange())

inline val <C : HTMLElement> C.selectStartEvent: EventInstance<Event, C, Node>
    get() = EventInstance(this, Event.selectStart())

inline val <C : HTMLElement> C.transitionCancelEvent: EventInstance<TransitionEvent, C, Node>
    get() = EventInstance(this, TransitionEvent.transitionCancel())

inline val <C : HTMLElement> C.transitionEndEvent: EventInstance<TransitionEvent, C, Node>
    get() = EventInstance(this, TransitionEvent.transitionEnd())

inline val <C : HTMLElement> C.transitionRunEvent: EventInstance<TransitionEvent, C, Node>
    get() = EventInstance(this, TransitionEvent.transitionRun())

inline val <C : HTMLElement> C.transitionStartEvent: EventInstance<TransitionEvent, C, Node>
    get() = EventInstance(this, TransitionEvent.transitionStart())
