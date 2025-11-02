// Automatically generated - do not modify!

package web.window

import js.array.ArrayLike
import js.array.ReadonlyArray
import js.closeable.JsCloseable
import js.core.Void
import js.globals.GlobalScope
import js.promise.Promise
import js.serialization.Transferable
import web.animations.AnimationEvent
import web.clipboard.ClipboardEvent
import web.cookie.CookieStore
import web.csp.SecurityPolicyViolationEvent
import web.cssom.TransitionEvent
import web.device.DeviceMotionEvent
import web.device.DeviceOrientationEvent
import web.dnd.DragEvent
import web.dom.Element
import web.dom.GlobalEventHandlers
import web.dom.Node
import web.events.Event
import web.events.EventHandler
import web.events.EventInstance
import web.events.EventTarget
import web.focus.FocusEvent
import web.form.FormDataEvent
import web.form.SubmitEvent
import web.gamepad.GamepadEvent
import web.history.HashChangeEvent
import web.history.PageTransitionEvent
import web.history.PopStateEvent
import web.input.CompositionEvent
import web.input.InputEvent
import web.keyboard.KeyboardEvent
import web.location.Location
import web.messaging.MessageEvent
import web.messaging.MessageEventSource
import web.mouse.MouseEvent
import web.mouse.WheelEvent
import web.pip.PictureInPictureEvent
import web.pointer.PointerEvent
import web.promise.PromiseRejectionEvent
import web.scroll.ScrollToOptions
import web.selection.Selection
import web.storage.StorageEvent
import web.touch.TouchEvent
import web.url.URL
import web.viewtransition.PageRevealEvent
import web.viewtransition.PageSwapEvent
import kotlin.js.JsAny
import kotlin.js.definedExternally

/**
 * The **`Window`** interface represents a window containing a DOM document; the document property points to the DOM document loaded in that window.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window)
 */
