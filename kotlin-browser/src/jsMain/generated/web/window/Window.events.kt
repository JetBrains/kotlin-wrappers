// Automatically generated - do not modify!

package web.window

import web.animations.AnimationEvent
import web.clipboard.ClipboardEvent
import web.csp.SecurityPolicyViolationEvent
import web.cssom.TransitionEvent
import web.device.DeviceMotionEvent
import web.device.DeviceOrientationEvent
import web.dom.Node
import web.events.Event
import web.events.EventInstance
import web.form.FormDataEvent
import web.form.SubmitEvent
import web.gamepad.GamepadEvent
import web.history.HashChangeEvent
import web.history.PageTransitionEvent
import web.history.PopStateEvent
import web.messaging.MessageEvent
import web.pip.PictureInPictureEvent
import web.promise.PromiseRejectionEvent
import web.storage.StorageEvent
import web.uievents.*

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/abort_event)
 */
inline val <C : Window> C.abortEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.abort())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/afterprint_event)
 */
inline val <C : Window> C.afterPrintEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.afterPrint())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/animationcancel_event)
 */
inline val <C : Window> C.animationCancelEvent: EventInstance<AnimationEvent, C, Node>
    get() = EventInstance(this, AnimationEvent.animationCancel())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/animationend_event)
 */
inline val <C : Window> C.animationEndEvent: EventInstance<AnimationEvent, C, Node>
    get() = EventInstance(this, AnimationEvent.animationEnd())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/animationiteration_event)
 */
inline val <C : Window> C.animationIterationEvent: EventInstance<AnimationEvent, C, Node>
    get() = EventInstance(this, AnimationEvent.animationIteration())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/animationstart_event)
 */
inline val <C : Window> C.animationStartEvent: EventInstance<AnimationEvent, C, Node>
    get() = EventInstance(this, AnimationEvent.animationStart())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/auxclick_event)
 */
inline val <C : Window> C.auxClickEvent: EventInstance<MouseEvent, C, Node>
    get() = EventInstance(this, MouseEvent.auxClick())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/beforeinput_event)
 */
inline val <C : Window> C.beforeInputEvent: EventInstance<InputEvent, C, Node>
    get() = EventInstance(this, InputEvent.beforeInput())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/beforeprint_event)
 */
inline val <C : Window> C.beforePrintEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.beforePrint())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/beforeunload_event)
 */
inline val <C : Window> C.beforeUnloadEvent: EventInstance<BeforeUnloadEvent, C, C>
    get() = EventInstance(this, BeforeUnloadEvent.beforeUnload())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/blur_event)
 */
inline val <C : Window> C.blurEvent: EventInstance<FocusEvent, C, C>
    get() = EventInstance(this, FocusEvent.blur())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/cancel_event)
 */
inline val <C : Window> C.cancelEvent: EventInstance<Event, C, Node>
    get() = EventInstance(this, Event.cancel())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/change_event)
 */
inline val <C : Window> C.changeEvent: EventInstance<Event, C, Node>
    get() = EventInstance(this, Event.change())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/click_event)
 */
inline val <C : Window> C.clickEvent: EventInstance<MouseEvent, C, Node>
    get() = EventInstance(this, MouseEvent.click())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/compositionend_event)
 */
inline val <C : Window> C.compositionEndEvent: EventInstance<CompositionEvent, C, Node>
    get() = EventInstance(this, CompositionEvent.compositionEnd())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/compositionstart_event)
 */
inline val <C : Window> C.compositionStartEvent: EventInstance<CompositionEvent, C, Node>
    get() = EventInstance(this, CompositionEvent.compositionStart())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/compositionupdate_event)
 */
inline val <C : Window> C.compositionUpdateEvent: EventInstance<CompositionEvent, C, Node>
    get() = EventInstance(this, CompositionEvent.compositionUpdate())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/contextmenu_event)
 */
inline val <C : Window> C.contextMenuEvent: EventInstance<MouseEvent, C, Node>
    get() = EventInstance(this, MouseEvent.contextMenu())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/copy_event)
 */
inline val <C : Window> C.copyEvent: EventInstance<ClipboardEvent, C, Node>
    get() = EventInstance(this, ClipboardEvent.copy())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/cut_event)
 */
inline val <C : Window> C.cutEvent: EventInstance<ClipboardEvent, C, Node>
    get() = EventInstance(this, ClipboardEvent.cut())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/dblclick_event)
 */
inline val <C : Window> C.dblClickEvent: EventInstance<MouseEvent, C, Node>
    get() = EventInstance(this, MouseEvent.dblClick())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/devicemotion_event)
 */
