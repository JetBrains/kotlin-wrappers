@file:JsModule("INTERNAL_ENTITY")

package electron.core

import node.buffer.Buffer
import kotlin.js.Promise
import node.events.EventEmitter as NodeEventEmitter


external class WebContents : NodeEventEmitter {
    /**
     * Emitted before dispatching the `keydown` and `keyup` events in the page. Calling
     * `event.preventDefault` will prevent the page `keydown`/`keyup` events and the
     * menu shortcuts.
     *
     * To only prevent the menu shortcuts, use `setIgnoreMenuShortcuts`:
     */
    fun on(
        event: WebContentsEvent.BEFORE_INPUT_EVENT, listener: (
            event: Event,
            /**
             * Input properties.
             */
            input: Input
        ) -> Unit
    ): Unit /* this */

    /**
     * Emitted when the `WebContents` loses focus.
     */
    fun on(event: WebContentsEvent.BLUR, listener: Function<*>): Unit /* this */

    /**
     * Emitted when failed to verify the `certificate` for `url`.
     *
     * The usage is the same with the `certificate-error` event of `app`.
     */
    fun on(
        event: WebContentsEvent.CERTIFICATE_ERROR, listener: (
            event: Event, url: String,
            /**
             * The error code.
             */
            error: String, certificate: Certificate, callback: (isTrusted: Boolean) -> Unit, isMainFrame: Boolean
        ) -> Unit
    ): Unit /* this */

    /**
     * Emitted when the associated window logs a console message.
     */
    fun on(
        event: WebContentsEvent.CONSOLE_MESSAGE, listener: (
            event: Event,
            /**
             * The log level, from 0 to 3. In order it matches `verbose`, `info`, `warning` and
             * `error`.
             */
            level: Double,
            /**
             * The actual console message
             */
            message: String,
            /**
             * The line number of the source that triggered this console message
             */
            line: Double, sourceId: String
        ) -> Unit
    ): Unit /* this */

    /**
     * Emitted when the page calls `window.moveTo`, `window.resizeTo` or related APIs.
     *
     * By default, this will move the window. To prevent that behavior, call
     * `event.preventDefault()`.
     */
    fun on(
        event: WebContentsEvent.CONTENT_BOUNDS_UPDATED, listener: (
            event: Event,
            /**
             * requested new content bounds
             */
            bounds: Rectangle
        ) -> Unit
    ): Unit /* this */

    /**
     * Emitted when there is a new context menu that needs to be handled.
     */
    fun on(event: WebContentsEvent.CONTEXT_MENU, listener: (event: Event, params: ContextMenuParams) -> Unit): Unit /* this */

    /**
     * Emitted when the renderer process crashes or is killed.
     *
     * **Deprecated:** This event is superceded by the `render-process-gone` event
     * which contains more information about why the render process disappeared. It
     * isn't always because it crashed.  The `killed` boolean can be replaced by
     * checking `reason === 'killed'` when you switch to that event.
     *
     * @deprecated
     */
    fun on(event: WebContentsEvent.CRASHED, listener: (event: Event, killed: Boolean) -> Unit): Unit /* this */

    /**
     * Emitted when the cursor's type changes. The `type` parameter can be `pointer`,
     * `crosshair`, `hand`, `text`, `wait`, `help`, `e-resize`, `n-resize`,
     * `ne-resize`, `nw-resize`, `s-resize`, `se-resize`, `sw-resize`, `w-resize`,
     * `ns-resize`, `ew-resize`, `nesw-resize`, `nwse-resize`, `col-resize`,
     * `row-resize`, `m-panning`, `m-panning-vertical`, `m-panning-horizontal`,
     * `e-panning`, `n-panning`, `ne-panning`, `nw-panning`, `s-panning`, `se-panning`,
     * `sw-panning`, `w-panning`, `move`, `vertical-text`, `cell`, `context-menu`,
     * `alias`, `progress`, `nodrop`, `copy`, `none`, `not-allowed`, `zoom-in`,
     * `zoom-out`, `grab`, `grabbing`, `custom`, `null`, `drag-drop-none`,
     * `drag-drop-move`, `drag-drop-copy`, `drag-drop-link`, `ns-no-resize`,
     * `ew-no-resize`, `nesw-no-resize`, `nwse-no-resize`, or `default`.
     *
     * If the `type` parameter is `custom`, the `image` parameter will hold the custom
     * cursor image in a `NativeImage`, and `scale`, `size` and `hotspot` will hold
     * additional information about the custom cursor.
     */
    fun on(
        event: WebContentsEvent.CURSOR_CHANGED, listener: (
            event: Event, type: String, image: NativeImage,
            /**
             * scaling factor for the custom cursor.
             */
            scale: Double,
            /**
             * the size of the `image`.
             */
            size: Size,
            /**
             * coordinates of the custom cursor's hotspot.
             */
            hotspot: Point
        ) -> Unit
    ): Unit /* this */

    /**
     * Emitted when `webContents` is destroyed.
     */
    fun on(event: WebContentsEvent.DESTROYED, listener: Function<*>): Unit /* this */

    /**
     * Emitted when DevTools is closed.
     */
    fun on(event: WebContentsEvent.DEVTOOLS_CLOSED, listener: Function<*>): Unit /* this */

    /**
     * Emitted when DevTools is focused / opened.
     */
    fun on(event: WebContentsEvent.DEVTOOLS_FOCUSED, listener: Function<*>): Unit /* this */

    /**
     * Emitted when a link is clicked in DevTools or 'Open in new tab' is selected for
     * a link in its context menu.
     */
    fun on(
        event: WebContentsEvent.DEVTOOLS_OPEN_URL, listener: (
            event: Event,
            /**
             * URL of the link that was clicked or selected.
             */
            url: String
        ) -> Unit
    ): Unit /* this */

    /**
     * Emitted when DevTools is opened.
     */
    fun on(event: WebContentsEvent.DEVTOOLS_OPENED, listener: Function<*>): Unit /* this */

    /**
     * Emitted when the devtools window instructs the webContents to reload
     */
    fun on(event: WebContentsEvent.DEVTOOLS_RELOAD_PAGE, listener: Function<*>): Unit /* this */

    /**
     * Emitted when a `<webview>` has been attached to this web contents.
     */
    fun on(
        event: WebContentsEvent.DID_ATTACH_WEBVIEW, listener: (
            event: Event,
            /**
             * The guest web contents that is used by the `<webview>`.
             */
            webContents: WebContents
        ) -> Unit
    ): Unit /* this */

    /**
     * Emitted when a page's theme color changes. This is usually due to encountering a
     * meta tag:
     */
    fun on(
        event: WebContentsEvent.DID_CHANGE_THEME_COLOR, listener: (
            event: Event,
            /**
             * Theme color is in format of '#rrggbb'. It is `null` when no theme color is set.
             */
            color: Any /* (string) | (null) */
        ) -> Unit
    ): Unit /* this */

    /**
     * Emitted _after_ successful creation of a window via `window.open` in the
     * renderer. Not emitted if the creation of the window is canceled from
     * `webContents.setWindowOpenHandler`.
     *
     * See `window.open()` for more details and how to use this in conjunction with
     * `webContents.setWindowOpenHandler`.
     */
    fun on(event: WebContentsEvent.DID_CREATE_WINDOW, listener: (window: BrowserWindow, details: DidCreateWindowDetails) -> Unit): Unit /* this */

    /**
     * This event is like `did-finish-load` but emitted when the load failed. The full
     * list of error codes and their meaning is available here.
     */
    fun on(
        event: WebContentsEvent.DID_FAIL_LOAD,
        listener: (event: Event, errorCode: Double, errorDescription: String, validatedURL: String, isMainFrame: Boolean, frameProcessId: Double, frameRoutingId: Double) -> Unit
    ): Unit /* this */

    /**
     * This event is like `did-fail-load` but emitted when the load was cancelled (e.g.
     * `window.stop()` was invoked).
     */
    fun on(
        event: WebContentsEvent.DID_FAIL_PROVISIONAL_LOAD,
        listener: (event: Event, errorCode: Double, errorDescription: String, validatedURL: String, isMainFrame: Boolean, frameProcessId: Double, frameRoutingId: Double) -> Unit
    ): Unit /* this */

    /**
     * Emitted when the navigation is done, i.e. the spinner of the tab has stopped
     * spinning, and the `onload` event was dispatched.
     */
    fun on(event: WebContentsEvent.DID_FINISH_LOAD, listener: Function<*>): Unit /* this */

    /**
     * Emitted when a frame has done navigation.
     */
    fun on(event: WebContentsEvent.DID_FRAME_FINISH_LOAD, listener: (event: Event, isMainFrame: Boolean, frameProcessId: Double, frameRoutingId: Double) -> Unit): Unit /* this */

    /**
     * Emitted when any frame navigation is done.
     *
     * This event is not emitted for in-page navigations, such as clicking anchor links
     * or updating the `window.location.hash`. Use `did-navigate-in-page` event for
     * this purpose.
     */
    fun on(
        event: WebContentsEvent.DID_FRAME_NAVIGATE, listener: (
            event: Event, url: String,
            /**
             * -1 for non HTTP navigations
             */
            httpResponseCode: Double,
            /**
             * empty for non HTTP navigations,
             */
            httpStatusText: String, isMainFrame: Boolean, frameProcessId: Double, frameRoutingId: Double
        ) -> Unit
    ): Unit /* this */

    /**
     * Emitted when a main frame navigation is done.
     *
     * This event is not emitted for in-page navigations, such as clicking anchor links
     * or updating the `window.location.hash`. Use `did-navigate-in-page` event for
     * this purpose.
     */
    fun on(
        event: WebContentsEvent.DID_NAVIGATE, listener: (
            event: Event, url: String,
            /**
             * -1 for non HTTP navigations
             */
            httpResponseCode: Double,
            /**
             * empty for non HTTP navigations
             */
            httpStatusText: String
        ) -> Unit
    ): Unit /* this */

    /**
     * Emitted when an in-page navigation happened in any frame.
     *
     * When in-page navigation happens, the page URL changes but does not cause
     * navigation outside of the page. Examples of this occurring are when anchor links
     * are clicked or when the DOM `hashchange` event is triggered.
     */
    fun on(event: WebContentsEvent.DID_NAVIGATE_IN_PAGE, listener: (event: Event, url: String, isMainFrame: Boolean, frameProcessId: Double, frameRoutingId: Double) -> Unit): Unit /* this */

    /**
     * Emitted after a server side redirect occurs during navigation.  For example a
     * 302 redirect.
     *
     * This event cannot be prevented, if you want to prevent redirects you should
     * checkout out the `will-redirect` event above.
     */
    fun on(
        event: WebContentsEvent.DID_REDIRECT_NAVIGATION,
        listener: (event: Event, url: String, isInPlace: Boolean, isMainFrame: Boolean, frameProcessId: Double, frameRoutingId: Double) -> Unit
    ): Unit /* this */

    /**
     * Corresponds to the points in time when the spinner of the tab started spinning.
     */
    fun on(event: WebContentsEvent.DID_START_LOADING, listener: Function<*>): Unit /* this */

    /**
     * Emitted when any frame (including main) starts navigating. `isInPlace` will be
     * `true` for in-page navigations.
     */
    fun on(
        event: WebContentsEvent.DID_START_NAVIGATION,
        listener: (event: Event, url: String, isInPlace: Boolean, isMainFrame: Boolean, frameProcessId: Double, frameRoutingId: Double) -> Unit
    ): Unit /* this */

    /**
     * Corresponds to the points in time when the spinner of the tab stopped spinning.
     */
    fun on(event: WebContentsEvent.DID_STOP_LOADING, listener: Function<*>): Unit /* this */

    /**
     * Emitted when the document in the top-level frame is loaded.
     */
    fun on(event: WebContentsEvent.DOM_READY, listener: Function<*>): Unit /* this */

    /**
     * Emitted when the window enters a full-screen state triggered by HTML API.
     */
    fun on(event: WebContentsEvent.ENTER_HTML_FULL_SCREEN, listener: Function<*>): Unit /* this */

    /**
     * Emitted when the `WebContents` gains focus.
     *
     * Note that on macOS, having focus means the `WebContents` is the first responder
     * of window, so switching focus between windows would not trigger the `focus` and
     * `blur` events of `WebContents`, as the first responder of each window is not
     * changed.
     *
     * The `focus` and `blur` events of `WebContents` should only be used to detect
     * focus change between different `WebContents` and `BrowserView` in the same
     * window.
     */
    fun on(event: WebContentsEvent.FOCUS, listener: Function<*>): Unit /* this */

    /**
     * Emitted when a result is available for `webContents.findInPage` request.
     */
    fun on(event: WebContentsEvent.FOUND_IN_PAGE, listener: (event: Event, result: Result) -> Unit): Unit /* this */

    /**
     * Emitted when the mainFrame, an `<iframe>`, or a nested `<iframe>` is loaded
     * within the page.
     */
    fun on(event: WebContentsEvent.FRAME_CREATED, listener: (event: Event, details: FrameCreatedDetails) -> Unit): Unit /* this */

    /**
     * Emitted when an input event is sent to the WebContents. See InputEvent for
     * details.
     */
    fun on(event: WebContentsEvent.INPUT_EVENT, listener: (event: Event, inputEvent: InputEvent) -> Unit): Unit /* this */

    /**
     * Emitted when the renderer process sends an asynchronous message via
     * `ipcRenderer.send()`.
     *
     * See also `webContents.ipc`, which provides an `IpcMain`-like interface for
     * responding to IPC messages specifically from this WebContents.
     */
    fun on(event: WebContentsEvent.IPC_MESSAGE, listener: Function<Any?> /* (event: Event, channel: string, ...args: any[]) => void */): Unit /* this */

    /**
     * Emitted when the renderer process sends a synchronous message via
     * `ipcRenderer.sendSync()`.
     *
     * See also `webContents.ipc`, which provides an `IpcMain`-like interface for
     * responding to IPC messages specifically from this WebContents.
     */
    fun on(event: WebContentsEvent.IPC_MESSAGE_SYNC, listener: Function<Any?> /* (event: Event, channel: string, ...args: any[]) => void */): Unit /* this */

    /**
     * Emitted when the window leaves a full-screen state triggered by HTML API.
     */
    fun on(event: WebContentsEvent.LEAVE_HTML_FULL_SCREEN, listener: Function<*>): Unit /* this */

    /**
     * Emitted when `webContents` wants to do basic auth.
     *
     * The usage is the same with the `login` event of `app`.
     */
    fun on(
        event: WebContentsEvent.LOGIN,
        listener: (event: Event, authenticationResponseDetails: AuthenticationResponseDetails, authInfo: AuthInfo, callback: (username: String? /* use undefined for default */, password: String? /* use undefined for default */) -> Unit) -> Unit
    ): Unit /* this */

    /**
     * Emitted when media is paused or done playing.
     */
    fun on(event: WebContentsEvent.MEDIA_PAUSED, listener: Function<*>): Unit /* this */

    /**
     * Emitted when media starts playing.
     */
    fun on(event: WebContentsEvent.MEDIA_STARTED_PLAYING, listener: Function<*>): Unit /* this */

    /**
     * Emitted when page receives favicon urls.
     */
    fun on(
        event: WebContentsEvent.PAGE_FAVICON_UPDATED, listener: (
            event: Event,
            /**
             * Array of URLs.
             */
            favicons: js.core.ReadonlyArray<String>
        ) -> Unit
    ): Unit /* this */

    /**
     * Fired when page title is set during navigation. `explicitSet` is false when
     * title is synthesized from file url.
     */
    fun on(event: WebContentsEvent.PAGE_TITLE_UPDATED, listener: (event: Event, title: String, explicitSet: Boolean) -> Unit): Unit /* this */

    /**
     * Emitted when a new frame is generated. Only the dirty area is passed in the
     * buffer.
     */
    fun on(
        event: WebContentsEvent.PAINT, listener: (
            event: Event, dirtyRect: Rectangle,
            /**
             * The image data of the whole frame.
             */
            image: NativeImage
        ) -> Unit
    ): Unit /* this */

    /**
     * Emitted when a plugin process has crashed.
     */
    fun on(event: WebContentsEvent.PLUGIN_CRASHED, listener: (event: Event, name: String, version: String) -> Unit): Unit /* this */

    /**
     * Emitted when the `WebContents` preferred size has changed.
     *
     * This event will only be emitted when `enablePreferredSizeMode` is set to `true`
     * in `webPreferences`.
     */
    fun on(
        event: WebContentsEvent.PREFERRED_SIZE_CHANGED, listener: (
            event: Event,
            /**
             * The minimum size needed to contain the layout of the document—without requiring
             * scrolling.
             */
            preferredSize: Size
        ) -> Unit
    ): Unit /* this */

    /**
     * Emitted when the preload script `preloadPath` throws an unhandled exception
     * `error`.
     */
    fun on(event: WebContentsEvent.PRELOAD_ERROR, listener: (event: Event, preloadPath: String, error: Throwable /* JsError */) -> Unit): Unit /* this */

    /**
     * Emitted when the renderer process unexpectedly disappears.  This is normally
     * because it was crashed or killed.
     */
    fun on(event: WebContentsEvent.RENDER_PROCESS_GONE, listener: (event: Event, details: RenderProcessGoneDetails) -> Unit): Unit /* this */

    /**
     * Emitted when the unresponsive web page becomes responsive again.
     */
    fun on(event: WebContentsEvent.RESPONSIVE, listener: Function<*>): Unit /* this */

    /**
     * Emitted when a bluetooth device needs to be selected when a call to
     * `navigator.bluetooth.requestDevice` is made. `callback` should be called with
     * the `deviceId` of the device to be selected.  Passing an empty string to
     * `callback` will cancel the request.
     *
     * If an event listener is not added for this event, or if `event.preventDefault`
     * is not called when handling this event, the first available device will be
     * automatically selected.
     *
     * Due to the nature of bluetooth, scanning for devices when
     * `navigator.bluetooth.requestDevice` is called may take time and will cause
     * `select-bluetooth-device` to fire multiple times until `callback` is called with
     * either a device id or an empty string to cancel the request.
     */
    fun on(event: WebContentsEvent.SELECT_BLUETOOTH_DEVICE, listener: (event: Event, devices: js.core.ReadonlyArray<BluetoothDevice>, callback: (deviceId: String) -> Unit) -> Unit): Unit /* this */

    /**
     * Emitted when a client certificate is requested.
     *
     * The usage is the same with the `select-client-certificate` event of `app`.
     */
    fun on(
        event: WebContentsEvent.SELECT_CLIENT_CERTIFICATE,
        listener: (event: Event, url: String, certificateList: js.core.ReadonlyArray<Certificate>, callback: (certificate: Certificate) -> Unit) -> Unit
    ): Unit /* this */

    /**
     * Emitted when the web page becomes unresponsive.
     */
    fun on(event: WebContentsEvent.UNRESPONSIVE, listener: Function<*>): Unit /* this */

    /**
     * Emitted when mouse moves over a link or the keyboard moves the focus to a link.
     */
    fun on(event: WebContentsEvent.UPDATE_TARGET_URL, listener: (event: Event, url: String) -> Unit): Unit /* this */

    /**
     * Emitted when a `<webview>`'s web contents is being attached to this web
     * contents. Calling `event.preventDefault()` will destroy the guest page.
     *
     * This event can be used to configure `webPreferences` for the `webContents` of a
     * `<webview>` before it's loaded, and provides the ability to set settings that
     * can't be set via `<webview>` attributes.
     */
    fun on(
        event: WebContentsEvent.WILL_ATTACH_WEBVIEW, listener: (
            event: Event,
            /**
             * The web preferences that will be used by the guest page. This object can be
             * modified to adjust the preferences for the guest page.
             */
            webPreferences: WebPreferences,
            /**
             * The other `<webview>` parameters such as the `src` URL. This object can be
             * modified to adjust the parameters of the guest page.
             */
            params: js.core.ReadonlyRecord<String, String>
        ) -> Unit
    ): Unit /* this */

    /**
     * Emitted when a user or the page wants to start navigation. It can happen when
     * the `window.location` object is changed or a user clicks a link in the page.
     *
     * This event will not emit when the navigation is started programmatically with
     * APIs like `webContents.loadURL` and `webContents.back`.
     *
     * It is also not emitted for in-page navigations, such as clicking anchor links or
     * updating the `window.location.hash`. Use `did-navigate-in-page` event for this
     * purpose.
     *
     * Calling `event.preventDefault()` will prevent the navigation.
     */
    fun on(event: WebContentsEvent.WILL_NAVIGATE, listener: (event: Event, url: String) -> Unit): Unit /* this */

    /**
     * Emitted when a `beforeunload` event handler is attempting to cancel a page
     * unload.
     *
     * Calling `event.preventDefault()` will ignore the `beforeunload` event handler
     * and allow the page to be unloaded.
     *
     * **Note:** This will be emitted for `BrowserViews` but will _not_ be respected -
     * this is because we have chosen not to tie the `BrowserView` lifecycle to its
     * owning BrowserWindow should one exist per the specification.
     */
    fun on(event: WebContentsEvent.WILL_PREVENT_UNLOAD, listener: (event: Event) -> Unit): Unit /* this */

    /**
     * Emitted when a server side redirect occurs during navigation.  For example a 302
     * redirect.
     *
     * This event will be emitted after `did-start-navigation` and always before the
     * `did-redirect-navigation` event for the same navigation.
     *
     * Calling `event.preventDefault()` will prevent the navigation (not just the
     * redirect).
     */
    fun on(
        event: WebContentsEvent.WILL_REDIRECT,
        listener: (event: Event, url: String, isInPlace: Boolean, isMainFrame: Boolean, frameProcessId: Double, frameRoutingId: Double) -> Unit
    ): Unit /* this */

    /**
     * Emitted when the user is requesting to change the zoom level using the mouse
     * wheel.
     */
    fun on(
        event: WebContentsEvent.ZOOM_CHANGED, listener: (
            event: Event,
            /**
             * Can be `in` or `out`.
             */
            zoomDirection: (WebContentsOnListenerZoomDirection)
        ) -> Unit
    ): Unit /* this */

    fun once(
        event: WebContentsEvent.BEFORE_INPUT_EVENT, listener: (
            event: Event,
            /**
             * Input properties.
             */
            input: Input
        ) -> Unit
    ): Unit /* this */

    fun once(event: WebContentsEvent.BLUR, listener: Function<*>): Unit /* this */
    fun once(
        event: WebContentsEvent.CERTIFICATE_ERROR, listener: (
            event: Event, url: String,
            /**
             * The error code.
             */
            error: String, certificate: Certificate, callback: (isTrusted: Boolean) -> Unit, isMainFrame: Boolean
        ) -> Unit
    ): Unit /* this */

    fun once(
        event: WebContentsEvent.CONSOLE_MESSAGE, listener: (
            event: Event,
            /**
             * The log level, from 0 to 3. In order it matches `verbose`, `info`, `warning` and
             * `error`.
             */
            level: Double,
            /**
             * The actual console message
             */
            message: String,
            /**
             * The line number of the source that triggered this console message
             */
            line: Double, sourceId: String
        ) -> Unit
    ): Unit /* this */

    fun once(
        event: WebContentsEvent.CONTENT_BOUNDS_UPDATED, listener: (
            event: Event,
            /**
             * requested new content bounds
             */
            bounds: Rectangle
        ) -> Unit
    ): Unit /* this */

    fun once(event: WebContentsEvent.CONTEXT_MENU, listener: (event: Event, params: ContextMenuParams) -> Unit): Unit /* this */
    fun once(event: WebContentsEvent.CRASHED, listener: (event: Event, killed: Boolean) -> Unit): Unit /* this */
    fun once(
        event: WebContentsEvent.CURSOR_CHANGED, listener: (
            event: Event, type: String, image: NativeImage,
            /**
             * scaling factor for the custom cursor.
             */
            scale: Double,
            /**
             * the size of the `image`.
             */
            size: Size,
            /**
             * coordinates of the custom cursor's hotspot.
             */
            hotspot: Point
        ) -> Unit
    ): Unit /* this */

    fun once(event: WebContentsEvent.DESTROYED, listener: Function<*>): Unit /* this */
    fun once(event: WebContentsEvent.DEVTOOLS_CLOSED, listener: Function<*>): Unit /* this */
    fun once(event: WebContentsEvent.DEVTOOLS_FOCUSED, listener: Function<*>): Unit /* this */
    fun once(
        event: WebContentsEvent.DEVTOOLS_OPEN_URL, listener: (
            event: Event,
            /**
             * URL of the link that was clicked or selected.
             */
            url: String
        ) -> Unit
    ): Unit /* this */

    fun once(event: WebContentsEvent.DEVTOOLS_OPENED, listener: Function<*>): Unit /* this */
    fun once(event: WebContentsEvent.DEVTOOLS_RELOAD_PAGE, listener: Function<*>): Unit /* this */
    fun once(
        event: WebContentsEvent.DID_ATTACH_WEBVIEW, listener: (
            event: Event,
            /**
             * The guest web contents that is used by the `<webview>`.
             */
            webContents: WebContents
        ) -> Unit
    ): Unit /* this */

    fun once(
        event: WebContentsEvent.DID_CHANGE_THEME_COLOR, listener: (
            event: Event,
            /**
             * Theme color is in format of '#rrggbb'. It is `null` when no theme color is set.
             */
            color: Any /* (string) | (null) */
        ) -> Unit
    ): Unit /* this */

    fun once(event: WebContentsEvent.DID_CREATE_WINDOW, listener: (window: BrowserWindow, details: DidCreateWindowDetails) -> Unit): Unit /* this */
    fun once(
        event: WebContentsEvent.DID_FAIL_LOAD,
        listener: (event: Event, errorCode: Double, errorDescription: String, validatedURL: String, isMainFrame: Boolean, frameProcessId: Double, frameRoutingId: Double) -> Unit
    ): Unit /* this */

    fun once(
        event: WebContentsEvent.DID_FAIL_PROVISIONAL_LOAD,
        listener: (event: Event, errorCode: Double, errorDescription: String, validatedURL: String, isMainFrame: Boolean, frameProcessId: Double, frameRoutingId: Double) -> Unit
    ): Unit /* this */

    fun once(event: WebContentsEvent.DID_FINISH_LOAD, listener: Function<*>): Unit /* this */
    fun once(event: WebContentsEvent.DID_FRAME_FINISH_LOAD, listener: (event: Event, isMainFrame: Boolean, frameProcessId: Double, frameRoutingId: Double) -> Unit): Unit /* this */
    fun once(
        event: WebContentsEvent.DID_FRAME_NAVIGATE, listener: (
            event: Event, url: String,
            /**
             * -1 for non HTTP navigations
             */
            httpResponseCode: Double,
            /**
             * empty for non HTTP navigations,
             */
            httpStatusText: String, isMainFrame: Boolean, frameProcessId: Double, frameRoutingId: Double
        ) -> Unit
    ): Unit /* this */

    fun once(
        event: WebContentsEvent.DID_NAVIGATE, listener: (
            event: Event, url: String,
            /**
             * -1 for non HTTP navigations
             */
            httpResponseCode: Double,
            /**
             * empty for non HTTP navigations
             */
            httpStatusText: String
        ) -> Unit
    ): Unit /* this */

    fun once(event: WebContentsEvent.DID_NAVIGATE_IN_PAGE, listener: (event: Event, url: String, isMainFrame: Boolean, frameProcessId: Double, frameRoutingId: Double) -> Unit): Unit /* this */
    fun once(
        event: WebContentsEvent.DID_REDIRECT_NAVIGATION,
        listener: (event: Event, url: String, isInPlace: Boolean, isMainFrame: Boolean, frameProcessId: Double, frameRoutingId: Double) -> Unit
    ): Unit /* this */

    fun once(event: WebContentsEvent.DID_START_LOADING, listener: Function<*>): Unit /* this */
    fun once(
        event: WebContentsEvent.DID_START_NAVIGATION,
        listener: (event: Event, url: String, isInPlace: Boolean, isMainFrame: Boolean, frameProcessId: Double, frameRoutingId: Double) -> Unit
    ): Unit /* this */

    fun once(event: WebContentsEvent.DID_STOP_LOADING, listener: Function<*>): Unit /* this */
    fun once(event: WebContentsEvent.DOM_READY, listener: Function<*>): Unit /* this */
    fun once(event: WebContentsEvent.ENTER_HTML_FULL_SCREEN, listener: Function<*>): Unit /* this */
    fun once(event: WebContentsEvent.FOCUS, listener: Function<*>): Unit /* this */
    fun once(event: WebContentsEvent.FOUND_IN_PAGE, listener: (event: Event, result: Result) -> Unit): Unit /* this */
    fun once(event: WebContentsEvent.FRAME_CREATED, listener: (event: Event, details: FrameCreatedDetails) -> Unit): Unit /* this */
    fun once(event: WebContentsEvent.INPUT_EVENT, listener: (event: Event, inputEvent: InputEvent) -> Unit): Unit /* this */
    fun once(event: WebContentsEvent.IPC_MESSAGE, listener: Function<Any?> /* (event: Event, channel: string, ...args: any[]) => void */): Unit /* this */
    fun once(event: WebContentsEvent.IPC_MESSAGE_SYNC, listener: Function<Any?> /* (event: Event, channel: string, ...args: any[]) => void */): Unit /* this */
    fun once(event: WebContentsEvent.LEAVE_HTML_FULL_SCREEN, listener: Function<*>): Unit /* this */
    fun once(
        event: WebContentsEvent.LOGIN,
        listener: (event: Event, authenticationResponseDetails: AuthenticationResponseDetails, authInfo: AuthInfo, callback: (username: String? /* use undefined for default */, password: String? /* use undefined for default */) -> Unit) -> Unit
    ): Unit /* this */

    fun once(event: WebContentsEvent.MEDIA_PAUSED, listener: Function<*>): Unit /* this */
    fun once(event: WebContentsEvent.MEDIA_STARTED_PLAYING, listener: Function<*>): Unit /* this */
    fun once(
        event: WebContentsEvent.PAGE_FAVICON_UPDATED, listener: (
            event: Event,
            /**
             * Array of URLs.
             */
            favicons: js.core.ReadonlyArray<String>
        ) -> Unit
    ): Unit /* this */

    fun once(event: WebContentsEvent.PAGE_TITLE_UPDATED, listener: (event: Event, title: String, explicitSet: Boolean) -> Unit): Unit /* this */
    fun once(
        event: WebContentsEvent.PAINT, listener: (
            event: Event, dirtyRect: Rectangle,
            /**
             * The image data of the whole frame.
             */
            image: NativeImage
        ) -> Unit
    ): Unit /* this */

    fun once(event: WebContentsEvent.PLUGIN_CRASHED, listener: (event: Event, name: String, version: String) -> Unit): Unit /* this */
    fun once(
        event: WebContentsEvent.PREFERRED_SIZE_CHANGED, listener: (
            event: Event,
            /**
             * The minimum size needed to contain the layout of the document—without requiring
             * scrolling.
             */
            preferredSize: Size
        ) -> Unit
    ): Unit /* this */

    fun once(event: WebContentsEvent.PRELOAD_ERROR, listener: (event: Event, preloadPath: String, error: Throwable /* JsError */) -> Unit): Unit /* this */
    fun once(event: WebContentsEvent.RENDER_PROCESS_GONE, listener: (event: Event, details: RenderProcessGoneDetails) -> Unit): Unit /* this */
    fun once(event: WebContentsEvent.RESPONSIVE, listener: Function<*>): Unit /* this */
    fun once(event: WebContentsEvent.SELECT_BLUETOOTH_DEVICE, listener: (event: Event, devices: js.core.ReadonlyArray<BluetoothDevice>, callback: (deviceId: String) -> Unit) -> Unit): Unit /* this */
    fun once(
        event: WebContentsEvent.SELECT_CLIENT_CERTIFICATE,
        listener: (event: Event, url: String, certificateList: js.core.ReadonlyArray<Certificate>, callback: (certificate: Certificate) -> Unit) -> Unit
    ): Unit /* this */

    fun once(event: WebContentsEvent.UNRESPONSIVE, listener: Function<*>): Unit /* this */
    fun once(event: WebContentsEvent.UPDATE_TARGET_URL, listener: (event: Event, url: String) -> Unit): Unit /* this */
    fun once(
        event: WebContentsEvent.WILL_ATTACH_WEBVIEW, listener: (
            event: Event,
            /**
             * The web preferences that will be used by the guest page. This object can be
             * modified to adjust the preferences for the guest page.
             */
            webPreferences: WebPreferences,
            /**
             * The other `<webview>` parameters such as the `src` URL. This object can be
             * modified to adjust the parameters of the guest page.
             */
            params: js.core.ReadonlyRecord<String, String>
        ) -> Unit
    ): Unit /* this */

    fun once(event: WebContentsEvent.WILL_NAVIGATE, listener: (event: Event, url: String) -> Unit): Unit /* this */
    fun once(event: WebContentsEvent.WILL_PREVENT_UNLOAD, listener: (event: Event) -> Unit): Unit /* this */
    fun once(
        event: WebContentsEvent.WILL_REDIRECT,
        listener: (event: Event, url: String, isInPlace: Boolean, isMainFrame: Boolean, frameProcessId: Double, frameRoutingId: Double) -> Unit
    ): Unit /* this */

    fun once(
        event: WebContentsEvent.ZOOM_CHANGED, listener: (
            event: Event,
            /**
             * Can be `in` or `out`.
             */
            zoomDirection: (WebContentsOnceListenerZoomDirection)
        ) -> Unit
    ): Unit /* this */

    fun addListener(
        event: WebContentsEvent.BEFORE_INPUT_EVENT, listener: (
            event: Event,
            /**
             * Input properties.
             */
            input: Input
        ) -> Unit
    ): Unit /* this */

    fun addListener(event: WebContentsEvent.BLUR, listener: Function<*>): Unit /* this */
    fun addListener(
        event: WebContentsEvent.CERTIFICATE_ERROR, listener: (
            event: Event, url: String,
            /**
             * The error code.
             */
            error: String, certificate: Certificate, callback: (isTrusted: Boolean) -> Unit, isMainFrame: Boolean
        ) -> Unit
    ): Unit /* this */

    fun addListener(
        event: WebContentsEvent.CONSOLE_MESSAGE, listener: (
            event: Event,
            /**
             * The log level, from 0 to 3. In order it matches `verbose`, `info`, `warning` and
             * `error`.
             */
            level: Double,
            /**
             * The actual console message
             */
            message: String,
            /**
             * The line number of the source that triggered this console message
             */
            line: Double, sourceId: String
        ) -> Unit
    ): Unit /* this */

    fun addListener(
        event: WebContentsEvent.CONTENT_BOUNDS_UPDATED, listener: (
            event: Event,
            /**
             * requested new content bounds
             */
            bounds: Rectangle
        ) -> Unit
    ): Unit /* this */

    fun addListener(event: WebContentsEvent.CONTEXT_MENU, listener: (event: Event, params: ContextMenuParams) -> Unit): Unit /* this */
    fun addListener(event: WebContentsEvent.CRASHED, listener: (event: Event, killed: Boolean) -> Unit): Unit /* this */
    fun addListener(
        event: WebContentsEvent.CURSOR_CHANGED, listener: (
            event: Event, type: String, image: NativeImage,
            /**
             * scaling factor for the custom cursor.
             */
            scale: Double,
            /**
             * the size of the `image`.
             */
            size: Size,
            /**
             * coordinates of the custom cursor's hotspot.
             */
            hotspot: Point
        ) -> Unit
    ): Unit /* this */

    fun addListener(event: WebContentsEvent.DESTROYED, listener: Function<*>): Unit /* this */
    fun addListener(event: WebContentsEvent.DEVTOOLS_CLOSED, listener: Function<*>): Unit /* this */
    fun addListener(event: WebContentsEvent.DEVTOOLS_FOCUSED, listener: Function<*>): Unit /* this */
    fun addListener(
        event: WebContentsEvent.DEVTOOLS_OPEN_URL, listener: (
            event: Event,
            /**
             * URL of the link that was clicked or selected.
             */
            url: String
        ) -> Unit
    ): Unit /* this */

    fun addListener(event: WebContentsEvent.DEVTOOLS_OPENED, listener: Function<*>): Unit /* this */
    fun addListener(event: WebContentsEvent.DEVTOOLS_RELOAD_PAGE, listener: Function<*>): Unit /* this */
    fun addListener(
        event: WebContentsEvent.DID_ATTACH_WEBVIEW, listener: (
            event: Event,
            /**
             * The guest web contents that is used by the `<webview>`.
             */
            webContents: WebContents
        ) -> Unit
    ): Unit /* this */

    fun addListener(
        event: WebContentsEvent.DID_CHANGE_THEME_COLOR, listener: (
            event: Event,
            /**
             * Theme color is in format of '#rrggbb'. It is `null` when no theme color is set.
             */
            color: Any /* (string) | (null) */
        ) -> Unit
    ): Unit /* this */

    fun addListener(event: WebContentsEvent.DID_CREATE_WINDOW, listener: (window: BrowserWindow, details: DidCreateWindowDetails) -> Unit): Unit /* this */
    fun addListener(
        event: WebContentsEvent.DID_FAIL_LOAD,
        listener: (event: Event, errorCode: Double, errorDescription: String, validatedURL: String, isMainFrame: Boolean, frameProcessId: Double, frameRoutingId: Double) -> Unit
    ): Unit /* this */

    fun addListener(
        event: WebContentsEvent.DID_FAIL_PROVISIONAL_LOAD,
        listener: (event: Event, errorCode: Double, errorDescription: String, validatedURL: String, isMainFrame: Boolean, frameProcessId: Double, frameRoutingId: Double) -> Unit
    ): Unit /* this */

    fun addListener(event: WebContentsEvent.DID_FINISH_LOAD, listener: Function<*>): Unit /* this */
    fun addListener(event: WebContentsEvent.DID_FRAME_FINISH_LOAD, listener: (event: Event, isMainFrame: Boolean, frameProcessId: Double, frameRoutingId: Double) -> Unit): Unit /* this */
    fun addListener(
        event: WebContentsEvent.DID_FRAME_NAVIGATE, listener: (
            event: Event, url: String,
            /**
             * -1 for non HTTP navigations
             */
            httpResponseCode: Double,
            /**
             * empty for non HTTP navigations,
             */
            httpStatusText: String, isMainFrame: Boolean, frameProcessId: Double, frameRoutingId: Double
        ) -> Unit
    ): Unit /* this */

    fun addListener(
        event: WebContentsEvent.DID_NAVIGATE, listener: (
            event: Event, url: String,
            /**
             * -1 for non HTTP navigations
             */
            httpResponseCode: Double,
            /**
             * empty for non HTTP navigations
             */
            httpStatusText: String
        ) -> Unit
    ): Unit /* this */

    fun addListener(event: WebContentsEvent.DID_NAVIGATE_IN_PAGE, listener: (event: Event, url: String, isMainFrame: Boolean, frameProcessId: Double, frameRoutingId: Double) -> Unit): Unit /* this */
    fun addListener(
        event: WebContentsEvent.DID_REDIRECT_NAVIGATION,
        listener: (event: Event, url: String, isInPlace: Boolean, isMainFrame: Boolean, frameProcessId: Double, frameRoutingId: Double) -> Unit
    ): Unit /* this */

    fun addListener(event: WebContentsEvent.DID_START_LOADING, listener: Function<*>): Unit /* this */
    fun addListener(
        event: WebContentsEvent.DID_START_NAVIGATION,
        listener: (event: Event, url: String, isInPlace: Boolean, isMainFrame: Boolean, frameProcessId: Double, frameRoutingId: Double) -> Unit
    ): Unit /* this */

    fun addListener(event: WebContentsEvent.DID_STOP_LOADING, listener: Function<*>): Unit /* this */
    fun addListener(event: WebContentsEvent.DOM_READY, listener: Function<*>): Unit /* this */
    fun addListener(event: WebContentsEvent.ENTER_HTML_FULL_SCREEN, listener: Function<*>): Unit /* this */
    fun addListener(event: WebContentsEvent.FOCUS, listener: Function<*>): Unit /* this */
    fun addListener(event: WebContentsEvent.FOUND_IN_PAGE, listener: (event: Event, result: Result) -> Unit): Unit /* this */
    fun addListener(event: WebContentsEvent.FRAME_CREATED, listener: (event: Event, details: FrameCreatedDetails) -> Unit): Unit /* this */
    fun addListener(event: WebContentsEvent.INPUT_EVENT, listener: (event: Event, inputEvent: InputEvent) -> Unit): Unit /* this */
    fun addListener(event: WebContentsEvent.IPC_MESSAGE, listener: Function<Any?> /* (event: Event, channel: string, ...args: any[]) => void */): Unit /* this */
    fun addListener(event: WebContentsEvent.IPC_MESSAGE_SYNC, listener: Function<Any?> /* (event: Event, channel: string, ...args: any[]) => void */): Unit /* this */
    fun addListener(event: WebContentsEvent.LEAVE_HTML_FULL_SCREEN, listener: Function<*>): Unit /* this */
    fun addListener(
        event: WebContentsEvent.LOGIN,
        listener: (event: Event, authenticationResponseDetails: AuthenticationResponseDetails, authInfo: AuthInfo, callback: (username: String? /* use undefined for default */, password: String? /* use undefined for default */) -> Unit) -> Unit
    ): Unit /* this */

    fun addListener(event: WebContentsEvent.MEDIA_PAUSED, listener: Function<*>): Unit /* this */
    fun addListener(event: WebContentsEvent.MEDIA_STARTED_PLAYING, listener: Function<*>): Unit /* this */
    fun addListener(
        event: WebContentsEvent.PAGE_FAVICON_UPDATED, listener: (
            event: Event,
            /**
             * Array of URLs.
             */
            favicons: js.core.ReadonlyArray<String>
        ) -> Unit
    ): Unit /* this */

    fun addListener(event: WebContentsEvent.PAGE_TITLE_UPDATED, listener: (event: Event, title: String, explicitSet: Boolean) -> Unit): Unit /* this */
    fun addListener(
        event: WebContentsEvent.PAINT, listener: (
            event: Event, dirtyRect: Rectangle,
            /**
             * The image data of the whole frame.
             */
            image: NativeImage
        ) -> Unit
    ): Unit /* this */

    fun addListener(event: WebContentsEvent.PLUGIN_CRASHED, listener: (event: Event, name: String, version: String) -> Unit): Unit /* this */
    fun addListener(
        event: WebContentsEvent.PREFERRED_SIZE_CHANGED, listener: (
            event: Event,
            /**
             * The minimum size needed to contain the layout of the document—without requiring
             * scrolling.
             */
            preferredSize: Size
        ) -> Unit
    ): Unit /* this */

    fun addListener(event: WebContentsEvent.PRELOAD_ERROR, listener: (event: Event, preloadPath: String, error: Throwable /* JsError */) -> Unit): Unit /* this */
    fun addListener(event: WebContentsEvent.RENDER_PROCESS_GONE, listener: (event: Event, details: RenderProcessGoneDetails) -> Unit): Unit /* this */
    fun addListener(event: WebContentsEvent.RESPONSIVE, listener: Function<*>): Unit /* this */
    fun addListener(
        event: WebContentsEvent.SELECT_BLUETOOTH_DEVICE,
        listener: (event: Event, devices: js.core.ReadonlyArray<BluetoothDevice>, callback: (deviceId: String) -> Unit) -> Unit
    ): Unit /* this */

    fun addListener(
        event: WebContentsEvent.SELECT_CLIENT_CERTIFICATE,
        listener: (event: Event, url: String, certificateList: js.core.ReadonlyArray<Certificate>, callback: (certificate: Certificate) -> Unit) -> Unit
    ): Unit /* this */

    fun addListener(event: WebContentsEvent.UNRESPONSIVE, listener: Function<*>): Unit /* this */
    fun addListener(event: WebContentsEvent.UPDATE_TARGET_URL, listener: (event: Event, url: String) -> Unit): Unit /* this */
    fun addListener(
        event: WebContentsEvent.WILL_ATTACH_WEBVIEW, listener: (
            event: Event,
            /**
             * The web preferences that will be used by the guest page. This object can be
             * modified to adjust the preferences for the guest page.
             */
            webPreferences: WebPreferences,
            /**
             * The other `<webview>` parameters such as the `src` URL. This object can be
             * modified to adjust the parameters of the guest page.
             */
            params: js.core.ReadonlyRecord<String, String>
        ) -> Unit
    ): Unit /* this */

    fun addListener(event: WebContentsEvent.WILL_NAVIGATE, listener: (event: Event, url: String) -> Unit): Unit /* this */
    fun addListener(event: WebContentsEvent.WILL_PREVENT_UNLOAD, listener: (event: Event) -> Unit): Unit /* this */
    fun addListener(
        event: WebContentsEvent.WILL_REDIRECT,
        listener: (event: Event, url: String, isInPlace: Boolean, isMainFrame: Boolean, frameProcessId: Double, frameRoutingId: Double) -> Unit
    ): Unit /* this */

    fun addListener(
        event: WebContentsEvent.ZOOM_CHANGED, listener: (
            event: Event,
            /**
             * Can be `in` or `out`.
             */
            zoomDirection: (WebContentsAddListenerListenerZoomDirection)
        ) -> Unit
    ): Unit /* this */

    fun removeListener(
        event: WebContentsEvent.BEFORE_INPUT_EVENT, listener: (
            event: Event,
            /**
             * Input properties.
             */
            input: Input
        ) -> Unit
    ): Unit /* this */

    fun removeListener(event: WebContentsEvent.BLUR, listener: Function<*>): Unit /* this */
    fun removeListener(
        event: WebContentsEvent.CERTIFICATE_ERROR, listener: (
            event: Event, url: String,
            /**
             * The error code.
             */
            error: String, certificate: Certificate, callback: (isTrusted: Boolean) -> Unit, isMainFrame: Boolean
        ) -> Unit
    ): Unit /* this */

    fun removeListener(
        event: WebContentsEvent.CONSOLE_MESSAGE, listener: (
            event: Event,
            /**
             * The log level, from 0 to 3. In order it matches `verbose`, `info`, `warning` and
             * `error`.
             */
            level: Double,
            /**
             * The actual console message
             */
            message: String,
            /**
             * The line number of the source that triggered this console message
             */
            line: Double, sourceId: String
        ) -> Unit
    ): Unit /* this */

    fun removeListener(
        event: WebContentsEvent.CONTENT_BOUNDS_UPDATED, listener: (
            event: Event,
            /**
             * requested new content bounds
             */
            bounds: Rectangle
        ) -> Unit
    ): Unit /* this */

    fun removeListener(event: WebContentsEvent.CONTEXT_MENU, listener: (event: Event, params: ContextMenuParams) -> Unit): Unit /* this */
    fun removeListener(event: WebContentsEvent.CRASHED, listener: (event: Event, killed: Boolean) -> Unit): Unit /* this */
    fun removeListener(
        event: WebContentsEvent.CURSOR_CHANGED, listener: (
            event: Event, type: String, image: NativeImage,
            /**
             * scaling factor for the custom cursor.
             */
            scale: Double,
            /**
             * the size of the `image`.
             */
            size: Size,
            /**
             * coordinates of the custom cursor's hotspot.
             */
            hotspot: Point
        ) -> Unit
    ): Unit /* this */

    fun removeListener(event: WebContentsEvent.DESTROYED, listener: Function<*>): Unit /* this */
    fun removeListener(event: WebContentsEvent.DEVTOOLS_CLOSED, listener: Function<*>): Unit /* this */
    fun removeListener(event: WebContentsEvent.DEVTOOLS_FOCUSED, listener: Function<*>): Unit /* this */
    fun removeListener(
        event: WebContentsEvent.DEVTOOLS_OPEN_URL, listener: (
            event: Event,
            /**
             * URL of the link that was clicked or selected.
             */
            url: String
        ) -> Unit
    ): Unit /* this */

    fun removeListener(event: WebContentsEvent.DEVTOOLS_OPENED, listener: Function<*>): Unit /* this */
    fun removeListener(event: WebContentsEvent.DEVTOOLS_RELOAD_PAGE, listener: Function<*>): Unit /* this */
    fun removeListener(
        event: WebContentsEvent.DID_ATTACH_WEBVIEW, listener: (
            event: Event,
            /**
             * The guest web contents that is used by the `<webview>`.
             */
            webContents: WebContents
        ) -> Unit
    ): Unit /* this */

    fun removeListener(
        event: WebContentsEvent.DID_CHANGE_THEME_COLOR, listener: (
            event: Event,
            /**
             * Theme color is in format of '#rrggbb'. It is `null` when no theme color is set.
             */
            color: Any /* (string) | (null) */
        ) -> Unit
    ): Unit /* this */

    fun removeListener(event: WebContentsEvent.DID_CREATE_WINDOW, listener: (window: BrowserWindow, details: DidCreateWindowDetails) -> Unit): Unit /* this */
    fun removeListener(
        event: WebContentsEvent.DID_FAIL_LOAD,
        listener: (event: Event, errorCode: Double, errorDescription: String, validatedURL: String, isMainFrame: Boolean, frameProcessId: Double, frameRoutingId: Double) -> Unit
    ): Unit /* this */

    fun removeListener(
        event: WebContentsEvent.DID_FAIL_PROVISIONAL_LOAD,
        listener: (event: Event, errorCode: Double, errorDescription: String, validatedURL: String, isMainFrame: Boolean, frameProcessId: Double, frameRoutingId: Double) -> Unit
    ): Unit /* this */

    fun removeListener(event: WebContentsEvent.DID_FINISH_LOAD, listener: Function<*>): Unit /* this */
    fun removeListener(event: WebContentsEvent.DID_FRAME_FINISH_LOAD, listener: (event: Event, isMainFrame: Boolean, frameProcessId: Double, frameRoutingId: Double) -> Unit): Unit /* this */
    fun removeListener(
        event: WebContentsEvent.DID_FRAME_NAVIGATE, listener: (
            event: Event, url: String,
            /**
             * -1 for non HTTP navigations
             */
            httpResponseCode: Double,
            /**
             * empty for non HTTP navigations,
             */
            httpStatusText: String, isMainFrame: Boolean, frameProcessId: Double, frameRoutingId: Double
        ) -> Unit
    ): Unit /* this */

    fun removeListener(
        event: WebContentsEvent.DID_NAVIGATE, listener: (
            event: Event, url: String,
            /**
             * -1 for non HTTP navigations
             */
            httpResponseCode: Double,
            /**
             * empty for non HTTP navigations
             */
            httpStatusText: String
        ) -> Unit
    ): Unit /* this */

    fun removeListener(
        event: WebContentsEvent.DID_NAVIGATE_IN_PAGE,
        listener: (event: Event, url: String, isMainFrame: Boolean, frameProcessId: Double, frameRoutingId: Double) -> Unit
    ): Unit /* this */

    fun removeListener(
        event: WebContentsEvent.DID_REDIRECT_NAVIGATION,
        listener: (event: Event, url: String, isInPlace: Boolean, isMainFrame: Boolean, frameProcessId: Double, frameRoutingId: Double) -> Unit
    ): Unit /* this */

    fun removeListener(event: WebContentsEvent.DID_START_LOADING, listener: Function<*>): Unit /* this */
    fun removeListener(
        event: WebContentsEvent.DID_START_NAVIGATION,
        listener: (event: Event, url: String, isInPlace: Boolean, isMainFrame: Boolean, frameProcessId: Double, frameRoutingId: Double) -> Unit
    ): Unit /* this */

    fun removeListener(event: WebContentsEvent.DID_STOP_LOADING, listener: Function<*>): Unit /* this */
    fun removeListener(event: WebContentsEvent.DOM_READY, listener: Function<*>): Unit /* this */
    fun removeListener(event: WebContentsEvent.ENTER_HTML_FULL_SCREEN, listener: Function<*>): Unit /* this */
    fun removeListener(event: WebContentsEvent.FOCUS, listener: Function<*>): Unit /* this */
    fun removeListener(event: WebContentsEvent.FOUND_IN_PAGE, listener: (event: Event, result: Result) -> Unit): Unit /* this */
    fun removeListener(event: WebContentsEvent.FRAME_CREATED, listener: (event: Event, details: FrameCreatedDetails) -> Unit): Unit /* this */
    fun removeListener(event: WebContentsEvent.INPUT_EVENT, listener: (event: Event, inputEvent: InputEvent) -> Unit): Unit /* this */
    fun removeListener(event: WebContentsEvent.IPC_MESSAGE, listener: Function<Any?> /* (event: Event, channel: string, ...args: any[]) => void */): Unit /* this */
    fun removeListener(event: WebContentsEvent.IPC_MESSAGE_SYNC, listener: Function<Any?> /* (event: Event, channel: string, ...args: any[]) => void */): Unit /* this */
    fun removeListener(event: WebContentsEvent.LEAVE_HTML_FULL_SCREEN, listener: Function<*>): Unit /* this */
    fun removeListener(
        event: WebContentsEvent.LOGIN,
        listener: (event: Event, authenticationResponseDetails: AuthenticationResponseDetails, authInfo: AuthInfo, callback: (username: String? /* use undefined for default */, password: String? /* use undefined for default */) -> Unit) -> Unit
    ): Unit /* this */

    fun removeListener(event: WebContentsEvent.MEDIA_PAUSED, listener: Function<*>): Unit /* this */
    fun removeListener(event: WebContentsEvent.MEDIA_STARTED_PLAYING, listener: Function<*>): Unit /* this */
    fun removeListener(
        event: WebContentsEvent.PAGE_FAVICON_UPDATED, listener: (
            event: Event,
            /**
             * Array of URLs.
             */
            favicons: js.core.ReadonlyArray<String>
        ) -> Unit
    ): Unit /* this */

    fun removeListener(event: WebContentsEvent.PAGE_TITLE_UPDATED, listener: (event: Event, title: String, explicitSet: Boolean) -> Unit): Unit /* this */
    fun removeListener(
        event: WebContentsEvent.PAINT, listener: (
            event: Event, dirtyRect: Rectangle,
            /**
             * The image data of the whole frame.
             */
            image: NativeImage
        ) -> Unit
    ): Unit /* this */

    fun removeListener(event: WebContentsEvent.PLUGIN_CRASHED, listener: (event: Event, name: String, version: String) -> Unit): Unit /* this */
    fun removeListener(
        event: WebContentsEvent.PREFERRED_SIZE_CHANGED, listener: (
            event: Event,
            /**
             * The minimum size needed to contain the layout of the document—without requiring
             * scrolling.
             */
            preferredSize: Size
        ) -> Unit
    ): Unit /* this */

    fun removeListener(event: WebContentsEvent.PRELOAD_ERROR, listener: (event: Event, preloadPath: String, error: Throwable /* JsError */) -> Unit): Unit /* this */
    fun removeListener(event: WebContentsEvent.RENDER_PROCESS_GONE, listener: (event: Event, details: RenderProcessGoneDetails) -> Unit): Unit /* this */
    fun removeListener(event: WebContentsEvent.RESPONSIVE, listener: Function<*>): Unit /* this */
    fun removeListener(
        event: WebContentsEvent.SELECT_BLUETOOTH_DEVICE,
        listener: (event: Event, devices: js.core.ReadonlyArray<BluetoothDevice>, callback: (deviceId: String) -> Unit) -> Unit
    ): Unit /* this */

    fun removeListener(
        event: WebContentsEvent.SELECT_CLIENT_CERTIFICATE,
        listener: (event: Event, url: String, certificateList: js.core.ReadonlyArray<Certificate>, callback: (certificate: Certificate) -> Unit) -> Unit
    ): Unit /* this */

    fun removeListener(event: WebContentsEvent.UNRESPONSIVE, listener: Function<*>): Unit /* this */
    fun removeListener(event: WebContentsEvent.UPDATE_TARGET_URL, listener: (event: Event, url: String) -> Unit): Unit /* this */
    fun removeListener(
        event: WebContentsEvent.WILL_ATTACH_WEBVIEW, listener: (
            event: Event,
            /**
             * The web preferences that will be used by the guest page. This object can be
             * modified to adjust the preferences for the guest page.
             */
            webPreferences: WebPreferences,
            /**
             * The other `<webview>` parameters such as the `src` URL. This object can be
             * modified to adjust the parameters of the guest page.
             */
            params: js.core.ReadonlyRecord<String, String>
        ) -> Unit
    ): Unit /* this */

    fun removeListener(event: WebContentsEvent.WILL_NAVIGATE, listener: (event: Event, url: String) -> Unit): Unit /* this */
    fun removeListener(event: WebContentsEvent.WILL_PREVENT_UNLOAD, listener: (event: Event) -> Unit): Unit /* this */
    fun removeListener(
        event: WebContentsEvent.WILL_REDIRECT,
        listener: (event: Event, url: String, isInPlace: Boolean, isMainFrame: Boolean, frameProcessId: Double, frameRoutingId: Double) -> Unit
    ): Unit /* this */

    fun removeListener(
        event: WebContentsEvent.ZOOM_CHANGED, listener: (
            event: Event,
            /**
             * Can be `in` or `out`.
             */
            zoomDirection: (WebContentsRemoveListenerListenerZoomDirection)
        ) -> Unit
    ): Unit /* this */

    /**
     * Adds the specified path to DevTools workspace. Must be used after DevTools
     * creation:
     */
    fun addWorkSpace(path: String): Unit

    /**
     * Begin subscribing for presentation events and captured frames, the `callback`
     * will be called with `callback(image, dirtyRect)` when there is a presentation
     * event.
     *
     * The `image` is an instance of NativeImage that stores the captured frame.
     *
     * The `dirtyRect` is an object with `x, y, width, height` properties that
     * describes which part of the page was repainted. If `onlyDirty` is set to `true`,
     * `image` will only contain the repainted area. `onlyDirty` defaults to `false`.
     */
    fun beginFrameSubscription(onlyDirty: Boolean, callback: (image: NativeImage, dirtyRect: Rectangle) -> Unit): Unit

    /**
     * Begin subscribing for presentation events and captured frames, the `callback`
     * will be called with `callback(image, dirtyRect)` when there is a presentation
     * event.
     *
     * The `image` is an instance of NativeImage that stores the captured frame.
     *
     * The `dirtyRect` is an object with `x, y, width, height` properties that
     * describes which part of the page was repainted. If `onlyDirty` is set to `true`,
     * `image` will only contain the repainted area. `onlyDirty` defaults to `false`.
     */
    fun beginFrameSubscription(callback: (image: NativeImage, dirtyRect: Rectangle) -> Unit): Unit

    /**
     * Whether the browser can go back to previous web page.
     */
    fun canGoBack(): Boolean

    /**
     * Whether the browser can go forward to next web page.
     */
    fun canGoForward(): Boolean

    /**
     * Whether the web page can go to `offset`.
     */
    fun canGoToOffset(offset: Double): Boolean

    /**
     * Resolves with a NativeImage
     *
     * Captures a snapshot of the page within `rect`. Omitting `rect` will capture the
     * whole visible page. The page is considered visible when its browser window is
     * hidden and the capturer count is non-zero. If you would like the page to stay
     * hidden, you should ensure that `stayHidden` is set to true.
     */
    fun capturePage(rect: Rectangle = definedExternally, opts: Opts = definedExternally): Promise<NativeImage>

    /**
     * Clears the navigation history.
     */
    fun clearHistory(): Unit

    /**
     * Closes the page, as if the web content had called `window.close()`.
     *
     * If the page is successfully closed (i.e. the unload is not prevented by the
     * page, or `waitForBeforeUnload` is false or unspecified), the WebContents will be
     * destroyed and no longer usable. The `destroyed` event will be emitted.
     */
    fun close(opts: CloseOpts = definedExternally): Unit

    /**
     * Closes the devtools.
     */
    fun closeDevTools(): Unit

    /**
     * Executes the editing command `copy` in web page.
     */
    fun copy(): Unit

    /**
     * Copy the image at the given position to the clipboard.
     */
    fun copyImageAt(x: Double, y: Double): Unit

    /**
     * Executes the editing command `cut` in web page.
     */
    fun cut(): Unit

    /**
     * Executes the editing command `delete` in web page.
     */
    fun delete(): Unit

    /**
     * Disable device emulation enabled by `webContents.enableDeviceEmulation`.
     */
    fun disableDeviceEmulation(): Unit

    /**
     * Initiates a download of the resource at `url` without navigating. The
     * `will-download` event of `session` will be triggered.
     */
    fun downloadURL(url: String): Unit

    /**
     * Enable device emulation with the given parameters.
     */
    fun enableDeviceEmulation(parameters: Parameters): Unit

    /**
     * End subscribing for frame presentation events.
     */
    fun endFrameSubscription(): Unit

    /**
     * A promise that resolves with the result of the executed code or is rejected if
     * the result of the code is a rejected promise.
     *
     * Evaluates `code` in page.
     *
     * In the browser window some HTML APIs like `requestFullScreen` can only be
     * invoked by a gesture from the user. Setting `userGesture` to `true` will remove
     * this limitation.
     *
     * Code execution will be suspended until web page stop loading.
     */
    fun executeJavaScript(code: String, userGesture: Boolean = definedExternally): Promise<Any?>

    /**
     * A promise that resolves with the result of the executed code or is rejected if
     * the result of the code is a rejected promise.
     *
     * Works like `executeJavaScript` but evaluates `scripts` in an isolated context.
     */
    fun executeJavaScriptInIsolatedWorld(worldId: Double, scripts: js.core.ReadonlyArray<WebSource>, userGesture: Boolean = definedExternally): Promise<Any?>

    /**
     * The request id used for the request.
     *
     * Starts a request to find all matches for the `text` in the web page. The result
     * of the request can be obtained by subscribing to `found-in-page` event.
     */
    fun findInPage(text: String, options: FindInPageOptions = definedExternally): Double

    /**
     * Focuses the web page.
     */
    fun focus(): Unit

    /**
     * Forcefully terminates the renderer process that is currently hosting this
     * `webContents`. This will cause the `render-process-gone` event to be emitted
     * with the `reason=killed || reason=crashed`. Please note that some webContents
     * share renderer processes and therefore calling this method may also crash the
     * host process for other webContents as well.
     *
     * Calling `reload()` immediately after calling this method will force the reload
     * to occur in a new process. This should be used when this process is unstable or
     * unusable, for instance in order to recover from the `unresponsive` event.
     */
    fun forcefullyCrashRenderer(): Unit

    /**
     * Information about all Shared Workers.
     */
    fun getAllSharedWorkers(): js.core.ReadonlyArray<SharedWorkerInfo>

    /**
     * whether or not this WebContents will throttle animations and timers when the
     * page becomes backgrounded. This also affects the Page Visibility API.
     */
    fun getBackgroundThrottling(): Boolean

    /**
     * If _offscreen rendering_ is enabled returns the current frame rate.
     */
    fun getFrameRate(): Double

    /**
     * The identifier of a WebContents stream. This identifier can be used with
     * `navigator.mediaDevices.getUserMedia` using a `chromeMediaSource` of `tab`. The
     * identifier is restricted to the web contents that it is registered to and is
     * only valid for 10 seconds.
     */
    fun getMediaSourceId(requestWebContents: WebContents): String

    /**
     * The operating system `pid` of the associated renderer process.
     */
    fun getOSProcessId(): Double

    /**
     * Get the system printer list.
     *
     *
     * **Deprecated:** Should use the new `contents.getPrintersAsync` API.
     *
     * @deprecated
     */
    fun getPrinters(): js.core.ReadonlyArray<PrinterInfo>

    /**
     * Get the system printer list.
     *
     * Resolves with a `PrinterInfo[]`
     */
    fun getPrintersAsync(): Promise<js.core.ReadonlyArray<PrinterInfo>>

    /**
     * The Chromium internal `pid` of the associated renderer. Can be compared to the
     * `frameProcessId` passed by frame specific navigation events (e.g.
     * `did-frame-navigate`)
     */
    fun getProcessId(): Double

    /**
     * The title of the current web page.
     */
    fun getTitle(): String

    /**
     * the type of the webContent. Can be `backgroundPage`, `window`, `browserView`,
     * `remote`, `webview` or `offscreen`.
     */
    fun getType(): (WebContentsGetTypeResult)

    /**
     * The URL of the current web page.
     */
    fun getURL(): String

    /**
     * The user agent for this web page.
     */
    fun getUserAgent(): String

    /**
     * Returns the WebRTC IP Handling Policy.
     */
    fun getWebRTCIPHandlingPolicy(): String

    /**
     * the current zoom factor.
     */
    fun getZoomFactor(): Double

    /**
     * the current zoom level.
     */
    fun getZoomLevel(): Double

    /**
     * Makes the browser go back a web page.
     */
    fun goBack(): Unit

    /**
     * Makes the browser go forward a web page.
     */
    fun goForward(): Unit

    /**
     * Navigates browser to the specified absolute web page index.
     */
    fun goToIndex(index: Double): Unit

    /**
     * Navigates to the specified offset from the "current entry".
     */
    fun goToOffset(offset: Double): Unit

    /**
     * A promise that resolves with a key for the inserted CSS that can later be used
     * to remove the CSS via `contents.removeInsertedCSS(key)`.
     *
     * Injects CSS into the current web page and returns a unique key for the inserted
     * stylesheet.
     */
    fun insertCSS(css: String, options: InsertCSSOptions = definedExternally): Promise<String>

    /**
     * Inserts `text` to the focused element.
     */
    fun insertText(text: String): Promise<Unit>

    /**
     * Starts inspecting element at position (`x`, `y`).
     */
    fun inspectElement(x: Double, y: Double): Unit

    /**
     * Opens the developer tools for the service worker context.
     */
    fun inspectServiceWorker(): Unit

    /**
     * Opens the developer tools for the shared worker context.
     */
    fun inspectSharedWorker(): Unit

    /**
     * Inspects the shared worker based on its ID.
     */
    fun inspectSharedWorkerById(workerId: String): Unit

    /**
     * Schedules a full repaint of the window this web contents is in.
     *
     * If _offscreen rendering_ is enabled invalidates the frame and generates a new
     * one through the `'paint'` event.
     */
    fun invalidate(): Unit

    /**
     * Whether this page has been muted.
     */
    fun isAudioMuted(): Boolean

    /**
     * Whether this page is being captured. It returns true when the capturer count is
     * large then 0.
     */
    fun isBeingCaptured(): Boolean

    /**
     * Whether the renderer process has crashed.
     */
    fun isCrashed(): Boolean

    /**
     * Whether audio is currently playing.
     */
    fun isCurrentlyAudible(): Boolean

    /**
     * Whether the web page is destroyed.
     */
    fun isDestroyed(): Boolean

    /**
     * Whether the devtools view is focused .
     */
    fun isDevToolsFocused(): Boolean

    /**
     * Whether the devtools is opened.
     */
    fun isDevToolsOpened(): Boolean

    /**
     * Whether the web page is focused.
     */
    fun isFocused(): Boolean

    /**
     * Whether web page is still loading resources.
     */
    fun isLoading(): Boolean

    /**
     * Whether the main frame (and not just iframes or frames within it) is still
     * loading.
     */
    fun isLoadingMainFrame(): Boolean

    /**
     * Indicates whether _offscreen rendering_ is enabled.
     */
    fun isOffscreen(): Boolean

    /**
     * If _offscreen rendering_ is enabled returns whether it is currently painting.
     */
    fun isPainting(): Boolean

    /**
     * Whether the web page is waiting for a first-response from the main resource of
     * the page.
     */
    fun isWaitingForResponse(): Boolean

    /**
     * the promise will resolve when the page has finished loading (see
     * `did-finish-load`), and rejects if the page fails to load (see `did-fail-load`).
     *
     * Loads the given file in the window, `filePath` should be a path to an HTML file
     * relative to the root of your application.  For instance an app structure like
     * this:
     *
     * Would require code like this
     */
    fun loadFile(filePath: String, options: LoadFileOptions = definedExternally): Promise<Unit>

    /**
     * the promise will resolve when the page has finished loading (see
     * `did-finish-load`), and rejects if the page fails to load (see `did-fail-load`).
     * A noop rejection handler is already attached, which avoids unhandled rejection
     * errors.
     *
     * Loads the `url` in the window. The `url` must contain the protocol prefix, e.g.
     * the `http://` or `file://`. If the load should bypass http cache then use the
     * `pragma` header to achieve it.
     */
    fun loadURL(url: String, options: LoadURLOptions = definedExternally): Promise<Unit>

    /**
     * Opens the devtools.
     *
     * When `contents` is a `<webview>` tag, the `mode` would be `detach` by default,
     * explicitly passing an empty `mode` can force using last used dock state.
     *
     * On Windows, if Windows Control Overlay is enabled, Devtools will be opened with
     * `mode: 'detach'`.
     */
    fun openDevTools(options: OpenDevToolsOptions = definedExternally): Unit

    /**
     * Executes the editing command `paste` in web page.
     */
    fun paste(): Unit

    /**
     * Executes the editing command `pasteAndMatchStyle` in web page.
     */
    fun pasteAndMatchStyle(): Unit

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
     * When a custom `pageSize` is passed, Chromium attempts to validate platform
     * specific minimum values for `width_microns` and `height_microns`. Width and
     * height must both be minimum 353 microns but may be higher on some operating
     * systems.
     *
     * Prints window's web page. When `silent` is set to `true`, Electron will pick the
     * system's default printer if `deviceName` is empty and the default settings for
     * printing.
     *
     * Use `page-break-before: always;` CSS style to force to print to a new page.
     *
     * Example usage:
     */
    fun print(options: WebContentsPrintOptions = definedExternally, callback: (success: Boolean, failureReason: String) -> Unit = definedExternally): Unit

    /**
     * Resolves with the generated PDF data.
     *
     * Prints the window's web page as PDF.
     *
     * The `landscape` will be ignored if `@page` CSS at-rule is used in the web page.
     *
     * An example of `webContents.printToPDF`:
     *
     * See Page.printToPdf for more information.
     */
    fun printToPDF(options: PrintToPDFOptions): Promise<Buffer>

    /**
     * Executes the editing command `redo` in web page.
     */
    fun redo(): Unit

    /**
     * Reloads the current web page.
     */
    fun reload(): Unit

    /**
     * Reloads current page and ignores cache.
     */
    fun reloadIgnoringCache(): Unit

    /**
     * Resolves if the removal was successful.
     *
     * Removes the inserted CSS from the current web page. The stylesheet is identified
     * by its key, which is returned from `contents.insertCSS(css)`.
     */
    fun removeInsertedCSS(key: String): Promise<Unit>

    /**
     * Removes the specified path from DevTools workspace.
     */
    fun removeWorkSpace(path: String): Unit

    /**
     * Executes the editing command `replace` in web page.
     */
    fun replace(text: String): Unit

    /**
     * Executes the editing command `replaceMisspelling` in web page.
     */
    fun replaceMisspelling(text: String): Unit

    /**
     * resolves if the page is saved.
     */
    fun savePage(fullPath: String, saveType: WebContentsSavePageSaveType): Promise<Unit>

    /**
     * Executes the editing command `selectAll` in web page.
     */
    fun selectAll(): Unit

    /**
     * Send an asynchronous message to the renderer process via `channel`, along with
     * arguments. Arguments will be serialized with the Structured Clone Algorithm,
     * just like `postMessage`, so prototype chains will not be included. Sending
     * Functions, Promises, Symbols, WeakMaps, or WeakSets will throw an exception.
     *
     * :::warning
     *
     * Sending non-standard JavaScript types such as DOM objects or special Electron
     * objects will throw an exception.
     *
     * :::
     *
     * For additional reading, refer to Electron's IPC guide.
     */
    fun send(channel: String, vararg args: Any? /* js.core.ReadonlyArray<Any?> */): Unit

    /**
     * Sends an input `event` to the page. **Note:** The `BrowserWindow` containing the
     * contents needs to be focused for `sendInputEvent()` to work.
     */
    fun sendInputEvent(inputEvent: (MouseInputEvent)): Unit

    fun sendInputEvent(inputEvent: (MouseWheelInputEvent)): Unit

    fun sendInputEvent(inputEvent: (KeyboardInputEvent)): Unit

    /**
     * Send an asynchronous message to a specific frame in a renderer process via
     * `channel`, along with arguments. Arguments will be serialized with the
     * Structured Clone Algorithm, just like `postMessage`, so prototype chains will
     * not be included. Sending Functions, Promises, Symbols, WeakMaps, or WeakSets
     * will throw an exception.
     *
     * > **NOTE:** Sending non-standard JavaScript types such as DOM objects or special
     * Electron objects will throw an exception.
     *
     * The renderer process can handle the message by listening to `channel` with the
     * `ipcRenderer` module.
     *
     * If you want to get the `frameId` of a given renderer context you should use the
     * `webFrame.routingId` value.  E.g.
     *
     * You can also read `frameId` from all incoming IPC messages in the main process.
     */
    fun sendToFrame(frameId: (Double), channel: String, vararg args: Any? /* js.core.ReadonlyArray<Any?> */): Unit

    fun sendToFrame(frameId: (js.core.JsTuple2<Double, Double>), channel: String, vararg args: Any? /* js.core.ReadonlyArray<Any?> */): Unit

    /**
     * Mute the audio on the current web page.
     */
    fun setAudioMuted(muted: Boolean): Unit

    /**
     * Controls whether or not this WebContents will throttle animations and timers
     * when the page becomes backgrounded. This also affects the Page Visibility API.
     */
    fun setBackgroundThrottling(allowed: Boolean): Unit

    /**
     * Uses the `devToolsWebContents` as the target `WebContents` to show devtools.
     *
     * The `devToolsWebContents` must not have done any navigation, and it should not
     * be used for other purposes after the call.
     *
     * By default Electron manages the devtools by creating an internal `WebContents`
     * with native view, which developers have very limited control of. With the
     * `setDevToolsWebContents` method, developers can use any `WebContents` to show
     * the devtools in it, including `BrowserWindow`, `BrowserView` and `<webview>`
     * tag.
     *
     * Note that closing the devtools does not destroy the `devToolsWebContents`, it is
     * caller's responsibility to destroy `devToolsWebContents`.
     *
     * An example of showing devtools in a `<webview>` tag:
     *
     * An example of showing devtools in a `BrowserWindow`:
     */
    fun setDevToolsWebContents(devToolsWebContents: WebContents): Unit

    /**
     * If _offscreen rendering_ is enabled sets the frame rate to the specified number.
     * Only values between 1 and 240 are accepted.
     */
    fun setFrameRate(fps: Double): Unit

    /**
     * Ignore application menu shortcuts while this web contents is focused.
     */
    fun setIgnoreMenuShortcuts(ignore: Boolean): Unit

    /**
     * Sets the image animation policy for this webContents.  The policy only affects
     * _new_ images, existing images that are currently being animated are unaffected.
     * This is a known limitation in Chromium, you can force image animation to be
     * recalculated with `img.src = img.src` which will result in no network traffic
     * but will update the animation policy.
     *
     * This corresponds to the animationPolicy accessibility feature in Chromium.
     */
    fun setImageAnimationPolicy(policy: WebContentsSetImageAnimationPolicyPolicy): Unit

    /**
     * Overrides the user agent for this web page.
     */
    fun setUserAgent(userAgent: String): Unit

    /**
     * Sets the maximum and minimum pinch-to-zoom level.
     *
     * > **NOTE**: Visual zoom is disabled by default in Electron. To re-enable it,
     * call:
     */
    fun setVisualZoomLevelLimits(minimumLevel: Double, maximumLevel: Double): Promise<Unit>

    /**
     * Setting the WebRTC IP handling policy allows you to control which IPs are
     * exposed via WebRTC. See BrowserLeaks for more details.
     */
    fun setWebRTCIPHandlingPolicy(policy: WebContentsSetWebRTCIPHandlingPolicyPolicy): Unit

    /**
     * Called before creating a window a new window is requested by the renderer, e.g.
     * by `window.open()`, a link with `target="_blank"`, shift+clicking on a link, or
     * submitting a form with `<form target="_blank">`. See `window.open()` for more
     * details and how to use this in conjunction with `did-create-window`.
     */
    fun setWindowOpenHandler(
        handler: (details: HandlerDetails) -> Any /* ({
    action: 'deny';
}) | ({
    action: 'allow';
    outlivesOpener?: boolean;
    overrideBrowserWindowOptions?: BrowserWindowConstructorOptions;
}) */
    ): Unit

    /**
     * Changes the zoom factor to the specified factor. Zoom factor is zoom percent
     * divided by 100, so 300% = 3.0.
     *
     * The factor must be greater than 0.0.
     */
    fun setZoomFactor(factor: Double): Unit

    /**
     * Changes the zoom level to the specified level. The original size is 0 and each
     * increment above or below represents zooming 20% larger or smaller to default
     * limits of 300% and 50% of original size, respectively. The formula for this is
     * `scale := 1.2 ^ level`.
     *
     * > **NOTE**: The zoom policy at the Chromium level is same-origin, meaning that
     * the zoom level for a specific domain propagates across all instances of windows
     * with the same domain. Differentiating the window URLs will make zoom work
     * per-window.
     */
    fun setZoomLevel(level: Double): Unit

    /**
     * Shows pop-up dictionary that searches the selected word on the page.
     *
     * @platform darwin
     */
    fun showDefinitionForSelection(): Unit

    /**
     * Sets the `item` as dragging item for current drag-drop operation, `file` is the
     * absolute path of the file to be dragged, and `icon` is the image showing under
     * the cursor when dragging.
     */
    fun startDrag(item: Item): Unit

    /**
     * If _offscreen rendering_ is enabled and not painting, start painting.
     */
    fun startPainting(): Unit

    /**
     * Stops any pending navigation.
     */
    fun stop(): Unit

    /**
     * Stops any `findInPage` request for the `webContents` with the provided `action`.
     */
    fun stopFindInPage(action: WebContentsStopFindInPageAction): Unit

    /**
     * If _offscreen rendering_ is enabled and painting, stop painting.
     */
    fun stopPainting(): Unit

    /**
     * Indicates whether the snapshot has been created successfully.
     *
     * Takes a V8 heap snapshot and saves it to `filePath`.
     */
    fun takeHeapSnapshot(filePath: String): Promise<Unit>

    /**
     * Toggles the developer tools.
     */
    fun toggleDevTools(): Unit

    /**
     * Executes the editing command `undo` in web page.
     */
    fun undo(): Unit

    /**
     * Executes the editing command `unselect` in web page.
     */
    fun unselect(): Unit

    /**
     * A `boolean` property that determines whether this page is muted.
     */
    var audioMuted: Boolean

    /**
     * A `boolean` property that determines whether or not this WebContents will
     * throttle animations and timers when the page becomes backgrounded. This also
     * affects the Page Visibility API.
     */
    var backgroundThrottling: Boolean

    /**
     * A `Debugger` instance for this webContents.
     *
     */
    val debugger: Debugger

    /**
     * A `WebContents | null` property that represents the of DevTools `WebContents`
     * associated with a given `WebContents`.
     *
     * **Note:** Users should never store this object because it may become `null` when
     * the DevTools has been closed.
     *
     */
    val devToolsWebContents: Any /* (WebContents) | (null) */

    /**
     * An `Integer` property that sets the frame rate of the web contents to the
     * specified number. Only values between 1 and 240 are accepted.
     *
     * Only applicable if _offscreen rendering_ is enabled.
     */
    var frameRate: Double

    /**
     * A `WebContents` instance that might own this `WebContents`.
     *
     */
    val hostWebContents: WebContents

    /**
     * A `Integer` representing the unique ID of this WebContents. Each ID is unique
     * among all `WebContents` instances of the entire Electron application.
     *
     */
    val id: Double

    /**
     * An `IpcMain` scoped to just IPC messages sent from this WebContents.
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
     * A handler or event listener registered on the WebContents will receive IPC
     * messages sent from any frame, including child frames. In most cases, only the
     * main frame can send IPC messages. However, if the `nodeIntegrationInSubFrames`
     * option is enabled, it is possible for child frames to send IPC messages also. In
     * that case, handlers should check the `senderFrame` property of the IPC event to
     * ensure that the message is coming from the expected frame. Alternatively,
     * register handlers on the appropriate frame directly using the `WebFrameMain.ipc`
     * interface.
     *
     */
    val ipc: IpcMain

    /**
     * A `WebFrameMain` property that represents the top frame of the page's frame
     * hierarchy.
     *
     */
    val mainFrame: WebFrameMain

    /**
     * A `WebFrameMain` property that represents the frame that opened this
     * WebContents, either with open(), or by navigating a link with a target
     * attribute.
     *
     */
    val opener: WebFrameMain

    /**
     * A `Session` used by this webContents.
     *
     */
    val session: Session

    /**
     * A `string` property that determines the user agent for this web page.
     */
    var userAgent: String

    /**
     * A `number` property that determines the zoom factor for this web contents.
     *
     * The zoom factor is the zoom percent divided by 100, so 300% = 3.0.
     */
    var zoomFactor: Double

    /**
     * A `number` property that determines the zoom level for this web contents.
     *
     * The original size is 0 and each increment above or below represents zooming 20%
     * larger or smaller to default limits of 300% and 50% of original size,
     * respectively. The formula for this is `scale := 1.2 ^ level`.
     */
    var zoomLevel: Double

    companion object {
// Docs: https://electronjs.org/docs/api/web-contents
        /**
         * A WebContents instance with the given TargetID, or `undefined` if there is no
         * WebContents associated with the given TargetID.
         *
         * When communicating with the Chrome DevTools Protocol, it can be useful to lookup
         * a WebContents instance based on its assigned TargetID.
         */
        fun fromDevToolsTargetId(targetId: String): Any /* (WebContents) | (undefined) */

        /**
         * A WebContents instance with the given WebFrameMain, or `undefined` if there is
         * no WebContents associated with the given WebFrameMain.
         */
        fun fromFrame(frame: WebFrameMain): Any /* (WebContents) | (undefined) */

        /**
         * A WebContents instance with the given ID, or `undefined` if there is no
         * WebContents associated with the given ID.
         */
        fun fromId(id: Double): Any /* (WebContents) | (undefined) */

        /**
         * An array of all `WebContents` instances. This will contain web contents for all
         * windows, webviews, opened devtools, and devtools extension background pages.
         */
        fun getAllWebContents(): js.core.ReadonlyArray<WebContents>

        /**
         * The web contents that is focused in this application, otherwise returns `null`.
         */
        fun getFocusedWebContents(): Any /* (WebContents) | (null) */
    }

}
