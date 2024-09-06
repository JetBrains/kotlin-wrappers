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
    get() = EventInstance(this, Event.ABORT)

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/afterprint_event)
 */
inline val <C : Window> C.afterPrintEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.AFTER_PRINT)

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/animationcancel_event)
 */
inline val <C : Window> C.animationCancelEvent: EventInstance<AnimationEvent, C, Node>
    get() = EventInstance(this, AnimationEvent.ANIMATION_CANCEL)

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/animationend_event)
 */
inline val <C : Window> C.animationEndEvent: EventInstance<AnimationEvent, C, Node>
    get() = EventInstance(this, AnimationEvent.ANIMATION_END)

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/animationiteration_event)
 */
inline val <C : Window> C.animationIterationEvent: EventInstance<AnimationEvent, C, Node>
    get() = EventInstance(this, AnimationEvent.ANIMATION_ITERATION)

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/animationstart_event)
 */
inline val <C : Window> C.animationStartEvent: EventInstance<AnimationEvent, C, Node>
    get() = EventInstance(this, AnimationEvent.ANIMATION_START)

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/auxclick_event)
 */
inline val <C : Window> C.auxClickEvent: EventInstance<MouseEvent, C, Node>
    get() = EventInstance(this, MouseEvent.AUX_CLICK)

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/beforeinput_event)
 */
inline val <C : Window> C.beforeInputEvent: EventInstance<InputEvent, C, Node>
    get() = EventInstance(this, InputEvent.BEFORE_INPUT)

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/beforeprint_event)
 */
inline val <C : Window> C.beforePrintEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.BEFORE_PRINT)

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/beforeunload_event)
 */
inline val <C : Window> C.beforeUnloadEvent: EventInstance<BeforeUnloadEvent, C, C>
    get() = EventInstance(this, BeforeUnloadEvent.BEFORE_UNLOAD)

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/blur_event)
 */
inline val <C : Window> C.blurEvent: EventInstance<FocusEvent, C, C>
    get() = EventInstance(this, FocusEvent.BLUR)

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/cancel_event)
 */
inline val <C : Window> C.cancelEvent: EventInstance<Event, C, Node>
    get() = EventInstance(this, Event.CANCEL)

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/change_event)
 */
inline val <C : Window> C.changeEvent: EventInstance<Event, C, Node>
    get() = EventInstance(this, Event.CHANGE)

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/click_event)
 */
inline val <C : Window> C.clickEvent: EventInstance<MouseEvent, C, Node>
    get() = EventInstance(this, MouseEvent.CLICK)

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/compositionend_event)
 */
inline val <C : Window> C.compositionEndEvent: EventInstance<CompositionEvent, C, Node>
    get() = EventInstance(this, CompositionEvent.COMPOSITION_END)

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/compositionstart_event)
 */
inline val <C : Window> C.compositionStartEvent: EventInstance<CompositionEvent, C, Node>
    get() = EventInstance(this, CompositionEvent.COMPOSITION_START)

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/compositionupdate_event)
 */
inline val <C : Window> C.compositionUpdateEvent: EventInstance<CompositionEvent, C, Node>
    get() = EventInstance(this, CompositionEvent.COMPOSITION_UPDATE)

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/contextmenu_event)
 */
inline val <C : Window> C.contextMenuEvent: EventInstance<MouseEvent, C, Node>
    get() = EventInstance(this, MouseEvent.CONTEXT_MENU)

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/copy_event)
 */
inline val <C : Window> C.copyEvent: EventInstance<ClipboardEvent, C, Node>
    get() = EventInstance(this, ClipboardEvent.COPY)

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/cut_event)
 */
inline val <C : Window> C.cutEvent: EventInstance<ClipboardEvent, C, Node>
    get() = EventInstance(this, ClipboardEvent.CUT)

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/dblclick_event)
 */
inline val <C : Window> C.dblClickEvent: EventInstance<MouseEvent, C, Node>
    get() = EventInstance(this, MouseEvent.DBL_CLICK)

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/devicemotion_event)
 */
inline val <C : Window> C.deviceMotionEvent: EventInstance<DeviceMotionEvent, C, C>
    get() = EventInstance(this, DeviceMotionEvent.DEVICE_MOTION)

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/deviceorientation_event)
 */
inline val <C : Window> C.deviceOrientationEvent: EventInstance<DeviceOrientationEvent, C, C>
    get() = EventInstance(this, DeviceOrientationEvent.DEVICE_ORIENTATION)

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/deviceorientationabsolute_event)
 */
inline val <C : Window> C.deviceOrientationAbsoluteEvent: EventInstance<DeviceOrientationEvent, C, C>
    get() = EventInstance(this, DeviceOrientationEvent.DEVICE_ORIENTATION_ABSOLUTE)

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/DOMContentLoaded_event)
 */
