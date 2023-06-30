@file:JsModule("INTERNAL_ENTITY")

package electron.core

import node.buffer.Buffer
import kotlin.js.Promise
import node.events.EventEmitter as NodeEventEmitter


open external class BrowserWindow : NodeEventEmitter {
// Docs: https://electronjs.org/docs/api/browser-window
    /**
     * Emitted when the window is set or unset to show always on top of other windows.
     */
    fun on(event: BrowserWindowEvent.ALWAYS_ON_TOP_CHANGED, listener: (event: Event, isAlwaysOnTop: Boolean) -> Unit): Unit /* this */

    /**
     * Emitted when an App Command is invoked. These are typically related to keyboard
     * media keys or browser commands, as well as the "Back" button built into some
     * mice on Windows.
     *
     * Commands are lowercased, underscores are replaced with hyphens, and the
     * `APPCOMMAND_` prefix is stripped off. e.g. `APPCOMMAND_BROWSER_BACKWARD` is
     * emitted as `browser-backward`.
     *
     * The following app commands are explicitly supported on Linux:
     *
     * * `browser-backward`
     * * `browser-forward`
     *
     * @platform win32,linux
     */
    fun on(event: BrowserWindowEvent.APP_COMMAND, listener: (event: Event, command: String) -> Unit): Unit /* this */

    /**
     * Emitted when the window loses focus.
     */
    fun on(event: BrowserWindowEvent.BLUR, listener: Function<*>): Unit /* this */

    /**
     * Emitted when the window is going to be closed. It's emitted before the
     * `beforeunload` and `unload` event of the DOM. Calling `event.preventDefault()`
     * will cancel the close.
     *
     * Usually you would want to use the `beforeunload` handler to decide whether the
     * window should be closed, which will also be called when the window is reloaded.
     * In Electron, returning any value other than `undefined` would cancel the close.
     * For example:
     *
     * _**Note**: There is a subtle difference between the behaviors of
     * `window.onbeforeunload = handler` and `window.addEventListener('beforeunload',
     * handler)`. It is recommended to always set the `event.returnValue` explicitly,
     * instead of only returning a value, as the former works more consistently within
     * Electron._
     */
    fun on(event: BrowserWindowEvent.CLOSE, listener: (event: Event) -> Unit): Unit /* this */

    /**
     * Emitted when the window is closed. After you have received this event you should
     * remove the reference to the window and avoid using it any more.
     */
    fun on(event: BrowserWindowEvent.CLOSED, listener: Function<*>): Unit /* this */

    /**
     * Emitted when the window enters a full-screen state.
     */
    fun on(event: BrowserWindowEvent.ENTER_FULL_SCREEN, listener: Function<*>): Unit /* this */

    /**
     * Emitted when the window enters a full-screen state triggered by HTML API.
     */
    fun on(event: BrowserWindowEvent.ENTER_HTML_FULL_SCREEN, listener: Function<*>): Unit /* this */

    /**
     * Emitted when the window gains focus.
     */
    fun on(event: BrowserWindowEvent.FOCUS, listener: Function<*>): Unit /* this */

    /**
     * Emitted when the window is hidden.
     */
    fun on(event: BrowserWindowEvent.HIDE, listener: Function<*>): Unit /* this */

    /**
     * Emitted when the window leaves a full-screen state.
     */
    fun on(event: BrowserWindowEvent.LEAVE_FULL_SCREEN, listener: Function<*>): Unit /* this */

    /**
     * Emitted when the window leaves a full-screen state triggered by HTML API.
     */
    fun on(event: BrowserWindowEvent.LEAVE_HTML_FULL_SCREEN, listener: Function<*>): Unit /* this */

    /**
     * Emitted when window is maximized.
     */
    fun on(event: BrowserWindowEvent.MAXIMIZE, listener: Function<*>): Unit /* this */

    /**
     * Emitted when the window is minimized.
     */
    fun on(event: BrowserWindowEvent.MINIMIZE, listener: Function<*>): Unit /* this */

    /**
     * Emitted when the window is being moved to a new position.
     */
    fun on(event: BrowserWindowEvent.MOVE, listener: Function<*>): Unit /* this */

    /**
     * Emitted once when the window is moved to a new position.
     *
     * **Note**: On macOS this event is an alias of `move`.
     *
     * @platform darwin,win32
     */
    fun on(event: BrowserWindowEvent.MOVED, listener: Function<*>): Unit /* this */

    /**
     * Emitted when the native new tab button is clicked.
     *
     * @platform darwin
     */
    fun on(event: BrowserWindowEvent.NEW_WINDOW_FOR_TAB, listener: Function<*>): Unit /* this */

    /**
     * Emitted when the document changed its title, calling `event.preventDefault()`
     * will prevent the native window's title from changing. `explicitSet` is false
     * when title is synthesized from file URL.
     */
    fun on(event: BrowserWindowEvent.PAGE_TITLE_UPDATED, listener: (event: Event, title: String, explicitSet: Boolean) -> Unit): Unit /* this */

    /**
     * Emitted when the web page has been rendered (while not being shown) and window
     * can be displayed without a visual flash.
     *
     * Please note that using this event implies that the renderer will be considered
     * "visible" and paint even though `show` is false.  This event will never fire if
     * you use `paintWhenInitiallyHidden: false`
     */
    fun on(event: BrowserWindowEvent.READY_TO_SHOW, listener: Function<*>): Unit /* this */

    /**
     * Emitted after the window has been resized.
     */
    fun on(event: BrowserWindowEvent.RESIZE, listener: Function<*>): Unit /* this */

    /**
     * Emitted once when the window has finished being resized.
     *
     * This is usually emitted when the window has been resized manually. On macOS,
     * resizing the window with `setBounds`/`setSize` and setting the `animate`
     * parameter to `true` will also emit this event once resizing has finished.
     *
     * @platform darwin,win32
     */
    fun on(event: BrowserWindowEvent.RESIZED, listener: Function<*>): Unit /* this */

    /**
     * Emitted when the unresponsive web page becomes responsive again.
     */
    fun on(event: BrowserWindowEvent.RESPONSIVE, listener: Function<*>): Unit /* this */

    /**
     * Emitted when the window is restored from a minimized state.
     */
    fun on(event: BrowserWindowEvent.RESTORE, listener: Function<*>): Unit /* this */

    /**
     * Emitted on trackpad rotation gesture. Continually emitted until rotation gesture
     * is ended. The `rotation` value on each emission is the angle in degrees rotated
     * since the last emission. The last emitted event upon a rotation gesture will
     * always be of value `0`. Counter-clockwise rotation values are positive, while
     * clockwise ones are negative.
     *
     * @platform darwin
     */
    fun on(event: BrowserWindowEvent.ROTATE_GESTURE, listener: (event: Event, rotation: Double) -> Unit): Unit /* this */

    /**
     * Emitted when scroll wheel event phase has begun.
     *
     * > **Note** This event is deprecated beginning in Electron 22.0.0. See Breaking
     * Changes for details of how to migrate to using the WebContents `input-event`
     * event.
     *
     * @deprecated
     * @platform darwin
     */
    fun on(event: BrowserWindowEvent.SCROLL_TOUCH_BEGIN, listener: Function<*>): Unit /* this */

    /**
     * Emitted when scroll wheel event phase filed upon reaching the edge of element.
     *
     * > **Note** This event is deprecated beginning in Electron 22.0.0. See Breaking
     * Changes for details of how to migrate to using the WebContents `input-event`
     * event.
     *
     * @deprecated
     * @platform darwin
     */
    fun on(event: BrowserWindowEvent.SCROLL_TOUCH_EDGE, listener: Function<*>): Unit /* this */

    /**
     * Emitted when scroll wheel event phase has ended.
     *
     * > **Note** This event is deprecated beginning in Electron 22.0.0. See Breaking
     * Changes for details of how to migrate to using the WebContents `input-event`
     * event.
     *
     * @deprecated
     * @platform darwin
     */
    fun on(event: BrowserWindowEvent.SCROLL_TOUCH_END, listener: Function<*>): Unit /* this */

    /**
     * Emitted when window session is going to end due to force shutdown or machine
     * restart or session log off.
     *
     * @platform win32
     */
    fun on(event: BrowserWindowEvent.SESSION_END, listener: Function<*>): Unit /* this */

    /**
     * Emitted when the window opens a sheet.
     *
     * @platform darwin
     */
    fun on(event: BrowserWindowEvent.SHEET_BEGIN, listener: Function<*>): Unit /* this */

    /**
     * Emitted when the window has closed a sheet.
     *
     * @platform darwin
     */
    fun on(event: BrowserWindowEvent.SHEET_END, listener: Function<*>): Unit /* this */

    /**
     * Emitted when the window is shown.
     */
    fun on(event: BrowserWindowEvent.SHOW, listener: Function<*>): Unit /* this */

    /**
     * Emitted on 3-finger swipe. Possible directions are `up`, `right`, `down`,
     * `left`.
     *
     * The method underlying this event is built to handle older macOS-style trackpad
     * swiping, where the content on the screen doesn't move with the swipe. Most macOS
     * trackpads are not configured to allow this kind of swiping anymore, so in order
     * for it to emit properly the 'Swipe between pages' preference in `System
     * Preferences > Trackpad > More Gestures` must be set to 'Swipe with two or three
     * fingers'.
     *
     * @platform darwin
     */
    fun on(event: BrowserWindowEvent.SWIPE, listener: (event: Event, direction: String) -> Unit): Unit /* this */

    /**
     * Emitted when the system context menu is triggered on the window, this is
     * normally only triggered when the user right clicks on the non-client area of
     * your window.  This is the window titlebar or any area you have declared as
     * `-webkit-app-region: drag` in a frameless window.
     *
     * Calling `event.preventDefault()` will prevent the menu from being displayed.
     *
     * @platform win32
     */
    fun on(
        event: BrowserWindowEvent.SYSTEM_CONTEXT_MENU, listener: (
            event: Event,
            /**
             * The screen coordinates the context menu was triggered at
             */
            point: Point
        ) -> Unit
    ): Unit /* this */

    /**
     * Emitted when the window exits from a maximized state.
     */
    fun on(event: BrowserWindowEvent.UNMAXIMIZE, listener: Function<*>): Unit /* this */

    /**
     * Emitted when the web page becomes unresponsive.
     */
    fun on(event: BrowserWindowEvent.UNRESPONSIVE, listener: Function<*>): Unit /* this */

    /**
     * Emitted before the window is moved. On Windows, calling `event.preventDefault()`
     * will prevent the window from being moved.
     *
     * Note that this is only emitted when the window is being moved manually. Moving
     * the window with `setPosition`/`setBounds`/`center` will not emit this event.
     *
     * @platform darwin,win32
     */
    fun on(
        event: BrowserWindowEvent.WILL_MOVE, listener: (
            event: Event,
            /**
             * Location the window is being moved to.
             */
            newBounds: Rectangle
        ) -> Unit
    ): Unit /* this */

    /**
     * Emitted before the window is resized. Calling `event.preventDefault()` will
     * prevent the window from being resized.
     *
     * Note that this is only emitted when the window is being resized manually.
     * Resizing the window with `setBounds`/`setSize` will not emit this event.
     *
     * The possible values and behaviors of the `edge` option are platform dependent.
     * Possible values are:
     *
     * * On Windows, possible values are `bottom`, `top`, `left`, `right`, `top-left`,
     * `top-right`, `bottom-left`, `bottom-right`.
     * * On macOS, possible values are `bottom` and `right`.
     *   * The value `bottom` is used to denote vertical resizing.
     *   * The value `right` is used to denote horizontal resizing.
     *
     * @platform darwin,win32
     */
    fun on(
        event: BrowserWindowEvent.WILL_RESIZE, listener: (
            event: Event,
            /**
             * Size the window is being resized to.
             */
            newBounds: Rectangle, details: WillResizeDetails
        ) -> Unit
    ): Unit /* this */

    fun once(event: BrowserWindowEvent.ALWAYS_ON_TOP_CHANGED, listener: (event: Event, isAlwaysOnTop: Boolean) -> Unit): Unit /* this */
    fun once(event: BrowserWindowEvent.APP_COMMAND, listener: (event: Event, command: String) -> Unit): Unit /* this */
    fun once(event: BrowserWindowEvent.BLUR, listener: Function<*>): Unit /* this */
    fun once(event: BrowserWindowEvent.CLOSE, listener: (event: Event) -> Unit): Unit /* this */
    fun once(event: BrowserWindowEvent.CLOSED, listener: Function<*>): Unit /* this */
    fun once(event: BrowserWindowEvent.ENTER_FULL_SCREEN, listener: Function<*>): Unit /* this */
    fun once(event: BrowserWindowEvent.ENTER_HTML_FULL_SCREEN, listener: Function<*>): Unit /* this */
    fun once(event: BrowserWindowEvent.FOCUS, listener: Function<*>): Unit /* this */
    fun once(event: BrowserWindowEvent.HIDE, listener: Function<*>): Unit /* this */
    fun once(event: BrowserWindowEvent.LEAVE_FULL_SCREEN, listener: Function<*>): Unit /* this */
    fun once(event: BrowserWindowEvent.LEAVE_HTML_FULL_SCREEN, listener: Function<*>): Unit /* this */
    fun once(event: BrowserWindowEvent.MAXIMIZE, listener: Function<*>): Unit /* this */
    fun once(event: BrowserWindowEvent.MINIMIZE, listener: Function<*>): Unit /* this */
    fun once(event: BrowserWindowEvent.MOVE, listener: Function<*>): Unit /* this */
    fun once(event: BrowserWindowEvent.MOVED, listener: Function<*>): Unit /* this */
    fun once(event: BrowserWindowEvent.NEW_WINDOW_FOR_TAB, listener: Function<*>): Unit /* this */
    fun once(event: BrowserWindowEvent.PAGE_TITLE_UPDATED, listener: (event: Event, title: String, explicitSet: Boolean) -> Unit): Unit /* this */
    fun once(event: BrowserWindowEvent.READY_TO_SHOW, listener: Function<*>): Unit /* this */
    fun once(event: BrowserWindowEvent.RESIZE, listener: Function<*>): Unit /* this */
    fun once(event: BrowserWindowEvent.RESIZED, listener: Function<*>): Unit /* this */
    fun once(event: BrowserWindowEvent.RESPONSIVE, listener: Function<*>): Unit /* this */
    fun once(event: BrowserWindowEvent.RESTORE, listener: Function<*>): Unit /* this */
    fun once(event: BrowserWindowEvent.ROTATE_GESTURE, listener: (event: Event, rotation: Double) -> Unit): Unit /* this */
    fun once(event: BrowserWindowEvent.SCROLL_TOUCH_BEGIN, listener: Function<*>): Unit /* this */
    fun once(event: BrowserWindowEvent.SCROLL_TOUCH_EDGE, listener: Function<*>): Unit /* this */
    fun once(event: BrowserWindowEvent.SCROLL_TOUCH_END, listener: Function<*>): Unit /* this */
    fun once(event: BrowserWindowEvent.SESSION_END, listener: Function<*>): Unit /* this */
    fun once(event: BrowserWindowEvent.SHEET_BEGIN, listener: Function<*>): Unit /* this */
    fun once(event: BrowserWindowEvent.SHEET_END, listener: Function<*>): Unit /* this */
    fun once(event: BrowserWindowEvent.SHOW, listener: Function<*>): Unit /* this */
    fun once(event: BrowserWindowEvent.SWIPE, listener: (event: Event, direction: String) -> Unit): Unit /* this */
    fun once(
        event: BrowserWindowEvent.SYSTEM_CONTEXT_MENU, listener: (
            event: Event,
            /**
             * The screen coordinates the context menu was triggered at
             */
            point: Point
        ) -> Unit
    ): Unit /* this */

    fun once(event: BrowserWindowEvent.UNMAXIMIZE, listener: Function<*>): Unit /* this */
    fun once(event: BrowserWindowEvent.UNRESPONSIVE, listener: Function<*>): Unit /* this */
    fun once(
        event: BrowserWindowEvent.WILL_MOVE, listener: (
            event: Event,
            /**
             * Location the window is being moved to.
             */
            newBounds: Rectangle
        ) -> Unit
    ): Unit /* this */

    fun once(
        event: BrowserWindowEvent.WILL_RESIZE, listener: (
            event: Event,
            /**
             * Size the window is being resized to.
             */
            newBounds: Rectangle, details: WillResizeDetails
        ) -> Unit
    ): Unit /* this */

    fun addListener(event: BrowserWindowEvent.ALWAYS_ON_TOP_CHANGED, listener: (event: Event, isAlwaysOnTop: Boolean) -> Unit): Unit /* this */
    fun addListener(event: BrowserWindowEvent.APP_COMMAND, listener: (event: Event, command: String) -> Unit): Unit /* this */
    fun addListener(event: BrowserWindowEvent.BLUR, listener: Function<*>): Unit /* this */
    fun addListener(event: BrowserWindowEvent.CLOSE, listener: (event: Event) -> Unit): Unit /* this */
    fun addListener(event: BrowserWindowEvent.CLOSED, listener: Function<*>): Unit /* this */
    fun addListener(event: BrowserWindowEvent.ENTER_FULL_SCREEN, listener: Function<*>): Unit /* this */
    fun addListener(event: BrowserWindowEvent.ENTER_HTML_FULL_SCREEN, listener: Function<*>): Unit /* this */
    fun addListener(event: BrowserWindowEvent.FOCUS, listener: Function<*>): Unit /* this */
    fun addListener(event: BrowserWindowEvent.HIDE, listener: Function<*>): Unit /* this */
    fun addListener(event: BrowserWindowEvent.LEAVE_FULL_SCREEN, listener: Function<*>): Unit /* this */
    fun addListener(event: BrowserWindowEvent.LEAVE_HTML_FULL_SCREEN, listener: Function<*>): Unit /* this */
    fun addListener(event: BrowserWindowEvent.MAXIMIZE, listener: Function<*>): Unit /* this */
    fun addListener(event: BrowserWindowEvent.MINIMIZE, listener: Function<*>): Unit /* this */
    fun addListener(event: BrowserWindowEvent.MOVE, listener: Function<*>): Unit /* this */
    fun addListener(event: BrowserWindowEvent.MOVED, listener: Function<*>): Unit /* this */
    fun addListener(event: BrowserWindowEvent.NEW_WINDOW_FOR_TAB, listener: Function<*>): Unit /* this */
    fun addListener(event: BrowserWindowEvent.PAGE_TITLE_UPDATED, listener: (event: Event, title: String, explicitSet: Boolean) -> Unit): Unit /* this */
    fun addListener(event: BrowserWindowEvent.READY_TO_SHOW, listener: Function<*>): Unit /* this */
    fun addListener(event: BrowserWindowEvent.RESIZE, listener: Function<*>): Unit /* this */
    fun addListener(event: BrowserWindowEvent.RESIZED, listener: Function<*>): Unit /* this */
    fun addListener(event: BrowserWindowEvent.RESPONSIVE, listener: Function<*>): Unit /* this */
    fun addListener(event: BrowserWindowEvent.RESTORE, listener: Function<*>): Unit /* this */
    fun addListener(event: BrowserWindowEvent.ROTATE_GESTURE, listener: (event: Event, rotation: Double) -> Unit): Unit /* this */
    fun addListener(event: BrowserWindowEvent.SCROLL_TOUCH_BEGIN, listener: Function<*>): Unit /* this */
    fun addListener(event: BrowserWindowEvent.SCROLL_TOUCH_EDGE, listener: Function<*>): Unit /* this */
    fun addListener(event: BrowserWindowEvent.SCROLL_TOUCH_END, listener: Function<*>): Unit /* this */
    fun addListener(event: BrowserWindowEvent.SESSION_END, listener: Function<*>): Unit /* this */
    fun addListener(event: BrowserWindowEvent.SHEET_BEGIN, listener: Function<*>): Unit /* this */
    fun addListener(event: BrowserWindowEvent.SHEET_END, listener: Function<*>): Unit /* this */
    fun addListener(event: BrowserWindowEvent.SHOW, listener: Function<*>): Unit /* this */
    fun addListener(event: BrowserWindowEvent.SWIPE, listener: (event: Event, direction: String) -> Unit): Unit /* this */
    fun addListener(
        event: BrowserWindowEvent.SYSTEM_CONTEXT_MENU, listener: (
            event: Event,
            /**
             * The screen coordinates the context menu was triggered at
             */
            point: Point
        ) -> Unit
    ): Unit /* this */

    fun addListener(event: BrowserWindowEvent.UNMAXIMIZE, listener: Function<*>): Unit /* this */
    fun addListener(event: BrowserWindowEvent.UNRESPONSIVE, listener: Function<*>): Unit /* this */
    fun addListener(
        event: BrowserWindowEvent.WILL_MOVE, listener: (
            event: Event,
            /**
             * Location the window is being moved to.
             */
            newBounds: Rectangle
        ) -> Unit
    ): Unit /* this */

    fun addListener(
        event: BrowserWindowEvent.WILL_RESIZE, listener: (
            event: Event,
            /**
             * Size the window is being resized to.
             */
            newBounds: Rectangle, details: WillResizeDetails
        ) -> Unit
    ): Unit /* this */

    fun removeListener(event: BrowserWindowEvent.ALWAYS_ON_TOP_CHANGED, listener: (event: Event, isAlwaysOnTop: Boolean) -> Unit): Unit /* this */
    fun removeListener(event: BrowserWindowEvent.APP_COMMAND, listener: (event: Event, command: String) -> Unit): Unit /* this */
    fun removeListener(event: BrowserWindowEvent.BLUR, listener: Function<*>): Unit /* this */
    fun removeListener(event: BrowserWindowEvent.CLOSE, listener: (event: Event) -> Unit): Unit /* this */
    fun removeListener(event: BrowserWindowEvent.CLOSED, listener: Function<*>): Unit /* this */
    fun removeListener(event: BrowserWindowEvent.ENTER_FULL_SCREEN, listener: Function<*>): Unit /* this */
    fun removeListener(event: BrowserWindowEvent.ENTER_HTML_FULL_SCREEN, listener: Function<*>): Unit /* this */
    fun removeListener(event: BrowserWindowEvent.FOCUS, listener: Function<*>): Unit /* this */
    fun removeListener(event: BrowserWindowEvent.HIDE, listener: Function<*>): Unit /* this */
    fun removeListener(event: BrowserWindowEvent.LEAVE_FULL_SCREEN, listener: Function<*>): Unit /* this */
    fun removeListener(event: BrowserWindowEvent.LEAVE_HTML_FULL_SCREEN, listener: Function<*>): Unit /* this */
    fun removeListener(event: BrowserWindowEvent.MAXIMIZE, listener: Function<*>): Unit /* this */
    fun removeListener(event: BrowserWindowEvent.MINIMIZE, listener: Function<*>): Unit /* this */
    fun removeListener(event: BrowserWindowEvent.MOVE, listener: Function<*>): Unit /* this */
    fun removeListener(event: BrowserWindowEvent.MOVED, listener: Function<*>): Unit /* this */
    fun removeListener(event: BrowserWindowEvent.NEW_WINDOW_FOR_TAB, listener: Function<*>): Unit /* this */
    fun removeListener(event: BrowserWindowEvent.PAGE_TITLE_UPDATED, listener: (event: Event, title: String, explicitSet: Boolean) -> Unit): Unit /* this */
    fun removeListener(event: BrowserWindowEvent.READY_TO_SHOW, listener: Function<*>): Unit /* this */
    fun removeListener(event: BrowserWindowEvent.RESIZE, listener: Function<*>): Unit /* this */
    fun removeListener(event: BrowserWindowEvent.RESIZED, listener: Function<*>): Unit /* this */
    fun removeListener(event: BrowserWindowEvent.RESPONSIVE, listener: Function<*>): Unit /* this */
    fun removeListener(event: BrowserWindowEvent.RESTORE, listener: Function<*>): Unit /* this */
    fun removeListener(event: BrowserWindowEvent.ROTATE_GESTURE, listener: (event: Event, rotation: Double) -> Unit): Unit /* this */
    fun removeListener(event: BrowserWindowEvent.SCROLL_TOUCH_BEGIN, listener: Function<*>): Unit /* this */
    fun removeListener(event: BrowserWindowEvent.SCROLL_TOUCH_EDGE, listener: Function<*>): Unit /* this */
    fun removeListener(event: BrowserWindowEvent.SCROLL_TOUCH_END, listener: Function<*>): Unit /* this */
    fun removeListener(event: BrowserWindowEvent.SESSION_END, listener: Function<*>): Unit /* this */
    fun removeListener(event: BrowserWindowEvent.SHEET_BEGIN, listener: Function<*>): Unit /* this */
    fun removeListener(event: BrowserWindowEvent.SHEET_END, listener: Function<*>): Unit /* this */
    fun removeListener(event: BrowserWindowEvent.SHOW, listener: Function<*>): Unit /* this */
    fun removeListener(event: BrowserWindowEvent.SWIPE, listener: (event: Event, direction: String) -> Unit): Unit /* this */
    fun removeListener(
        event: BrowserWindowEvent.SYSTEM_CONTEXT_MENU, listener: (
            event: Event,
            /**
             * The screen coordinates the context menu was triggered at
             */
            point: Point
        ) -> Unit
    ): Unit /* this */

    fun removeListener(event: BrowserWindowEvent.UNMAXIMIZE, listener: Function<*>): Unit /* this */
    fun removeListener(event: BrowserWindowEvent.UNRESPONSIVE, listener: Function<*>): Unit /* this */
    fun removeListener(
        event: BrowserWindowEvent.WILL_MOVE, listener: (
            event: Event,
            /**
             * Location the window is being moved to.
             */
            newBounds: Rectangle
        ) -> Unit
    ): Unit /* this */

    fun removeListener(
        event: BrowserWindowEvent.WILL_RESIZE, listener: (
            event: Event,
            /**
             * Size the window is being resized to.
             */
            newBounds: Rectangle, details: WillResizeDetails
        ) -> Unit
    ): Unit /* this */

    /**
     * BrowserWindow
     */
    constructor (options: BrowserWindowConstructorOptions = definedExternally)

    /**
     * Replacement API for setBrowserView supporting work with multi browser views.
     *
     * @experimental
     */
    fun addBrowserView(browserView: BrowserView): Unit

    /**
     * Adds a window as a tab on this window, after the tab for the window instance.
     *
     * @platform darwin
     */
    fun addTabbedWindow(browserWindow: BrowserWindow): Unit

    /**
     * Removes focus from the window.
     */
    fun blur(): Unit
    fun blurWebView(): Unit

    /**
     * Resolves with a NativeImage
     *
     * Captures a snapshot of the page within `rect`. Omitting `rect` will capture the
     * whole visible page. If the page is not visible, `rect` may be empty. The page is
     * considered visible when its browser window is hidden and the capturer count is
     * non-zero. If you would like the page to stay hidden, you should ensure that
     * `stayHidden` is set to true.
     */
    fun capturePage(rect: Rectangle = definedExternally, opts: Opts = definedExternally): Promise<NativeImage>

    /**
     * Moves window to the center of the screen.
     */
    fun center(): Unit

    /**
     * Try to close the window. This has the same effect as a user manually clicking
     * the close button of the window. The web page may cancel the close though. See
     * the close event.
     */
    fun close(): Unit

    /**
     * Closes the currently open Quick Look panel.
     *
     * @platform darwin
     */
    fun closeFilePreview(): Unit

    /**
     * Force closing the window, the `unload` and `beforeunload` event won't be emitted
     * for the web page, and `close` event will also not be emitted for this window,
     * but it guarantees the `closed` event will be emitted.
     */
    fun destroy(): Unit

    /**
     * Starts or stops flashing the window to attract user's attention.
     */
    fun flashFrame(flag: Boolean): Unit

    /**
     * Focuses on the window.
     */
    fun focus(): Unit
    fun focusOnWebView(): Unit

    /**
     * Gets the background color of the window in Hex (`#RRGGBB`) format.
     *
     * See Setting `backgroundColor`.
     *
     * **Note:** The alpha value is _not_ returned alongside the red, green, and blue
     * values.
     */
    fun getBackgroundColor(): String

    /**
     * The `bounds` of the window as `Object`.
     */
    fun getBounds(): Rectangle

    /**
     * The `BrowserView` attached to `win`. Returns `null` if one is not attached.
     * Throws an error if multiple `BrowserView`s are attached.
     *
     * @experimental
     */
    fun getBrowserView(): Any /* (BrowserView) | (null) */

    /**
     * an array of all BrowserViews that have been attached with `addBrowserView` or
     * `setBrowserView`.
     *
     * **Note:** The BrowserView API is currently experimental and may change or be
     * removed in future Electron releases.
     *
     * @experimental
     */
    fun getBrowserViews(): js.core.ReadonlyArray<BrowserView>

    /**
     * All child windows.
     */
    fun getChildWindows(): js.core.ReadonlyArray<BrowserWindow>

    /**
     * The `bounds` of the window's client area as `Object`.
     */
    fun getContentBounds(): Rectangle

    /**
     * Contains the window's client area's width and height.
     */
    fun getContentSize(): js.core.ReadonlyArray<Double>

    /**
     * Contains the window's maximum width and height.
     */
    fun getMaximumSize(): js.core.ReadonlyArray<Double>

    /**
     * Window id in the format of DesktopCapturerSource's id. For example
     * "window:1324:0".
     *
     * More precisely the format is `window:id:other_id` where `id` is `HWND` on
     * Windows, `CGWindowID` (`uint64_t`) on macOS and `Window` (`unsigned long`) on
     * Linux. `other_id` is used to identify web contents (tabs) so within the same top
     * level window.
     */
    fun getMediaSourceId(): String

    /**
     * Contains the window's minimum width and height.
     */
    fun getMinimumSize(): js.core.ReadonlyArray<Double>

    /**
     * The platform-specific handle of the window.
     *
     * The native type of the handle is `HWND` on Windows, `NSView*` on macOS, and
     * `Window` (`unsigned long`) on Linux.
     */
    fun getNativeWindowHandle(): Buffer

    /**
     * Contains the window bounds of the normal state
     *
     * **Note:** whatever the current state of the window : maximized, minimized or in
     * fullscreen, this function always returns the position and size of the window in
     * normal state. In normal state, getBounds and getNormalBounds returns the same
     * `Rectangle`.
     */
    fun getNormalBounds(): Rectangle

    /**
     * between 0.0 (fully transparent) and 1.0 (fully opaque). On Linux, always returns
     * 1.
     */
    fun getOpacity(): Double

    /**
     * The parent window or `null` if there is no parent.
     */
    fun getParentWindow(): Any /* (BrowserWindow) | (null) */

    /**
     * Contains the window's current position.
     */
    fun getPosition(): js.core.ReadonlyArray<Double>

    /**
     * The pathname of the file the window represents.
     *
     * @platform darwin
     */
    fun getRepresentedFilename(): String

    /**
     * Contains the window's width and height.
     */
    fun getSize(): js.core.ReadonlyArray<Double>

    /**
     * The title of the native window.
     *
     * **Note:** The title of the web page can be different from the title of the
     * native window.
     */
    fun getTitle(): String

    /**
     * The custom position for the traffic light buttons in frameless window.
     *
     * @platform darwin
     */
    fun getTrafficLightPosition(): Point

    /**
     * Whether the window has a shadow.
     */
    fun hasShadow(): Boolean

    /**
     * Hides the window.
     */
    fun hide(): Unit

    /**
     * Hooks a windows message. The `callback` is called when the message is received
     * in the WndProc.
     *
     * @platform win32
     */
    fun hookWindowMessage(message: Double, callback: (wParam: Buffer, lParam: Buffer) -> Unit): Unit

    /**
     * Invalidates the window shadow so that it is recomputed based on the current
     * window shape.
     *
     * `BrowserWindows` that are transparent can sometimes leave behind visual
     * artifacts on macOS. This method can be used to clear these artifacts when, for
     * example, performing an animation.
     *
     * @platform darwin
     */
    fun invalidateShadow(): Unit

    /**
     * Whether the window is always on top of other windows.
     */
    fun isAlwaysOnTop(): Boolean

    /**
     * Whether the window can be manually closed by user.
     *
     * On Linux always returns `true`.
     *
     * @platform darwin,win32
     */
    fun isClosable(): Boolean

    /**
     * Whether the window is destroyed.
     */
    fun isDestroyed(): Boolean

    /**
     * Whether the window's document has been edited.
     *
     * @platform darwin
     */
    fun isDocumentEdited(): Boolean

    /**
     * whether the window is enabled.
     */
    fun isEnabled(): Boolean

    /**
     * Whether the window can be focused.
     *
     * @platform darwin,win32
     */
    fun isFocusable(): Boolean

    /**
     * Whether the window is focused.
     */
    fun isFocused(): Boolean

    /**
     * Whether the window is in fullscreen mode.
     */
    fun isFullScreen(): Boolean

    /**
     * Whether the maximize/zoom window button toggles fullscreen mode or maximizes the
     * window.
     */
    fun isFullScreenable(): Boolean

    /**
     * Whether the window will be hidden when the user toggles into mission control.
     *
     * @platform darwin
     */
    fun isHiddenInMissionControl(): Boolean

    /**
     * Whether the window is in kiosk mode.
     */
    fun isKiosk(): Boolean

    /**
     * Whether the window can be manually maximized by user.
     *
     * On Linux always returns `true`.
     *
     * @platform darwin,win32
     */
    fun isMaximizable(): Boolean

    /**
     * Whether the window is maximized.
     */
    fun isMaximized(): Boolean

    /**
     * Whether menu bar automatically hides itself.
     *
     * @platform win32,linux
     */
    fun isMenuBarAutoHide(): Boolean

    /**
     * Whether the menu bar is visible.
     *
     * @platform win32,linux
     */
    fun isMenuBarVisible(): Boolean

    /**
     * Whether the window can be manually minimized by the user.
     *
     * On Linux always returns `true`.
     *
     * @platform darwin,win32
     */
    fun isMinimizable(): Boolean

    /**
     * Whether the window is minimized.
     */
    fun isMinimized(): Boolean

    /**
     * Whether current window is a modal window.
     */
    fun isModal(): Boolean

    /**
     * Whether the window can be moved by user.
     *
     * On Linux always returns `true`.
     *
     * @platform darwin,win32
     */
    fun isMovable(): Boolean

    /**
     * Whether the window is in normal state (not maximized, not minimized, not in
     * fullscreen mode).
     */
    fun isNormal(): Boolean

    /**
     * Whether the window can be manually resized by the user.
     */
    fun isResizable(): Boolean

    /**
     * Whether the window is in simple (pre-Lion) fullscreen mode.
     *
     * @platform darwin
     */
    fun isSimpleFullScreen(): Boolean

    /**
     * Whether the window is in Windows 10 tablet mode.
     *
     * Since Windows 10 users can use their PC as tablet, under this mode apps can
     * choose to optimize their UI for tablets, such as enlarging the titlebar and
     * hiding titlebar buttons.
     *
     * This API returns whether the window is in tablet mode, and the `resize` event
     * can be be used to listen to changes to tablet mode.
     *
     * @platform win32
     */
    fun isTabletMode(): Boolean

    /**
     * Whether the window is visible to the user in the foreground of the app.
     */
    fun isVisible(): Boolean

    /**
     * Whether the window is visible on all workspaces.
     *
     * **Note:** This API always returns false on Windows.
     *
     * @platform darwin,linux
     */
    fun isVisibleOnAllWorkspaces(): Boolean

    /**
     * `true` or `false` depending on whether the message is hooked.
     *
     * @platform win32
     */
    fun isWindowMessageHooked(message: Double): Boolean

    /**
     * the promise will resolve when the page has finished loading (see
     * `did-finish-load`), and rejects if the page fails to load (see `did-fail-load`).
     *
     * Same as `webContents.loadFile`, `filePath` should be a path to an HTML file
     * relative to the root of your application.  See the `webContents` docs for more
     * information.
     */
    fun loadFile(filePath: String, options: LoadFileOptions = definedExternally): Promise<Unit>

    /**
     * the promise will resolve when the page has finished loading (see
     * `did-finish-load`), and rejects if the page fails to load (see `did-fail-load`).
     *
     * Same as `webContents.loadURL(url[, options])`.
     *
     * The `url` can be a remote address (e.g. `http://`) or a path to a local HTML
     * file using the `file://` protocol.
     *
     * To ensure that file URLs are properly formatted, it is recommended to use Node's
     * `url.format` method:
     *
     * You can load a URL using a `POST` request with URL-encoded data by doing the
     * following:
     */
    fun loadURL(url: String, options: LoadURLOptions = definedExternally): Promise<Unit>

    /**
     * Maximizes the window. This will also show (but not focus) the window if it isn't
     * being displayed already.
     */
    fun maximize(): Unit

    /**
     * Merges all windows into one window with multiple tabs when native tabs are
     * enabled and there is more than one open window.
     *
     * @platform darwin
     */
    fun mergeAllWindows(): Unit

    /**
     * Minimizes the window. On some platforms the minimized window will be shown in
     * the Dock.
     */
    fun minimize(): Unit

    /**
     * Moves window above the source window in the sense of z-order. If the
     * `mediaSourceId` is not of type window or if the window does not exist then this
     * method throws an error.
     */
    fun moveAbove(mediaSourceId: String): Unit

    /**
     * Moves the current tab into a new window if native tabs are enabled and there is
     * more than one tab in the current window.
     *
     * @platform darwin
     */
    fun moveTabToNewWindow(): Unit

    /**
     * Moves window to top(z-order) regardless of focus
     */
    fun moveTop(): Unit

    /**
     * Uses Quick Look to preview a file at a given path.
     *
     * @platform darwin
     */
    fun previewFile(path: String, displayName: String = definedExternally): Unit

    /**
     * Same as `webContents.reload`.
     */
    fun reload(): Unit
    fun removeBrowserView(browserView: BrowserView): Unit

    /**
     * Remove the window's menu bar.
     *
     * @platform linux,win32
     */
    fun removeMenu(): Unit

    /**
     * Restores the window from minimized state to its previous state.
     */
    fun restore(): Unit

    /**
     * Selects the next tab when native tabs are enabled and there are other tabs in
     * the window.
     *
     * @platform darwin
     */
    fun selectNextTab(): Unit

    /**
     * Selects the previous tab when native tabs are enabled and there are other tabs
     * in the window.
     *
     * @platform darwin
     */
    fun selectPreviousTab(): Unit

    /**
     * Sets whether the window should show always on top of other windows. After
     * setting this, the window is still a normal window, not a toolbox window which
     * can not be focused on.
     */
    fun setAlwaysOnTop(flag: Boolean, level: BrowserWindowSetAlwaysOnTopLevel = definedExternally, relativeLevel: Double = definedExternally): Unit

    /**
     * Sets the properties for the window's taskbar button.
     *
     * **Note:** `relaunchCommand` and `relaunchDisplayName` must always be set
     * together. If one of those properties is not set, then neither will be used.
     *
     * @platform win32
     */
    fun setAppDetails(options: AppDetailsOptions): Unit

    /**
     * This will make a window maintain an aspect ratio. The extra size allows a
     * developer to have space, specified in pixels, not included within the aspect
     * ratio calculations. This API already takes into account the difference between a
     * window's size and its content size.
     *
     * Consider a normal window with an HD video player and associated controls.
     * Perhaps there are 15 pixels of controls on the left edge, 25 pixels of controls
     * on the right edge and 50 pixels of controls below the player. In order to
     * maintain a 16:9 aspect ratio (standard aspect ratio for HD @1920x1080) within
     * the player itself we would call this function with arguments of 16/9 and {
     * width: 40, height: 50 }. The second argument doesn't care where the extra width
     * and height are within the content view--only that they exist. Sum any extra
     * width and height areas you have within the overall content view.
     *
     * The aspect ratio is not respected when window is resized programmatically with
     * APIs like `win.setSize`.
     *
     * To reset an aspect ratio, pass 0 as the `aspectRatio` value:
     * `win.setAspectRatio(0)`.
     */
    fun setAspectRatio(aspectRatio: Double, extraSize: Size = definedExternally): Unit

    /**
     * Controls whether to hide cursor when typing.
     *
     * @platform darwin
     */
    fun setAutoHideCursor(autoHide: Boolean): Unit

    /**
     * Sets whether the window menu bar should hide itself automatically. Once set the
     * menu bar will only show when users press the single `Alt` key.
     *
     * If the menu bar is already visible, calling `setAutoHideMenuBar(true)` won't
     * hide it immediately.
     *
     * @platform win32,linux
     */
    fun setAutoHideMenuBar(hide: Boolean): Unit

    /**
     * Examples of valid `backgroundColor` values:
     *
     * * Hex
     *   * #fff (shorthand RGB)
     *   * #ffff (shorthand ARGB)
     *   * #ffffff (RGB)
     *   * #ffffffff (ARGB)
     * * RGB
     *   * rgb(([\d]+),\s*([\d]+),\s*([\d]+))
     *     * e.g. rgb(255, 255, 255)
     * * RGBA
     *   * rgba(([\d]+),\s*([\d]+),\s*([\d]+),\s*([\d.]+))
     *     * e.g. rgba(255, 255, 255, 1.0)
     * * HSL
     *   * hsl((-?[\d.]+),\s*([\d.]+)%,\s*([\d.]+)%)
     *     * e.g. hsl(200, 20%, 50%)
     * * HSLA
     *   * hsla((-?[\d.]+),\s*([\d.]+)%,\s*([\d.]+)%,\s*([\d.]+))
     *     * e.g. hsla(200, 20%, 50%, 0.5)
     * * Color name
     *   * Options are listed in SkParseColor.cpp
     *   * Similar to CSS Color Module Level 3 keywords, but case-sensitive.
     *     * e.g. `blueviolet` or `red`
     *
     * Sets the background color of the window. See Setting `backgroundColor`.
     */
    fun setBackgroundColor(backgroundColor: String): Unit

    /**
     * This method sets the browser window's system-drawn background material,
     * including behind the non-client area.
     *
     * See the Windows documentation for more details.
     *
     * **Note:** This method is only supported on Windows 11 22H2 and up.
     *
     * @platform win32
     */
    fun setBackgroundMaterial(material: BrowserWindowSetBackgroundMaterialMaterial): Unit

    /**
     * Resizes and moves the window to the supplied bounds. Any properties that are not
     * supplied will default to their current values.
     */
    fun setBounds(bounds: Rectangle, animate: Boolean = definedExternally): Unit
    fun setBrowserView(browserView: (BrowserView)): Unit

    fun setBrowserView(browserView: (Nothing?)): Unit

    /**
     * Sets whether the window can be manually closed by user. On Linux does nothing.
     *
     * @platform darwin,win32
     */
    fun setClosable(closable: Boolean): Unit

    /**
     * Resizes and moves the window's client area (e.g. the web page) to the supplied
     * bounds.
     */
    fun setContentBounds(bounds: Rectangle, animate: Boolean = definedExternally): Unit

    /**
     * Prevents the window contents from being captured by other apps.
     *
     * On macOS it sets the NSWindow's sharingType to NSWindowSharingNone. On Windows
     * it calls SetWindowDisplayAffinity with `WDA_EXCLUDEFROMCAPTURE`. For Windows 10
     * version 2004 and up the window will be removed from capture entirely, older
     * Windows versions behave as if `WDA_MONITOR` is applied capturing a black window.
     *
     * @platform darwin,win32
     */
    fun setContentProtection(enable: Boolean): Unit

    /**
     * Resizes the window's client area (e.g. the web page) to `width` and `height`.
     */
    fun setContentSize(width: Double, height: Double, animate: Boolean = definedExternally): Unit

    /**
     * Specifies whether the window’s document has been edited, and the icon in title
     * bar will become gray when set to `true`.
     *
     * @platform darwin
     */
    fun setDocumentEdited(edited: Boolean): Unit

    /**
     * Disable or enable the window.
     */
    fun setEnabled(enable: Boolean): Unit

    /**
     * Changes whether the window can be focused.
     *
     * On macOS it does not remove the focus from the window.
     *
     * @platform darwin,win32
     */
    fun setFocusable(focusable: Boolean): Unit

    /**
     * Sets whether the window should be in fullscreen mode.
     *
     * **Note:** On macOS, fullscreen transitions take place asynchronously. If further
     * actions depend on the fullscreen state, use the 'enter-full-screen' or
     * 'leave-full-screen' events.
     */
    fun setFullScreen(flag: Boolean): Unit

    /**
     * Sets whether the maximize/zoom window button toggles fullscreen mode or
     * maximizes the window.
     */
    fun setFullScreenable(fullscreenable: Boolean): Unit

    /**
     * Sets whether the window should have a shadow.
     */
    fun setHasShadow(hasShadow: Boolean): Unit

    /**
     * Sets whether the window will be hidden when the user toggles into mission
     * control.
     *
     * @platform darwin
     */
    fun setHiddenInMissionControl(hidden: Boolean): Unit

    /**
     * Changes window icon.
     *
     * @platform win32,linux
     */
    fun setIcon(icon: (NativeImage)): Unit

    fun setIcon(icon: (String)): Unit

    /**
     * Makes the window ignore all mouse events.
     *
     * All mouse events happened in this window will be passed to the window below this
     * window, but if this window has focus, it will still receive keyboard events.
     */
    fun setIgnoreMouseEvents(ignore: Boolean, options: IgnoreMouseEventsOptions = definedExternally): Unit

    /**
     * Enters or leaves kiosk mode.
     */
    fun setKiosk(flag: Boolean): Unit

    /**
     * Sets whether the window can be manually maximized by user. On Linux does
     * nothing.
     *
     * @platform darwin,win32
     */
    fun setMaximizable(maximizable: Boolean): Unit

    /**
     * Sets the maximum size of window to `width` and `height`.
     */
    fun setMaximumSize(width: Double, height: Double): Unit

    /**
     * Sets the `menu` as the window's menu bar.
     *
     * @platform linux,win32
     */
    fun setMenu(menu: (Menu)): Unit

    fun setMenu(menu: (Nothing?)): Unit

    /**
     * Sets whether the menu bar should be visible. If the menu bar is auto-hide, users
     * can still bring up the menu bar by pressing the single `Alt` key.
     *
     * @platform win32,linux
     */
    fun setMenuBarVisibility(visible: Boolean): Unit

    /**
     * Sets whether the window can be manually minimized by user. On Linux does
     * nothing.
     *
     * @platform darwin,win32
     */
    fun setMinimizable(minimizable: Boolean): Unit

    /**
     * Sets the minimum size of window to `width` and `height`.
     */
    fun setMinimumSize(width: Double, height: Double): Unit

    /**
     * Sets whether the window can be moved by user. On Linux does nothing.
     *
     * @platform darwin,win32
     */
    fun setMovable(movable: Boolean): Unit

    /**
     * Sets the opacity of the window. On Linux, does nothing. Out of bound number
     * values are clamped to the [0, 1] range.
     *
     * @platform win32,darwin
     */
    fun setOpacity(opacity: Double): Unit

    /**
     * Sets a 16 x 16 pixel overlay onto the current taskbar icon, usually used to
     * convey some sort of application status or to passively notify the user.
     *
     * @platform win32
     */
    fun setOverlayIcon(overlay: (NativeImage), description: String): Unit

    fun setOverlayIcon(overlay: (Nothing?), description: String): Unit

    /**
     * Sets `parent` as current window's parent window, passing `null` will turn
     * current window into a top-level window.
     */
    fun setParentWindow(parent: (BrowserWindow)): Unit

    fun setParentWindow(parent: (Nothing?)): Unit

    /**
     * Moves window to `x` and `y`.
     */
    fun setPosition(x: Double, y: Double, animate: Boolean = definedExternally): Unit

    /**
     * Sets progress value in progress bar. Valid range is [0, 1.0].
     *
     * Remove progress bar when progress < 0; Change to indeterminate mode when
     * progress > 1.
     *
     * On Linux platform, only supports Unity desktop environment, you need to specify
     * the `*.desktop` file name to `desktopName` field in `package.json`. By default,
     * it will assume `{app.name}.desktop`.
     *
     * On Windows, a mode can be passed. Accepted values are `none`, `normal`,
     * `indeterminate`, `error`, and `paused`. If you call `setProgressBar` without a
     * mode set (but with a value within the valid range), `normal` will be assumed.
     */
    fun setProgressBar(progress: Double, options: ProgressBarOptions = definedExternally): Unit

    /**
     * Sets the pathname of the file the window represents, and the icon of the file
     * will show in window's title bar.
     *
     * @platform darwin
     */
    fun setRepresentedFilename(filename: String): Unit

    /**
     * Sets whether the window can be manually resized by the user.
     */
    fun setResizable(resizable: Boolean): Unit

    /**
     * Setting a window shape determines the area within the window where the system
     * permits drawing and user interaction. Outside of the given region, no pixels
     * will be drawn and no mouse events will be registered. Mouse events outside of
     * the region will not be received by that window, but will fall through to
     * whatever is behind the window.
     *
     * @experimental
     * @platform win32,linux
     */
    fun setShape(rects: js.core.ReadonlyArray<Rectangle>): Unit

    /**
     * Changes the attachment point for sheets on macOS. By default, sheets are
     * attached just below the window frame, but you may want to display them beneath a
     * HTML-rendered toolbar. For example:
     *
     * @platform darwin
     */
    fun setSheetOffset(offsetY: Double, offsetX: Double = definedExternally): Unit

    /**
     * Enters or leaves simple fullscreen mode.
     *
     * Simple fullscreen mode emulates the native fullscreen behavior found in versions
     * of macOS prior to Lion (10.7).
     *
     * @platform darwin
     */
    fun setSimpleFullScreen(flag: Boolean): Unit

    /**
     * Resizes the window to `width` and `height`. If `width` or `height` are below any
     * set minimum size constraints the window will snap to its minimum size.
     */
    fun setSize(width: Double, height: Double, animate: Boolean = definedExternally): Unit

    /**
     * Makes the window not show in the taskbar.
     *
     * @platform darwin,win32
     */
    fun setSkipTaskbar(skip: Boolean): Unit

    /**
     * Whether the buttons were added successfully
     *
     * Add a thumbnail toolbar with a specified set of buttons to the thumbnail image
     * of a window in a taskbar button layout. Returns a `boolean` object indicates
     * whether the thumbnail has been added successfully.
     *
     * The number of buttons in thumbnail toolbar should be no greater than 7 due to
     * the limited room. Once you setup the thumbnail toolbar, the toolbar cannot be
     * removed due to the platform's limitation. But you can call the API with an empty
     * array to clean the buttons.
     *
     * The `buttons` is an array of `Button` objects:
     *
     * * `Button` Object
     *   * `icon` NativeImage - The icon showing in thumbnail toolbar.
     *   * `click` Function
     *   * `tooltip` string (optional) - The text of the button's tooltip.
     *   * `flags` string[] (optional) - Control specific states and behaviors of the
     * button. By default, it is `['enabled']`.
     *
     * The `flags` is an array that can include following `string`s:
     *
     * * `enabled` - The button is active and available to the user.
     * * `disabled` - The button is disabled. It is present, but has a visual state
     * indicating it will not respond to user action.
     * * `dismissonclick` - When the button is clicked, the thumbnail window closes
     * immediately.
     * * `nobackground` - Do not draw a button border, use only the image.
     * * `hidden` - The button is not shown to the user.
     * * `noninteractive` - The button is enabled but not interactive; no pressed
     * button state is drawn. This value is intended for instances where the button is
     * used in a notification.
     *
     * @platform win32
     */
    fun setThumbarButtons(buttons: js.core.ReadonlyArray<ThumbarButton>): Boolean

    /**
     * Sets the region of the window to show as the thumbnail image displayed when
     * hovering over the window in the taskbar. You can reset the thumbnail to be the
     * entire window by specifying an empty region: `{ x: 0, y: 0, width: 0, height: 0
     * }`.
     *
     * @platform win32
     */
    fun setThumbnailClip(region: Rectangle): Unit

    /**
     * Sets the toolTip that is displayed when hovering over the window thumbnail in
     * the taskbar.
     *
     * @platform win32
     */
    fun setThumbnailToolTip(toolTip: String): Unit

    /**
     * Changes the title of native window to `title`.
     */
    fun setTitle(title: String): Unit

    /**
     * On a Window with Window Controls Overlay already enabled, this method updates
     * the style of the title bar overlay.
     *
     * @platform win32
     */
    fun setTitleBarOverlay(options: TitleBarOverlayOptions): Unit

    /**
     * Raises `browserView` above other `BrowserView`s attached to `win`. Throws an
     * error if `browserView` is not attached to `win`.
     *
     * @experimental
     */
    fun setTopBrowserView(browserView: BrowserView): Unit

    /**
     * Sets the touchBar layout for the current window. Specifying `null` or
     * `undefined` clears the touch bar. This method only has an effect if the machine
     * has a touch bar.
     *
     * **Note:** The TouchBar API is currently experimental and may change or be
     * removed in future Electron releases.
     *
     * @platform darwin
     */
    fun setTouchBar(touchBar: (TouchBar)): Unit

    fun setTouchBar(touchBar: (Nothing?)): Unit

    /**
     * Set a custom position for the traffic light buttons in frameless window.
     *
     * @platform darwin
     */
    fun setTrafficLightPosition(position: Point): Unit

    /**
     * Adds a vibrancy effect to the browser window. Passing `null` or an empty string
     * will remove the vibrancy effect on the window.
     *
     * Note that `appearance-based`, `light`, `dark`, `medium-light`, and `ultra-dark`
     * have been deprecated and will be removed in an upcoming version of macOS.
     *
     * @platform darwin
     */
    fun setVibrancy(type: ((Temp0))): Unit

    fun setVibrancy(type: (Nothing?)): Unit

    /**
     * Sets whether the window should be visible on all workspaces.
     *
     * **Note:** This API does nothing on Windows.
     *
     * @platform darwin,linux
     */
    fun setVisibleOnAllWorkspaces(visible: Boolean, options: VisibleOnAllWorkspacesOptions = definedExternally): Unit

    /**
     * Sets whether the window traffic light buttons should be visible.
     *
     * @platform darwin
     */
    fun setWindowButtonVisibility(visible: Boolean): Unit

    /**
     * Shows and gives focus to the window.
     */
    fun show(): Unit

    /**
     * Same as `webContents.showDefinitionForSelection()`.
     *
     * @platform darwin
     */
    fun showDefinitionForSelection(): Unit

    /**
     * Shows the window but doesn't focus on it.
     */
    fun showInactive(): Unit

    /**
     * Toggles the visibility of the tab bar if native tabs are enabled and there is
     * only one tab in the current window.
     *
     * @platform darwin
     */
    fun toggleTabBar(): Unit

    /**
     * Unhooks all of the window messages.
     *
     * @platform win32
     */
    fun unhookAllWindowMessages(): Unit

    /**
     * Unhook the window message.
     *
     * @platform win32
     */
    fun unhookWindowMessage(message: Double): Unit

    /**
     * Unmaximizes the window.
     */
    fun unmaximize(): Unit

    /**
     * A `string` property that defines an alternative title provided only to
     * accessibility tools such as screen readers. This string is not directly visible
     * to users.
     */
    var accessibleTitle: String

    /**
     * A `boolean` property that determines whether the window menu bar should hide
     * itself automatically. Once set, the menu bar will only show when users press the
     * single `Alt` key.
     *
     * If the menu bar is already visible, setting this property to `true` won't hide
     * it immediately.
     */
    var autoHideMenuBar: Boolean

    /**
     * A `boolean` property that determines whether the window can be manually closed
     * by user.
     *
     * On Linux the setter is a no-op, although the getter returns `true`.
     *
     * @platform darwin,win32
     */
    var closable: Boolean

    /**
     * A `boolean` property that specifies whether the window’s document has been
     * edited.
     *
     * The icon in title bar will become gray when set to `true`.
     *
     * @platform darwin
     */
    var documentEdited: Boolean

    /**
     * A `boolean` property that determines whether the window is excluded from the
     * application’s Windows menu. `false` by default.
     *
     * @platform darwin
     */
    var excludedFromShownWindowsMenu: Boolean

    /**
     * A `boolean` property that determines whether the window is focusable.
     *
     * @platform win32,darwin
     */
    var focusable: Boolean

    /**
     * A `boolean` property that determines whether the window is in fullscreen mode.
     */
    var fullScreen: Boolean

    /**
     * A `boolean` property that determines whether the maximize/zoom window button
     * toggles fullscreen mode or maximizes the window.
     */
    var fullScreenable: Boolean

    /**
     * A `Integer` property representing the unique ID of the window. Each ID is unique
     * among all `BrowserWindow` instances of the entire Electron application.
     *
     */
    val id: Double

    /**
     * A `boolean` property that determines whether the window is in kiosk mode.
     */
    var kiosk: Boolean

    /**
     * A `boolean` property that determines whether the window can be manually
     * maximized by user.
     *
     * On Linux the setter is a no-op, although the getter returns `true`.
     *
     * @platform darwin,win32
     */
    var maximizable: Boolean

    /**
     * A `boolean` property that determines whether the menu bar should be visible.
     *
     * **Note:** If the menu bar is auto-hide, users can still bring up the menu bar by
     * pressing the single `Alt` key.
     *
     * @platform win32,linux
     */
    var menuBarVisible: Boolean

    /**
     * A `boolean` property that determines whether the window can be manually
     * minimized by user.
     *
     * On Linux the setter is a no-op, although the getter returns `true`.
     *
     * @platform darwin,win32
     */
    var minimizable: Boolean

    /**
     * A `boolean` property that determines Whether the window can be moved by user.
     *
     * On Linux the setter is a no-op, although the getter returns `true`.
     *
     * @platform darwin,win32
     */
    var movable: Boolean

    /**
     * A `string` property that determines the pathname of the file the window
     * represents, and the icon of the file will show in window's title bar.
     *
     * @platform darwin
     */
    var representedFilename: String

    /**
     * A `boolean` property that determines whether the window can be manually resized
     * by user.
     */
    var resizable: Boolean

    /**
     * A `boolean` property that determines whether the window has a shadow.
     */
    var shadow: Boolean

    /**
     * A `boolean` property that determines whether the window is in simple (pre-Lion)
     * fullscreen mode.
     */
    var simpleFullScreen: Boolean

    /**
     * A `string` property that determines the title of the native window.
     *
     * **Note:** The title of the web page can be different from the title of the
     * native window.
     */
    var title: String

    /**
     * A `boolean` property that determines whether the window is visible on all
     * workspaces.
     *
     * **Note:** Always returns false on Windows.
     *
     * @platform darwin,linux
     */
    var visibleOnAllWorkspaces: Boolean

    /**
     * A `WebContents` object this window owns. All web page related events and
     * operations will be done via it.
     *
     * See the `webContents` documentation for its methods and events.
     *
     */
    val webContents: WebContents

    companion object {
        /**
         * The window that owns the given `browserView`. If the given view is not attached
         * to any window, returns `null`.
         */
        fun fromBrowserView(browserView: BrowserView): Any /* (BrowserWindow) | (null) */

        /**
         * The window with the given `id`.
         */
        fun fromId(id: Double): Any /* (BrowserWindow) | (null) */

        /**
         * The window that owns the given `webContents` or `null` if the contents are not
         * owned by a window.
         */
        fun fromWebContents(webContents: WebContents): Any /* (BrowserWindow) | (null) */

        /**
         * An array of all opened browser windows.
         */
        fun getAllWindows(): js.core.ReadonlyArray<BrowserWindow>

        /**
         * The window that is focused in this application, otherwise returns `null`.
         */
        fun getFocusedWindow(): Any /* (BrowserWindow) | (null) */
    }

}
