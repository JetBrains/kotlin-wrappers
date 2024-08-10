// Automatically generated - do not modify!

package web.window

import web.animations.AnimationEvent
import web.clipboard.ClipboardEvent
import web.csp.SecurityPolicyViolationEvent
import web.cssom.TransitionEvent
import web.device.DeviceMotionEvent
import web.device.DeviceOrientationEvent
import web.dom.*
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

inline val <C : Window> C.abortEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.abort())

inline val <C : Window> C.afterPrintEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.afterPrint())

inline val <C : Window> C.animationCancelEvent: EventInstance<AnimationEvent, C, Node>
    get() = EventInstance(this, AnimationEvent.animationCancel())

inline val <C : Window> C.animationEndEvent: EventInstance<AnimationEvent, C, Node>
    get() = EventInstance(this, AnimationEvent.animationEnd())

inline val <C : Window> C.animationIterationEvent: EventInstance<AnimationEvent, C, Node>
    get() = EventInstance(this, AnimationEvent.animationIteration())

inline val <C : Window> C.animationStartEvent: EventInstance<AnimationEvent, C, Node>
    get() = EventInstance(this, AnimationEvent.animationStart())

inline val <C : Window> C.auxClickEvent: EventInstance<MouseEvent, C, Node>
    get() = EventInstance(this, MouseEvent.auxClick())

inline val <C : Window> C.beforeInputEvent: EventInstance<InputEvent, C, Node>
    get() = EventInstance(this, InputEvent.beforeInput())

inline val <C : Window> C.beforePrintEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.beforePrint())

inline val <C : Window> C.beforeUnloadEvent: EventInstance<BeforeUnloadEvent, C, C>
    get() = EventInstance(this, BeforeUnloadEvent.beforeUnload())

inline val <C : Window> C.blurEvent: EventInstance<FocusEvent, C, C>
    get() = EventInstance(this, FocusEvent.blur())

inline val <C : Window> C.cancelEvent: EventInstance<Event, C, Node>
    get() = EventInstance(this, Event.cancel())

inline val <C : Window> C.changeEvent: EventInstance<Event, C, Node>
    get() = EventInstance(this, Event.change())

inline val <C : Window> C.clickEvent: EventInstance<MouseEvent, C, Node>
    get() = EventInstance(this, MouseEvent.click())

inline val <C : Window> C.compositionEndEvent: EventInstance<CompositionEvent, C, Node>
    get() = EventInstance(this, CompositionEvent.compositionEnd())

inline val <C : Window> C.compositionStartEvent: EventInstance<CompositionEvent, C, Node>
    get() = EventInstance(this, CompositionEvent.compositionStart())

inline val <C : Window> C.compositionUpdateEvent: EventInstance<CompositionEvent, C, Node>
    get() = EventInstance(this, CompositionEvent.compositionUpdate())

inline val <C : Window> C.contextMenuEvent: EventInstance<MouseEvent, C, Node>
    get() = EventInstance(this, MouseEvent.contextMenu())

inline val <C : Window> C.copyEvent: EventInstance<ClipboardEvent, C, Node>
    get() = EventInstance(this, ClipboardEvent.copy())

inline val <C : Window> C.cutEvent: EventInstance<ClipboardEvent, C, Node>
    get() = EventInstance(this, ClipboardEvent.cut())

inline val <C : Window> C.dblClickEvent: EventInstance<MouseEvent, C, Node>
    get() = EventInstance(this, MouseEvent.dblClick())

inline val <C : Window> C.deviceMotionEvent: EventInstance<DeviceMotionEvent, C, C>
    get() = EventInstance(this, DeviceMotionEvent.deviceMotion())

inline val <C : Window> C.deviceOrientationEvent: EventInstance<DeviceOrientationEvent, C, C>
    get() = EventInstance(this, DeviceOrientationEvent.deviceOrientation())

inline val <C : Window> C.deviceOrientationAbsoluteEvent: EventInstance<DeviceOrientationEvent, C, C>
    get() = EventInstance(this, DeviceOrientationEvent.deviceOrientationAbsolute())

inline val <C : Window> C.domContentLoadedEvent: EventInstance<Event, C, Window>
    get() = EventInstance(this, Event.domContentLoaded())

inline val <C : Window> C.dragEvent: EventInstance<DragEvent, C, Node>
    get() = EventInstance(this, DragEvent.drag())

inline val <C : Window> C.dragEndEvent: EventInstance<DragEvent, C, Node>
    get() = EventInstance(this, DragEvent.dragEnd())

inline val <C : Window> C.dragEnterEvent: EventInstance<DragEvent, C, Node>
    get() = EventInstance(this, DragEvent.dragEnter())

inline val <C : Window> C.dragLeaveEvent: EventInstance<DragEvent, C, Node>
    get() = EventInstance(this, DragEvent.dragLeave())

inline val <C : Window> C.dragOverEvent: EventInstance<DragEvent, C, Node>
    get() = EventInstance(this, DragEvent.dragOver())

