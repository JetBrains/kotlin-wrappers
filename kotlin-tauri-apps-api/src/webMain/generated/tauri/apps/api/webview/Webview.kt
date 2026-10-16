// Automatically generated - do not modify!

@file:JsModule("@tauri-apps/api/webview")

package tauri.apps.api.webview

import tauri.apps.api.dpi.*
import tauri.apps.api.event.EventCallback
import tauri.apps.api.event.EventName
import tauri.apps.api.event.EventTarget
import tauri.apps.api.event.UnlistenFn
import tauri.apps.api.webviewwindow.WebviewWindow
import tauri.apps.api.window.Color
import tauri.apps.api.window.Window

/**
 * Create new webview or get a handle to an existing one.
 *
 * Webviews are identified by a *label*  a unique identifier that can be used to reference it later.
 * It may only contain alphanumeric characters `a-zA-Z` plus the following special characters `-`, `/`, `:` and `_`.
 *
 * #### Requires the `unstable` Cargo feature
 *
 * Creating a webview with `new Webview(...)` adds a *child webview* to an existing
 * window, which is an unstable API gated behind the `unstable` feature of the
 * `tauri` crate:
 *
 * ```toml
 * [dependencies]
 * tauri = { version = "2", features = ["unstable"] }
 * ```
 *
 * Without it the call rejects with an "unstable feature not supported" error.
 * Getting a handle to an existing webview (`Webview.getByLabel`,
 * {@link getCurrentWebview}, {@link getAllWebviews}) and every method on this class
 * work without the feature. To create a window that hosts a single webview, use
 * {@link WebviewWindow} instead, which is stable.
 *
 * @example
 * ```typescript
 * import { Window } from "@tauri-apps/api/window"
 * import { Webview } from "@tauri-apps/api/webview"
 *
 * const appWindow = new Window('uniqueLabel');
 *
 * appWindow.once('tauri://created', async function () {
 *   // `new Webview` Should be called after the window is successfully created,
 *   // or webview may not be attached to the window since window is not created yet.
 *
 *   // loading embedded asset:
 *   const webview = new Webview(appWindow, 'theUniqueLabel', {
 *     url: 'path/to/page.html',
 *
 *     // create a webview with specific logical position and size
 *     x: 0,
 *     y: 0,
 *     width: 800,
 *     height: 600,
 *   });
 *   // alternatively, load a remote URL:
 *   const webview = new Webview(appWindow, 'theUniqueLabel', {
 *     url: 'https://github.com/tauri-apps/tauri',
 *
 *     // create a webview with specific logical position and size
 *     x: 0,
 *     y: 0,
 *     width: 800,
 *     height: 600,
 *   });
 *
 *   webview.once('tauri://created', function () {
 *     // webview successfully created
 *   });
 *   webview.once('tauri://error', function (e) {
 *     // an error happened creating the webview
 *   });
 *
 *
 *   // emit an event to the backend
 *   await webview.emit("some-event", "data");
 *   // listen to an event from the backend
 *   const unlisten = await webview.listen("event-name", e => { });
 *   unlisten();
 * });
 * ```
 *
 * @since 2.0.0
 */