open external class Window
private constructor() :
    EventTarget,
    GlobalScope,
    GlobalEventHandlers,
    WindowEventHandlers,
    MessageEventSource,
    JsCloseable {
    /**
     * The **`Window.closed`** read-only property indicates whether the referenced window is closed or not.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/closed)
     */
    val closed: Boolean

    /**
     * The **`cookieStore`** read-only property of the Window interface returns a reference to the CookieStore object for the current document context. This is an entry point for the Cookie Store API.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/cookieStore)
     */
    val cookieStore: CookieStore

    /**
     * The **`Window.frameElement`** property returns the element (such as <iframe> or <object>) in which the window is embedded.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/frameElement)
     */
    val frameElement: Element?

    /**
     * Returns the window itself, which is an array-like object, listing the direct sub-**`frames`** of the current window.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/frames)
     */
    val frames: ArrayLike<Window>

    /**
     * The read-only **`innerHeight`** property of the Window interface returns the interior height of the window in pixels, including the height of the horizontal scroll bar, if present.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/innerHeight)
     */
    val innerHeight: Int

    /**
     * The read-only Window property **`innerWidth`** returns the interior width of the window in pixels (that is, the width of the window's layout viewport). That includes the width of the vertical scroll bar, if one is present.
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
     * Returns the **`locationbar`** object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/locationbar)
     */
    val locationbar: BarProp

    /**
     * Returns the **`menubar`** object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/menubar)
     */
    val menubar: BarProp

    /**
     * The **`Window.name`** property gets/sets the name of the window's browsing context.
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
     * The Window interface's **`opener`** property returns a reference to the window that opened the window, either with open(), or by navigating a link with a target attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/opener)
     */
    var opener: JsAny?

    /**
     * The **`originAgentCluster`** read-only property of the Window interface returns true if this window belongs to an origin-keyed agent cluster: this means that the operating system has provided dedicated resources (for example an operating system process) to this window's origin that are not shared with windows from other origins.
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
     * **`Window.outerWidth`** read-only property returns the width of the outside of the browser window. It represents the width of the whole browser window including sidebar (if expanded), window chrome and window resizing borders/handles.
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
     * Returns the **`personalbar`** object.
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
     * The read-only **`scrollX`** property of the Window interface returns the number of pixels by which the document is currently scrolled horizontally. This value is subpixel precise in modern browsers, meaning that it isn't necessarily a whole number. You can get the number of pixels the document is scrolled vertically from the scrollY property.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/scrollX)
     */
    val scrollX: Double

    /**
     * The read-only **`scrollY`** property of the Window interface returns the number of pixels by which the document is currently scrolled vertically. This value is subpixel precise in modern browsers, meaning that it isn't necessarily a whole number. You can get the number of pixels the document is scrolled horizontally from the scrollX property.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/scrollY)
     */
    val scrollY: Double

    /**
     * Returns the **`scrollbars`** object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/scrollbars)
     */
    val scrollbars: BarProp

    /**
     * Returns the **`statusbar`** object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/statusbar)
     */
    val statusbar: BarProp

    /**
     * Returns the **`toolbar`** object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/toolbar)
     */
    val toolbar: BarProp

    /**
     * Returns a reference to the **`top`**most window in the window hierarchy.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/top)
     */
    val top: WindowProxy?

    /**
     * The **`Window.close()`** method closes the current window, or the window on which it was called.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/close)
     */
    override fun close()

    /**
     * Makes a request to bring the window to the front. It may fail due to user settings and the window isn't guaranteed to be frontmost before this method returns.
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
     * The **`open()`** method of the Window interface loads a specified resource into a new or existing browsing context (that is, a tab, a window, or an iframe) under a specified name.
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
     * The **`window.postMessage()`** method safely enables cross-origin communication between Window objects; e.g., between a page and a pop-up that it spawned, or between a page and an iframe embedded within it.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/postMessage)
     */
    fun postMessage(
        message: JsAny?,
        targetOrigin: String,
        transfer: ReadonlyArray<Transferable> = definedExternally,
    )

    fun postMessage(
        message: String,
        targetOrigin: String,
        transfer: ReadonlyArray<Transferable> = definedExternally,
    )

    fun postMessage(
        message: JsAny?,
        options: WindowPostMessageOptions = definedExternally,
    )

    fun postMessage(
        message: String,
        options: WindowPostMessageOptions = definedExternally,
    )

    /**
     * Opens the **`print`** dialog to print the current document.
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
    fun scroll(options: ScrollToOptions = definedExternally): Promise<Void>?
    fun scroll(
        x: Double,
        y: Double,
    ): Promise<Void>?

    /**
     * The **`Window.scrollBy()`** method scrolls the document in the window by the given amount.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/scrollBy)
     */
    fun scrollBy(options: ScrollToOptions = definedExternally): Promise<Void>?
    fun scrollBy(
        x: Double,
        y: Double,
    ): Promise<Void>?

    /**
     * **`Window.scrollTo()`** scrolls to a particular set of coordinates in the document.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/scrollTo)
     */
    fun scrollTo(options: ScrollToOptions = definedExternally): Promise<Void>?
    fun scrollTo(
        x: Double,
        y: Double,
    ): Promise<Void>?

    /**
     * The **`window.stop()`** stops further resource loading in the current browsing context, equivalent to the stop button in the browser.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/stop)
     */
    fun stop()
}

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/abort_event)
 */
inline val <C : Window> C.abortEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, "abort")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/afterprint_event)
 */
inline val <C : Window> C.afterPrintEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, "afterprint")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/animationcancel_event)
 */
inline val <C : Window> C.animationCancelEvent: EventInstance<AnimationEvent, C, Node>
    get() = EventInstance(this, "animationcancel")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/animationend_event)
 */
inline val <C : Window> C.animationEndEvent: EventInstance<AnimationEvent, C, Node>
    get() = EventInstance(this, "animationend")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/animationiteration_event)
 */
inline val <C : Window> C.animationIterationEvent: EventInstance<AnimationEvent, C, Node>
    get() = EventInstance(this, "animationiteration")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/animationstart_event)
 */
