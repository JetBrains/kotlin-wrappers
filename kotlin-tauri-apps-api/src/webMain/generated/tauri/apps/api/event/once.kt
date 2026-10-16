// Automatically generated - do not modify!

@file:JsModule("@tauri-apps/api/event")

package tauri.apps.api.event

/**
 * Listens once to an emitted event to any {@link EventTarget|target}.
 *
 * @example
 * ```typescript
 * import { once } from '@tauri-apps/api/event';
 * interface LoadedPayload {
 *   loggedIn: boolean,
 *   token: string
 * }
 * const unlisten = await once<LoadedPayload>('loaded', (event) => {
 *   console.log(`App is loaded, loggedIn: ${event.payload.loggedIn}, token: ${event.payload.token}`);
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
 * @remarks The listener removes itself after the first event, and listeners bound
 * to a window or webview are also removed automatically when that target is
 * destroyed. Still call the returned function when the listener's own scope ends
 * before the event arrives — for example on page navigation or component unmount.
 *
 * @since 1.0.0
 */
external fun <T> once(
    event: EventName,
    handler: EventCallback<T>,
    options: Options = definedExternally,
): js.promise.Promise<UnlistenFn>
