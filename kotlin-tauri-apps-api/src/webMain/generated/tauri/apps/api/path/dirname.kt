// Automatically generated - do not modify!

@file:JsModule("@tauri-apps/api/path")

package tauri.apps.api.path

/**
 * Returns the parent directory of a given `path`. Trailing directory separators are ignored.
 * @example
 * ```typescript
 * import { dirname } from '@tauri-apps/api/path';
 * const dir = await dirname('/path/to/somedir/');
 * assert(dir === '/path/to');
 * ```
 *
 * @since 1.0.0
 */
external fun dirname(path: String): js.promise.Promise<String>