inline val <C : Window> C.domContentLoadedEvent: EventInstance<Event, C, Window>
    get() = EventInstance(this, Event.DOM_CONTENT_LOADED)

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/drag_event)
 */
inline val <C : Window> C.dragEvent: EventInstance<DragEvent, C, Node>
    get() = EventInstance(this, DragEvent.DRAG)

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/dragend_event)
 */
inline val <C : Window> C.dragEndEvent: EventInstance<DragEvent, C, Node>
    get() = EventInstance(this, DragEvent.DRAG_END)

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/dragenter_event)
 */
inline val <C : Window> C.dragEnterEvent: EventInstance<DragEvent, C, Node>
    get() = EventInstance(this, DragEvent.DRAG_ENTER)

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/dragleave_event)
 */
inline val <C : Window> C.dragLeaveEvent: EventInstance<DragEvent, C, Node>
    get() = EventInstance(this, DragEvent.DRAG_LEAVE)

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/dragover_event)
 */
inline val <C : Window> C.dragOverEvent: EventInstance<DragEvent, C, Node>
    get() = EventInstance(this, DragEvent.DRAG_OVER)

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/dragstart_event)
 */
inline val <C : Window> C.dragStartEvent: EventInstance<DragEvent, C, Node>
    get() = EventInstance(this, DragEvent.DRAG_START)

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/drop_event)
 */
inline val <C : Window> C.dropEvent: EventInstance<DragEvent, C, Node>
    get() = EventInstance(this, DragEvent.DROP)

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/enterpictureinpicture_event)
 */
inline val <C : Window> C.enterPictureInPictureEvent: EventInstance<PictureInPictureEvent, C, Node>
    get() = EventInstance(this, PictureInPictureEvent.ENTER_PICTURE_IN_PICTURE)

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/error_event)
 */
inline val <C : Window> C.errorEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.ERROR)

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/focus_event)
 */
inline val <C : Window> C.focusEvent: EventInstance<FocusEvent, C, C>
    get() = EventInstance(this, FocusEvent.FOCUS)

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/focusin_event)
 */
inline val <C : Window> C.focusInEvent: EventInstance<FocusEvent, C, Node>
    get() = EventInstance(this, FocusEvent.FOCUS_IN)

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/focusout_event)
 */
inline val <C : Window> C.focusOutEvent: EventInstance<FocusEvent, C, Node>
    get() = EventInstance(this, FocusEvent.FOCUS_OUT)

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/formdata_event)
 */
inline val <C : Window> C.formDataEvent: EventInstance<FormDataEvent, C, Node>
    get() = EventInstance(this, FormDataEvent.FORM_DATA)

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/fullscreenchange_event)
 */
inline val <C : Window> C.fullscreenChangeEvent: EventInstance<Event, C, Node>
    get() = EventInstance(this, Event.FULLSCREEN_CHANGE)

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/fullscreenerror_event)
 */
inline val <C : Window> C.fullscreenErrorEvent: EventInstance<Event, C, Node>
    get() = EventInstance(this, Event.FULLSCREEN_ERROR)

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/gamepadconnected_event)
 */
inline val <C : Window> C.gamepadConnectedEvent: EventInstance<GamepadEvent, C, C>
    get() = EventInstance(this, GamepadEvent.GAMEPAD_CONNECTED)

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/gamepaddisconnected_event)
 */
inline val <C : Window> C.gamepadDisconnectedEvent: EventInstance<GamepadEvent, C, C>
    get() = EventInstance(this, GamepadEvent.GAMEPAD_DISCONNECTED)

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/gotpointercapture_event)
 */
inline val <C : Window> C.gotPointerCaptureEvent: EventInstance<PointerEvent, C, Node>
    get() = EventInstance(this, PointerEvent.GOT_POINTER_CAPTURE)

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/hashchange_event)
 */
inline val <C : Window> C.hashChangeEvent: EventInstance<HashChangeEvent, C, C>
    get() = EventInstance(this, HashChangeEvent.HASH_CHANGE)

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/input_event)
 */
inline val <C : Window> C.inputEvent: EventInstance<InputEvent, C, Node>
    get() = EventInstance(this, InputEvent.INPUT)

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/keydown_event)
 */
inline val <C : Window> C.keyDownEvent: EventInstance<KeyboardEvent, C, Node>
    get() = EventInstance(this, KeyboardEvent.KEY_DOWN)

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/keypress_event)
 */
inline val <C : Window> C.keyPressEvent: EventInstance<KeyboardEvent, C, Node>
    get() = EventInstance(this, KeyboardEvent.KEY_PRESS)

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/keyup_event)
 */
