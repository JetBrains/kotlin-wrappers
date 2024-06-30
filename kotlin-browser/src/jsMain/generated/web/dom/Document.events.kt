// Automatically generated - do not modify!

package web.dom

import web.animations.AnimationEvent
import web.clipboard.ClipboardEvent
import web.cssom.TransitionEvent
import web.events.Event
import web.events.EventInstance
import web.form.FormDataEvent
import web.form.SubmitEvent
import web.pip.PictureInPictureEvent
import web.uievents.*
import web.window.Window
import web.window.unload

inline val <C : Document> C.animationCancelEvent: EventInstance<AnimationEvent, C, Node>
    get() = EventInstance(this, AnimationEvent.animationCancel())

inline val <C : Document> C.animationEndEvent: EventInstance<AnimationEvent, C, Node>
    get() = EventInstance(this, AnimationEvent.animationEnd())

inline val <C : Document> C.animationIterationEvent: EventInstance<AnimationEvent, C, Node>
    get() = EventInstance(this, AnimationEvent.animationIteration())

inline val <C : Document> C.animationStartEvent: EventInstance<AnimationEvent, C, Node>
    get() = EventInstance(this, AnimationEvent.animationStart())

inline val <C : Document> C.auxClickEvent: EventInstance<MouseEvent, C, Node>
    get() = EventInstance(this, MouseEvent.auxClick())

inline val <C : Document> C.beforeInputEvent: EventInstance<InputEvent, C, Node>
    get() = EventInstance(this, InputEvent.beforeInput())

inline val <C : Document> C.cancelEvent: EventInstance<Event, C, Node>
    get() = EventInstance(this, Event.cancel())

inline val <C : Document> C.changeEvent: EventInstance<Event, C, Node>
    get() = EventInstance(this, Event.change())

inline val <C : Document> C.clickEvent: EventInstance<MouseEvent, C, Node>
    get() = EventInstance(this, MouseEvent.click())

inline val <C : Document> C.compositionEndEvent: EventInstance<CompositionEvent, C, Node>
    get() = EventInstance(this, CompositionEvent.compositionEnd())

inline val <C : Document> C.compositionStartEvent: EventInstance<CompositionEvent, C, Node>
    get() = EventInstance(this, CompositionEvent.compositionStart())

inline val <C : Document> C.compositionUpdateEvent: EventInstance<CompositionEvent, C, Node>
    get() = EventInstance(this, CompositionEvent.compositionUpdate())

inline val <C : Document> C.contextMenuEvent: EventInstance<MouseEvent, C, Node>
    get() = EventInstance(this, MouseEvent.contextMenu())

inline val <C : Document> C.copyEvent: EventInstance<ClipboardEvent, C, Node>
    get() = EventInstance(this, ClipboardEvent.copy())

inline val <C : Document> C.cutEvent: EventInstance<ClipboardEvent, C, Node>
    get() = EventInstance(this, ClipboardEvent.cut())

inline val <C : Document> C.dblClickEvent: EventInstance<MouseEvent, C, Node>
    get() = EventInstance(this, MouseEvent.dblClick())

inline val <C : Document> C.domContentLoadedEvent: EventInstance<Event, C, Window>
    get() = EventInstance(this, Event.domContentLoaded())

inline val <C : Document> C.dragEvent: EventInstance<DragEvent, C, Node>
    get() = EventInstance(this, DragEvent.drag())

inline val <C : Document> C.dragEndEvent: EventInstance<DragEvent, C, Node>
    get() = EventInstance(this, DragEvent.dragEnd())

inline val <C : Document> C.dragEnterEvent: EventInstance<DragEvent, C, Node>
    get() = EventInstance(this, DragEvent.dragEnter())

inline val <C : Document> C.dragLeaveEvent: EventInstance<DragEvent, C, Node>
    get() = EventInstance(this, DragEvent.dragLeave())