inline val <C : Window> C.animationStartEvent: EventInstance<AnimationEvent, C, Node>
    get() = EventInstance(this, "animationstart")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/auxclick_event)
 */
inline val <C : Window> C.auxClickEvent: EventInstance<MouseEvent, C, Node>
    get() = EventInstance(this, "auxclick")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/beforeinput_event)
 */
inline val <C : Window> C.beforeInputEvent: EventInstance<InputEvent, C, Node>
    get() = EventInstance(this, "beforeinput")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/beforematch_event)
 */
inline val <C : Window> C.beforeMatchEvent: EventInstance<Event, C, Node>
    get() = EventInstance(this, "beforematch")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/beforeprint_event)
 */
inline val <C : Window> C.beforePrintEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, "beforeprint")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/beforeunload_event)
 */
inline val <C : Window> C.beforeUnloadEvent: EventInstance<BeforeUnloadEvent, C, C>
    get() = EventInstance(this, "beforeunload")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/blur_event)
 */
inline val <C : Window> C.blurEvent: EventInstance<FocusEvent, C, C>
    get() = EventInstance(this, "blur")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/cancel_event)
 */
inline val <C : Window> C.cancelEvent: EventInstance<Event, C, Node>
    get() = EventInstance(this, "cancel")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/change_event)
 */
inline val <C : Window> C.changeEvent: EventInstance<Event, C, Node>
    get() = EventInstance(this, "change")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/click_event)
 */
inline val <C : Window> C.clickEvent: EventInstance<MouseEvent, C, Node>
    get() = EventInstance(this, "click")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/compositionend_event)
 */
inline val <C : Window> C.compositionEndEvent: EventInstance<CompositionEvent, C, Node>
    get() = EventInstance(this, "compositionend")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/compositionstart_event)
 */
inline val <C : Window> C.compositionStartEvent: EventInstance<CompositionEvent, C, Node>
    get() = EventInstance(this, "compositionstart")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/compositionupdate_event)
 */
inline val <C : Window> C.compositionUpdateEvent: EventInstance<CompositionEvent, C, Node>
    get() = EventInstance(this, "compositionupdate")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/contextmenu_event)
 */
inline val <C : Window> C.contextMenuEvent: EventInstance<MouseEvent, C, Node>
    get() = EventInstance(this, "contextmenu")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/copy_event)
 */
inline val <C : Window> C.copyEvent: EventInstance<ClipboardEvent, C, Node>
    get() = EventInstance(this, "copy")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/cut_event)
 */
inline val <C : Window> C.cutEvent: EventInstance<ClipboardEvent, C, Node>
    get() = EventInstance(this, "cut")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/dblclick_event)
 */
inline val <C : Window> C.dblClickEvent: EventInstance<MouseEvent, C, Node>
    get() = EventInstance(this, "dblclick")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/devicemotion_event)
 */
inline val <C : Window> C.deviceMotionEvent: EventInstance<DeviceMotionEvent, C, C>
    get() = EventInstance(this, "devicemotion")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/deviceorientation_event)
 */
inline val <C : Window> C.deviceOrientationEvent: EventInstance<DeviceOrientationEvent, C, C>
    get() = EventInstance(this, "deviceorientation")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/deviceorientationabsolute_event)
 */
inline val <C : Window> C.deviceOrientationAbsoluteEvent: EventInstance<DeviceOrientationEvent, C, C>
    get() = EventInstance(this, "deviceorientationabsolute")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/DOMContentLoaded_event)
 */
inline val <C : Window> C.domContentLoadedEvent: EventInstance<Event, C, Window>
    get() = EventInstance(this, "DOMContentLoaded")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/drag_event)
 */
inline val <C : Window> C.dragEvent: EventInstance<DragEvent, C, Node>
    get() = EventInstance(this, "drag")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/dragend_event)
 */
inline val <C : Window> C.dragEndEvent: EventInstance<DragEvent, C, Node>
    get() = EventInstance(this, "dragend")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/dragenter_event)
 */
inline val <C : Window> C.dragEnterEvent: EventInstance<DragEvent, C, Node>
    get() = EventInstance(this, "dragenter")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/dragleave_event)
 */
