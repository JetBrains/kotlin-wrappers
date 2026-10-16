// Automatically generated - do not modify!

@file:JsModule("@tauri-apps/api/webviewWindow")

package tauri.apps.api.webviewwindow

import tauri.apps.api.event.EventCallback
import tauri.apps.api.event.EventName
import tauri.apps.api.event.UnlistenFn
import tauri.apps.api.webview.Webview
import tauri.apps.api.webview.WebviewLabel

open external class WebviewWindow :
    Webview {
    // TODO @js.mixin.JsMixin tauri.apps.api.Window {
    /**
     * Creates a new {@link Window} hosting a {@link Webview}.
     * @example
     * ```typescript
     * import { WebviewWindow } from '@tauri-apps/api/webviewWindow'
     * const webview = new WebviewWindow('my-label', {
     *   url: 'https://github.com/tauri-apps/tauri'
     * });
     * webview.once('tauri://created', function () {
     *  // webview successfully created
     * });
     * webview.once('tauri://error', function (e) {
     *  // an error happened creating the webview
     * });
     * ```
     *
     * @param label The unique webview label. Must be alphanumeric: `a-zA-Z-/:_`.
     * @param options The window and webview configuration, see {@link WindowOptions}
     * and {@link WebviewOptions}.
     * @returns The {@link WebviewWindow} instance to communicate with the window and webview.
     *
     * @remarks Requires the `core:webview:allow-create-webview-window` permission
     * (not included in `core:webview:default`).
     */
    constructor (label: WebviewLabel, options: WebviewWindowOptions = definedExternally)

    override var label: String

    /** Local event listeners. */
    override var listeners: js.objects.ReadonlyRecord<String, js.array.ReadonlyArray<EventCallback<Any?>>>

    /**
     * Listen to an emitted event on this webview window.
     *
     * @example
     * ```typescript
     * import { WebviewWindow } from '@tauri-apps/api/webviewWindow';
     * const unlisten = await WebviewWindow.getCurrent().listen<string>('state-changed', (event) => {
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
     * @remarks The listener is removed automatically when this webview window is
     * destroyed, so you do not need to unlisten just because the window is closing.
     * Do call the returned function when the listener's own scope ends, e.g. on page
     * navigation or when a component unmounts.
     */
    override fun <T> listen(
        event: EventName,
        handler: EventCallback<T>,
    ): js.promise.Promise<UnlistenFn>

    /**
     * Listen to an emitted event on this webview window only once.
     *
     * @example
     * ```typescript
     * import { WebviewWindow } from '@tauri-apps/api/webviewWindow';
     * const unlisten = await WebviewWindow.getCurrent().once<null>('initialized', (event) => {
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
     * automatically when this webview window is destroyed. Do call the returned
     * function if the listener's own scope ends before the event arrives.
     */
    override fun <T> once(
        event: EventName,
        handler: EventCallback<T>,
    ): js.promise.Promise<UnlistenFn>

    /**
     * Set the window and webview background color.
     *
     * #### Platform-specific:
     *
     * - **Android / iOS:** Unsupported for the window layer.
     * - **macOS / iOS**: Not implemented for the webview layer.
     * - **Windows**:
     *   - alpha channel is ignored for the window layer.
     *   - On Windows 7, alpha channel is ignored for the webview layer.
     *   - On Windows 8 and newer, if alpha channel is not `0`, it will be ignored.
     *
     * @example
     * ```typescript
     * import { getCurrentWebviewWindow } from '@tauri-apps/api/webviewWindow';
     * await getCurrentWebviewWindow().setBackgroundColor('#2f2f2f');
     * ```
     *
     * @param color The new background color.
     * @returns A promise indicating the success or failure of the operation.
     *
     * @remarks Requires both the `core:window:allow-set-background-color` and
     * `core:webview:allow-set-webview-background-color` permissions, neither of which
     * is included in the respective default permission set.
     *
     * @since 2.1.0
     */
    // TODO open override fun setBackgroundColor(color: Color): js.promise.Promise<js.void.Void>

    companion object {
        /**
         * Gets the Webview for the webview associated with the given label.
         * @example
         * ```typescript
         * import { WebviewWindow } from '@tauri-apps/api/webviewWindow';
         * const mainWebview = WebviewWindow.getByLabel('main');
         * ```
         *
         * @param label The webview label.
         * @returns The Webview instance to communicate with the webview or null if the webview doesn't exist.
         */
        fun getByLabel(label: String): js.promise.Promise<WebviewWindow?>

        /**
         * Get an instance of `Webview` for the current webview.
         */
        fun getCurrent(): WebviewWindow

        /**
         * Gets a list of instances of `Webview` for all available webviews.
         */
        fun getAll(): js.promise.Promise<js.array.ReadonlyArray<WebviewWindow>>
    }
}
