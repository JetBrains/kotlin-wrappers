// Automatically generated - do not modify!

@file:JsModule("@tauri-apps/api")

package tauri.apps.api

/**
 * Returns the extension of the `path`.
 * @example
 * ```typescript
 * import { extname } from '@tauri-apps/api/path';
 * const ext = await extname('/path/to/file.html');
 * assert(ext === 'html');
 * ```
 *
 * @since 1.0.0
 */
external fun extname(path: String): js.promise.Promise<String>