open external class Webview {
    /**
     * Creates a new Webview.
     * @example
     * ```typescript
     * import { Window } from '@tauri-apps/api/window'
     * import { Webview } from '@tauri-apps/api/webview'
     * const appWindow = new Window('my-label')
     *
     * appWindow.once('tauri://created', async function() {
     *   const webview = new Webview(appWindow, 'my-label', {
     *     url: 'https://github.com/tauri-apps/tauri',
     *
     *     // create a webview with specific logical position and size
     *     x: 0,
     *     y: 0,
     *     width: 800,
     *     height: 600,
     *   });
     *
     *   webview.once('tauri://created', function () {
     *     // webview successfully created
     *   });
     *   webview.once('tauri://error', function (e) {
     *     // an error happened creating the webview
     *   });
     * });
     * ```
     *
     * @param window the window to add this webview to.
     * @param label The unique webview label. Must be alphanumeric: `a-zA-Z-/:_`.
     * @param options The webview configuration, see {@link WebviewOptions}.
     * @returns The {@link Webview} instance to communicate with the webview.
     *
     * @remarks Requires the `unstable` Cargo feature on the `tauri` crate
     * (`tauri = { version = "2", features = ["unstable"] }`), otherwise the call
     * rejects with an "unstable feature not supported" error. It also requires the
     * `core:webview:allow-create-webview` permission, which is not included in
     * `core:webview:default`.
     */
    constructor (window: Window, label: WebviewLabel, options: WebviewOptions)

    /** The webview label. It is a unique identifier for the webview, can be used to reference it later. */
    open var label: WebviewLabel

    /** The window hosting this webview. */
    var window: Window

    /** Local event listeners. */
    open var listeners: js.objects.ReadonlyRecord<String, js.array.ReadonlyArray<EventCallback<Any?>>>

    /**
     * Listen to an emitted event on this webview.
     *
     * @example
     * ```typescript
     * import { getCurrentWebview } from '@tauri-apps/api/webview';
     * const unlisten = await getCurrentWebview().listen<string>('state-changed', (event) => {
     *   console.log(`Got error: ${payload}`);
     * });
     *
     * // call unlisten when your handler goes out of scope e.g. the component is unmounted
     * unlisten();
     * ```
     *
     * @param event Event name. Must include only alphanumeric characters, `-`, `/`, `:` and `_`.
     * @param handler Event handler.
     * @returns A promise resolving to a function to unlisten to the event.
     *
     * @remarks The listener is removed automatically when this webview is destroyed,
     * so you do not need to unlisten just because the webview is closing. Do call the
     * returned function when the listener's own scope ends, e.g. on page navigation
     * or when a component unmounts.
     */
    open fun <T> listen(
        event: EventName,
        handler: EventCallback<T>,
    ): js.promise.Promise<UnlistenFn>

    /**
     * Listen to an emitted event on this webview only once.
     *
     * @example
     * ```typescript
     * import { getCurrentWebview } from '@tauri-apps/api/webview';
     * const unlisten = await getCurrentWebview().once<null>('initialized', (event) => {
     *   console.log(`Webview initialized!`);
     * });
     *
     * // call unlisten when your handler goes out of scope e.g. the component is unmounted
     * unlisten();
     * ```
     *
     * @param event Event name. Must include only alphanumeric characters, `-`, `/`, `:` and `_`.
     * @param handler Event handler.
     * @returns A promise resolving to a function to unlisten to the event.
     *
     * @remarks The listener removes itself after the first event and is also removed
     * automatically when this webview is destroyed. Do call the returned function if
     * the listener's own scope ends before the event arrives.
     */
    open fun <T> once(
        event: EventName,
        handler: EventCallback<T>,
    ): js.promise.Promise<UnlistenFn>

    /**
     * Emits an event to all {@link EventTarget|targets}.
     *
     * @example
     * ```typescript
     * import { getCurrentWebview } from '@tauri-apps/api/webview';
     * await getCurrentWebview().emit('webview-loaded', { loggedIn: true, token: 'authToken' });
     * ```
     *
     * @param event Event name. Must include only alphanumeric characters, `-`, `/`, `:` and `_`.
     * @param payload Event payload.
     */
    fun <T> emit(
        event: String,
        payload: T = definedExternally,
    ): js.promise.Promise<js.void.Void>

    /**
     * Emits an event to all {@link EventTarget|targets} matching the given target.
     *
     * @example
     * ```typescript
     * import { getCurrentWebview } from '@tauri-apps/api/webview';
     * await getCurrentWebview().emitTo('main', 'webview-loaded', { loggedIn: true, token: 'authToken' });
     * ```
     *
     * @param target Label of the target Window/Webview/WebviewWindow or raw {@link EventTarget} object.
     * @param event Event name. Must include only alphanumeric characters, `-`, `/`, `:` and `_`.
     * @param payload Event payload.
     */
    fun <T> emitTo(
        target: String,
        event: String,
        payload: T = definedExternally,
    ): js.promise.Promise<js.void.Void>

    /**
     * Emits an event to all {@link EventTarget|targets} matching the given target.
     *
     * @example
     * ```typescript
     * import { getCurrentWebview } from '@tauri-apps/api/webview';
     * await getCurrentWebview().emitTo('main', 'webview-loaded', { loggedIn: true, token: 'authToken' });
     * ```
     *
     * @param target Label of the target Window/Webview/WebviewWindow or raw {@link EventTarget} object.
     * @param event Event name. Must include only alphanumeric characters, `-`, `/`, `:` and `_`.
     * @param payload Event payload.
     */
    fun <T> emitTo(
        target: EventTarget,
        event: String,
        payload: T = definedExternally,
    ): js.promise.Promise<js.void.Void>

    /** @ignore */
    fun <T> _handleTauriEvent(
        event: String,
        handler: EventCallback<T>,
    ): Boolean

    /**
     * The position of the top-left hand corner of the webview's client area relative to the top-left hand corner of the desktop.
     * @example
     * ```typescript
     * import { getCurrentWebview } from '@tauri-apps/api/webview';
     * const position = await getCurrentWebview().position();
     * ```
     *
     * @returns The webview's position, in physical pixels.
     *
     * @remarks Uses the `core:webview:allow-webview-position` permission, which is
     * part of `core:webview:default`.
     */
    fun position(): js.promise.Promise<PhysicalPosition>

    /**
     * The physical size of the webview's client area.
     * The client area is the content of the webview, excluding the title bar and borders.
     * @example
     * ```typescript
     * import { getCurrentWebview } from '@tauri-apps/api/webview';
     * const size = await getCurrentWebview().size();
     * ```
     *
     * @returns The webview's size, in physical pixels.
     *
     * @remarks Uses the `core:webview:allow-webview-size` permission, which is part
     * of `core:webview:default`.
     */
    fun size(): js.promise.Promise<PhysicalSize>

    /**
     * Closes the webview.
     * @example
     * ```typescript
     * import { getCurrentWebview } from '@tauri-apps/api/webview';
     * await getCurrentWebview().close();
     * ```
     *
     * @returns A promise indicating the success or failure of the operation.
     *
     * @remarks Requires the `core:webview:allow-webview-close` permission (not
     * included in `core:webview:default`).
     */
    fun close(): js.promise.Promise<js.void.Void>

    /**
     * Resizes the webview.
     * @example
     * ```typescript
     * import { getCurrentWebview } from '@tauri-apps/api/webview';
     * import { LogicalSize } from '@tauri-apps/api/dpi';
     * await getCurrentWebview().setSize(new LogicalSize(600, 500));
     * ```
     *
     * @param size The logical or physical size.
     * @returns A promise indicating the success or failure of the operation.
     *
     * @remarks Requires the `core:webview:allow-set-webview-size` permission (not
     * included in `core:webview:default`).
     */
    fun setSize(size: LogicalSize): js.promise.Promise<js.void.Void>

    /**
     * Resizes the webview.
     * @example
     * ```typescript
     * import { getCurrentWebview } from '@tauri-apps/api/webview';
     * import { LogicalSize } from '@tauri-apps/api/dpi';
     * await getCurrentWebview().setSize(new LogicalSize(600, 500));
     * ```
     *
     * @param size The logical or physical size.
     * @returns A promise indicating the success or failure of the operation.
     *
     * @remarks Requires the `core:webview:allow-set-webview-size` permission (not
     * included in `core:webview:default`).
     */
    fun setSize(size: PhysicalSize): js.promise.Promise<js.void.Void>

    /**
     * Resizes the webview.
     * @example
     * ```typescript
     * import { getCurrentWebview } from '@tauri-apps/api/webview';
     * import { LogicalSize } from '@tauri-apps/api/dpi';
     * await getCurrentWebview().setSize(new LogicalSize(600, 500));
     * ```
     *
     * @param size The logical or physical size.
     * @returns A promise indicating the success or failure of the operation.
     *
     * @remarks Requires the `core:webview:allow-set-webview-size` permission (not
     * included in `core:webview:default`).
     */
    fun setSize(size: Size): js.promise.Promise<js.void.Void>

    /**
     * Sets the webview position.
     * @example
     * ```typescript
     * import { getCurrentWebview } from '@tauri-apps/api/webview';
     * import { LogicalPosition } from '@tauri-apps/api/dpi';
     * await getCurrentWebview().setPosition(new LogicalPosition(600, 500));
     * ```
     *
     * @param position The new position, in logical or physical pixels, relative to
     * the top-left corner of the hosting window.
     * @returns A promise indicating the success or failure of the operation.
     *
     * @remarks Requires the `core:webview:allow-set-webview-position` permission (not
     * included in `core:webview:default`).
     */
    fun setPosition(position: LogicalPosition): js.promise.Promise<js.void.Void>

    /**
     * Sets the webview position.
     * @example
     * ```typescript
     * import { getCurrentWebview } from '@tauri-apps/api/webview';
     * import { LogicalPosition } from '@tauri-apps/api/dpi';
     * await getCurrentWebview().setPosition(new LogicalPosition(600, 500));
     * ```
     *
     * @param position The new position, in logical or physical pixels, relative to
     * the top-left corner of the hosting window.
     * @returns A promise indicating the success or failure of the operation.
     *
     * @remarks Requires the `core:webview:allow-set-webview-position` permission (not
     * included in `core:webview:default`).
     */
    fun setPosition(position: PhysicalPosition): js.promise.Promise<js.void.Void>

    /**
     * Sets the webview position.
     * @example
     * ```typescript
     * import { getCurrentWebview } from '@tauri-apps/api/webview';
     * import { LogicalPosition } from '@tauri-apps/api/dpi';
     * await getCurrentWebview().setPosition(new LogicalPosition(600, 500));
     * ```
     *
     * @param position The new position, in logical or physical pixels, relative to
     * the top-left corner of the hosting window.
     * @returns A promise indicating the success or failure of the operation.
     *
     * @remarks Requires the `core:webview:allow-set-webview-position` permission (not
     * included in `core:webview:default`).
     */
    fun setPosition(position: Position): js.promise.Promise<js.void.Void>

    /**
     * Bring the webview to front and focus.
     * @example
     * ```typescript
     * import { getCurrentWebview } from '@tauri-apps/api/webview';
     * await getCurrentWebview().setFocus();
     * ```
     *
     * @returns A promise indicating the success or failure of the operation.
     *
     * @remarks Requires the `core:webview:allow-set-webview-focus` permission (not
     * included in `core:webview:default`).
     */
    fun setFocus(): js.promise.Promise<js.void.Void>

    /**
     * Sets whether the webview should automatically grow and shrink its size and position when the parent window resizes.
     * @example
     * ```typescript
     * import { getCurrentWebview } from '@tauri-apps/api/webview';
     * await getCurrentWebview().setAutoResize(true);
     * ```
     *
     * @returns A promise indicating the success or failure of the operation.
     *
     * @remarks Requires the `core:webview:allow-set-webview-auto-resize` permission
     * (not included in `core:webview:default`).
     */
    fun setAutoResize(autoResize: Boolean): js.promise.Promise<js.void.Void>

    /**
     * Hide the webview.
     * @example
     * ```typescript
     * import { getCurrentWebview } from '@tauri-apps/api/webview';
     * await getCurrentWebview().hide();
     * ```
     *
     * @returns A promise indicating the success or failure of the operation.
     *
     * @remarks Requires the `core:webview:allow-webview-hide` permission (not
     * included in `core:webview:default`).
     */
    fun hide(): js.promise.Promise<js.void.Void>

    /**
     * Show the webview.
     * @example
     * ```typescript
     * import { getCurrentWebview } from '@tauri-apps/api/webview';
     * await getCurrentWebview().show();
     * ```
     *
     * @returns A promise indicating the success or failure of the operation.
     *
     * @remarks Requires the `core:webview:allow-webview-show` permission (not
     * included in `core:webview:default`).
     */
    fun show(): js.promise.Promise<js.void.Void>

    /**
     * Set webview zoom level.
     * @example
     * ```typescript
     * import { getCurrentWebview } from '@tauri-apps/api/webview';
     * await getCurrentWebview().setZoom(1.5);
     * ```
     *
     * @param scaleFactor The zoom level, where `1` is 100%.
     * @returns A promise indicating the success or failure of the operation.
     *
     * @remarks Requires the `core:webview:allow-set-webview-zoom` permission (not
     * included in `core:webview:default`).
     */
    fun setZoom(scaleFactor: Double): js.promise.Promise<js.void.Void>

    /**
     * Moves this webview to the window with the given label.
     * @example
     * ```typescript
     * import { getCurrentWebview } from '@tauri-apps/api/webview';
     * await getCurrentWebview().reparent('other-window');
     * ```
     *
     * @param window The target window, or its label.
     * @returns A promise indicating the success or failure of the operation.
     *
     * @remarks Requires the `core:webview:allow-reparent` permission (not included in
     * `core:webview:default`).
     */
    fun reparent(window: Window): js.promise.Promise<js.void.Void>

    /**
     * Moves this webview to the window with the given label.
     * @example
     * ```typescript
     * import { getCurrentWebview } from '@tauri-apps/api/webview';
     * await getCurrentWebview().reparent('other-window');
     * ```
     *
     * @param window The target window, or its label.
     * @returns A promise indicating the success or failure of the operation.
     *
     * @remarks Requires the `core:webview:allow-reparent` permission (not included in
     * `core:webview:default`).
     */
    fun reparent(window: WebviewWindow): js.promise.Promise<js.void.Void>

    /**
     * Moves this webview to the window with the given label.
     * @example
     * ```typescript
     * import { getCurrentWebview } from '@tauri-apps/api/webview';
     * await getCurrentWebview().reparent('other-window');
     * ```
     *
     * @param window The target window, or its label.
     * @returns A promise indicating the success or failure of the operation.
     *
     * @remarks Requires the `core:webview:allow-reparent` permission (not included in
     * `core:webview:default`).
     */
    fun reparent(window: String): js.promise.Promise<js.void.Void>

    /**
     * Clears all browsing data for this webview: cookies, localStorage, IndexedDB,
     * caches and any other data the webview stores for the loaded origins.
     * @example
     * ```typescript
     * import { getCurrentWebview } from '@tauri-apps/api/webview';
     * await getCurrentWebview().clearAllBrowsingData();
     * ```
     *
     * @returns A promise indicating the success or failure of the operation.
     *
     * @remarks Requires the `core:webview:allow-clear-all-browsing-data` permission
     * (not included in `core:webview:default`).
     */
    fun clearAllBrowsingData(): js.promise.Promise<js.void.Void>

    /**
     * Specify the webview background color.
     *
     * #### Platform-specific:
     *
     * - **macOS / iOS**: Not implemented.
     * - **Windows**:
     *   - On Windows 7, transparency is not supported and the alpha value will be ignored.
     *   - On Windows higher than 7: translucent colors are not supported so any alpha value other than `0` will be replaced by `255`
     *
     * @example
     * ```typescript
     * import { getCurrentWebview } from '@tauri-apps/api/webview';
     * await getCurrentWebview().setBackgroundColor('#2f2f2f');
     * // or with an RGBA tuple, or `null` to restore the default background
     * await getCurrentWebview().setBackgroundColor([47, 47, 47, 255]);
     * ```
     *
     * @param color The new background color, or `null` to reset it.
     * @returns A promise indicating the success or failure of the operation.
     *
     * @remarks Requires the `core:webview:allow-set-webview-background-color`
     * permission (not included in `core:webview:default`).
     *
     * @since 2.1.0
     */
    open fun setBackgroundColor(color: Color?): js.promise.Promise<js.void.Void>

    /**
     * Listen to a file drop event.
     * The listener is triggered when the user hovers the selected files on the webview,
     * drops the files or cancels the operation.
     *
     * @example
     * ```typescript
     * import { getCurrentWebview } from "@tauri-apps/api/webview";
     * const unlisten = await getCurrentWebview().onDragDropEvent((event) => {
     *  if (event.payload.type === 'over') {
     *    console.log('User hovering', event.payload.position);
     *  } else if (event.payload.type === 'drop') {
     *    console.log('User dropped', event.payload.paths);
     *  } else {
     *    console.log('File drop cancelled');
     *  }
     * });
     *
     * // call unlisten when your handler goes out of scope e.g. the component is unmounted
     * unlisten();
     * ```
     *
     * When the debugger panel is open, the drop position of this event may be inaccurate due to a known limitation.
     * To retrieve the correct drop position, please detach the debugger.
     *
     * @returns A promise resolving to a function to unlisten to the event.
     *
     * @remarks The listeners are removed automatically when this webview is
     * destroyed. Do call the returned function when the listener's own scope ends,
     * e.g. on page navigation or when a component unmounts.
     */
    fun onDragDropEvent(handler: EventCallback<DragDropEvent>): js.promise.Promise<UnlistenFn>

    companion object {
        /**
         * Gets the Webview for the webview associated with the given label.
         * @example
         * ```typescript
         * import { Webview } from '@tauri-apps/api/webview';
         * const mainWebview = Webview.getByLabel('main');
         * ```
         *
         * @param label The webview label.
         * @returns The Webview instance to communicate with the webview or null if the webview doesn't exist.
         */
        fun getByLabel(label: String): js.promise.Promise<Webview?>

        /**
         * Get an instance of `Webview` for the current webview.
         */
        fun getCurrent(): Webview

        /**
         * Gets a list of instances of `Webview` for all available webviews.
         */
        fun getAll(): js.promise.Promise<js.array.ReadonlyArray<Webview>>
    }
}