inline val <C : Window> C.dragLeaveEvent: EventInstance<DragEvent, C, Node>
    get() = EventInstance(this, "dragleave")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/dragover_event)
 */
inline val <C : Window> C.dragOverEvent: EventInstance<DragEvent, C, Node>
    get() = EventInstance(this, "dragover")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/dragstart_event)
 */
inline val <C : Window> C.dragStartEvent: EventInstance<DragEvent, C, Node>
    get() = EventInstance(this, "dragstart")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/drop_event)
 */
inline val <C : Window> C.dropEvent: EventInstance<DragEvent, C, Node>
    get() = EventInstance(this, "drop")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/enterpictureinpicture_event)
 */
inline val <C : Window> C.enterPictureInPictureEvent: EventInstance<PictureInPictureEvent, C, Node>
    get() = EventInstance(this, "enterpictureinpicture")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/error_event)
 */
inline val <C : Window> C.errorEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, "error")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/focus_event)
 */
inline val <C : Window> C.focusEvent: EventInstance<FocusEvent, C, C>
    get() = EventInstance(this, "focus")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/focusin_event)
 */
inline val <C : Window> C.focusInEvent: EventInstance<FocusEvent, C, Node>
    get() = EventInstance(this, "focusin")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/focusout_event)
 */
inline val <C : Window> C.focusOutEvent: EventInstance<FocusEvent, C, Node>
    get() = EventInstance(this, "focusout")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/formdata_event)
 */
inline val <C : Window> C.formDataEvent: EventInstance<FormDataEvent, C, Node>
    get() = EventInstance(this, "formdata")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/fullscreenchange_event)
 */
inline val <C : Window> C.fullscreenChangeEvent: EventInstance<Event, C, Node>
    get() = EventInstance(this, "fullscreenchange")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/fullscreenerror_event)
 */
inline val <C : Window> C.fullscreenErrorEvent: EventInstance<Event, C, Node>
    get() = EventInstance(this, "fullscreenerror")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/gamepadconnected_event)
 */
inline val <C : Window> C.gamepadConnectedEvent: EventInstance<GamepadEvent, C, C>
    get() = EventInstance(this, "gamepadconnected")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/gamepaddisconnected_event)
 */
inline val <C : Window> C.gamepadDisconnectedEvent: EventInstance<GamepadEvent, C, C>
    get() = EventInstance(this, "gamepaddisconnected")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/gotpointercapture_event)
 */
inline val <C : Window> C.gotPointerCaptureEvent: EventInstance<PointerEvent, C, Node>
    get() = EventInstance(this, "gotpointercapture")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/hashchange_event)
 */
inline val <C : Window> C.hashChangeEvent: EventInstance<HashChangeEvent, C, C>
    get() = EventInstance(this, "hashchange")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/input_event)
 */
inline val <C : Window> C.inputEvent: EventInstance<InputEvent, C, Node>
    get() = EventInstance(this, "input")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/keydown_event)
 */
inline val <C : Window> C.keyDownEvent: EventInstance<KeyboardEvent, C, Node>
    get() = EventInstance(this, "keydown")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/keypress_event)
 */
inline val <C : Window> C.keyPressEvent: EventInstance<KeyboardEvent, C, Node>
    get() = EventInstance(this, "keypress")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/keyup_event)
 */
inline val <C : Window> C.keyUpEvent: EventInstance<KeyboardEvent, C, Node>
    get() = EventInstance(this, "keyup")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/languagechange_event)
 */
inline val <C : Window> C.languageChangeEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, "languagechange")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/leavepictureinpicture_event)
 */
inline val <C : Window> C.leavePictureInPictureEvent: EventInstance<PictureInPictureEvent, C, Node>
    get() = EventInstance(this, "leavepictureinpicture")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/load_event)
 */
inline val <C : Window> C.loadEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, "load")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/lostpointercapture_event)
 */
inline val <C : Window> C.lostPointerCaptureEvent: EventInstance<PointerEvent, C, Node>
    get() = EventInstance(this, "lostpointercapture")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/message_event)
 */