inline val <C : Document> C.dragOverEvent: EventInstance<DragEvent, C, Node>
    get() = EventInstance(this, DragEvent.dragOver())

inline val <C : Document> C.dragStartEvent: EventInstance<DragEvent, C, Node>
    get() = EventInstance(this, DragEvent.dragStart())

inline val <C : Document> C.dropEvent: EventInstance<DragEvent, C, Node>
    get() = EventInstance(this, DragEvent.drop())

inline val <C : Document> C.enterPictureInPictureEvent: EventInstance<PictureInPictureEvent, C, Node>
    get() = EventInstance(this, PictureInPictureEvent.enterPictureInPicture())

inline val <C : Document> C.focusInEvent: EventInstance<FocusEvent, C, Node>
    get() = EventInstance(this, FocusEvent.focusIn())

inline val <C : Document> C.focusOutEvent: EventInstance<FocusEvent, C, Node>
    get() = EventInstance(this, FocusEvent.focusOut())

inline val <C : Document> C.formDataEvent: EventInstance<FormDataEvent, C, Node>
    get() = EventInstance(this, FormDataEvent.formData())

inline val <C : Document> C.fullscreenChangeEvent: EventInstance<Event, C, Node>
    get() = EventInstance(this, Event.fullscreenChange())

inline val <C : Document> C.fullscreenErrorEvent: EventInstance<Event, C, Node>
    get() = EventInstance(this, Event.fullscreenError())

inline val <C : Document> C.gotPointerCaptureEvent: EventInstance<PointerEvent, C, Node>
    get() = EventInstance(this, PointerEvent.gotPointerCapture())

inline val <C : Document> C.inputEvent: EventInstance<InputEvent, C, Node>
    get() = EventInstance(this, InputEvent.input())

inline val <C : Document> C.keyDownEvent: EventInstance<KeyboardEvent, C, Node>
    get() = EventInstance(this, KeyboardEvent.keyDown())

inline val <C : Document> C.keyPressEvent: EventInstance<KeyboardEvent, C, Node>
    get() = EventInstance(this, KeyboardEvent.keyPress())

inline val <C : Document> C.keyUpEvent: EventInstance<KeyboardEvent, C, Node>
    get() = EventInstance(this, KeyboardEvent.keyUp())

inline val <C : Document> C.leavePictureInPictureEvent: EventInstance<PictureInPictureEvent, C, Node>
    get() = EventInstance(this, PictureInPictureEvent.leavePictureInPicture())

inline val <C : Document> C.loadEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.load())

inline val <C : Document> C.lostPointerCaptureEvent: EventInstance<PointerEvent, C, Node>
    get() = EventInstance(this, PointerEvent.lostPointerCapture())

inline val <C : Document> C.mouseDownEvent: EventInstance<MouseEvent, C, Node>
    get() = EventInstance(this, MouseEvent.mouseDown())

inline val <C : Document> C.mouseMoveEvent: EventInstance<MouseEvent, C, Node>
    get() = EventInstance(this, MouseEvent.mouseMove())

inline val <C : Document> C.mouseOutEvent: EventInstance<MouseEvent, C, Node>
    get() = EventInstance(this, MouseEvent.mouseOut())

inline val <C : Document> C.mouseOverEvent: EventInstance<MouseEvent, C, Node>
    get() = EventInstance(this, MouseEvent.mouseOver())

inline val <C : Document> C.mouseUpEvent: EventInstance<MouseEvent, C, Node>
    get() = EventInstance(this, MouseEvent.mouseUp())

inline val <C : Document> C.pasteEvent: EventInstance<ClipboardEvent, C, Node>
    get() = EventInstance(this, ClipboardEvent.paste())

inline val <C : Document> C.pointerCancelEvent: EventInstance<PointerEvent, C, Node>
    get() = EventInstance(this, PointerEvent.pointerCancel())

inline val <C : Document> C.pointerDownEvent: EventInstance<PointerEvent, C, Node>
    get() = EventInstance(this, PointerEvent.pointerDown())

