// Automatically generated - do not modify!

@file:JsModule("@tauri-apps/api/core")

package tauri.apps.api.core

/**
 * Adds a listener to a plugin event.
 *
 * This is meant to be used by plugin authors to wrap the `register_listener`
 * command their mobile plugin implements; application code normally calls the
 * wrapper the plugin exposes instead of this function.
 *
 * @example
 * ```typescript
 * import { addPluginListener } from '@tauri-apps/api/core';
 *
 * interface ScanEvent {
 *   value: string
 * }
 *
 * const listener = await addPluginListener<ScanEvent>(
 *   'barcode-scanner',
 *   'scan',
 *   (payload) => console.log('scanned', payload.value)
 * );
 *
 * // stop listening when the scanner screen is closed
 * await listener.unregister();
 * ```
 *
 * @param plugin The plugin name, as used in the `plugin:<name>|<command>` IPC command format.
 * @param event The plugin event name.
 * @param cb The callback executed for each event payload.
 * @returns The listener object to stop listening to the events.
 *
 * @since 2.0.0
 */
external fun <T> addPluginListener(
    plugin: String,
    event: String,
    cb: (payload: T) -> Unit,
): js.promise.Promise<PluginListener>
