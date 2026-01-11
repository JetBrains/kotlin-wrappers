// Automatically generated - do not modify!

@file:JsModule("@tauri-apps/api")

package tauri.apps.api

/**
 * Emits an event to all {@link EventTarget|targets}.
 *
 * @example
 * ```typescript
 * import { emit } from '@tauri-apps/api/event';
 * await emit('frontend-loaded', { loggedIn: true, token: 'authToken' });
 * ```
 *
 * @param event Event name. Must include only alphanumeric characters, `-`, `/`, `:` and `_`.
 * @param payload Event payload.
 *
 * @since 1.0.0
 */
external fun <T> emit(
    event: String,
    payload: T = definedExternally,
): js.promise.Promise<js.core.Void>
