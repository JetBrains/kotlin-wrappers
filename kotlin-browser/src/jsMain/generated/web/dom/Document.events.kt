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

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/animationcancel_event)
 */
inline val <C : Document> C.animationCancelEvent: EventInstance<AnimationEvent, C, Node>
    get() = EventInstance(this, AnimationEvent.animationCancel())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/animationend_event)
 */
inline val <C : Document> C.animationEndEvent: EventInstance<AnimationEvent, C, Node>
    get() = EventInstance(this, AnimationEvent.animationEnd())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/animationiteration_event)
 */
inline val <C : Document> C.animationIterationEvent: EventInstance<AnimationEvent, C, Node>
    get() = EventInstance(this, AnimationEvent.animationIteration())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/animationstart_event)
 */
inline val <C : Document> C.animationStartEvent: EventInstance<AnimationEvent, C, Node>
    get() = EventInstance(this, AnimationEvent.animationStart())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/auxclick_event)
 */
inline val <C : Document> C.auxClickEvent: EventInstance<MouseEvent, C, Node>
    get() = EventInstance(this, MouseEvent.auxClick())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/beforeinput_event)
 */
inline val <C : Document> C.beforeInputEvent: EventInstance<InputEvent, C, Node>
    get() = EventInstance(this, InputEvent.beforeInput())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/cancel_event)
 */
inline val <C : Document> C.cancelEvent: EventInstance<Event, C, Node>
    get() = EventInstance(this, Event.cancel())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/change_event)
 */
inline val <C : Document> C.changeEvent: EventInstance<Event, C, Node>
    get() = EventInstance(this, Event.change())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/click_event)
 */
inline val <C : Document> C.clickEvent: EventInstance<MouseEvent, C, Node>
    get() = EventInstance(this, MouseEvent.click())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/compositionend_event)
 */
inline val <C : Document> C.compositionEndEvent: EventInstance<CompositionEvent, C, Node>
    get() = EventInstance(this, CompositionEvent.compositionEnd())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/compositionstart_event)
 */
inline val <C : Document> C.compositionStartEvent: EventInstance<CompositionEvent, C, Node>
    get() = EventInstance(this, CompositionEvent.compositionStart())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/compositionupdate_event)
 */
inline val <C : Document> C.compositionUpdateEvent: EventInstance<CompositionEvent, C, Node>
    get() = EventInstance(this, CompositionEvent.compositionUpdate())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/contextmenu_event)
 */
inline val <C : Document> C.contextMenuEvent: EventInstance<MouseEvent, C, Node>
    get() = EventInstance(this, MouseEvent.contextMenu())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/copy_event)
 */
inline val <C : Document> C.copyEvent: EventInstance<ClipboardEvent, C, Node>
    get() = EventInstance(this, ClipboardEvent.copy())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/cut_event)
 */
inline val <C : Document> C.cutEvent: EventInstance<ClipboardEvent, C, Node>
    get() = EventInstance(this, ClipboardEvent.cut())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/dblclick_event)
 */
inline val <C : Document> C.dblClickEvent: EventInstance<MouseEvent, C, Node>
    get() = EventInstance(this, MouseEvent.dblClick())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/DOMContentLoaded_event)
 */
inline val <C : Document> C.domContentLoadedEvent: EventInstance<Event, C, Window>
    get() = EventInstance(this, Event.domContentLoaded())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/drag_event)
 */
inline val <C : Document> C.dragEvent: EventInstance<DragEvent, C, Node>
    get() = EventInstance(this, DragEvent.drag())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/dragend_event)
 */
inline val <C : Document> C.dragEndEvent: EventInstance<DragEvent, C, Node>
    get() = EventInstance(this, DragEvent.dragEnd())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/dragenter_event)
 */
inline val <C : Document> C.dragEnterEvent: EventInstance<DragEvent, C, Node>
    get() = EventInstance(this, DragEvent.dragEnter())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/dragleave_event)
 */
inline val <C : Document> C.dragLeaveEvent: EventInstance<DragEvent, C, Node>
    get() = EventInstance(this, DragEvent.dragLeave())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/dragover_event)
 */
inline val <C : Document> C.dragOverEvent: EventInstance<DragEvent, C, Node>
    get() = EventInstance(this, DragEvent.dragOver())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/dragstart_event)
 */
inline val <C : Document> C.dragStartEvent: EventInstance<DragEvent, C, Node>
    get() = EventInstance(this, DragEvent.dragStart())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/drop_event)
 */