inline val <C : Window> C.keyUpEvent: EventInstance<KeyboardEvent, C, Node>
    get() = EventInstance(this, KeyboardEvent.KEY_UP)

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/languagechange_event)
 */
inline val <C : Window> C.languageChangeEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.LANGUAGE_CHANGE)

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/leavepictureinpicture_event)
 */
inline val <C : Window> C.leavePictureInPictureEvent: EventInstance<PictureInPictureEvent, C, Node>
    get() = EventInstance(this, PictureInPictureEvent.LEAVE_PICTURE_IN_PICTURE)

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/load_event)
 */
inline val <C : Window> C.loadEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.LOAD)

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/lostpointercapture_event)
 */
inline val <C : Window> C.lostPointerCaptureEvent: EventInstance<PointerEvent, C, Node>
    get() = EventInstance(this, PointerEvent.LOST_POINTER_CAPTURE)

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/message_event)
 */
inline val <C : Window> C.messageEvent: EventInstance<MessageEvent<Any?>, C, C>
    get() = EventInstance(this, MessageEvent.MESSAGE)

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/messageerror_event)
 */
inline val <C : Window> C.messageErrorEvent: EventInstance<MessageEvent<Any?>, C, C>
    get() = EventInstance(this, MessageEvent.MESSAGE_ERROR)

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/mousedown_event)
 */
inline val <C : Window> C.mouseDownEvent: EventInstance<MouseEvent, C, Node>
    get() = EventInstance(this, MouseEvent.MOUSE_DOWN)

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/mousemove_event)
 */
inline val <C : Window> C.mouseMoveEvent: EventInstance<MouseEvent, C, Node>
    get() = EventInstance(this, MouseEvent.MOUSE_MOVE)

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/mouseout_event)
 */
inline val <C : Window> C.mouseOutEvent: EventInstance<MouseEvent, C, Node>
    get() = EventInstance(this, MouseEvent.MOUSE_OUT)

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/mouseover_event)
 */
inline val <C : Window> C.mouseOverEvent: EventInstance<MouseEvent, C, Node>
    get() = EventInstance(this, MouseEvent.MOUSE_OVER)

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/mouseup_event)
 */
inline val <C : Window> C.mouseUpEvent: EventInstance<MouseEvent, C, Node>
    get() = EventInstance(this, MouseEvent.MOUSE_UP)

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/offline_event)
 */
inline val <C : Window> C.offlineEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.OFFLINE)

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/online_event)
 */
inline val <C : Window> C.onlineEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.ONLINE)

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/pagehide_event)
 */
inline val <C : Window> C.pageHideEvent: EventInstance<PageTransitionEvent, C, C>
    get() = EventInstance(this, PageTransitionEvent.PAGE_HIDE)

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/pageshow_event)
 */
inline val <C : Window> C.pageShowEvent: EventInstance<PageTransitionEvent, C, C>
    get() = EventInstance(this, PageTransitionEvent.PAGE_SHOW)

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/paste_event)
 */
inline val <C : Window> C.pasteEvent: EventInstance<ClipboardEvent, C, Node>
    get() = EventInstance(this, ClipboardEvent.PASTE)

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/pointercancel_event)
 */
inline val <C : Window> C.pointerCancelEvent: EventInstance<PointerEvent, C, Node>
    get() = EventInstance(this, PointerEvent.POINTER_CANCEL)

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/pointerdown_event)
 */
inline val <C : Window> C.pointerDownEvent: EventInstance<PointerEvent, C, Node>
    get() = EventInstance(this, PointerEvent.POINTER_DOWN)

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/pointerenter_event)
 */
inline val <C : Window> C.pointerEnterEvent: EventInstance<PointerEvent, C, C>
    get() = EventInstance(this, PointerEvent.POINTER_ENTER)

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/pointerleave_event)
 */
inline val <C : Window> C.pointerLeaveEvent: EventInstance<PointerEvent, C, C>
    get() = EventInstance(this, PointerEvent.POINTER_LEAVE)

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/pointermove_event)
 */
inline val <C : Window> C.pointerMoveEvent: EventInstance<PointerEvent, C, Node>
    get() = EventInstance(this, PointerEvent.POINTER_MOVE)

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/pointerout_event)
 */
inline val <C : Window> C.pointerOutEvent: EventInstance<PointerEvent, C, Node>
    get() = EventInstance(this, PointerEvent.POINTER_OUT)

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/pointerover_event)
 */
inline val <C : Window> C.pointerOverEvent: EventInstance<PointerEvent, C, Node>
    get() = EventInstance(this, PointerEvent.POINTER_OVER)

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/pointerup_event)
 */
