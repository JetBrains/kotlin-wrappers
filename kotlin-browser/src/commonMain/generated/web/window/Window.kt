// Automatically generated - do not modify!

package web.window

import js.array.ArrayLike
import js.array.ReadonlyArray
import js.core.JsAny
import js.globals.GlobalScope
import js.serialization.Transferable
import web.animations.AnimationEvent
import web.clipboard.ClipboardEvent
import web.cookie.CookieStore
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
import kotlin.js.definedExternally

/**
 * The **`Window`** interface represents a window containing a DOM document; the `document` property points to the DOM document loaded in that window.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window)
 */
external class Window
private constructor() :
    EventTarget,
    GlobalScope,
    GlobalEventHandlers,
    WindowEventHandlers,
    MessageEventSource {
    /**
     * The **`Window.closed`** read-only property indicates whether the referenced window is closed or not.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/closed)
     */
    val closed: Boolean

    /**
     * The **`cookieStore`** read-only property of the Window interface returns a reference to the CookieStore object for the current document context.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/cookieStore)
     */
    val cookieStore: CookieStore

    /**
     * The **`Window.frameElement`** property returns the element (such as iframe or object) in which the window is embedded.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/frameElement)
     */
    val frameElement: Element?

    /**
     * Returns the window itself, which is an array-like object, listing the direct sub-frames of the current window.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/frames)
     */
    val frames: ArrayLike<Window>

    /**
     * The read-only **`innerHeight`** property of the including the height of the horizontal scroll bar, if present.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/innerHeight)
     */
    val innerHeight: Int

    /**
     * The read-only Window property **`innerWidth`** returns the interior width of the window in pixels (that is, the width of the window's layout viewport).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/innerWidth)
     */
    val innerWidth: Int

    /**
     * The **`Window.location`** read-only property returns a Location object with information about the current location of the document.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/location)
     */
    val location: Location

    /**
     * Returns the `locationbar` object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/locationbar)
     */
    val locationbar: BarProp

    /**
     * Returns the `menubar` object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/menubar)
     */
    val menubar: BarProp

    /**
     * The `Window.name` property gets/sets the name of the window's browsing context.
     *
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
     * The Window interface's **`opener`** property returns a reference to the window that opened the window, either with Window.open, or by navigating a link with a `target` attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/opener)
     */
    var opener: JsAny?

    /**
     * The **`originAgentCluster`** read-only property of the Window interface returns `true` if this window belongs to an _origin-keyed agent cluster_: this means that the operating system has provided dedicated resources (for example an operating system process) to this window's origin that are not shared with windows from other origins.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/originAgentCluster)
     */
    val originAgentCluster: Boolean

    /**
     * The **`Window.outerHeight`** read-only property returns the height in pixels of the whole browser window, including any sidebar, window chrome, and window-resizing borders/handles.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/outerHeight)
     */
    val outerHeight: Int

    /**
     * **`Window.outerWidth`** read-only property returns the width of the outside of the browser window.
     *
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
     * The **`Window.parent`** property is a reference to the parent of the current window or subframe.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/parent)
     */
    val parent: WindowProxy

    /**
     * Returns the `personalbar` object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/personalbar)
     */
    val personalbar: BarProp

    /**
     * The **`Window.screenLeft`** read-only property returns the horizontal distance, in CSS pixels, from the left border of the user's browser viewport to the left side of the screen.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/screenLeft)
     */
    val screenLeft: Int

    /**
     * The **`Window.screenTop`** read-only property returns the vertical distance, in CSS pixels, from the top border of the user's browser viewport to the top side of the screen.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/screenTop)
     */
    val screenTop: Int

    /**
     * The **`Window.screenX`** read-only property returns the horizontal distance, in CSS pixels, of the left border of the user's browser viewport to the left side of the screen.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/screenX)
     */
    val screenX: Int

    /**
     * The **`Window.screenY`** read-only property returns the vertical distance, in CSS pixels, of the top border of the user's browser viewport to the top edge of the screen.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/screenY)
     */
    val screenY: Int

    /**
     * The read-only **`scrollX`** property of the Window interface returns the number of pixels by which the document is currently scrolled horizontally.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/scrollX)
     */
    val scrollX: Double

    /**
     * The read-only **`scrollY`** property of the Window interface returns the number of pixels by which the document is currently scrolled vertically.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/scrollY)
     */
    val scrollY: Double

    /**
     * Returns the `scrollbars` object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/scrollbars)
     */
    val scrollbars: BarProp

    /**
     * Returns the `statusbar` object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/statusbar)
     */
    val statusbar: BarProp

    /**
     * Returns the `toolbar` object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/toolbar)
     */
    val toolbar: BarProp

    /**
     * Returns a reference to the topmost window in the window hierarchy.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/top)
     */
    val top: WindowProxy?

    /**
     * The **`Window.close()`** method closes the current window, or the window on which it was called.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/close)
     */
    fun close()

    /**
     * Makes a request to bring the window to the front.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/focus)
     */
    fun focus()

    /**
     * The **`getSelection()`** method of the Window interface returns the Selection object associated with the window's document, representing the range of text selected by the user or the current position of the caret.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/getSelection)
     */
    fun getSelection(): Selection?

    /**
     * The **`moveBy()`** method of the Window interface moves the current window by a specified amount.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/moveBy)
     */
    fun moveBy(
        x: Double,
        y: Double,
    )

    /**
     * The **`moveTo()`** method of the Window interface moves the current window to the specified coordinates.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/moveTo)
     */
    fun moveTo(
        x: Double,
        y: Double,
    )

    /**
     * The **`open()`** method of the `Window` interface loads a specified resource into a new or existing browsing context (that is, a tab, a window, or an iframe) under a specified name.
     *
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
     * The **`window.postMessage()`** method safely enables cross-origin communication between Window objects; _e.g.,_ between a page and a pop-up that it spawned, or between a page and an iframe embedded within it.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/postMessage)
     */
    fun postMessage(
        message: JsAny?,
        targetOrigin: String,
        transfer: ReadonlyArray<Transferable> = definedExternally,
    )

    fun postMessage(
        message: JsAny?,
        options: WindowPostMessageOptions = definedExternally,
    )

    /**
     * Opens the print dialog to print the current document.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/print)
     */
    fun print()

    /**
     * The **`Window.resizeBy()`** method resizes the current window by a specified amount.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/resizeBy)
     */
    fun resizeBy(
        x: Double,
        y: Double,
    )

    /**
     * The **`Window.resizeTo()`** method dynamically resizes the window.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/resizeTo)
     */
    fun resizeTo(
        width: Int,
        height: Int,
    )

    /**
     * The **`Window.scroll()`** method scrolls the window to a particular place in the document.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/scroll)
     */
    fun scroll(options: ScrollToOptions = definedExternally)
    fun scroll(
        x: Double,
        y: Double,
    )

    /**
     * The **`Window.scrollBy()`** method scrolls the document in the window by the given amount.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/scrollBy)
     */
    fun scrollBy(options: ScrollToOptions = definedExternally)
    fun scrollBy(
        x: Double,
        y: Double,
    )

    /**
     * **`Window.scrollTo()`** scrolls to a particular set of coordinates in the document.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/scrollTo)
     */
    fun scrollTo(options: ScrollToOptions = definedExternally)
    fun scrollTo(
        x: Double,
        y: Double,
    )

    /**
     * The **`window.stop()`** stops further resource loading in the current browsing context, equivalent to the stop button in the browser.
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
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/beforematch_event)
     */
    @JsEvent("beforematch")
    val beforeMatchEvent: EventInstance<Event, Window /* this */, Node>

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
    val messageEvent: EventInstance<MessageEvent<JsAny?>, Window /* this */, Window /* this */>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/messageerror_event)
     */
    @JsEvent("messageerror")
    val messageErrorEvent: EventInstance<MessageEvent<JsAny?>, Window /* this */, Window /* this */>

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
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/pointerrawupdate_event)
     */
    @JsEvent("pointerrawupdate")
    val pointerRawUpdateEvent: EventInstance<PointerEvent, Window /* this */, Node>

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
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/visibilitychange_event)
     */
    @JsEvent("visibilitychange")
    val visibilityChangeEvent: EventInstance<Event, Window /* this */, Window>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/wheel_event)
     */
    @JsEvent("wheel")
    val wheelEvent: EventInstance<WheelEvent, Window /* this */, Node>
}