inline val <C : Window> C.messageEvent: EventInstance<MessageEvent<JsAny?>, C, C>
    get() = EventInstance(this, "message")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/messageerror_event)
 */
inline val <C : Window> C.messageErrorEvent: EventInstance<MessageEvent<JsAny?>, C, C>
    get() = EventInstance(this, "messageerror")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/mousedown_event)
 */
inline val <C : Window> C.mouseDownEvent: EventInstance<MouseEvent, C, Node>
    get() = EventInstance(this, "mousedown")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/mousemove_event)
 */
inline val <C : Window> C.mouseMoveEvent: EventInstance<MouseEvent, C, Node>
    get() = EventInstance(this, "mousemove")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/mouseout_event)
 */
inline val <C : Window> C.mouseOutEvent: EventInstance<MouseEvent, C, Node>
    get() = EventInstance(this, "mouseout")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/mouseover_event)
 */
inline val <C : Window> C.mouseOverEvent: EventInstance<MouseEvent, C, Node>
    get() = EventInstance(this, "mouseover")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/mouseup_event)
 */
inline val <C : Window> C.mouseUpEvent: EventInstance<MouseEvent, C, Node>
    get() = EventInstance(this, "mouseup")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/offline_event)
 */
inline val <C : Window> C.offlineEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, "offline")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/online_event)
 */
inline val <C : Window> C.onlineEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, "online")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/pagehide_event)
 */
inline val <C : Window> C.pageHideEvent: EventInstance<PageTransitionEvent, C, C>
    get() = EventInstance(this, "pagehide")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/pagereveal_event)
 */
inline val <C : Window> C.pageRevealEvent: EventInstance<PageRevealEvent, C, C>
    get() = EventInstance(this, "pagereveal")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/pageshow_event)
 */
inline val <C : Window> C.pageShowEvent: EventInstance<PageTransitionEvent, C, C>
    get() = EventInstance(this, "pageshow")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/pageswap_event)
 */
inline val <C : Window> C.pageSwapEvent: EventInstance<PageSwapEvent, C, C>
    get() = EventInstance(this, "pageswap")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/paste_event)
 */
inline val <C : Window> C.pasteEvent: EventInstance<ClipboardEvent, C, Node>
    get() = EventInstance(this, "paste")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/pointercancel_event)
 */
inline val <C : Window> C.pointerCancelEvent: EventInstance<PointerEvent, C, Node>
    get() = EventInstance(this, "pointercancel")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/pointerdown_event)
 */
inline val <C : Window> C.pointerDownEvent: EventInstance<PointerEvent, C, Node>
    get() = EventInstance(this, "pointerdown")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/pointerenter_event)
 */
inline val <C : Window> C.pointerEnterEvent: EventInstance<PointerEvent, C, C>
    get() = EventInstance(this, "pointerenter")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/pointerleave_event)
 */
inline val <C : Window> C.pointerLeaveEvent: EventInstance<PointerEvent, C, C>
    get() = EventInstance(this, "pointerleave")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/pointermove_event)
 */
inline val <C : Window> C.pointerMoveEvent: EventInstance<PointerEvent, C, Node>
    get() = EventInstance(this, "pointermove")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/pointerout_event)
 */
inline val <C : Window> C.pointerOutEvent: EventInstance<PointerEvent, C, Node>
    get() = EventInstance(this, "pointerout")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/pointerover_event)
 */
inline val <C : Window> C.pointerOverEvent: EventInstance<PointerEvent, C, Node>
    get() = EventInstance(this, "pointerover")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/pointerrawupdate_event)
 */
inline val <C : Window> C.pointerRawUpdateEvent: EventInstance<PointerEvent, C, Node>
    get() = EventInstance(this, "pointerrawupdate")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/pointerup_event)
 */
inline val <C : Window> C.pointerUpEvent: EventInstance<PointerEvent, C, Node>
    get() = EventInstance(this, "pointerup")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/popstate_event)
 */
