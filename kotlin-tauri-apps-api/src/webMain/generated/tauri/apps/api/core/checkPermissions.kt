// Automatically generated - do not modify!

@file:JsModule("@tauri-apps/api/core")

package tauri.apps.api.core

/**
 * Get permission state for a plugin.
 *
 * This should be used by plugin authors to wrap their actual implementation,
 * it calls the `plugin:<name>|check_permissions` command implemented by the
 * mobile plugin and returns its permission status object without prompting
 * the user.
 *
 * @example
 * ```typescript
 * import { checkPermissions, type PermissionState } from '@tauri-apps/api/core';
 *
 * interface Permissions {
 *   camera: PermissionState
 * }
 *
 * const status = await checkPermissions<Permissions>('barcode-scanner');
 * if (status.camera === 'prompt') {
 *   // ask the user, see requestPermissions
 * }
 * ```
 *
 * @param plugin The plugin name, as used in the `plugin:<name>|<command>` IPC command format.
 *
 * @since 2.0.0
 */
external fun <T> checkPermissions(plugin: String): js.promise.Promise<T>