inline val <C : Window> C.dragStartEvent: EventInstance<DragEvent, C, Node>
    get() = EventInstance(this, DragEvent.dragStart())

inline val <C : Window> C.dropEvent: EventInstance<DragEvent, C, Node>
    get() = EventInstance(this, DragEvent.drop())

inline val <C : Window> C.enterPictureInPictureEvent: EventInstance<PictureInPictureEvent, C, Node>
    get() = EventInstance(this, PictureInPictureEvent.enterPictureInPicture())

inline val <C : Window> C.errorEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.error())

inline val <C : Window> C.focusEvent: EventInstance<FocusEvent, C, C>
    get() = EventInstance(this, FocusEvent.focus())

inline val <C : Window> C.focusInEvent: EventInstance<FocusEvent, C, Node>
    get() = EventInstance(this, FocusEvent.focusIn())

inline val <C : Window> C.focusOutEvent: EventInstance<FocusEvent, C, Node>
    get() = EventInstance(this, FocusEvent.focusOut())

inline val <C : Window> C.formDataEvent: EventInstance<FormDataEvent, C, Node>
    get() = EventInstance(this, FormDataEvent.formData())

inline val <C : Window> C.fullscreenChangeEvent: EventInstance<Event, C, Node>
    get() = EventInstance(this, Event.fullscreenChange())

inline val <C : Window> C.fullscreenErrorEvent: EventInstance<Event, C, Node>
    get() = EventInstance(this, Event.fullscreenError())

inline val <C : Window> C.gamepadConnectedEvent: EventInstance<GamepadEvent, C, C>
    get() = EventInstance(this, GamepadEvent.gamepadConnected())

inline val <C : Window> C.gamepadDisconnectedEvent: EventInstance<GamepadEvent, C, C>
    get() = EventInstance(this, GamepadEvent.gamepadDisconnected())

inline val <C : Window> C.gotPointerCaptureEvent: EventInstance<PointerEvent, C, Node>
    get() = EventInstance(this, PointerEvent.gotPointerCapture())

inline val <C : Window> C.hashChangeEvent: EventInstance<HashChangeEvent, C, C>
    get() = EventInstance(this, HashChangeEvent.hashChange())

inline val <C : Window> C.inputEvent: EventInstance<InputEvent, C, Node>
    get() = EventInstance(this, InputEvent.input())

inline val <C : Window> C.keyDownEvent: EventInstance<KeyboardEvent, C, Node>
    get() = EventInstance(this, KeyboardEvent.keyDown())

inline val <C : Window> C.keyPressEvent: EventInstance<KeyboardEvent, C, Node>
    get() = EventInstance(this, KeyboardEvent.keyPress())

inline val <C : Window> C.keyUpEvent: EventInstance<KeyboardEvent, C, Node>
    get() = EventInstance(this, KeyboardEvent.keyUp())

inline val <C : Window> C.languageChangeEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.languageChange())

inline val <C : Window> C.leavePictureInPictureEvent: EventInstance<PictureInPictureEvent, C, Node>
    get() = EventInstance(this, PictureInPictureEvent.leavePictureInPicture())

inline val <C : Window> C.loadEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.load())

inline val <C : Window> C.lostPointerCaptureEvent: EventInstance<PointerEvent, C, Node>
    get() = EventInstance(this, PointerEvent.lostPointerCapture())

inline val <C : Window> C.messageEvent: EventInstance<MessageEvent<Any?>, C, C>
    get() = EventInstance(this, MessageEvent.message())

inline val <C : Window> C.messageErrorEvent: EventInstance<MessageEvent<Any?>, C, C>
    get() = EventInstance(this, MessageEvent.messageError())

inline val <C : Window> C.mouseDownEvent: EventInstance<MouseEvent, C, Node>
    get() = EventInstance(this, MouseEvent.mouseDown())

inline val <C : Window> C.mouseMoveEvent: EventInstance<MouseEvent, C, Node>
    get() = EventInstance(this, MouseEvent.mouseMove())

inline val <C : Window> C.mouseOutEvent: EventInstance<MouseEvent, C, Node>
    get() = EventInstance(this, MouseEvent.mouseOut())

inline val <C : Window> C.mouseOverEvent: EventInstance<MouseEvent, C, Node>
    get() = EventInstance(this, MouseEvent.mouseOver())

inline val <C : Window> C.mouseUpEvent: EventInstance<MouseEvent, C, Node>
    get() = EventInstance(this, MouseEvent.mouseUp())

inline val <C : Window> C.offlineEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.offline())

inline val <C : Window> C.onlineEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.online())

inline val <C : Window> C.pageHideEvent: EventInstance<PageTransitionEvent, C, C>
    get() = EventInstance(this, PageTransitionEvent.pageHide())

inline val <C : Window> C.pageShowEvent: EventInstance<PageTransitionEvent, C, C>
    get() = EventInstance(this, PageTransitionEvent.pageShow())