inline val <C : Document> C.dropEvent: EventInstance<DragEvent, C, Node>
    get() = EventInstance(this, DragEvent.drop())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/enterpictureinpicture_event)
 */
inline val <C : Document> C.enterPictureInPictureEvent: EventInstance<PictureInPictureEvent, C, Node>
    get() = EventInstance(this, PictureInPictureEvent.enterPictureInPicture())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/focusin_event)
 */
inline val <C : Document> C.focusInEvent: EventInstance<FocusEvent, C, Node>
    get() = EventInstance(this, FocusEvent.focusIn())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/focusout_event)
 */
inline val <C : Document> C.focusOutEvent: EventInstance<FocusEvent, C, Node>
    get() = EventInstance(this, FocusEvent.focusOut())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/formdata_event)
 */
inline val <C : Document> C.formDataEvent: EventInstance<FormDataEvent, C, Node>
    get() = EventInstance(this, FormDataEvent.formData())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/fullscreenchange_event)
 */
inline val <C : Document> C.fullscreenChangeEvent: EventInstance<Event, C, Node>
    get() = EventInstance(this, Event.fullscreenChange())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/fullscreenerror_event)
 */
inline val <C : Document> C.fullscreenErrorEvent: EventInstance<Event, C, Node>
    get() = EventInstance(this, Event.fullscreenError())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/gotpointercapture_event)
 */
inline val <C : Document> C.gotPointerCaptureEvent: EventInstance<PointerEvent, C, Node>
    get() = EventInstance(this, PointerEvent.gotPointerCapture())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/input_event)
 */
inline val <C : Document> C.inputEvent: EventInstance<InputEvent, C, Node>
    get() = EventInstance(this, InputEvent.input())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/keydown_event)
 */
inline val <C : Document> C.keyDownEvent: EventInstance<KeyboardEvent, C, Node>
    get() = EventInstance(this, KeyboardEvent.keyDown())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/keypress_event)
 */
inline val <C : Document> C.keyPressEvent: EventInstance<KeyboardEvent, C, Node>
    get() = EventInstance(this, KeyboardEvent.keyPress())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/keyup_event)
 */
inline val <C : Document> C.keyUpEvent: EventInstance<KeyboardEvent, C, Node>
    get() = EventInstance(this, KeyboardEvent.keyUp())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/leavepictureinpicture_event)
 */
inline val <C : Document> C.leavePictureInPictureEvent: EventInstance<PictureInPictureEvent, C, Node>
    get() = EventInstance(this, PictureInPictureEvent.leavePictureInPicture())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/load_event)
 */
inline val <C : Document> C.loadEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.load())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/lostpointercapture_event)
 */
inline val <C : Document> C.lostPointerCaptureEvent: EventInstance<PointerEvent, C, Node>
    get() = EventInstance(this, PointerEvent.lostPointerCapture())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/mousedown_event)
 */
inline val <C : Document> C.mouseDownEvent: EventInstance<MouseEvent, C, Node>
    get() = EventInstance(this, MouseEvent.mouseDown())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/mousemove_event)
 */
inline val <C : Document> C.mouseMoveEvent: EventInstance<MouseEvent, C, Node>
    get() = EventInstance(this, MouseEvent.mouseMove())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/mouseout_event)
 */
inline val <C : Document> C.mouseOutEvent: EventInstance<MouseEvent, C, Node>
    get() = EventInstance(this, MouseEvent.mouseOut())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/mouseover_event)
 */
inline val <C : Document> C.mouseOverEvent: EventInstance<MouseEvent, C, Node>
    get() = EventInstance(this, MouseEvent.mouseOver())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/mouseup_event)
 */
inline val <C : Document> C.mouseUpEvent: EventInstance<MouseEvent, C, Node>
    get() = EventInstance(this, MouseEvent.mouseUp())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/paste_event)
 */
inline val <C : Document> C.pasteEvent: EventInstance<ClipboardEvent, C, Node>
    get() = EventInstance(this, ClipboardEvent.paste())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/pointercancel_event)
 */
inline val <C : Document> C.pointerCancelEvent: EventInstance<PointerEvent, C, Node>
    get() = EventInstance(this, PointerEvent.pointerCancel())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/pointerdown_event)
 */
inline val <C : Document> C.pointerDownEvent: EventInstance<PointerEvent, C, Node>
    get() = EventInstance(this, PointerEvent.pointerDown())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/pointerenter_event)
 */
inline val <C : Document> C.pointerEnterEvent: EventInstance<PointerEvent, C, C>
    get() = EventInstance(this, PointerEvent.pointerEnter())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/pointerleave_event)
 */