inline val <C : Window> C.pointerUpEvent: EventInstance<PointerEvent, C, Node>
    get() = EventInstance(this, PointerEvent.POINTER_UP)

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/popstate_event)
 */
inline val <C : Window> C.popStateEvent: EventInstance<PopStateEvent, C, C>
    get() = EventInstance(this, PopStateEvent.POP_STATE)

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/rejectionhandled_event)
 */
inline val <C : Window> C.rejectionHandledEvent: EventInstance<PromiseRejectionEvent, C, C>
    get() = EventInstance(this, PromiseRejectionEvent.REJECTION_HANDLED)

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/reset_event)
 */
inline val <C : Window> C.resetEvent: EventInstance<Event, C, Node>
    get() = EventInstance(this, Event.RESET)

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/resize_event)
 */
inline val <C : Window> C.resizeEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.RESIZE)

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/scroll_event)
 */
inline val <C : Window> C.scrollEvent: EventInstance<Event, C, Node>
    get() = EventInstance(this, Event.SCROLL)

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/scrollend_event)
 */
inline val <C : Window> C.scrollEndEvent: EventInstance<Event, C, Node>
    get() = EventInstance(this, Event.SCROLL_END)

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/securitypolicyviolation_event)
 */
inline val <C : Window> C.securityPolicyViolationEvent: EventInstance<SecurityPolicyViolationEvent, C, C>
    get() = EventInstance(this, SecurityPolicyViolationEvent.SECURITY_POLICY_VIOLATION)

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/select_event)
 */
inline val <C : Window> C.selectEvent: EventInstance<Event, C, Node>
    get() = EventInstance(this, Event.SELECT)

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/selectionchange_event)
 */
inline val <C : Window> C.selectionChangeEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.SELECTION_CHANGE)

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/selectstart_event)
 */
inline val <C : Window> C.selectStartEvent: EventInstance<Event, C, Node>
    get() = EventInstance(this, Event.SELECT_START)

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/slotchange_event)
 */
inline val <C : Window> C.slotChangeEvent: EventInstance<Event, C, Node>
    get() = EventInstance(this, Event.SLOT_CHANGE)

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/storage_event)
 */
inline val <C : Window> C.storageEvent: EventInstance<StorageEvent, C, C>
    get() = EventInstance(this, StorageEvent.STORAGE)

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/submit_event)
 */
inline val <C : Window> C.submitEvent: EventInstance<SubmitEvent, C, Node>
    get() = EventInstance(this, SubmitEvent.SUBMIT)

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/touchcancel_event)
 */
inline val <C : Window> C.touchCancelEvent: EventInstance<TouchEvent, C, Node>
    get() = EventInstance(this, TouchEvent.TOUCH_CANCEL)

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/touchend_event)
 */
inline val <C : Window> C.touchEndEvent: EventInstance<TouchEvent, C, Node>
    get() = EventInstance(this, TouchEvent.TOUCH_END)

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/touchmove_event)
 */
inline val <C : Window> C.touchMoveEvent: EventInstance<TouchEvent, C, Node>
    get() = EventInstance(this, TouchEvent.TOUCH_MOVE)

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/touchstart_event)
 */
inline val <C : Window> C.touchStartEvent: EventInstance<TouchEvent, C, Node>
    get() = EventInstance(this, TouchEvent.TOUCH_START)

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/transitioncancel_event)
 */
inline val <C : Window> C.transitionCancelEvent: EventInstance<TransitionEvent, C, Node>
    get() = EventInstance(this, TransitionEvent.TRANSITION_CANCEL)

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/transitionend_event)
 */
inline val <C : Window> C.transitionEndEvent: EventInstance<TransitionEvent, C, Node>
    get() = EventInstance(this, TransitionEvent.TRANSITION_END)

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/transitionrun_event)
 */
inline val <C : Window> C.transitionRunEvent: EventInstance<TransitionEvent, C, Node>
    get() = EventInstance(this, TransitionEvent.TRANSITION_RUN)

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/transitionstart_event)
 */
inline val <C : Window> C.transitionStartEvent: EventInstance<TransitionEvent, C, Node>
    get() = EventInstance(this, TransitionEvent.TRANSITION_START)

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/unhandledrejection_event)
 */
inline val <C : Window> C.unhandledRejectionEvent: EventInstance<PromiseRejectionEvent, C, C>
    get() = EventInstance(this, PromiseRejectionEvent.UNHANDLED_REJECTION)

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/unload_event)
 */
inline val <C : Window> C.unloadEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.UNLOAD)

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/wheel_event)
 */
inline val <C : Window> C.wheelEvent: EventInstance<WheelEvent, C, Node>
    get() = EventInstance(this, WheelEvent.WHEEL)