inline val <C : Window> C.deviceMotionEvent: EventInstance<DeviceMotionEvent, C, C>
    get() = EventInstance(this, DeviceMotionEvent.deviceMotion())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/deviceorientation_event)
 */
inline val <C : Window> C.deviceOrientationEvent: EventInstance<DeviceOrientationEvent, C, C>
    get() = EventInstance(this, DeviceOrientationEvent.deviceOrientation())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/deviceorientationabsolute_event)
 */
inline val <C : Window> C.deviceOrientationAbsoluteEvent: EventInstance<DeviceOrientationEvent, C, C>
    get() = EventInstance(this, DeviceOrientationEvent.deviceOrientationAbsolute())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/DOMContentLoaded_event)
 */
inline val <C : Window> C.domContentLoadedEvent: EventInstance<Event, C, Window>
    get() = EventInstance(this, Event.domContentLoaded())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/drag_event)
 */
inline val <C : Window> C.dragEvent: EventInstance<DragEvent, C, Node>
    get() = EventInstance(this, DragEvent.drag())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/dragend_event)
 */
inline val <C : Window> C.dragEndEvent: EventInstance<DragEvent, C, Node>
    get() = EventInstance(this, DragEvent.dragEnd())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/dragenter_event)
 */
inline val <C : Window> C.dragEnterEvent: EventInstance<DragEvent, C, Node>
    get() = EventInstance(this, DragEvent.dragEnter())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/dragleave_event)
 */
inline val <C : Window> C.dragLeaveEvent: EventInstance<DragEvent, C, Node>
    get() = EventInstance(this, DragEvent.dragLeave())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/dragover_event)
 */
inline val <C : Window> C.dragOverEvent: EventInstance<DragEvent, C, Node>
    get() = EventInstance(this, DragEvent.dragOver())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/dragstart_event)
 */
inline val <C : Window> C.dragStartEvent: EventInstance<DragEvent, C, Node>
    get() = EventInstance(this, DragEvent.dragStart())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/drop_event)
 */
inline val <C : Window> C.dropEvent: EventInstance<DragEvent, C, Node>
    get() = EventInstance(this, DragEvent.drop())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/enterpictureinpicture_event)
 */
inline val <C : Window> C.enterPictureInPictureEvent: EventInstance<PictureInPictureEvent, C, Node>
    get() = EventInstance(this, PictureInPictureEvent.enterPictureInPicture())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/error_event)
 */
inline val <C : Window> C.errorEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.error())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/focus_event)
 */
inline val <C : Window> C.focusEvent: EventInstance<FocusEvent, C, C>
    get() = EventInstance(this, FocusEvent.focus())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/focusin_event)
 */
inline val <C : Window> C.focusInEvent: EventInstance<FocusEvent, C, Node>
    get() = EventInstance(this, FocusEvent.focusIn())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/focusout_event)
 */
inline val <C : Window> C.focusOutEvent: EventInstance<FocusEvent, C, Node>
    get() = EventInstance(this, FocusEvent.focusOut())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/formdata_event)
 */
inline val <C : Window> C.formDataEvent: EventInstance<FormDataEvent, C, Node>
    get() = EventInstance(this, FormDataEvent.formData())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/fullscreenchange_event)
 */
inline val <C : Window> C.fullscreenChangeEvent: EventInstance<Event, C, Node>
    get() = EventInstance(this, Event.fullscreenChange())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/fullscreenerror_event)
 */
inline val <C : Window> C.fullscreenErrorEvent: EventInstance<Event, C, Node>
    get() = EventInstance(this, Event.fullscreenError())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/gamepadconnected_event)
 */
inline val <C : Window> C.gamepadConnectedEvent: EventInstance<GamepadEvent, C, C>
    get() = EventInstance(this, GamepadEvent.gamepadConnected())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/gamepaddisconnected_event)
 */
inline val <C : Window> C.gamepadDisconnectedEvent: EventInstance<GamepadEvent, C, C>
    get() = EventInstance(this, GamepadEvent.gamepadDisconnected())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/gotpointercapture_event)
 */
inline val <C : Window> C.gotPointerCaptureEvent: EventInstance<PointerEvent, C, Node>
    get() = EventInstance(this, PointerEvent.gotPointerCapture())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/hashchange_event)
 */
inline val <C : Window> C.hashChangeEvent: EventInstance<HashChangeEvent, C, C>
    get() = EventInstance(this, HashChangeEvent.hashChange())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/input_event)
 */
inline val <C : Window> C.inputEvent: EventInstance<InputEvent, C, Node>
    get() = EventInstance(this, InputEvent.input())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/keydown_event)
 */