inline val <C : Window> C.pasteEvent: EventInstance<ClipboardEvent, C, Node>
    get() = EventInstance(this, ClipboardEvent.paste())

inline val <C : Window> C.pointerCancelEvent: EventInstance<PointerEvent, C, Node>
    get() = EventInstance(this, PointerEvent.pointerCancel())

inline val <C : Window> C.pointerDownEvent: EventInstance<PointerEvent, C, Node>
    get() = EventInstance(this, PointerEvent.pointerDown())

inline val <C : Window> C.pointerEnterEvent: EventInstance<PointerEvent, C, C>
    get() = EventInstance(this, PointerEvent.pointerEnter())

inline val <C : Window> C.pointerLeaveEvent: EventInstance<PointerEvent, C, C>
    get() = EventInstance(this, PointerEvent.pointerLeave())

inline val <C : Window> C.pointerMoveEvent: EventInstance<PointerEvent, C, Node>
    get() = EventInstance(this, PointerEvent.pointerMove())

inline val <C : Window> C.pointerOutEvent: EventInstance<PointerEvent, C, Node>
    get() = EventInstance(this, PointerEvent.pointerOut())

inline val <C : Window> C.pointerOverEvent: EventInstance<PointerEvent, C, Node>
    get() = EventInstance(this, PointerEvent.pointerOver())

inline val <C : Window> C.pointerUpEvent: EventInstance<PointerEvent, C, Node>
    get() = EventInstance(this, PointerEvent.pointerUp())

inline val <C : Window> C.popStateEvent: EventInstance<PopStateEvent, C, C>
    get() = EventInstance(this, PopStateEvent.popState())

inline val <C : Window> C.rejectionHandledEvent: EventInstance<PromiseRejectionEvent, C, C>
    get() = EventInstance(this, PromiseRejectionEvent.rejectionHandled())

inline val <C : Window> C.resetEvent: EventInstance<Event, C, Node>
    get() = EventInstance(this, Event.reset())

inline val <C : Window> C.resizeEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.resize())

inline val <C : Window> C.scrollEvent: EventInstance<Event, C, Node>
    get() = EventInstance(this, Event.scroll())

inline val <C : Window> C.scrollEndEvent: EventInstance<Event, C, Node>
    get() = EventInstance(this, Event.scrollEnd())

inline val <C : Window> C.securityPolicyViolationEvent: EventInstance<SecurityPolicyViolationEvent, C, C>
    get() = EventInstance(this, SecurityPolicyViolationEvent.securityPolicyViolation())

inline val <C : Window> C.selectEvent: EventInstance<Event, C, Node>
    get() = EventInstance(this, Event.select())

inline val <C : Window> C.selectionChangeEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.selectionChange())

inline val <C : Window> C.selectStartEvent: EventInstance<Event, C, Node>
    get() = EventInstance(this, Event.selectStart())

inline val <C : Window> C.slotChangeEvent: EventInstance<Event, C, Node>
    get() = EventInstance(this, Event.slotChange())

inline val <C : Window> C.storageEvent: EventInstance<StorageEvent, C, C>
    get() = EventInstance(this, StorageEvent.storage())

inline val <C : Window> C.submitEvent: EventInstance<SubmitEvent, C, Node>
    get() = EventInstance(this, SubmitEvent.submit())

inline val <C : Window> C.touchCancelEvent: EventInstance<TouchEvent, C, Node>
    get() = EventInstance(this, TouchEvent.touchCancel())

inline val <C : Window> C.touchEndEvent: EventInstance<TouchEvent, C, Node>
    get() = EventInstance(this, TouchEvent.touchEnd())

inline val <C : Window> C.touchMoveEvent: EventInstance<TouchEvent, C, Node>
    get() = EventInstance(this, TouchEvent.touchMove())

inline val <C : Window> C.touchStartEvent: EventInstance<TouchEvent, C, Node>
    get() = EventInstance(this, TouchEvent.touchStart())

inline val <C : Window> C.transitionCancelEvent: EventInstance<TransitionEvent, C, Node>
    get() = EventInstance(this, TransitionEvent.transitionCancel())

inline val <C : Window> C.transitionEndEvent: EventInstance<TransitionEvent, C, Node>
    get() = EventInstance(this, TransitionEvent.transitionEnd())

inline val <C : Window> C.transitionRunEvent: EventInstance<TransitionEvent, C, Node>
    get() = EventInstance(this, TransitionEvent.transitionRun())

inline val <C : Window> C.transitionStartEvent: EventInstance<TransitionEvent, C, Node>
    get() = EventInstance(this, TransitionEvent.transitionStart())

inline val <C : Window> C.unhandledRejectionEvent: EventInstance<PromiseRejectionEvent, C, C>
    get() = EventInstance(this, PromiseRejectionEvent.unhandledRejection())

inline val <C : Window> C.unloadEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.unload())

inline val <C : Window> C.wheelEvent: EventInstance<WheelEvent, C, Node>
    get() = EventInstance(this, WheelEvent.wheel())
