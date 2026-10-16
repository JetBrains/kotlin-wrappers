// Automatically generated - do not modify!

@file:JsModule("@tauri-apps/api/event")

package tauri.apps.api.event

/**
 * Listen to an emitted event to any {@link EventTarget|target}.
 *
 * @example
 * ```typescript
 * import { listen } from '@tauri-apps/api/event';
 * const unlisten = await listen<string>('error', (event) => {
 *   console.log(`Got error, payload: ${event.payload}`);
 * });
 *
 * // call unlisten when your handler goes out of scope e.g. the component is unmounted
 * unlisten();
 * ```
 *
 * @param event Event name. Must include only alphanumeric characters, `-`, `/`, `:` and `_`.
 * @param handler Event handler callback.
 * @param options Event listening options.
 * @returns A promise resolving to a function to unlisten to the event.
 *
 * @remarks Listeners bound to a window or webview are removed automatically when
 * that window or webview is destroyed, so you do not need to unlisten just to
 * avoid leaking across a window close. You should still call the returned
 * function when the listener's own scope ends — for example on page navigation
 * or when a component unmounts — otherwise the handler keeps running for the
 * lifetime of the webview.
 *
 * @since 1.0.0
 */
external fun <T> listen(
    event: EventName,
    handler: EventCallback<T>,
    options: Options = definedExternally,
): js.promise.Promise<UnlistenFn>
