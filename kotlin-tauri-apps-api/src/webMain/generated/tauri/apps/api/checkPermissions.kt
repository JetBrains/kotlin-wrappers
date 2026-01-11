// Automatically generated - do not modify!

@file:JsModule("@tauri-apps/api")

package tauri.apps.api

/**
 * Get permission state for a plugin.
 *
 * This should be used by plugin authors to wrap their actual implementation.
 */
external fun <T> checkPermissions(plugin: String): js.promise.Promise<T>
