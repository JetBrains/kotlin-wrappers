// Automatically generated - do not modify!

@file:JsModule("@tauri-apps/api/window")

package tauri.apps.api.window

import tauri.apps.api.dpi.*
import tauri.apps.api.event.EventCallback
import tauri.apps.api.event.EventName
import tauri.apps.api.event.EventTarget
import tauri.apps.api.event.UnlistenFn
import tauri.apps.api.image.JsImage
import tauri.apps.api.webview.DragDropEvent

/**
 * Create new window or get a handle to an existing one.
 *
 * Windows are identified by a *label*  a unique identifier that can be used to reference it later.
 * It may only contain alphanumeric characters `a-zA-Z` plus the following special characters `-`, `/`, `:` and `_`.
 *
 * @example
 * ```typescript
 * import { Window } from "@tauri-apps/api/window"
 *
 * const appWindow = new Window('theUniqueLabel');
 *
 * appWindow.once('tauri://created', function () {
 *  // window successfully created
 * });
 * appWindow.once('tauri://error', function (e) {
 *  // an error happened creating the window
 * });
 *
 * // emit an event to the backend
 * await appWindow.emit("some-event", "data");
 * // listen to an event from the backend
 * const unlisten = await appWindow.listen("event-name", e => {});
 * unlisten();
 * ```
 *
 * @since 2.0.0
 */