inline val <C : Window> C.keyDownEvent: EventInstance<KeyboardEvent, C, Node>
    get() = EventInstance(this, KeyboardEvent.keyDown())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/keypress_event)
 */
inline val <C : Window> C.keyPressEvent: EventInstance<KeyboardEvent, C, Node>
    get() = EventInstance(this, KeyboardEvent.keyPress())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/keyup_event)
 */
inline val <C : Window> C.keyUpEvent: EventInstance<KeyboardEvent, C, Node>
    get() = EventInstance(this, KeyboardEvent.keyUp())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/languagechange_event)
 */
inline val <C : Window> C.languageChangeEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.languageChange())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/leavepictureinpicture_event)
 */
inline val <C : Window> C.leavePictureInPictureEvent: EventInstance<PictureInPictureEvent, C, Node>
    get() = EventInstance(this, PictureInPictureEvent.leavePictureInPicture())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/load_event)
 */
inline val <C : Window> C.loadEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.load())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/lostpointercapture_event)
 */
inline val <C : Window> C.lostPointerCaptureEvent: EventInstance<PointerEvent, C, Node>
    get() = EventInstance(this, PointerEvent.lostPointerCapture())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/message_event)
 */
inline val <C : Window> C.messageEvent: EventInstance<MessageEvent<Any?>, C, C>
    get() = EventInstance(this, MessageEvent.message())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/messageerror_event)
 */
inline val <C : Window> C.messageErrorEvent: EventInstance<MessageEvent<Any?>, C, C>
    get() = EventInstance(this, MessageEvent.messageError())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/mousedown_event)
 */
inline val <C : Window> C.mouseDownEvent: EventInstance<MouseEvent, C, Node>
    get() = EventInstance(this, MouseEvent.mouseDown())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/mousemove_event)
 */
inline val <C : Window> C.mouseMoveEvent: EventInstance<MouseEvent, C, Node>
    get() = EventInstance(this, MouseEvent.mouseMove())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/mouseout_event)
 */
inline val <C : Window> C.mouseOutEvent: EventInstance<MouseEvent, C, Node>
    get() = EventInstance(this, MouseEvent.mouseOut())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/mouseover_event)
 */
inline val <C : Window> C.mouseOverEvent: EventInstance<MouseEvent, C, Node>
    get() = EventInstance(this, MouseEvent.mouseOver())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/mouseup_event)
 */
inline val <C : Window> C.mouseUpEvent: EventInstance<MouseEvent, C, Node>
    get() = EventInstance(this, MouseEvent.mouseUp())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/offline_event)
 */
inline val <C : Window> C.offlineEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.offline())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/online_event)
 */
inline val <C : Window> C.onlineEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.online())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/pagehide_event)
 */
inline val <C : Window> C.pageHideEvent: EventInstance<PageTransitionEvent, C, C>
    get() = EventInstance(this, PageTransitionEvent.pageHide())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/pageshow_event)
 */
inline val <C : Window> C.pageShowEvent: EventInstance<PageTransitionEvent, C, C>
    get() = EventInstance(this, PageTransitionEvent.pageShow())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/paste_event)
 */
inline val <C : Window> C.pasteEvent: EventInstance<ClipboardEvent, C, Node>
    get() = EventInstance(this, ClipboardEvent.paste())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/pointercancel_event)
 */
inline val <C : Window> C.pointerCancelEvent: EventInstance<PointerEvent, C, Node>
    get() = EventInstance(this, PointerEvent.pointerCancel())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/pointerdown_event)
 */
inline val <C : Window> C.pointerDownEvent: EventInstance<PointerEvent, C, Node>
    get() = EventInstance(this, PointerEvent.pointerDown())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/pointerenter_event)
 */
inline val <C : Window> C.pointerEnterEvent: EventInstance<PointerEvent, C, C>
    get() = EventInstance(this, PointerEvent.pointerEnter())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/pointerleave_event)
 */
inline val <C : Window> C.pointerLeaveEvent: EventInstance<PointerEvent, C, C>
    get() = EventInstance(this, PointerEvent.pointerLeave())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/pointermove_event)
 */
inline val <C : Window> C.pointerMoveEvent: EventInstance<PointerEvent, C, Node>
    get() = EventInstance(this, PointerEvent.pointerMove())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/pointerout_event)
 */
inline val <C : Window> C.pointerOutEvent: EventInstance<PointerEvent, C, Node>
    get() = EventInstance(this, PointerEvent.pointerOut())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/pointerover_event)
 */
