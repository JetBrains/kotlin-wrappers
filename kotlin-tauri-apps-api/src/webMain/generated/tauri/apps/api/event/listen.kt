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
 * // you need to call unlisten if your handler goes out of scope e.g. the component is unmounted
 * unlisten();
 * ```
 *
 * @param event Event name. Must include only alphanumeric characters, `-`, `/`, `:` and `_`.
 * @param handler Event handler callback.
 * @param options Event listening options.
 * @returns A promise resolving to a function to unlisten to the event.
 * Note that removing the listener is required if your listener goes out of scope e.g. the component is unmounted.
 *
 * @since 1.0.0
 */
external fun <T> listen(
    event: EventName,
    handler: EventCallback<T>,
    options: Options = definedExternally,
): js.promise.Promise<UnlistenFn>
