// Automatically generated - do not modify!

package web.window

import js.core.ArrayLike
import js.core.ReadonlyArray
import web.device.DeviceMotionEvent
import web.device.DeviceOrientationEvent
import web.dom.Element
import web.dom.GlobalEventHandlers
import web.events.EventHandler
import web.events.EventTarget
import web.messaging.Transferable
import web.scroll.ScrollToOptions
import web.selection.Selection
import web.url.URL

/**
 * A window containing a DOM document; the document property points to the DOM document loaded in that window.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window)
 */
sealed external class Window :
    EventTarget,
    GlobalEventHandlers,
    WindowEventHandlers {
    /**
     * Returns true if the window has been closed, false otherwise.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/closed)
     */
    val closed: Boolean

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/frameElement) */
    val frameElement: Element?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/frames) */
    val frames: ArrayLike<Window>

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/innerHeight) */
    val innerHeight: Int

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/innerWidth) */
    val innerWidth: Int

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/name) */
    var name: WindowName

    /**
     * Available only in secure contexts.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/devicemotion_event)
     */
    var ondevicemotion: EventHandler<DeviceMotionEvent>?

    /**
     * Available only in secure contexts.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/deviceorientation_event)
     */
    var ondeviceorientation: EventHandler<DeviceOrientationEvent>?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/opener) */
    var opener: Any?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/outerHeight) */
    val outerHeight: Int

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/outerWidth) */
    val outerWidth: Int

    /**
     * Refers to either the parent WindowProxy, or itself.
     *
     * It can rarely be null e.g. for contentWindow of an iframe that is already removed from the parent.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/parent)
     */
    val parent: WindowProxy

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/screenLeft) */
    val screenLeft: Int

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/screenTop) */
    val screenTop: Int

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/screenX) */
    val screenX: Int

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/screenY) */
    val screenY: Int

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/scrollX) */
    val scrollX: Double

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/scrollY) */
    val scrollY: Double

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/top) */
    val top: WindowProxy?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/blur) */
    fun blur()

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

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/getSelection) */
    fun getSelection(): Selection?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/moveBy) */
    fun moveBy(
        x: Number,
        y: Number,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/moveTo) */
    fun moveTo(
        x: Number,
        y: Number,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/open) */
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

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/print) */
    fun print()

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/resizeBy) */
    fun resizeBy(
        x: Number,
        y: Number,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/resizeTo) */
    fun resizeTo(
        width: Number,
        height: Number,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/scroll) */
    fun scroll(options: ScrollToOptions = definedExternally)
    fun scroll(
        x: Number,
        y: Number,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/scrollBy) */
    fun scrollBy(options: ScrollToOptions = definedExternally)
    fun scrollBy(
        x: Number,
        y: Number,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/scrollTo) */
    fun scrollTo(options: ScrollToOptions = definedExternally)
    fun scrollTo(
        x: Number,
        y: Number,
    )

    /**
     * Cancels the document load.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/stop)
     */
    fun stop()
}