inline val <C : Document> C.pointerLeaveEvent: EventInstance<PointerEvent, C, C>
    get() = EventInstance(this, PointerEvent.pointerLeave())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/pointerlockchange_event)
 */
inline val <C : Document> C.pointerLockChangeEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.pointerLockChange())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/pointerlockerror_event)
 */
inline val <C : Document> C.pointerLockErrorEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.pointerLockError())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/pointermove_event)
 */
inline val <C : Document> C.pointerMoveEvent: EventInstance<PointerEvent, C, Node>
    get() = EventInstance(this, PointerEvent.pointerMove())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/pointerout_event)
 */
inline val <C : Document> C.pointerOutEvent: EventInstance<PointerEvent, C, Node>
    get() = EventInstance(this, PointerEvent.pointerOut())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/pointerover_event)
 */
inline val <C : Document> C.pointerOverEvent: EventInstance<PointerEvent, C, Node>
    get() = EventInstance(this, PointerEvent.pointerOver())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/pointerup_event)
 */
inline val <C : Document> C.pointerUpEvent: EventInstance<PointerEvent, C, Node>
    get() = EventInstance(this, PointerEvent.pointerUp())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/readystatechange_event)
 */
inline val <C : Document> C.readyStateChangeEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.readyStateChange())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/reset_event)
 */
inline val <C : Document> C.resetEvent: EventInstance<Event, C, Node>
    get() = EventInstance(this, Event.reset())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/resume_event)
 */
inline val <C : Document> C.resumeEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.resume())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/scroll_event)
 */
inline val <C : Document> C.scrollEvent: EventInstance<Event, C, Node>
    get() = EventInstance(this, Event.scroll())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/scrollend_event)
 */
inline val <C : Document> C.scrollEndEvent: EventInstance<Event, C, Node>
    get() = EventInstance(this, Event.scrollEnd())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/select_event)
 */
inline val <C : Document> C.selectEvent: EventInstance<Event, C, Node>
    get() = EventInstance(this, Event.select())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/selectionchange_event)
 */
inline val <C : Document> C.selectionChangeEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.selectionChange())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/selectstart_event)
 */
inline val <C : Document> C.selectStartEvent: EventInstance<Event, C, Node>
    get() = EventInstance(this, Event.selectStart())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/slotchange_event)
 */
inline val <C : Document> C.slotChangeEvent: EventInstance<Event, C, Node>
    get() = EventInstance(this, Event.slotChange())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/submit_event)
 */
inline val <C : Document> C.submitEvent: EventInstance<SubmitEvent, C, Node>
    get() = EventInstance(this, SubmitEvent.submit())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/touchcancel_event)
 */
inline val <C : Document> C.touchCancelEvent: EventInstance<TouchEvent, C, Node>
    get() = EventInstance(this, TouchEvent.touchCancel())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/touchend_event)
 */
inline val <C : Document> C.touchEndEvent: EventInstance<TouchEvent, C, Node>
    get() = EventInstance(this, TouchEvent.touchEnd())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/touchmove_event)
 */
inline val <C : Document> C.touchMoveEvent: EventInstance<TouchEvent, C, Node>
    get() = EventInstance(this, TouchEvent.touchMove())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/touchstart_event)
 */
inline val <C : Document> C.touchStartEvent: EventInstance<TouchEvent, C, Node>
    get() = EventInstance(this, TouchEvent.touchStart())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/transitioncancel_event)
 */
inline val <C : Document> C.transitionCancelEvent: EventInstance<TransitionEvent, C, Node>
    get() = EventInstance(this, TransitionEvent.transitionCancel())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/transitionend_event)
 */
inline val <C : Document> C.transitionEndEvent: EventInstance<TransitionEvent, C, Node>
    get() = EventInstance(this, TransitionEvent.transitionEnd())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/transitionrun_event)
 */
inline val <C : Document> C.transitionRunEvent: EventInstance<TransitionEvent, C, Node>
    get() = EventInstance(this, TransitionEvent.transitionRun())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/transitionstart_event)
 */
inline val <C : Document> C.transitionStartEvent: EventInstance<TransitionEvent, C, Node>
    get() = EventInstance(this, TransitionEvent.transitionStart())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/unload_event)
 */
inline val <C : Document> C.unloadEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.unload())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/visibilitychange_event)
 */
inline val <C : Document> C.visibilityChangeEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.visibilityChange())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/wheel_event)
 */
inline val <C : Document> C.wheelEvent: EventInstance<WheelEvent, C, Node>
    get() = EventInstance(this, WheelEvent.wheel())
