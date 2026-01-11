// Automatically generated - do not modify!

@file:JsModule("@tauri-apps/api")

package tauri.apps.api

/**
 * Returns the last portion of a `path`. Trailing directory separators are ignored.
 * @example
 * ```typescript
 * import { basename } from '@tauri-apps/api/path';
 * const base = await basename('path/to/app.conf');
 * assert(base === 'app.conf');
 * ```
 * @param ext An optional file extension to be removed from the returned path.
 *
 * @since 1.0.0
 */
external fun basename(
    path: String,
    ext: String = definedExternally,
): js.promise.Promise<String>
