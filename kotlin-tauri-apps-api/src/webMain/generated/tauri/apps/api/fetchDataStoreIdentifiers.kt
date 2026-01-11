// Automatically generated - do not modify!

@file:JsModule("@tauri-apps/api")

package tauri.apps.api

// unhandled import: PluginListener from "./core"
// unhandled import: Image from "./image"
// unhandled import: Theme from "./window"

/**
 * Fetches the data store identifiers on macOS and iOS.
 *
 * See https://developer.apple.com/documentation/webkit/wkwebsitedatastore for more information.
 *
 * @example
 * ```typescript
 * import { fetchDataStoreIdentifiers } from '@tauri-apps/api/app';
 * const ids = await fetchDataStoreIdentifiers();
 * ```
 *
 * @since 2.4.0
 */
external fun fetchDataStoreIdentifiers(): js.promise.Promise<js.array.ReadonlyArray<DataStoreIdentifier>>