open external class Window {
    /**
     * Creates a new Window.
     * @example
     * ```typescript
     * import { Window } from '@tauri-apps/api/window';
     * const appWindow = new Window('my-label');
     * appWindow.once('tauri://created', function () {
     *  // window successfully created
     * });
     * appWindow.once('tauri://error', function (e) {
     *  // an error happened creating the window
     * });
     * ```
     *
     * @param label The unique window label. Must be alphanumeric: `a-zA-Z-/:_`.
     * @param options The window configuration, see {@link WindowOptions}.
     * @returns The {@link Window} instance to communicate with the window.
     *
     * @remarks Requires the `core:window:allow-create` permission (not included in
     * `core:window:default`).
     */
    constructor (label: WindowLabel, options: WindowOptions = definedExternally)

    /** The window label. It is a unique identifier for the window, can be used to reference it later. */
    open var label: WindowLabel

    /** Local event listeners. */
    open var listeners: js.objects.ReadonlyRecord<String, js.array.ReadonlyArray<EventCallback<Any?>>>

    /**
     * Listen to an emitted event on this window.
     *
     * @example
     * ```typescript
     * import { getCurrentWindow } from '@tauri-apps/api/window';
     * const unlisten = await getCurrentWindow().listen<string>('state-changed', (event) => {
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
     * @remarks The listener is removed automatically when this window is destroyed,
     * so you do not need to unlisten just because the window is closing. Do call the
     * returned function when the listener's own scope ends, e.g. on page navigation
     * or when a component unmounts.
     */
    open fun <T> listen(
        event: EventName,
        handler: EventCallback<T>,
    ): js.promise.Promise<UnlistenFn>

    /**
     * Listen to an emitted event on this window only once.
     *
     * @example
     * ```typescript
     * import { getCurrentWindow } from '@tauri-apps/api/window';
     * const unlisten = await getCurrentWindow().once<null>('initialized', (event) => {
     *   console.log(`Window initialized!`);
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
     * automatically when this window is destroyed. Do call the returned function if
     * the listener's own scope ends before the event arrives.
     */
    open fun <T> once(
        event: EventName,
        handler: EventCallback<T>,
    ): js.promise.Promise<UnlistenFn>

    /**
     * Emits an event to all {@link EventTarget|targets}.
     * @example
     * ```typescript
     * import { getCurrentWindow } from '@tauri-apps/api/window';
     * await getCurrentWindow().emit('window-loaded', { loggedIn: true, token: 'authToken' });
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
     * import { getCurrentWindow } from '@tauri-apps/api/window';
     * await getCurrentWindow().emitTo('main', 'window-loaded', { loggedIn: true, token: 'authToken' });
     * ```
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
     * import { getCurrentWindow } from '@tauri-apps/api/window';
     * await getCurrentWindow().emitTo('main', 'window-loaded', { loggedIn: true, token: 'authToken' });
     * ```
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
     * The scale factor that can be used to map physical pixels to logical pixels.
     * @example
     * ```typescript
     * import { getCurrentWindow } from '@tauri-apps/api/window';
     * const factor = await getCurrentWindow().scaleFactor();
     * ```
     *
     * @returns The window's monitor scale factor.
     */
    fun scaleFactor(): js.promise.Promise<Double>

    /**
     * The position of the top-left hand corner of the window's client area relative to the top-left hand corner of the desktop.
     * @example
     * ```typescript
     * import { getCurrentWindow } from '@tauri-apps/api/window';
     * const position = await getCurrentWindow().innerPosition();
     * ```
     *
     * @returns The window's inner position.
     */
    fun innerPosition(): js.promise.Promise<PhysicalPosition>

    /**
     * The position of the top-left hand corner of the window relative to the top-left hand corner of the desktop.
     * @example
     * ```typescript
     * import { getCurrentWindow } from '@tauri-apps/api/window';
     * const position = await getCurrentWindow().outerPosition();
     * ```
     *
     * @returns The window's outer position.
     */
    fun outerPosition(): js.promise.Promise<PhysicalPosition>

    /**
     * The physical size of the window's client area.
     * The client area is the content of the window, excluding the title bar and borders.
     * @example
     * ```typescript
     * import { getCurrentWindow } from '@tauri-apps/api/window';
     * const size = await getCurrentWindow().innerSize();
     * ```
     *
     * @returns The window's inner size.
     */
    fun innerSize(): js.promise.Promise<PhysicalSize>

    /**
     * The physical size of the entire window.
     * These dimensions include the title bar and borders. If you don't want that (and you usually don't), use inner_size instead.
     * @example
     * ```typescript
     * import { getCurrentWindow } from '@tauri-apps/api/window';
     * const size = await getCurrentWindow().outerSize();
     * ```
     *
     * @returns The window's outer size.
     */
    fun outerSize(): js.promise.Promise<PhysicalSize>

    /**
     * Gets the window's current fullscreen state.
     * @example
     * ```typescript
     * import { getCurrentWindow } from '@tauri-apps/api/window';
     * const fullscreen = await getCurrentWindow().isFullscreen();
     * ```
     *
     * @returns Whether the window is in fullscreen mode or not.
     */
    fun isFullscreen(): js.promise.Promise<Boolean>

    /**
     * Gets the window's current minimized state.
     * @example
     * ```typescript
     * import { getCurrentWindow } from '@tauri-apps/api/window';
     * const minimized = await getCurrentWindow().isMinimized();
     * ```
     */
    fun isMinimized(): js.promise.Promise<Boolean>

    /**
     * Gets the window's current maximized state.
     * @example
     * ```typescript
     * import { getCurrentWindow } from '@tauri-apps/api/window';
     * const maximized = await getCurrentWindow().isMaximized();
     * ```
     *
     * @returns Whether the window is maximized or not.
     */
    fun isMaximized(): js.promise.Promise<Boolean>

    /**
     * Gets the window's current focus state.
     * @example
     * ```typescript
     * import { getCurrentWindow } from '@tauri-apps/api/window';
     * const focused = await getCurrentWindow().isFocused();
     * ```
     *
     * @returns Whether the window is focused or not.
     */
    fun isFocused(): js.promise.Promise<Boolean>

    /**
     * Gets the window's current decorated state.
     * @example
     * ```typescript
     * import { getCurrentWindow } from '@tauri-apps/api/window';
     * const decorated = await getCurrentWindow().isDecorated();
     * ```
     *
     * @returns Whether the window is decorated or not.
     */
    fun isDecorated(): js.promise.Promise<Boolean>

    /**
     * Gets the window's current resizable state.
     * @example
     * ```typescript
     * import { getCurrentWindow } from '@tauri-apps/api/window';
     * const resizable = await getCurrentWindow().isResizable();
     * ```
     *
     * @returns Whether the window is resizable or not.
     */
    fun isResizable(): js.promise.Promise<Boolean>

    /**
     * Gets the window's native maximize button state.
     *
     * #### Platform-specific
     *
     * - **Linux / iOS / Android:** Unsupported.
     *
     * @example
     * ```typescript
     * import { getCurrentWindow } from '@tauri-apps/api/window';
     * const maximizable = await getCurrentWindow().isMaximizable();
     * ```
     *
     * @returns Whether the window's native maximize button is enabled or not.
     */
    fun isMaximizable(): js.promise.Promise<Boolean>

    /**
     * Gets the window's native minimize button state.
     *
     * #### Platform-specific
     *
     * - **Linux / iOS / Android:** Unsupported.
     *
     * @example
     * ```typescript
     * import { getCurrentWindow } from '@tauri-apps/api/window';
     * const minimizable = await getCurrentWindow().isMinimizable();
     * ```
     *
     * @returns Whether the window's native minimize button is enabled or not.
     */
    fun isMinimizable(): js.promise.Promise<Boolean>

    /**
     * Gets the window's native close button state.
     *
     * #### Platform-specific
     *
     * - **iOS / Android:** Unsupported.
     *
     * @example
     * ```typescript
     * import { getCurrentWindow } from '@tauri-apps/api/window';
     * const closable = await getCurrentWindow().isClosable();
     * ```
     *
     * @returns Whether the window's native close button is enabled or not.
     */
    fun isClosable(): js.promise.Promise<Boolean>

    /**
     * Gets the window's current visible state.
     * @example
     * ```typescript
     * import { getCurrentWindow } from '@tauri-apps/api/window';
     * const visible = await getCurrentWindow().isVisible();
     * ```
     *
     * @returns Whether the window is visible or not.
     */
    fun isVisible(): js.promise.Promise<Boolean>

    /**
     * Gets the window's current title.
     * @example
     * ```typescript
     * import { getCurrentWindow } from '@tauri-apps/api/window';
     * const title = await getCurrentWindow().title();
     * ```
     */
    fun title(): js.promise.Promise<String>

    /**
     * Gets the window's current theme.
     *
     * #### Platform-specific
     *
     * - **macOS:** Theme was introduced on macOS 10.14. Returns `light` on macOS 10.13 and below.
     *
     * @example
     * ```typescript
     * import { getCurrentWindow } from '@tauri-apps/api/window';
     * const theme = await getCurrentWindow().theme();
     * ```
     *
     * @returns The window theme.
     */
    fun theme(): js.promise.Promise<Theme?>

    /**
     * Whether the window is configured to be always on top of other windows or not.
     * @example
     * ```typescript
     * import { getCurrentWindow } from '@tauri-apps/api/window';
     * const alwaysOnTop = await getCurrentWindow().isAlwaysOnTop();
     * ```
     *
     * @returns Whether the window is visible or not.
     */
    fun isAlwaysOnTop(): js.promise.Promise<Boolean>

    /**
     * The name of the Android activity hosting this window.
     *
     * On Android each window is backed by its own activity. Use this to tell windows
     * apart from native code, or to match a window with the activity declared in your
     * `AndroidManifest.xml`.
     *
     * #### Platform-specific
     *
     * - **Android:** Supported.
     * - **Windows / Linux / macOS / iOS:** Unsupported, the call rejects because the
     *   command is not registered.
     *
     * See the [mobile multiwindow guide](https://tauri.app/learn/mobile-multiwindow/).
     *
     * @example
     * ```typescript
     * import { getCurrentWindow } from '@tauri-apps/api/window';
     * const activity = await getCurrentWindow().activityName();
     * ```
     *
     * @returns The activity name.
     *
     * @remarks Uses the `core:window:allow-activity-name` permission, which is part
     * of `core:window:default`.
     *
     * @since 2.11.0
     */
    fun activityName(): js.promise.Promise<String>

    /**
     * The identifier of the iOS scene hosting this window.
     *
     * On iOS each window is backed by a `UIScene`. Use this to tell windows apart
     * from native code, or to match a window with a scene configuration declared in
     * your `Info.plist`.
     *
     * #### Platform-specific
     *
     * - **iOS:** Supported.
     * - **Windows / Linux / macOS / Android:** Unsupported, the call rejects because
     *   the command is not registered.
     *
     * See the [mobile multiwindow guide](https://tauri.app/learn/mobile-multiwindow/).
     *
     * @example
     * ```typescript
     * import { getCurrentWindow } from '@tauri-apps/api/window';
     * const scene = await getCurrentWindow().sceneIdentifier();
     * ```
     *
     * @returns The scene identifier.
     *
     * @remarks Uses the `core:window:allow-scene-identifier` permission, which is part
     * of `core:window:default`.
     *
     * @since 2.11.0
     */
    fun sceneIdentifier(): js.promise.Promise<String>

    /**
     * Centers the window.
     * @example
     * ```typescript
     * import { getCurrentWindow } from '@tauri-apps/api/window';
     * await getCurrentWindow().center();
     * ```
     *
     * @returns A promise indicating the success or failure of the operation.
     *
     * @remarks Requires the `core:window:allow-center` permission (not included
     * in `core:window:default`).
     */
    fun center(): js.promise.Promise<js.void.Void>

    /**
     *  Requests user attention to the window, this has no effect if the application
     * is already focused. How requesting for user attention manifests is platform dependent,
     * see `UserAttentionType` for details.
     *
     * Providing `null` will unset the request for user attention. Unsetting the request for
     * user attention might not be done automatically by the WM when the window receives input.
     *
     * #### Platform-specific
     *
     * - **macOS:** `null` has no effect.
     * - **Linux:** Urgency levels have the same effect.
     * @example
     * ```typescript
     * import { getCurrentWindow } from '@tauri-apps/api/window';
     * await getCurrentWindow().requestUserAttention();
     * ```
     *
     * @returns A promise indicating the success or failure of the operation.
     *
     * @remarks Requires the `core:window:allow-request-user-attention` permission (not included
     * in `core:window:default`).
     */
    fun requestUserAttention(requestType: UserAttentionType?): js.promise.Promise<js.void.Void>

    /**
     * Updates the window resizable flag.
     * @example
     * ```typescript
     * import { getCurrentWindow } from '@tauri-apps/api/window';
     * await getCurrentWindow().setResizable(false);
     * ```
     *
     * @returns A promise indicating the success or failure of the operation.
     *
     * @remarks Requires the `core:window:allow-set-resizable` permission (not included
     * in `core:window:default`).
     */
    fun setResizable(resizable: Boolean): js.promise.Promise<js.void.Void>

    /**
     * Enable or disable the window.
     * @example
     * ```typescript
     * import { getCurrentWindow } from '@tauri-apps/api/window';
     * await getCurrentWindow().setEnabled(false);
     * ```
     *
     * @returns A promise indicating the success or failure of the operation.
     *
     * @remarks Requires the `core:window:allow-set-enabled` permission (not included
     * in `core:window:default`).
     *
     * @since 2.0.0
     */
    fun setEnabled(enabled: Boolean): js.promise.Promise<js.void.Void>

    /**
     * Whether the window is enabled or disabled.
     *
     * A disabled window ignores all user input; see {@link Window.setEnabled}.
     *
     * @example
     * ```typescript
     * import { getCurrentWindow } from '@tauri-apps/api/window';
     * const enabled = await getCurrentWindow().isEnabled();
     * ```
     *
     * @returns `true` when the window accepts user input, `false` when it is disabled.
     *
     * @since 2.0.0
     */
    fun isEnabled(): js.promise.Promise<Boolean>

    /**
     * Sets whether the window's native maximize button is enabled or not.
     * If resizable is set to false, this setting is ignored.
     *
     * #### Platform-specific
     *
     * - **macOS:** Disables the "zoom" button in the window titlebar, which is also used to enter fullscreen mode.
     * - **Linux / iOS / Android:** Unsupported.
     *
     * @example
     * ```typescript
     * import { getCurrentWindow } from '@tauri-apps/api/window';
     * await getCurrentWindow().setMaximizable(false);
     * ```
     *
     * @returns A promise indicating the success or failure of the operation.
     *
     * @remarks Requires the `core:window:allow-set-maximizable` permission (not included
     * in `core:window:default`).
     */
    fun setMaximizable(maximizable: Boolean): js.promise.Promise<js.void.Void>

    /**
     * Sets whether the window's native minimize button is enabled or not.
     *
     * #### Platform-specific
     *
     * - **Linux / iOS / Android:** Unsupported.
     *
     * @example
     * ```typescript
     * import { getCurrentWindow } from '@tauri-apps/api/window';
     * await getCurrentWindow().setMinimizable(false);
     * ```
     *
     * @returns A promise indicating the success or failure of the operation.
     *
     * @remarks Requires the `core:window:allow-set-minimizable` permission (not included
     * in `core:window:default`).
     */
    fun setMinimizable(minimizable: Boolean): js.promise.Promise<js.void.Void>

    /**
     * Sets whether the window's native close button is enabled or not.
     *
     * #### Platform-specific
     *
     * - **Linux:** GTK+ will do its best to convince the window manager not to show a close button. Depending on the system, this function may not have any effect when called on a window that is already visible
     * - **iOS / Android:** Unsupported.
     *
     * @example
     * ```typescript
     * import { getCurrentWindow } from '@tauri-apps/api/window';
     * await getCurrentWindow().setClosable(false);
     * ```
     *
     * @returns A promise indicating the success or failure of the operation.
     *
     * @remarks Requires the `core:window:allow-set-closable` permission (not included
     * in `core:window:default`).
     */
    fun setClosable(closable: Boolean): js.promise.Promise<js.void.Void>

    /**
     * Sets the window title.
     * @example
     * ```typescript
     * import { getCurrentWindow } from '@tauri-apps/api/window';
     * await getCurrentWindow().setTitle('Tauri');
     * ```
     *
     * @param title The new title
     * @returns A promise indicating the success or failure of the operation.
     *
     * @remarks Requires the `core:window:allow-set-title` permission (not included
     * in `core:window:default`).
     */
    fun setTitle(title: String): js.promise.Promise<js.void.Void>

    /**
     * Maximizes the window.
     * @example
     * ```typescript
     * import { getCurrentWindow } from '@tauri-apps/api/window';
     * await getCurrentWindow().maximize();
     * ```
     *
     * @returns A promise indicating the success or failure of the operation.
     *
     * @remarks Requires the `core:window:allow-maximize` permission (not included
     * in `core:window:default`).
     */
    fun maximize(): js.promise.Promise<js.void.Void>

    /**
     * Unmaximizes the window.
     * @example
     * ```typescript
     * import { getCurrentWindow } from '@tauri-apps/api/window';
     * await getCurrentWindow().unmaximize();
     * ```
     *
     * @returns A promise indicating the success or failure of the operation.
     *
     * @remarks Requires the `core:window:allow-unmaximize` permission (not included
     * in `core:window:default`).
     */
    fun unmaximize(): js.promise.Promise<js.void.Void>

    /**
     * Toggles the window maximized state.
     * @example
     * ```typescript
     * import { getCurrentWindow } from '@tauri-apps/api/window';
     * await getCurrentWindow().toggleMaximize();
     * ```
     *
     * @returns A promise indicating the success or failure of the operation.
     *
     * @remarks Requires the `core:window:allow-toggle-maximize` permission (not included
     * in `core:window:default`).
     */
    fun toggleMaximize(): js.promise.Promise<js.void.Void>

    /**
     * Minimizes the window.
     * @example
     * ```typescript
     * import { getCurrentWindow } from '@tauri-apps/api/window';
     * await getCurrentWindow().minimize();
     * ```
     *
     * @returns A promise indicating the success or failure of the operation.
     *
     * @remarks Requires the `core:window:allow-minimize` permission (not included
     * in `core:window:default`).
     */
    fun minimize(): js.promise.Promise<js.void.Void>

    /**
     * Unminimizes the window.
     * @example
     * ```typescript
     * import { getCurrentWindow } from '@tauri-apps/api/window';
     * await getCurrentWindow().unminimize();
     * ```
     *
     * @returns A promise indicating the success or failure of the operation.
     *
     * @remarks Requires the `core:window:allow-unminimize` permission (not included
     * in `core:window:default`).
     */
    fun unminimize(): js.promise.Promise<js.void.Void>

    /**
     * Sets the window visibility to true.
     * @example
     * ```typescript
     * import { getCurrentWindow } from '@tauri-apps/api/window';
     * await getCurrentWindow().show();
     * ```
     *
     * @returns A promise indicating the success or failure of the operation.
     *
     * @remarks Requires the `core:window:allow-show` permission (not included
     * in `core:window:default`).
     */
    fun show(): js.promise.Promise<js.void.Void>

    /**
     * Sets the window visibility to false.
     * @example
     * ```typescript
     * import { getCurrentWindow } from '@tauri-apps/api/window';
     * await getCurrentWindow().hide();
     * ```
     *
     * @returns A promise indicating the success or failure of the operation.
     *
     * @remarks Requires the `core:window:allow-hide` permission (not included
     * in `core:window:default`).
     */
    fun hide(): js.promise.Promise<js.void.Void>

    /**
     * Closes the window.
     *
     * Note this emits a closeRequested event so you can intercept it. To force window close, use {@link Window.destroy}.
     * @example
     * ```typescript
     * import { getCurrentWindow } from '@tauri-apps/api/window';
     * await getCurrentWindow().close();
     * ```
     *
     * @returns A promise indicating the success or failure of the operation.
     *
     * @remarks Requires the `core:window:allow-close` permission (not included
     * in `core:window:default`).
     */
    fun close(): js.promise.Promise<js.void.Void>

    /**
     * Destroys the window. Behaves like {@link Window.close} but forces the window close instead of emitting a closeRequested event.
     * @example
     * ```typescript
     * import { getCurrentWindow } from '@tauri-apps/api/window';
     * await getCurrentWindow().destroy();
     * ```
     *
     * @returns A promise indicating the success or failure of the operation.
     *
     * @remarks Requires the `core:window:allow-destroy` permission (not included
     * in `core:window:default`).
     */
    fun destroy(): js.promise.Promise<js.void.Void>

    /**
     * Whether the window should have borders and bars.
     * @example
     * ```typescript
     * import { getCurrentWindow } from '@tauri-apps/api/window';
     * await getCurrentWindow().setDecorations(false);
     * ```
     *
     * @param decorations Whether the window should have borders and bars.
     * @returns A promise indicating the success or failure of the operation.
     *
     * @remarks Requires the `core:window:allow-set-decorations` permission (not included
     * in `core:window:default`).
     */
    fun setDecorations(decorations: Boolean): js.promise.Promise<js.void.Void>

    /**
     * Whether or not the window should have shadow.
     *
     * #### Platform-specific
     *
     * - **Windows:**
     *   - `false` has no effect on decorated window, shadows are always ON.
     *   - `true` will make undecorated window have a 1px white border,
     * and on Windows 11, it will have a rounded corners.
     * - **Linux:** Unsupported.
     *
     * @example
     * ```typescript
     * import { getCurrentWindow } from '@tauri-apps/api/window';
     * await getCurrentWindow().setShadow(false);
     * ```
     *
     * @returns A promise indicating the success or failure of the operation.
     *
     * @remarks Requires the `core:window:allow-set-shadow` permission (not included
     * in `core:window:default`).
     */
    fun setShadow(enable: Boolean): js.promise.Promise<js.void.Void>

    /**
     * Applies platform-specific window effects such as Mica, Acrylic, Blur or the
     * macOS vibrancy materials.
     *
     * Requires the window to be transparent, so create it with `transparent: true`
     * (or set `transparent` in `tauri.conf.json`). Give the page a transparent or
     * translucent background as well, otherwise the effect is hidden behind your own
     * background color.
     *
     * Conflicting effects are resolved by applying the first supported one and
     * ignoring the rest, so you can list a Windows and a macOS effect together.
     *
     * #### Platform-specific
     *
     * - **Windows:** If the window uses decorations or shadows, you may need
     *   [this workaround](https://github.com/tauri-apps/tao/issues/72#issuecomment-975607891).
     * - **Linux:** Unsupported.
     *
     * @example
     * ```typescript
     * import { getCurrentWindow, Effect, EffectState } from '@tauri-apps/api/window';
     *
     * await getCurrentWindow().setEffects({
     *   effects: [Effect.Mica, Effect.Acrylic, Effect.UnderWindowBackground],
     *   state: EffectState.Active,
     *   radius: 8
     * });
     * ```
     *
     * @param effects The effects to apply, see {@link Effects}.
     * @returns A promise indicating the success or failure of the operation.
     *
     * @remarks Requires the `core:window:allow-set-effects` permission (not included
     * in `core:window:default`).
     *
     * @since 2.0.0
     */
    fun setEffects(effects: Effects): js.promise.Promise<js.void.Void>

    /**
     * Clear any applied effects if possible.
     *
     * @example
     * ```typescript
     * import { getCurrentWindow } from '@tauri-apps/api/window';
     * await getCurrentWindow().clearEffects();
     * ```
     *
     * @returns A promise indicating the success or failure of the operation.
     *
     * @remarks Requires the `core:window:allow-set-effects` permission (not included
     * in `core:window:default`), the same one used by {@link Window.setEffects}.
     *
     * @since 2.0.0
     */
    fun clearEffects(): js.promise.Promise<js.void.Void>

    /**
     * Whether the window should always be on top of other windows.
     * @example
     * ```typescript
     * import { getCurrentWindow } from '@tauri-apps/api/window';
     * await getCurrentWindow().setAlwaysOnTop(true);
     * ```
     *
     * @param alwaysOnTop Whether the window should always be on top of other windows or not.
     * @returns A promise indicating the success or failure of the operation.
     *
     * @remarks Requires the `core:window:allow-set-always-on-top` permission (not included
     * in `core:window:default`).
     */
    fun setAlwaysOnTop(alwaysOnTop: Boolean): js.promise.Promise<js.void.Void>

    /**
     * Whether the window should always be below other windows.
     * @example
     * ```typescript
     * import { getCurrentWindow } from '@tauri-apps/api/window';
     * await getCurrentWindow().setAlwaysOnBottom(true);
     * ```
     *
     * @param alwaysOnBottom Whether the window should always be below other windows or not.
     * @returns A promise indicating the success or failure of the operation.
     *
     * @remarks Requires the `core:window:allow-set-always-on-bottom` permission (not included
     * in `core:window:default`).
     */
    fun setAlwaysOnBottom(alwaysOnBottom: Boolean): js.promise.Promise<js.void.Void>

    /**
     * Prevents the window contents from being captured by other apps.
     * @example
     * ```typescript
     * import { getCurrentWindow } from '@tauri-apps/api/window';
     * await getCurrentWindow().setContentProtected(true);
     * ```
     *
     * @returns A promise indicating the success or failure of the operation.
     *
     * @remarks Requires the `core:window:allow-set-content-protected` permission (not included
     * in `core:window:default`).
     */
    fun setContentProtected(protected_: Boolean): js.promise.Promise<js.void.Void>

    /**
     * Resizes the window with a new inner size.
     * @example
     * ```typescript
     * import { getCurrentWindow, LogicalSize } from '@tauri-apps/api/window';
     * await getCurrentWindow().setSize(new LogicalSize(600, 500));
     * ```
     *
     * @param size The logical or physical inner size.
     * @returns A promise indicating the success or failure of the operation.
     *
     * @remarks Requires the `core:window:allow-set-size` permission (not included
     * in `core:window:default`).
     */
    fun setSize(size: LogicalSize): js.promise.Promise<js.void.Void>

    /**
     * Resizes the window with a new inner size.
     * @example
     * ```typescript
     * import { getCurrentWindow, LogicalSize } from '@tauri-apps/api/window';
     * await getCurrentWindow().setSize(new LogicalSize(600, 500));
     * ```
     *
     * @param size The logical or physical inner size.
     * @returns A promise indicating the success or failure of the operation.
     *
     * @remarks Requires the `core:window:allow-set-size` permission (not included
     * in `core:window:default`).
     */
    fun setSize(size: PhysicalSize): js.promise.Promise<js.void.Void>

    /**
     * Resizes the window with a new inner size.
     * @example
     * ```typescript
     * import { getCurrentWindow, LogicalSize } from '@tauri-apps/api/window';
     * await getCurrentWindow().setSize(new LogicalSize(600, 500));
     * ```
     *
     * @param size The logical or physical inner size.
     * @returns A promise indicating the success or failure of the operation.
     *
     * @remarks Requires the `core:window:allow-set-size` permission (not included
     * in `core:window:default`).
     */
    fun setSize(size: Size): js.promise.Promise<js.void.Void>

    /**
     * Sets the window minimum inner size. If the `size` argument is not provided, the constraint is unset.
     * @example
     * ```typescript
     * import { getCurrentWindow, PhysicalSize } from '@tauri-apps/api/window';
     * await getCurrentWindow().setMinSize(new PhysicalSize(600, 500));
     * ```
     *
     * @param size The logical or physical inner size, or `null` to unset the constraint.
     * @returns A promise indicating the success or failure of the operation.
     *
     * @remarks Requires the `core:window:allow-set-min-size` permission (not included
     * in `core:window:default`).
     */
    fun setMinSize(size: LogicalSize?): js.promise.Promise<js.void.Void>

    /**
     * Sets the window minimum inner size. If the `size` argument is not provided, the constraint is unset.
     * @example
     * ```typescript
     * import { getCurrentWindow, PhysicalSize } from '@tauri-apps/api/window';
     * await getCurrentWindow().setMinSize(new PhysicalSize(600, 500));
     * ```
     *
     * @param size The logical or physical inner size, or `null` to unset the constraint.
     * @returns A promise indicating the success or failure of the operation.
     *
     * @remarks Requires the `core:window:allow-set-min-size` permission (not included
     * in `core:window:default`).
     */
    fun setMinSize(size: PhysicalSize?): js.promise.Promise<js.void.Void>

    /**
     * Sets the window minimum inner size. If the `size` argument is not provided, the constraint is unset.
     * @example
     * ```typescript
     * import { getCurrentWindow, PhysicalSize } from '@tauri-apps/api/window';
     * await getCurrentWindow().setMinSize(new PhysicalSize(600, 500));
     * ```
     *
     * @param size The logical or physical inner size, or `null` to unset the constraint.
     * @returns A promise indicating the success or failure of the operation.
     *
     * @remarks Requires the `core:window:allow-set-min-size` permission (not included
     * in `core:window:default`).
     */
    fun setMinSize(size: Size?): js.promise.Promise<js.void.Void>

    /**
     * Sets the window maximum inner size. If the `size` argument is undefined, the constraint is unset.
     * @example
     * ```typescript
     * import { getCurrentWindow, LogicalSize } from '@tauri-apps/api/window';
     * await getCurrentWindow().setMaxSize(new LogicalSize(600, 500));
     * ```
     *
     * @param size The logical or physical inner size, or `null` to unset the constraint.
     * @returns A promise indicating the success or failure of the operation.
     *
     * @remarks Requires the `core:window:allow-set-max-size` permission (not included
     * in `core:window:default`).
     */
    fun setMaxSize(size: LogicalSize?): js.promise.Promise<js.void.Void>

    /**
     * Sets the window maximum inner size. If the `size` argument is undefined, the constraint is unset.
     * @example
     * ```typescript
     * import { getCurrentWindow, LogicalSize } from '@tauri-apps/api/window';
     * await getCurrentWindow().setMaxSize(new LogicalSize(600, 500));
     * ```
     *
     * @param size The logical or physical inner size, or `null` to unset the constraint.
     * @returns A promise indicating the success or failure of the operation.
     *
     * @remarks Requires the `core:window:allow-set-max-size` permission (not included
     * in `core:window:default`).
     */
    fun setMaxSize(size: PhysicalSize?): js.promise.Promise<js.void.Void>

    /**
     * Sets the window maximum inner size. If the `size` argument is undefined, the constraint is unset.
     * @example
     * ```typescript
     * import { getCurrentWindow, LogicalSize } from '@tauri-apps/api/window';
     * await getCurrentWindow().setMaxSize(new LogicalSize(600, 500));
     * ```
     *
     * @param size The logical or physical inner size, or `null` to unset the constraint.
     * @returns A promise indicating the success or failure of the operation.
     *
     * @remarks Requires the `core:window:allow-set-max-size` permission (not included
     * in `core:window:default`).
     */
    fun setMaxSize(size: Size?): js.promise.Promise<js.void.Void>

    /**
     * Sets the window inner size constraints.
     * @example
     * ```typescript
     * import { getCurrentWindow } from '@tauri-apps/api/window';
     * await getCurrentWindow().setSizeConstraints({ minWidth: 300 });
     * ```
     *
     * @param constraints The inner size constraints in **logical pixels**, or `null`
     * to unset every constraint. Each field is optional and independent, so
     * `{ minWidth: 300 }` constrains only the width.
     * @returns A promise indicating the success or failure of the operation.
     *
     * @remarks Requires the `core:window:allow-set-size-constraints` permission (not included
     * in `core:window:default`).
     */
    fun setSizeConstraints(constraints: WindowSizeConstraints?): js.promise.Promise<js.void.Void>

    /**
     * Sets the window outer position.
     * @example
     * ```typescript
     * import { getCurrentWindow, LogicalPosition } from '@tauri-apps/api/window';
     * await getCurrentWindow().setPosition(new LogicalPosition(600, 500));
     * ```
     *
     * @param position The new position, in logical or physical pixels.
     * @returns A promise indicating the success or failure of the operation.
     *
     * @remarks Requires the `core:window:allow-set-position` permission (not included
     * in `core:window:default`).
     */
    fun setPosition(position: LogicalPosition): js.promise.Promise<js.void.Void>

    /**
     * Sets the window outer position.
     * @example
     * ```typescript
     * import { getCurrentWindow, LogicalPosition } from '@tauri-apps/api/window';
     * await getCurrentWindow().setPosition(new LogicalPosition(600, 500));
     * ```
     *
     * @param position The new position, in logical or physical pixels.
     * @returns A promise indicating the success or failure of the operation.
     *
     * @remarks Requires the `core:window:allow-set-position` permission (not included
     * in `core:window:default`).
     */
    fun setPosition(position: PhysicalPosition): js.promise.Promise<js.void.Void>

    /**
     * Sets the window outer position.
     * @example
     * ```typescript
     * import { getCurrentWindow, LogicalPosition } from '@tauri-apps/api/window';
     * await getCurrentWindow().setPosition(new LogicalPosition(600, 500));
     * ```
     *
     * @param position The new position, in logical or physical pixels.
     * @returns A promise indicating the success or failure of the operation.
     *
     * @remarks Requires the `core:window:allow-set-position` permission (not included
     * in `core:window:default`).
     */
    fun setPosition(position: Position): js.promise.Promise<js.void.Void>

    /**
     * Sets the window fullscreen state.
     * @example
     * ```typescript
     * import { getCurrentWindow } from '@tauri-apps/api/window';
     * await getCurrentWindow().setFullscreen(true);
     * ```
     *
     * @param fullscreen Whether the window should go to fullscreen or not.
     * @returns A promise indicating the success or failure of the operation.
     *
     * @remarks Requires the `core:window:allow-set-fullscreen` permission (not included
     * in `core:window:default`).
     */
    fun setFullscreen(fullscreen: Boolean): js.promise.Promise<js.void.Void>

    /**
     * Sets the window as fullscreen on the monitor that contains the given physical position.
     *
     * Does nothing if no monitor contains the position.
     * @example
     * ```typescript
     * import { getCurrentWindow, availableMonitors } from '@tauri-apps/api/window';
     * const monitors = await availableMonitors();
     * if (monitors.length > 1) {
     *   await getCurrentWindow().setFullscreenOnMonitor(monitors[1].position);
     * }
     * ```
     *
     * @param position A physical position inside the target monitor, such as {@linkcode Monitor.position}.
     * @returns A promise indicating the success or failure of the operation.
     *
     * @remarks Requires the `core:window:allow-set-fullscreen-on-monitor` permission (not included
     * in `core:window:default`).
     *
     * @since 2.12.0
     */
    fun setFullscreenOnMonitor(position: PhysicalPosition): js.promise.Promise<js.void.Void>

    /**
     * On macOS, Toggles a fullscreen mode that doesn’t require a new macOS space. Returns a boolean indicating whether the transition was successful (this won't work if the window was already in the native fullscreen).
     * This is how fullscreen used to work on macOS in versions before Lion. And allows the user to have a fullscreen window without using another space or taking control over the entire monitor.
     *
     * On other platforms, this is the same as {@link Window.setFullscreen}.
     *
     * @example
     * ```typescript
     * import { getCurrentWindow } from '@tauri-apps/api/window';
     * await getCurrentWindow().setSimpleFullscreen(true);
     * ```
     *
     * @param fullscreen Whether the window should go to simple fullscreen or not.
     * @returns A promise indicating the success or failure of the operation.
     *
     * @remarks Requires the `core:window:allow-set-simple-fullscreen` permission (not included
     * in `core:window:default`).
     *
     * @since 2.8.0
     */
    fun setSimpleFullscreen(fullscreen: Boolean): js.promise.Promise<js.void.Void>

    /**
     * Bring the window to front and focus.
     * @example
     * ```typescript
     * import { getCurrentWindow } from '@tauri-apps/api/window';
     * await getCurrentWindow().setFocus();
     * ```
     *
     * @returns A promise indicating the success or failure of the operation.
     *
     * @remarks Requires the `core:window:allow-set-focus` permission (not included
     * in `core:window:default`).
     */
    fun setFocus(): js.promise.Promise<js.void.Void>

    /**
     * Sets whether the window can be focused.
     *
     * #### Platform-specific
     *
     * - **macOS**: If the window is already focused, it is not possible to unfocus it after calling `set_focusable(false)`.
     *   In this case, you might consider calling {@link Window.setFocus} but it will move the window to the back i.e. at the bottom in terms of z-order.
     *
     * @example
     * ```typescript
     * import { getCurrentWindow } from '@tauri-apps/api/window';
     * await getCurrentWindow().setFocusable(true);
     * ```
     *
     * @param focusable Whether the window can be focused.
     * @returns A promise indicating the success or failure of the operation.
     *
     * @remarks Requires the `core:window:allow-set-focusable` permission (not included
     * in `core:window:default`).
     */
    fun setFocusable(focusable: Boolean): js.promise.Promise<js.void.Void>

    /**
     * Sets the window icon.
     * @example
     * ```typescript
     * import { getCurrentWindow } from '@tauri-apps/api/window';
     * await getCurrentWindow().setIcon('/tauri/awesome.png');
     * ```
     *
     * Note that you may need the `image-ico` or `image-png` Cargo features to use this API.
     * To enable it, change your Cargo.toml file:
     * ```toml
     * [dependencies]
     * tauri = { version = "...", features = ["...", "image-png"] }
     * ```
     *
     * @param icon Icon bytes or path to the icon file.
     * @returns A promise indicating the success or failure of the operation.
     *
     * @remarks Requires the `core:window:allow-set-icon` permission (not included
     * in `core:window:default`).
     */
    fun setIcon(icon: JsImage): js.promise.Promise<js.void.Void>

    /**
     * Whether the window icon should be hidden from the taskbar or not.
     *
     * #### Platform-specific
     *
     * - **macOS:** Unsupported.
     * @example
     * ```typescript
     * import { getCurrentWindow } from '@tauri-apps/api/window';
     * await getCurrentWindow().setSkipTaskbar(true);
     * ```
     *
     * @param skip true to hide window icon, false to show it.
     * @returns A promise indicating the success or failure of the operation.
     *
     * @remarks Requires the `core:window:allow-set-skip-taskbar` permission (not included
     * in `core:window:default`).
     */
    fun setSkipTaskbar(skip: Boolean): js.promise.Promise<js.void.Void>

    /**
     * Grabs the cursor, preventing it from leaving the window.
     *
     * There's no guarantee that the cursor will be hidden. You should
     * hide it by yourself if you want so.
     *
     * #### Platform-specific
     *
     * - **Linux:** Unsupported.
     * - **macOS:** This locks the cursor in a fixed location, which looks visually awkward.
     * @example
     * ```typescript
     * import { getCurrentWindow } from '@tauri-apps/api/window';
     * await getCurrentWindow().setCursorGrab(true);
     * ```
     *
     * @param grab `true` to grab the cursor icon, `false` to release it.
     * @returns A promise indicating the success or failure of the operation.
     *
     * @remarks Requires the `core:window:allow-set-cursor-grab` permission (not included
     * in `core:window:default`).
     */
    fun setCursorGrab(grab: Boolean): js.promise.Promise<js.void.Void>

    /**
     * Modifies the cursor's visibility.
     *
     * #### Platform-specific
     *
     * - **Windows:** The cursor is only hidden within the confines of the window.
     * - **macOS:** The cursor is hidden as long as the window has input focus, even if the cursor is
     *   outside of the window.
     * @example
     * ```typescript
     * import { getCurrentWindow } from '@tauri-apps/api/window';
     * await getCurrentWindow().setCursorVisible(false);
     * ```
     *
     * @param visible If `false`, this will hide the cursor. If `true`, this will show the cursor.
     * @returns A promise indicating the success or failure of the operation.
     *
     * @remarks Requires the `core:window:allow-set-cursor-visible` permission (not included
     * in `core:window:default`).
     */
    fun setCursorVisible(visible: Boolean): js.promise.Promise<js.void.Void>

    /**
     * Modifies the cursor icon of the window.
     * @example
     * ```typescript
     * import { getCurrentWindow } from '@tauri-apps/api/window';
     * await getCurrentWindow().setCursorIcon('help');
     * ```
     *
     * @param icon The new cursor icon.
     * @returns A promise indicating the success or failure of the operation.
     *
     * @remarks Requires the `core:window:allow-set-cursor-icon` permission (not included
     * in `core:window:default`).
     */
    fun setCursorIcon(icon: CursorIcon): js.promise.Promise<js.void.Void>

    /**
     * Sets the window background color.
     *
     * #### Platform-specific:
     *
     * - **Windows:** alpha channel is ignored.
     * - **iOS / Android:** Unsupported.
     *
     * This sets the color of the window itself, which is what you see while the
     * webview is still loading or behind a transparent page. To also change the
     * webview background use {@link WebviewWindow.setBackgroundColor}.
     *
     * @example
     * ```typescript
     * import { getCurrentWindow } from '@tauri-apps/api/window';
     * await getCurrentWindow().setBackgroundColor('#2f2f2f');
     * // also accepts an RGB/RGBA tuple or an object
     * await getCurrentWindow().setBackgroundColor([47, 47, 47, 255]);
     * ```
     *
     * @param color The new background color, see {@link Color}.
     * @returns A promise indicating the success or failure of the operation.
     *
     * @remarks Requires the `core:window:allow-set-background-color` permission (not included
     * in `core:window:default`).
     *
     * @since 2.1.0
     */
    open fun setBackgroundColor(color: Color): js.promise.Promise<js.void.Void>

    /**
     * Changes the position of the cursor in window coordinates.
     * @example
     * ```typescript
     * import { getCurrentWindow, LogicalPosition } from '@tauri-apps/api/window';
     * await getCurrentWindow().setCursorPosition(new LogicalPosition(600, 300));
     * ```
     *
     * @param position The new cursor position.
     * @returns A promise indicating the success or failure of the operation.
     *
     * @remarks Requires the `core:window:allow-set-cursor-position` permission (not included
     * in `core:window:default`).
     */
    fun setCursorPosition(position: LogicalPosition): js.promise.Promise<js.void.Void>

    /**
     * Changes the position of the cursor in window coordinates.
     * @example
     * ```typescript
     * import { getCurrentWindow, LogicalPosition } from '@tauri-apps/api/window';
     * await getCurrentWindow().setCursorPosition(new LogicalPosition(600, 300));
     * ```
     *
     * @param position The new cursor position.
     * @returns A promise indicating the success or failure of the operation.
     *
     * @remarks Requires the `core:window:allow-set-cursor-position` permission (not included
     * in `core:window:default`).
     */
    fun setCursorPosition(position: PhysicalPosition): js.promise.Promise<js.void.Void>

    /**
     * Changes the position of the cursor in window coordinates.
     * @example
     * ```typescript
     * import { getCurrentWindow, LogicalPosition } from '@tauri-apps/api/window';
     * await getCurrentWindow().setCursorPosition(new LogicalPosition(600, 300));
     * ```
     *
     * @param position The new cursor position.
     * @returns A promise indicating the success or failure of the operation.
     *
     * @remarks Requires the `core:window:allow-set-cursor-position` permission (not included
     * in `core:window:default`).
     */
    fun setCursorPosition(position: Position): js.promise.Promise<js.void.Void>

    /**
     * Changes the cursor events behavior.
     *
     * @example
     * ```typescript
     * import { getCurrentWindow } from '@tauri-apps/api/window';
     * await getCurrentWindow().setIgnoreCursorEvents(true);
     * ```
     *
     * @param ignore `true` to ignore the cursor events; `false` to process them as usual.
     * @returns A promise indicating the success or failure of the operation.
     *
     * @remarks Requires the `core:window:allow-set-ignore-cursor-events` permission (not included
     * in `core:window:default`).
     */
    fun setIgnoreCursorEvents(ignore: Boolean): js.promise.Promise<js.void.Void>

    /**
     * Starts dragging the window.
     * @example
     * ```typescript
     * import { getCurrentWindow } from '@tauri-apps/api/window';
     * await getCurrentWindow().startDragging();
     * ```
     *
     * @return A promise indicating the success or failure of the operation.
     *
     * @remarks Requires the `core:window:allow-start-dragging` permission (not included
     * in `core:window:default`).
     */
    fun startDragging(): js.promise.Promise<js.void.Void>

    /**
     * Starts resize-dragging the window.
     * @example
     * ```typescript
     * import { getCurrentWindow } from '@tauri-apps/api/window';
     * await getCurrentWindow().startResizeDragging();
     * ```
     *
     * @return A promise indicating the success or failure of the operation.
     *
     * @remarks Requires the `core:window:allow-start-resize-dragging` permission (not included
     * in `core:window:default`).
     */
    fun startResizeDragging(direction: ResizeDirection): js.promise.Promise<js.void.Void>

    /**
     * Sets the badge count. It is app wide and not specific to this window.
     *
     * #### Platform-specific
     *
     * - **Windows**: Unsupported. Use {@linkcode Window.setOverlayIcon} instead.
     *
     * @example
     * ```typescript
     * import { getCurrentWindow } from '@tauri-apps/api/window';
     * await getCurrentWindow().setBadgeCount(5);
     * ```
     *
     * @param count The badge count. Use `undefined` to remove the badge.
     * @return A promise indicating the success or failure of the operation.
     *
     * @remarks Requires the `core:window:allow-set-badge-count` permission (not included
     * in `core:window:default`).
     */
    fun setBadgeCount(count: Double = definedExternally): js.promise.Promise<js.void.Void>

    /**
     * Sets the badge label shown on the app's dock icon. **macOS only**
     *
     * Unlike {@linkcode Window.setBadgeCount}, which takes a number, this shows
     * arbitrary short text. It is app-wide and not specific to this window.
     *
     * @example
     * ```typescript
     * import { getCurrentWindow } from '@tauri-apps/api/window';
     * await getCurrentWindow().setBadgeLabel("Hello");
     * ```
     *
     * @param label The badge label. Use `undefined` to remove the badge.
     * @return A promise indicating the success or failure of the operation.
     *
     * @remarks Requires the `core:window:allow-set-badge-label` permission (not included
     * in `core:window:default`).
     */
    fun setBadgeLabel(label: String = definedExternally): js.promise.Promise<js.void.Void>

    /**
     * Sets the overlay icon. **Windows only**
     * The overlay icon can be set for every window.
     *
     *
     * Note that you may need the `image-ico` or `image-png` Cargo features to use this API.
     * To enable it, change your Cargo.toml file:
     *
     * ```toml
     * [dependencies]
     * tauri = { version = "...", features = ["...", "image-png"] }
     * ```
     *
     * @example
     * ```typescript
     * import { getCurrentWindow } from '@tauri-apps/api/window';
     * await getCurrentWindow().setOverlayIcon("/tauri/awesome.png");
     * ```
     *
     * @param icon Icon bytes or path to the icon file. Use `undefined` to remove the overlay icon.
     * @return A promise indicating the success or failure of the operation.
     *
     * @remarks Requires the `core:window:allow-set-overlay-icon` permission (not included
     * in `core:window:default`).
     */
    fun setOverlayIcon(icon: JsImage = definedExternally): js.promise.Promise<js.void.Void>

    /**
     * Sets the taskbar progress state.
     *
     * #### Platform-specific
     *
     * - **Linux / macOS**: Progress bar is app-wide and not specific to this window.
     * - **Linux**: Only supported desktop environments with `libunity` (e.g. GNOME).
     *
     * @example
     * ```typescript
     * import { getCurrentWindow, ProgressBarStatus } from '@tauri-apps/api/window';
     * await getCurrentWindow().setProgressBar({
     *   status: ProgressBarStatus.Normal,
     *   progress: 50,
     * });
     * ```
     *
     * @return A promise indicating the success or failure of the operation.
     *
     * @remarks Requires the `core:window:allow-set-progress-bar` permission (not included
     * in `core:window:default`).
     */
    fun setProgressBar(state: ProgressBarState): js.promise.Promise<js.void.Void>

    /**
     * Sets whether the window should be visible on all workspaces or virtual desktops.
     *
     * #### Platform-specific
     *
     * - **Windows / iOS / Android:** Unsupported.
     *
     * @example
     * ```typescript
     * import { getCurrentWindow } from '@tauri-apps/api/window';
     * await getCurrentWindow().setVisibleOnAllWorkspaces(true);
     * ```
     *
     * @param visible Whether the window should follow the user across workspaces.
     * @returns A promise indicating the success or failure of the operation.
     *
     * @remarks Requires the `core:window:allow-set-visible-on-all-workspaces` permission (not included
     * in `core:window:default`).
     *
     * @since 2.0.0
     */
    fun setVisibleOnAllWorkspaces(visible: Boolean): js.promise.Promise<js.void.Void>

    /**
     * Sets the title bar style. **macOS only**.
     *
     * Use `transparent` or `overlay` to build a custom title bar: with `overlay` the
     * page extends under the title bar and only the traffic lights remain, so leave
     * room for them in your layout and pair it with {@link Window.startDragging} on a
     * draggable region.
     *
     * @example
     * ```typescript
     * import { getCurrentWindow } from '@tauri-apps/api/window';
     * await getCurrentWindow().setTitleBarStyle('overlay');
     * ```
     *
     * @param style The new title bar style, see {@link TitleBarStyle}.
     * @returns A promise indicating the success or failure of the operation.
     *
     * @remarks Requires the `core:window:allow-set-title-bar-style` permission (not included
     * in `core:window:default`).
     *
     * @since 2.0.0
     */
    fun setTitleBarStyle(style: TitleBarStyle): js.promise.Promise<js.void.Void>

    /**
     * Set window theme, pass in `null` or `undefined` to follow system theme
     *
     * #### Platform-specific
     *
     * - **Linux / macOS**: Theme is app-wide and not specific to this window.
     * - **iOS / Android:** Unsupported.
     *
     * Use {@link Window.theme} to read the effective theme and
     * {@link Window.onThemeChanged} to react to changes.
     *
     * @example
     * ```typescript
     * import { getCurrentWindow } from '@tauri-apps/api/window';
     * await getCurrentWindow().setTheme('dark');
     * // follow the system theme again
     * await getCurrentWindow().setTheme(null);
     * ```
     *
     * @param theme The theme to apply, or `null`/`undefined` to follow the system theme.
     * @returns A promise indicating the success or failure of the operation.
     *
     * @remarks Requires the `core:window:allow-set-theme` permission (not included
     * in `core:window:default`).
     *
     * @since 2.0.0
     */
    fun setTheme(theme: Theme? = definedExternally): js.promise.Promise<js.void.Void>

    /**
     * Listen to window resize.
     *
     * @example
     * ```typescript
     * import { getCurrentWindow } from "@tauri-apps/api/window";
     * const unlisten = await getCurrentWindow().onResized(({ payload: size }) => {
     *  console.log('Window resized', size);
     * });
     *
     * // call unlisten when your handler goes out of scope e.g. the component is unmounted
     * unlisten();
     * ```
     *
     * @returns A promise resolving to a function to unlisten to the event.
     *
     * @remarks The listener is removed automatically when this window is destroyed,
     * so you do not need to unlisten just because the window is closing. Do call the
     * returned function when the listener's own scope ends, e.g. on page navigation
     * or when a component unmounts.
     */
    fun onResized(handler: EventCallback<PhysicalSize>): js.promise.Promise<UnlistenFn>

    /**
     * Listen to window move.
     *
     * @example
     * ```typescript
     * import { getCurrentWindow } from "@tauri-apps/api/window";
     * const unlisten = await getCurrentWindow().onMoved(({ payload: position }) => {
     *  console.log('Window moved', position);
     * });
     *
     * // call unlisten when your handler goes out of scope e.g. the component is unmounted
     * unlisten();
     * ```
     *
     * @returns A promise resolving to a function to unlisten to the event.
     *
     * @remarks The listener is removed automatically when this window is destroyed,
     * so you do not need to unlisten just because the window is closing. Do call the
     * returned function when the listener's own scope ends, e.g. on page navigation
     * or when a component unmounts.
     */
    fun onMoved(handler: EventCallback<PhysicalPosition>): js.promise.Promise<UnlistenFn>

    /**
     * Listen to window close requested. Emitted when the user requests to closes the window.
     *
     * @example
     * ```typescript
     * import { getCurrentWindow } from "@tauri-apps/api/window";
     * // `confirm` comes from the dialog plugin, which you have to add separately:
     * // `pnpm tauri add dialog`
     * import { confirm } from '@tauri-apps/plugin-dialog';
     * const unlisten = await getCurrentWindow().onCloseRequested(async (event) => {
     *   const confirmed = await confirm('Are you sure?');
     *   if (!confirmed) {
     *     // user did not confirm closing the window; let's prevent it
     *     event.preventDefault();
     *   }
     * });
     *
     * // call unlisten when your handler goes out of scope e.g. the component is unmounted
     * unlisten();
     * ```
     *
     * @returns A promise resolving to a function to unlisten to the event.
     *
     * @remarks The listener is removed automatically when this window is destroyed,
     * so you do not need to unlisten just because the window is closing. Do call the
     * returned function when the listener's own scope ends, e.g. on page navigation
     * or when a component unmounts.
     */
    fun onCloseRequested(
        handler: (event: CloseRequestedEvent) -> Any, /* void | Promise<void> */
    ): js.promise.Promise<UnlistenFn>

    /**
     * Listen to a file drop event.
     * The listener is triggered when the user hovers the selected files on the webview,
     * drops the files or cancels the operation.
     *
     * @example
     * ```typescript
     * import { getCurrentWindow } from "@tauri-apps/api/window";
     * const unlisten = await getCurrentWindow().onDragDropEvent((event) => {
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
     * @returns A promise resolving to a function to unlisten to the event.
     *
     * @remarks The listener is removed automatically when this window is destroyed,
     * so you do not need to unlisten just because the window is closing. Do call the
     * returned function when the listener's own scope ends, e.g. on page navigation
     * or when a component unmounts.
     */
    fun onDragDropEvent(handler: EventCallback<DragDropEvent>): js.promise.Promise<UnlistenFn>

    /**
     * Listen to window focus change.
     *
     * @example
     * ```typescript
     * import { getCurrentWindow } from "@tauri-apps/api/window";
     * const unlisten = await getCurrentWindow().onFocusChanged(({ payload: focused }) => {
     *  console.log('Focus changed, window is focused? ' + focused);
     * });
     *
     * // call unlisten when your handler goes out of scope e.g. the component is unmounted
     * unlisten();
     * ```
     *
     * @returns A promise resolving to a function to unlisten to the event.
     *
     * @remarks The listener is removed automatically when this window is destroyed,
     * so you do not need to unlisten just because the window is closing. Do call the
     * returned function when the listener's own scope ends, e.g. on page navigation
     * or when a component unmounts.
     */
    fun onFocusChanged(handler: EventCallback<Boolean>): js.promise.Promise<UnlistenFn>

    /**
     * Listen to window scale change. Emitted when the window's scale factor has changed.
     * The following user actions can cause DPI changes:
     * - Changing the display's resolution.
     * - Changing the display's scale factor (e.g. in Control Panel on Windows).
     * - Moving the window to a display with a different scale factor.
     *
     * @example
     * ```typescript
     * import { getCurrentWindow } from "@tauri-apps/api/window";
     * const unlisten = await getCurrentWindow().onScaleChanged(({ payload }) => {
     *  console.log('Scale changed', payload.scaleFactor, payload.size);
     * });
     *
     * // call unlisten when your handler goes out of scope e.g. the component is unmounted
     * unlisten();
     * ```
     *
     * @returns A promise resolving to a function to unlisten to the event.
     *
     * @remarks The listener is removed automatically when this window is destroyed,
     * so you do not need to unlisten just because the window is closing. Do call the
     * returned function when the listener's own scope ends, e.g. on page navigation
     * or when a component unmounts.
     */
    fun onScaleChanged(handler: EventCallback<ScaleFactorChanged>): js.promise.Promise<UnlistenFn>

    /**
     * Listen to the system theme change.
     *
     * @example
     * ```typescript
     * import { getCurrentWindow } from "@tauri-apps/api/window";
     * const unlisten = await getCurrentWindow().onThemeChanged(({ payload: theme }) => {
     *  console.log('New theme: ' + theme);
     * });
     *
     * // call unlisten when your handler goes out of scope e.g. the component is unmounted
     * unlisten();
     * ```
     *
     * @returns A promise resolving to a function to unlisten to the event.
     *
     * @remarks The listener is removed automatically when this window is destroyed,
     * so you do not need to unlisten just because the window is closing. Do call the
     * returned function when the listener's own scope ends, e.g. on page navigation
     * or when a component unmounts.
     */
    fun onThemeChanged(handler: EventCallback<Theme>): js.promise.Promise<UnlistenFn>

    companion object {
        /**
         * Gets the Window associated with the given label.
         * @example
         * ```typescript
         * import { Window } from '@tauri-apps/api/window';
         * const mainWindow = Window.getByLabel('main');
         * ```
         *
         * @param label The window label.
         * @returns The Window instance to communicate with the window or null if the window doesn't exist.
         */
        fun getByLabel(label: String): js.promise.Promise<Window?>

        /**
         * Get an instance of `Window` for the current window.
         */
        fun getCurrent(): Window

        /**
         * Gets a list of instances of `Window` for all available windows.
         */
        fun getAll(): js.promise.Promise<js.array.ReadonlyArray<Window>>

        /**
         *  Gets the focused window.
         * @example
         * ```typescript
         * import { Window } from '@tauri-apps/api/window';
         * const focusedWindow = Window.getFocusedWindow();
         * ```
         *
         * @returns The Window instance or `undefined` if there is not any focused window.
         */
        fun getFocusedWindow(): js.promise.Promise<Window?>
    }
}
