// Automatically generated - do not modify!

@file:JsModule("@tauri-apps/api/path")

package tauri.apps.api.path

/**
 * Resolve the path to a resource file.
 * @example
 * ```typescript
 * import { resolveResource } from '@tauri-apps/api/path';
 * const resourcePath = await resolveResource('script.sh');
 * ```
 *
 * @param resourcePath The path to the resource.
 * Must follow the same syntax as defined in `tauri.conf.json > bundle > resources`, i.e. keeping subfolders and parent dir components (`../`).
 * @returns The full path to the resource.
 *
 * @since 1.0.0
 */
external fun resolveResource(resourcePath: String): js.promise.Promise<String>