inline val <C : Window> C.pointerOverEvent: EventInstance<PointerEvent, C, Node>
    get() = EventInstance(this, PointerEvent.pointerOver())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/pointerup_event)
 */
inline val <C : Window> C.pointerUpEvent: EventInstance<PointerEvent, C, Node>
    get() = EventInstance(this, PointerEvent.pointerUp())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/popstate_event)
 */
inline val <C : Window> C.popStateEvent: EventInstance<PopStateEvent, C, C>
    get() = EventInstance(this, PopStateEvent.popState())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/rejectionhandled_event)
 */
inline val <C : Window> C.rejectionHandledEvent: EventInstance<PromiseRejectionEvent, C, C>
    get() = EventInstance(this, PromiseRejectionEvent.rejectionHandled())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/reset_event)
 */
inline val <C : Window> C.resetEvent: EventInstance<Event, C, Node>
    get() = EventInstance(this, Event.reset())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/resize_event)
 */
inline val <C : Window> C.resizeEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.resize())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/scroll_event)
 */
inline val <C : Window> C.scrollEvent: EventInstance<Event, C, Node>
    get() = EventInstance(this, Event.scroll())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/scrollend_event)
 */
inline val <C : Window> C.scrollEndEvent: EventInstance<Event, C, Node>
    get() = EventInstance(this, Event.scrollEnd())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/securitypolicyviolation_event)
 */
inline val <C : Window> C.securityPolicyViolationEvent: EventInstance<SecurityPolicyViolationEvent, C, C>
    get() = EventInstance(this, SecurityPolicyViolationEvent.securityPolicyViolation())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/select_event)
 */
inline val <C : Window> C.selectEvent: EventInstance<Event, C, Node>
    get() = EventInstance(this, Event.select())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/selectionchange_event)
 */
inline val <C : Window> C.selectionChangeEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.selectionChange())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/selectstart_event)
 */
inline val <C : Window> C.selectStartEvent: EventInstance<Event, C, Node>
    get() = EventInstance(this, Event.selectStart())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/slotchange_event)
 */
inline val <C : Window> C.slotChangeEvent: EventInstance<Event, C, Node>
    get() = EventInstance(this, Event.slotChange())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/storage_event)
 */
inline val <C : Window> C.storageEvent: EventInstance<StorageEvent, C, C>
    get() = EventInstance(this, StorageEvent.storage())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/submit_event)
 */
inline val <C : Window> C.submitEvent: EventInstance<SubmitEvent, C, Node>
    get() = EventInstance(this, SubmitEvent.submit())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/touchcancel_event)
 */
inline val <C : Window> C.touchCancelEvent: EventInstance<TouchEvent, C, Node>
    get() = EventInstance(this, TouchEvent.touchCancel())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/touchend_event)
 */
inline val <C : Window> C.touchEndEvent: EventInstance<TouchEvent, C, Node>
    get() = EventInstance(this, TouchEvent.touchEnd())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/touchmove_event)
 */
inline val <C : Window> C.touchMoveEvent: EventInstance<TouchEvent, C, Node>
    get() = EventInstance(this, TouchEvent.touchMove())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/touchstart_event)
 */
inline val <C : Window> C.touchStartEvent: EventInstance<TouchEvent, C, Node>
    get() = EventInstance(this, TouchEvent.touchStart())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/transitioncancel_event)
 */
inline val <C : Window> C.transitionCancelEvent: EventInstance<TransitionEvent, C, Node>
    get() = EventInstance(this, TransitionEvent.transitionCancel())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/transitionend_event)
 */
inline val <C : Window> C.transitionEndEvent: EventInstance<TransitionEvent, C, Node>
    get() = EventInstance(this, TransitionEvent.transitionEnd())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/transitionrun_event)
 */
inline val <C : Window> C.transitionRunEvent: EventInstance<TransitionEvent, C, Node>
    get() = EventInstance(this, TransitionEvent.transitionRun())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/transitionstart_event)
 */
inline val <C : Window> C.transitionStartEvent: EventInstance<TransitionEvent, C, Node>
    get() = EventInstance(this, TransitionEvent.transitionStart())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/unhandledrejection_event)
 */
inline val <C : Window> C.unhandledRejectionEvent: EventInstance<PromiseRejectionEvent, C, C>
    get() = EventInstance(this, PromiseRejectionEvent.unhandledRejection())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/unload_event)
 */
inline val <C : Window> C.unloadEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.unload())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/wheel_event)
 */
inline val <C : Window> C.wheelEvent: EventInstance<WheelEvent, C, Node>
    get() = EventInstance(this, WheelEvent.wheel())
