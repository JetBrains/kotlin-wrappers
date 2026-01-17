// Automatically generated - do not modify!

@file:JsModule("@tauri-apps/api")

package tauri.apps.api


/**
 * Removes the data store with the given identifier.
 *
 * Note that any webview using this data store should be closed before running this API.
 *
 * See https://developer.apple.com/documentation/webkit/wkwebsitedatastore for more information.
 *
 * @example
 * ```typescript
 * import { fetchDataStoreIdentifiers, removeDataStore } from '@tauri-apps/api/app';
 * for (const id of (await fetchDataStoreIdentifiers())) {
 *   await removeDataStore(id);
 * }
 * ```
 *
 * @since 2.4.0
 */
external fun removeDataStore(uuid: DataStoreIdentifier): js.promise.Promise<js.core.Void>
