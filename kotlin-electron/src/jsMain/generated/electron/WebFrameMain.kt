@file:JsModule("INTERNAL_ENTITY")

package electron

import kotlin.js.Promise
import node.events.EventEmitter as NodeEventEmitter


external class WebFrameMain : NodeEventEmitter {
    /**
     * Emitted when the document is loaded.
     */
    fun on(event: WebFrameMainEvent.DOM_READY, listener: Function<*>): Unit /* this */
    fun once(event: WebFrameMainEvent.DOM_READY, listener: Function<*>): Unit /* this */
    fun addListener(event: WebFrameMainEvent.DOM_READY, listener: Function<*>): Unit /* this */
    fun removeListener(event: WebFrameMainEvent.DOM_READY, listener: Function<*>): Unit /* this */

    /**
     * A promise that resolves with the result of the executed code or is rejected if
     * execution throws or results in a rejected promise.
     *
     * Evaluates `code` in page.
     *
     * In the browser window some HTML APIs like `requestFullScreen` can only be
     * invoked by a gesture from the user. Setting `userGesture` to `true` will remove
     * this limitation.
     */
    fun executeJavaScript(code: String, userGesture: Boolean = definedExternally): Promise<Any?>

    /**
     * Send a message to the renderer process, optionally transferring ownership of
     * zero or more `MessagePortMain` objects.
     *
     * The transferred `MessagePortMain` objects will be available in the renderer
     * process by accessing the `ports` property of the emitted event. When they arrive
     * in the renderer, they will be native DOM `MessagePort` objects.
     *
     * For example:
     */
    fun postMessage(channel: String, message: Any?, transfer: js.core.ReadonlyArray<MessagePortMain> = definedExternally): Unit

    /**
     * Whether the reload was initiated successfully. Only results in `false` when the
     * frame has no history.
     */
    fun reload(): Boolean

    /**
     * Send an asynchronous message to the renderer process via `channel`, along with
     * arguments. Arguments will be serialized with the Structured Clone Algorithm,
     * just like `postMessage`, so prototype chains will not be included. Sending
     * Functions, Promises, Symbols, WeakMaps, or WeakSets will throw an exception.
     *
     * The renderer process can handle the message by listening to `channel` with the
     * `ipcRenderer` module.
     */
    fun send(channel: String, vararg args: Any? /* js.core.ReadonlyArray<Any?> */): Unit

    /**
     * A `WebFrameMain[]` collection containing the direct descendents of `frame`.
     *
     */
    val frames: js.core.ReadonlyArray<WebFrameMain>

    /**
     * A `WebFrameMain[]` collection containing every frame in the subtree of `frame`,
     * including itself. This can be useful when traversing through all frames.
     *
     */
    val framesInSubtree: js.core.ReadonlyArray<WebFrameMain>

    /**
     * An `Integer` representing the id of the frame's internal FrameTreeNode instance.
     * This id is browser-global and uniquely identifies a frame that hosts content.
     * The identifier is fixed at the creation of the frame and stays constant for the
     * lifetime of the frame. When the frame is removed, the id is not used again.
     *
     */
    val frameTreeNodeId: Double

    /**
     * An `IpcMain` instance scoped to the frame.
     *
     * IPC messages sent with `ipcRenderer.send`, `ipcRenderer.sendSync` or
     * `ipcRenderer.postMessage` will be delivered in the following order:
     *
     * * `contents.on('ipc-message')`
     * * `contents.mainFrame.on(channel)`
     * * `contents.ipc.on(channel)`
     * * `ipcMain.on(channel)`
     *
     * Handlers registered with `invoke` will be checked in the following order. The
     * first one that is defined will be called, the rest will be ignored.
     *
     * * `contents.mainFrame.handle(channel)`
     * * `contents.handle(channel)`
     * * `ipcMain.handle(channel)`
     *
     * In most cases, only the main frame of a WebContents can send or receive IPC
     * messages. However, if the `nodeIntegrationInSubFrames` option is enabled, it is
     * possible for child frames to send and receive IPC messages also. The
     * `WebContents.ipc` interface may be more convenient when
     * `nodeIntegrationInSubFrames` is not enabled.
     *
     */
    val ipc: IpcMain

    /**
     * A `string` representing the frame name.
     *
     */
    val name: String

    /**
     * A `string` representing the current origin of the frame, serialized according to
     * RFC 6454. This may be different from the URL. For instance, if the frame is a
     * child window opened to `about:blank`, then `frame.origin` will return the parent
     * frame's origin, while `frame.url` will return the empty string. Pages without a
     * scheme/host/port triple origin will have the serialized origin of `"null"` (that
     * is, the string containing the letters n, u, l, l).
     *
     */
    val origin: String

    /**
     * An `Integer` representing the operating system `pid` of the process which owns
     * this frame.
     *
     */
    val osProcessId: Double

    /**
     * A `WebFrameMain | null` representing parent frame of `frame`, the property would
     * be `null` if `frame` is the top frame in the frame hierarchy.
     *
     */
    val parent: Any /* (WebFrameMain) | (null) */

    /**
     * An `Integer` representing the Chromium internal `pid` of the process which owns
     * this frame. This is not the same as the OS process ID; to read that use
     * `frame.osProcessId`.
     *
     */
    val processId: Double

    /**
     * An `Integer` representing the unique frame id in the current renderer process.
     * Distinct `WebFrameMain` instances that refer to the same underlying frame will
     * have the same `routingId`.
     *
     */
    val routingId: Double

    /**
     * A `WebFrameMain | null` representing top frame in the frame hierarchy to which
     * `frame` belongs.
     *
     */
    val top: Any /* (WebFrameMain) | (null) */

    /**
     * A `string` representing the current URL of the frame.
     *
     */
    val url: String

    /**
     * A `string` representing the visibility state of the frame.
     *
     * See also how the Page Visibility API is affected by other Electron APIs.
     *
     */
    val visibilityState: String

    companion object {
// Docs: https://electronjs.org/docs/api/web-frame-main
        /**
         * A frame with the given process and routing IDs, or `undefined` if there is no
         * WebFrameMain associated with the given IDs.
         */
        fun fromId(processId: Double, routingId: Double): Any /* (WebFrameMain) | (undefined) */
    }

}