inline val <C : Document> C.pointerEnterEvent: EventInstance<PointerEvent, C, C>
    get() = EventInstance(this, PointerEvent.pointerEnter())

inline val <C : Document> C.pointerLeaveEvent: EventInstance<PointerEvent, C, C>
    get() = EventInstance(this, PointerEvent.pointerLeave())

inline val <C : Document> C.pointerLockChangeEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.pointerLockChange())

inline val <C : Document> C.pointerLockErrorEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.pointerLockError())

inline val <C : Document> C.pointerMoveEvent: EventInstance<PointerEvent, C, Node>
    get() = EventInstance(this, PointerEvent.pointerMove())

inline val <C : Document> C.pointerOutEvent: EventInstance<PointerEvent, C, Node>
    get() = EventInstance(this, PointerEvent.pointerOut())

inline val <C : Document> C.pointerOverEvent: EventInstance<PointerEvent, C, Node>
    get() = EventInstance(this, PointerEvent.pointerOver())

inline val <C : Document> C.pointerUpEvent: EventInstance<PointerEvent, C, Node>
    get() = EventInstance(this, PointerEvent.pointerUp())

inline val <C : Document> C.readyStateChangeEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.readyStateChange())

inline val <C : Document> C.resetEvent: EventInstance<Event, C, Node>
    get() = EventInstance(this, Event.reset())

inline val <C : Document> C.resumeEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.resume())

inline val <C : Document> C.scrollEvent: EventInstance<Event, C, Node>
    get() = EventInstance(this, Event.scroll())

inline val <C : Document> C.scrollEndEvent: EventInstance<Event, C, Node>
    get() = EventInstance(this, Event.scrollEnd())

inline val <C : Document> C.selectEvent: EventInstance<Event, C, Node>
    get() = EventInstance(this, Event.select())

inline val <C : Document> C.selectionChangeEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.selectionChange())

inline val <C : Document> C.selectStartEvent: EventInstance<Event, C, Node>
    get() = EventInstance(this, Event.selectStart())

inline val <C : Document> C.slotChangeEvent: EventInstance<Event, C, Node>
    get() = EventInstance(this, Event.slotChange())

inline val <C : Document> C.submitEvent: EventInstance<SubmitEvent, C, Node>
    get() = EventInstance(this, SubmitEvent.submit())

inline val <C : Document> C.touchCancelEvent: EventInstance<TouchEvent, C, Node>
    get() = EventInstance(this, TouchEvent.touchCancel())

inline val <C : Document> C.touchEndEvent: EventInstance<TouchEvent, C, Node>
    get() = EventInstance(this, TouchEvent.touchEnd())

inline val <C : Document> C.touchMoveEvent: EventInstance<TouchEvent, C, Node>
    get() = EventInstance(this, TouchEvent.touchMove())

inline val <C : Document> C.touchStartEvent: EventInstance<TouchEvent, C, Node>
    get() = EventInstance(this, TouchEvent.touchStart())

inline val <C : Document> C.transitionCancelEvent: EventInstance<TransitionEvent, C, Node>
    get() = EventInstance(this, TransitionEvent.transitionCancel())

inline val <C : Document> C.transitionEndEvent: EventInstance<TransitionEvent, C, Node>
    get() = EventInstance(this, TransitionEvent.transitionEnd())

inline val <C : Document> C.transitionRunEvent: EventInstance<TransitionEvent, C, Node>
    get() = EventInstance(this, TransitionEvent.transitionRun())

inline val <C : Document> C.transitionStartEvent: EventInstance<TransitionEvent, C, Node>
    get() = EventInstance(this, TransitionEvent.transitionStart())

inline val <C : Document> C.unloadEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.unload())

inline val <C : Document> C.visibilityChangeEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.visibilityChange())

inline val <C : Document> C.wheelEvent: EventInstance<WheelEvent, C, Node>
    get() = EventInstance(this, WheelEvent.wheel())
