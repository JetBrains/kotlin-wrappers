// Automatically generated - do not modify!

package web.window

import js.array.ArrayLike
import js.array.ReadonlyArray
import js.transferable.Transferable
import web.animations.AnimationEvent
import web.clipboard.ClipboardEvent
import web.csp.SecurityPolicyViolationEvent
import web.cssom.TransitionEvent
import web.device.DeviceMotionEvent
import web.device.DeviceOrientationEvent
import web.dom.Element
import web.dom.GlobalEventHandlers
import web.dom.Node
import web.events.*
import web.form.FormDataEvent
import web.form.SubmitEvent
import web.gamepad.GamepadEvent
import web.history.HashChangeEvent
import web.history.PageTransitionEvent
import web.history.PopStateEvent
import web.location.Location
import web.messaging.MessageEvent
import web.messaging.MessageEventSource
import web.pip.PictureInPictureEvent
import web.promise.PromiseRejectionEvent
import web.scroll.ScrollToOptions
import web.selection.Selection
import web.storage.StorageEvent
import web.uievents.*
import web.url.URL
import web.viewtransition.PageRevealEvent
import web.viewtransition.PageSwapEvent

/**
 * A window containing a DOM document; the document property points to the DOM document loaded in that window.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window)
 */
external class Window
private constructor() :
    EventTarget,
    GlobalEventHandlers,
    WindowEventHandlers,
    MessageEventSource {
    /**
     * Returns true if the window has been closed, false otherwise.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/closed)
     */
    val closed: Boolean

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/frameElement)
     */
    val frameElement: Element?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/frames)
     */
    val frames: ArrayLike<Window>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/innerHeight)
     */
    val innerHeight: Int

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/innerWidth)
     */
    val innerWidth: Int

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/location)
     */
    val location: Location

    /**
     * Returns true if the location bar is visible; otherwise, returns false.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/locationbar)
     */
    val locationbar: BarProp

    /**
     * Returns true if the menu bar is visible; otherwise, returns false.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/menubar)
     */
    val menubar: BarProp

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/name)
     */
    var name: WindowName

    /**
     * Available only in secure contexts.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/devicemotion_event)
     */
    var ondevicemotion: EventHandler<DeviceMotionEvent, Window, Window>?

    /**
     * Available only in secure contexts.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/deviceorientation_event)
     */
    var ondeviceorientation: EventHandler<DeviceOrientationEvent, Window, Window>?

    /**
     * Available only in secure contexts.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/deviceorientationabsolute_event)
     */
    var ondeviceorientationabsolute: EventHandler<DeviceOrientationEvent, Window, Window>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/opener)
     */
    var opener: Any?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/outerHeight)
     */
    val outerHeight: Int

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/outerWidth)
     */
    val outerWidth: Int

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/scrollX)
     */
    val pageXOffset: Double

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/scrollY)
     */
    val pageYOffset: Double

    /**
     * Refers to either the parent WindowProxy, or itself.
     *
     * It can rarely be null e.g. for contentWindow of an iframe that is already removed from the parent.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/parent)
     */
    val parent: WindowProxy

    /**
     * Returns true if the personal bar is visible; otherwise, returns false.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/personalbar)
     */
    val personalbar: BarProp

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/screenLeft)
     */
    val screenLeft: Int

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/screenTop)
     */
    val screenTop: Int

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/screenX)
     */
    val screenX: Int

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/screenY)
     */
    val screenY: Int

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/scrollX)
     */
    val scrollX: Double

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/scrollY)
     */
    val scrollY: Double

    /**
     * Returns true if the scrollbars are visible; otherwise, returns false.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/scrollbars)
     */
    val scrollbars: BarProp

    /**
     * Returns true if the status bar is visible; otherwise, returns false.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/statusbar)
     */
    val statusbar: BarProp

    /**
     * Returns true if the toolbar is visible; otherwise, returns false.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/toolbar)
     */
    val toolbar: BarProp

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/top)
     */
    val top: WindowProxy?

    /**
     * Closes the window.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/close)
     */
    fun close()

    /**
     * Moves the focus to the window's browsing context, if any.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/focus)
     */
    fun focus()

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/getSelection)
     */
    fun getSelection(): Selection?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/moveBy)
     */
    fun moveBy(
        x: Double,
        y: Double,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/moveTo)
     */
    fun moveTo(
        x: Double,
        y: Double,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/open)
     */
    fun open(
        url: String = definedExternally,
        target: WindowTarget = definedExternally,
        features: String = definedExternally,
    ): WindowProxy?

    fun open(
        url: URL,
        target: WindowTarget = definedExternally,
        features: String = definedExternally,
    ): WindowProxy?

    /**
     * Posts a message to the given window. Messages can be structured objects, e.g. nested objects and arrays, can contain JavaScript values (strings, numbers, Date objects, etc), and can contain certain data objects such as File Blob, FileList, and ArrayBuffer objects.
     *
     * Objects listed in the transfer member of options are transferred, not just cloned, meaning that they are no longer usable on the sending side.
     *
     * A target origin can be specified using the targetOrigin member of options. If not provided, it defaults to "/". This default restricts the message to same-origin targets only.
     *
     * If the origin of the target window doesn't match the given target origin, the message is discarded, to avoid information leakage. To send the message to the target regardless of origin, set the target origin to "*".
     *
     * Throws a "DataCloneError" DOMException if transfer array contains duplicate objects or if message could not be cloned.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/postMessage)
     */
    fun postMessage(
        message: Any?,
        targetOrigin: String,
        transfer: ReadonlyArray<Transferable> = definedExternally,
    )

    fun postMessage(
        message: Any?,
        options: WindowPostMessageOptions = definedExternally,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/print)
     */
    fun print()

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/resizeBy)
     */
    fun resizeBy(
        x: Double,
        y: Double,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/resizeTo)
     */
    fun resizeTo(
        width: Int,
        height: Int,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/scroll)
     */
    fun scroll(options: ScrollToOptions = definedExternally)
    fun scroll(
        x: Double,
        y: Double,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/scrollBy)
     */
    fun scrollBy(options: ScrollToOptions = definedExternally)
    fun scrollBy(
        x: Double,
        y: Double,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/scrollTo)
     */
    fun scrollTo(options: ScrollToOptions = definedExternally)
    fun scrollTo(
        x: Double,
        y: Double,
    )

    /**
     * Cancels the document load.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/stop)
     */
    fun stop()

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/abort_event)
     */
    @JsEvent("abort")
    val abortEvent: EventInstance<Event, Window /* this */, Window /* this */>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/afterprint_event)
     */
    @JsEvent("afterprint")
    val afterPrintEvent: EventInstance<Event, Window /* this */, Window /* this */>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/animationcancel_event)
     */
    @JsEvent("animationcancel")
    val animationCancelEvent: EventInstance<AnimationEvent, Window /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/animationend_event)
     */
    @JsEvent("animationend")
    val animationEndEvent: EventInstance<AnimationEvent, Window /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/animationiteration_event)
     */
    @JsEvent("animationiteration")
    val animationIterationEvent: EventInstance<AnimationEvent, Window /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/animationstart_event)
     */
    @JsEvent("animationstart")
    val animationStartEvent: EventInstance<AnimationEvent, Window /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/auxclick_event)
     */
    @JsEvent("auxclick")
    val auxClickEvent: EventInstance<MouseEvent, Window /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/beforeinput_event)
     */
    @JsEvent("beforeinput")
    val beforeInputEvent: EventInstance<InputEvent, Window /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/beforeprint_event)
     */
    @JsEvent("beforeprint")
    val beforePrintEvent: EventInstance<Event, Window /* this */, Window /* this */>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/beforeunload_event)
     */
    @JsEvent("beforeunload")
    val beforeUnloadEvent: EventInstance<BeforeUnloadEvent, Window /* this */, Window /* this */>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/blur_event)
     */
    @JsEvent("blur")
    val blurEvent: EventInstance<FocusEvent, Window /* this */, Window /* this */>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/cancel_event)
     */
    @JsEvent("cancel")
    val cancelEvent: EventInstance<Event, Window /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/change_event)
     */
    @JsEvent("change")
    val changeEvent: EventInstance<Event, Window /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/click_event)
     */
    @JsEvent("click")
    val clickEvent: EventInstance<MouseEvent, Window /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/compositionend_event)
     */
    @JsEvent("compositionend")
    val compositionEndEvent: EventInstance<CompositionEvent, Window /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/compositionstart_event)
     */
    @JsEvent("compositionstart")
    val compositionStartEvent: EventInstance<CompositionEvent, Window /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/compositionupdate_event)
     */
    @JsEvent("compositionupdate")
    val compositionUpdateEvent: EventInstance<CompositionEvent, Window /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/contextmenu_event)
     */
    @JsEvent("contextmenu")
    val contextMenuEvent: EventInstance<MouseEvent, Window /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/copy_event)
     */
    @JsEvent("copy")
    val copyEvent: EventInstance<ClipboardEvent, Window /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/cut_event)
     */
    @JsEvent("cut")
    val cutEvent: EventInstance<ClipboardEvent, Window /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/dblclick_event)
     */
    @JsEvent("dblclick")
    val dblClickEvent: EventInstance<MouseEvent, Window /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/devicemotion_event)
     */
    @JsEvent("devicemotion")
    val deviceMotionEvent: EventInstance<DeviceMotionEvent, Window /* this */, Window /* this */>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/deviceorientation_event)
     */
    @JsEvent("deviceorientation")
    val deviceOrientationEvent: EventInstance<DeviceOrientationEvent, Window /* this */, Window /* this */>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/deviceorientationabsolute_event)
     */
    @JsEvent("deviceorientationabsolute")
    val deviceOrientationAbsoluteEvent: EventInstance<DeviceOrientationEvent, Window /* this */, Window /* this */>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/DOMContentLoaded_event)
     */
    @JsEvent("DOMContentLoaded")
    val domContentLoadedEvent: EventInstance<Event, Window /* this */, Window>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/drag_event)
     */
    @JsEvent("drag")
    val dragEvent: EventInstance<DragEvent, Window /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/dragend_event)
     */
    @JsEvent("dragend")
    val dragEndEvent: EventInstance<DragEvent, Window /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/dragenter_event)
     */
    @JsEvent("dragenter")
    val dragEnterEvent: EventInstance<DragEvent, Window /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/dragleave_event)
     */
    @JsEvent("dragleave")
    val dragLeaveEvent: EventInstance<DragEvent, Window /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/dragover_event)
     */
    @JsEvent("dragover")
    val dragOverEvent: EventInstance<DragEvent, Window /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/dragstart_event)
     */
    @JsEvent("dragstart")
    val dragStartEvent: EventInstance<DragEvent, Window /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/drop_event)
     */
    @JsEvent("drop")
    val dropEvent: EventInstance<DragEvent, Window /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/enterpictureinpicture_event)
     */
    @JsEvent("enterpictureinpicture")
    val enterPictureInPictureEvent: EventInstance<PictureInPictureEvent, Window /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/error_event)
     */
    @JsEvent("error")
    val errorEvent: EventInstance<Event, Window /* this */, Window /* this */>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/focus_event)
     */
    @JsEvent("focus")
    val focusEvent: EventInstance<FocusEvent, Window /* this */, Window /* this */>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/focusin_event)
     */
    @JsEvent("focusin")
    val focusInEvent: EventInstance<FocusEvent, Window /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/focusout_event)
     */
    @JsEvent("focusout")
    val focusOutEvent: EventInstance<FocusEvent, Window /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/formdata_event)
     */
    @JsEvent("formdata")
    val formDataEvent: EventInstance<FormDataEvent, Window /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/fullscreenchange_event)
     */
    @JsEvent("fullscreenchange")
    val fullscreenChangeEvent: EventInstance<Event, Window /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/fullscreenerror_event)
     */
    @JsEvent("fullscreenerror")
    val fullscreenErrorEvent: EventInstance<Event, Window /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/gamepadconnected_event)
     */
    @JsEvent("gamepadconnected")
    val gamepadConnectedEvent: EventInstance<GamepadEvent, Window /* this */, Window /* this */>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/gamepaddisconnected_event)
     */
    @JsEvent("gamepaddisconnected")
    val gamepadDisconnectedEvent: EventInstance<GamepadEvent, Window /* this */, Window /* this */>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/gotpointercapture_event)
     */
    @JsEvent("gotpointercapture")
    val gotPointerCaptureEvent: EventInstance<PointerEvent, Window /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/hashchange_event)
     */
    @JsEvent("hashchange")
    val hashChangeEvent: EventInstance<HashChangeEvent, Window /* this */, Window /* this */>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/input_event)
     */
    @JsEvent("input")
    val inputEvent: EventInstance<InputEvent, Window /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/keydown_event)
     */
    @JsEvent("keydown")
    val keyDownEvent: EventInstance<KeyboardEvent, Window /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/keypress_event)
     */
    @JsEvent("keypress")
    val keyPressEvent: EventInstance<KeyboardEvent, Window /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/keyup_event)
     */
    @JsEvent("keyup")
    val keyUpEvent: EventInstance<KeyboardEvent, Window /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/languagechange_event)
     */
    @JsEvent("languagechange")
    val languageChangeEvent: EventInstance<Event, Window /* this */, Window /* this */>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/leavepictureinpicture_event)
     */
    @JsEvent("leavepictureinpicture")
    val leavePictureInPictureEvent: EventInstance<PictureInPictureEvent, Window /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/load_event)
     */
    @JsEvent("load")
    val loadEvent: EventInstance<Event, Window /* this */, Window /* this */>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/lostpointercapture_event)
     */
    @JsEvent("lostpointercapture")
    val lostPointerCaptureEvent: EventInstance<PointerEvent, Window /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/message_event)
     */
    @JsEvent("message")
    val messageEvent: EventInstance<MessageEvent<Any?>, Window /* this */, Window /* this */>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/messageerror_event)
     */
    @JsEvent("messageerror")
    val messageErrorEvent: EventInstance<MessageEvent<Any?>, Window /* this */, Window /* this */>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/mousedown_event)
     */
    @JsEvent("mousedown")
    val mouseDownEvent: EventInstance<MouseEvent, Window /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/mousemove_event)
     */
    @JsEvent("mousemove")
    val mouseMoveEvent: EventInstance<MouseEvent, Window /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/mouseout_event)
     */
    @JsEvent("mouseout")
    val mouseOutEvent: EventInstance<MouseEvent, Window /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/mouseover_event)
     */
    @JsEvent("mouseover")
    val mouseOverEvent: EventInstance<MouseEvent, Window /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/mouseup_event)
     */
    @JsEvent("mouseup")
    val mouseUpEvent: EventInstance<MouseEvent, Window /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/offline_event)
     */
    @JsEvent("offline")
    val offlineEvent: EventInstance<Event, Window /* this */, Window /* this */>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/online_event)
     */
    @JsEvent("online")
    val onlineEvent: EventInstance<Event, Window /* this */, Window /* this */>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/pagehide_event)
     */
    @JsEvent("pagehide")
    val pageHideEvent: EventInstance<PageTransitionEvent, Window /* this */, Window /* this */>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/pagereveal_event)
     */
    @JsEvent("pagereveal")
    val pageRevealEvent: EventInstance<PageRevealEvent, Window /* this */, Window /* this */>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/pageshow_event)
     */
    @JsEvent("pageshow")
    val pageShowEvent: EventInstance<PageTransitionEvent, Window /* this */, Window /* this */>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/pageswap_event)
     */
    @JsEvent("pageswap")
    val pageSwapEvent: EventInstance<PageSwapEvent, Window /* this */, Window /* this */>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/paste_event)
     */
    @JsEvent("paste")
    val pasteEvent: EventInstance<ClipboardEvent, Window /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/pointercancel_event)
     */
    @JsEvent("pointercancel")
    val pointerCancelEvent: EventInstance<PointerEvent, Window /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/pointerdown_event)
     */
    @JsEvent("pointerdown")
    val pointerDownEvent: EventInstance<PointerEvent, Window /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/pointerenter_event)
     */
    @JsEvent("pointerenter")
    val pointerEnterEvent: EventInstance<PointerEvent, Window /* this */, Window /* this */>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/pointerleave_event)
     */
    @JsEvent("pointerleave")
    val pointerLeaveEvent: EventInstance<PointerEvent, Window /* this */, Window /* this */>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/pointermove_event)
     */
    @JsEvent("pointermove")
    val pointerMoveEvent: EventInstance<PointerEvent, Window /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/pointerout_event)
     */
    @JsEvent("pointerout")
    val pointerOutEvent: EventInstance<PointerEvent, Window /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/pointerover_event)
     */
    @JsEvent("pointerover")
    val pointerOverEvent: EventInstance<PointerEvent, Window /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/pointerup_event)
     */
    @JsEvent("pointerup")
    val pointerUpEvent: EventInstance<PointerEvent, Window /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/popstate_event)
     */
    @JsEvent("popstate")
    val popStateEvent: EventInstance<PopStateEvent, Window /* this */, Window /* this */>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/rejectionhandled_event)
     */
    @JsEvent("rejectionhandled")
    val rejectionHandledEvent: EventInstance<PromiseRejectionEvent, Window /* this */, Window /* this */>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/reset_event)
     */
    @JsEvent("reset")
    val resetEvent: EventInstance<Event, Window /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/resize_event)
     */
    @JsEvent("resize")
    val resizeEvent: EventInstance<Event, Window /* this */, Window /* this */>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/scroll_event)
     */
    @JsEvent("scroll")
    val scrollEvent: EventInstance<Event, Window /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/scrollend_event)
     */
    @JsEvent("scrollend")
    val scrollEndEvent: EventInstance<Event, Window /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/securitypolicyviolation_event)
     */
    @JsEvent("securitypolicyviolation")
    val securityPolicyViolationEvent: EventInstance<SecurityPolicyViolationEvent, Window /* this */, Window /* this */>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/select_event)
     */
    @JsEvent("select")
    val selectEvent: EventInstance<Event, Window /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/selectionchange_event)
     */
    @JsEvent("selectionchange")
    val selectionChangeEvent: EventInstance<Event, Window /* this */, Window /* this */>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/selectstart_event)
     */
    @JsEvent("selectstart")
    val selectStartEvent: EventInstance<Event, Window /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/slotchange_event)
     */
    @JsEvent("slotchange")
    val slotChangeEvent: EventInstance<Event, Window /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/storage_event)
     */
    @JsEvent("storage")
    val storageEvent: EventInstance<StorageEvent, Window /* this */, Window /* this */>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/submit_event)
     */
    @JsEvent("submit")
    val submitEvent: EventInstance<SubmitEvent, Window /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/touchcancel_event)
     */
    @JsEvent("touchcancel")
    val touchCancelEvent: EventInstance<TouchEvent, Window /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/touchend_event)
     */
    @JsEvent("touchend")
    val touchEndEvent: EventInstance<TouchEvent, Window /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/touchmove_event)
     */
    @JsEvent("touchmove")
    val touchMoveEvent: EventInstance<TouchEvent, Window /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/touchstart_event)
     */
    @JsEvent("touchstart")
    val touchStartEvent: EventInstance<TouchEvent, Window /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/transitioncancel_event)
     */
    @JsEvent("transitioncancel")
    val transitionCancelEvent: EventInstance<TransitionEvent, Window /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/transitionend_event)
     */
    @JsEvent("transitionend")
    val transitionEndEvent: EventInstance<TransitionEvent, Window /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/transitionrun_event)
     */
    @JsEvent("transitionrun")
    val transitionRunEvent: EventInstance<TransitionEvent, Window /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/transitionstart_event)
     */
    @JsEvent("transitionstart")
    val transitionStartEvent: EventInstance<TransitionEvent, Window /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/unhandledrejection_event)
     */
    @JsEvent("unhandledrejection")
    val unhandledRejectionEvent: EventInstance<PromiseRejectionEvent, Window /* this */, Window /* this */>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/unload_event)
     */
    @JsEvent("unload")
    val unloadEvent: EventInstance<Event, Window /* this */, Window /* this */>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/wheel_event)
     */
    @JsEvent("wheel")
    val wheelEvent: EventInstance<WheelEvent, Window /* this */, Node>
}