inline val <C : Window> C.popStateEvent: EventInstance<PopStateEvent, C, C>
    get() = EventInstance(this, "popstate")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/rejectionhandled_event)
 */
inline val <C : Window> C.rejectionHandledEvent: EventInstance<PromiseRejectionEvent, C, C>
    get() = EventInstance(this, "rejectionhandled")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/reset_event)
 */
inline val <C : Window> C.resetEvent: EventInstance<Event, C, Node>
    get() = EventInstance(this, "reset")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/resize_event)
 */
inline val <C : Window> C.resizeEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, "resize")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/scroll_event)
 */
inline val <C : Window> C.scrollEvent: EventInstance<Event, C, Window>
    get() = EventInstance(this, "scroll")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/scrollend_event)
 */
inline val <C : Window> C.scrollEndEvent: EventInstance<Event, C, Window>
    get() = EventInstance(this, "scrollend")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/securitypolicyviolation_event)
 */
inline val <C : Window> C.securityPolicyViolationEvent: EventInstance<SecurityPolicyViolationEvent, C, C>
    get() = EventInstance(this, "securitypolicyviolation")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/select_event)
 */
inline val <C : Window> C.selectEvent: EventInstance<Event, C, Node>
    get() = EventInstance(this, "select")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/selectionchange_event)
 */
inline val <C : Window> C.selectionChangeEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, "selectionchange")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/selectstart_event)
 */
inline val <C : Window> C.selectStartEvent: EventInstance<Event, C, Node>
    get() = EventInstance(this, "selectstart")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/slotchange_event)
 */
inline val <C : Window> C.slotChangeEvent: EventInstance<Event, C, Node>
    get() = EventInstance(this, "slotchange")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/storage_event)
 */
inline val <C : Window> C.storageEvent: EventInstance<StorageEvent, C, C>
    get() = EventInstance(this, "storage")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/submit_event)
 */
inline val <C : Window> C.submitEvent: EventInstance<SubmitEvent, C, Node>
    get() = EventInstance(this, "submit")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/touchcancel_event)
 */
inline val <C : Window> C.touchCancelEvent: EventInstance<TouchEvent, C, Node>
    get() = EventInstance(this, "touchcancel")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/touchend_event)
 */
inline val <C : Window> C.touchEndEvent: EventInstance<TouchEvent, C, Node>
    get() = EventInstance(this, "touchend")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/touchmove_event)
 */
inline val <C : Window> C.touchMoveEvent: EventInstance<TouchEvent, C, Node>
    get() = EventInstance(this, "touchmove")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/touchstart_event)
 */
inline val <C : Window> C.touchStartEvent: EventInstance<TouchEvent, C, Node>
    get() = EventInstance(this, "touchstart")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/transitioncancel_event)
 */
inline val <C : Window> C.transitionCancelEvent: EventInstance<TransitionEvent, C, Node>
    get() = EventInstance(this, "transitioncancel")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/transitionend_event)
 */
inline val <C : Window> C.transitionEndEvent: EventInstance<TransitionEvent, C, Node>
    get() = EventInstance(this, "transitionend")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/transitionrun_event)
 */
inline val <C : Window> C.transitionRunEvent: EventInstance<TransitionEvent, C, Node>
    get() = EventInstance(this, "transitionrun")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/transitionstart_event)
 */
inline val <C : Window> C.transitionStartEvent: EventInstance<TransitionEvent, C, Node>
    get() = EventInstance(this, "transitionstart")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/unhandledrejection_event)
 */
inline val <C : Window> C.unhandledRejectionEvent: EventInstance<PromiseRejectionEvent, C, C>
    get() = EventInstance(this, "unhandledrejection")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/unload_event)
 */
inline val <C : Window> C.unloadEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, "unload")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/visibilitychange_event)
 */
inline val <C : Window> C.visibilityChangeEvent: EventInstance<Event, C, Window>
    get() = EventInstance(this, "visibilitychange")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/wheel_event)
 */
inline val <C : Window> C.wheelEvent: EventInstance<WheelEvent, C, Node>
    get() = EventInstance(this, "wheel")
