// Automatically generated - do not modify!

@file:JsModule("@tauri-apps/api/core")

package tauri.apps.api.core

/**
 * Request permissions.
 *
 * This should be used by plugin authors to wrap their actual implementation,
 * it calls the `plugin:<name>|request_permissions` command implemented by the
 * mobile plugin, which shows the native permission prompt when needed, and
 * returns the resulting permission status object.
 *
 * @example
 * ```typescript
 * import { requestPermissions, type PermissionState } from '@tauri-apps/api/core';
 *
 * interface Permissions {
 *   camera: PermissionState
 * }
 *
 * const status = await requestPermissions<Permissions>('barcode-scanner');
 * if (status.camera !== 'granted') {
 *   throw new Error('camera permission denied');
 * }
 * ```
 *
 * @param plugin The plugin name, as used in the `plugin:<name>|<command>` IPC command format.
 *
 * @since 2.0.0
 */
external fun <T> requestPermissions(plugin: String): js.promise.Promise<T>
