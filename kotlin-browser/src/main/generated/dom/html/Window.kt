// Automatically generated - do not modify!

package dom.html

import dom.Element
import dom.GlobalEventHandlers
import dom.ScrollToOptions
import kotlinx.js.ReadonlyArray
import web.device.DeviceMotionEvent
import web.device.DeviceOrientationEvent
import web.events.EventTarget
import web.messaging.Transferable
import web.url.URL

sealed external class Window :
    EventTarget,
    GlobalEventHandlers,
    WindowEventHandlers {
    /** Returns true if the window has been closed, false otherwise. */
    val closed: Boolean
    val frameElement: Element?
    val frames: WindowProxy
    val innerHeight: Int
    val innerWidth: Int
    val length: Int
    var name: String

    /** Available only in secure contexts. */
    var ondevicemotion: ((event: DeviceMotionEvent) -> Unit)?

    /** Available only in secure contexts. */
    var ondeviceorientation: ((event: DeviceOrientationEvent) -> Unit)?
    var opener: Any?
    val outerHeight: Int
    val outerWidth: Int

    /**
     * Refers to either the parent WindowProxy, or itself.
     *
     * It can rarely be null e.g. for contentWindow of an iframe that is already removed from the parent.
     */
    val parent: WindowProxy
    val screenLeft: Int
    val screenTop: Int
    val screenX: Int
    val screenY: Int
    val scrollX: Double
    val scrollY: Double
    val top: WindowProxy?
    fun blur()

    /** Closes the window. */
    fun close()

    /** Moves the focus to the window's browsing context, if any. */
    fun focus()
    fun moveBy(
        x: Number,
        y: Number,
    )

    fun moveTo(
        x: Number,
        y: Number,
    )

    fun open(
        url: URL /* | string */ = definedExternally,
        target: String = definedExternally,
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

    fun print()
    fun resizeBy(
        x: Number,
        y: Number,
    )

    fun resizeTo(
        width: Number,
        height: Number,
    )

    fun scroll(options: ScrollToOptions = definedExternally)
    fun scroll(
        x: Number,
        y: Number,
    )

    fun scrollBy(options: ScrollToOptions = definedExternally)
    fun scrollBy(
        x: Number,
        y: Number,
    )

    fun scrollTo(options: ScrollToOptions = definedExternally)
    fun scrollTo(
        x: Number,
        y: Number,
    )

    /** Cancels the document load. */
    fun stop()
    // [index: number]: Window
}
