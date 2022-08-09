// Automatically generated - do not modify!

@file:JsModule("node:fs")
@file:JsNonModule

package node.fs

/**
 * Returns `true` if the path exists, `false` otherwise.
 *
 * For detailed information, see the documentation of the asynchronous version of
 * this API: {@link exists}.
 *
 * `fs.exists()` is deprecated, but `fs.existsSync()` is not. The `callback`parameter to `fs.exists()` accepts parameters that are inconsistent with other
 * Node.js callbacks. `fs.existsSync()` does not use a callback.
 *
 * ```js
 * import { existsSync } from 'fs';
 *
 * if (existsSync('/etc/passwd'))
 *   console.log('The path exists.');
 * ```
 * @since v0.1.21
 */
external fun existsSync(
    path: PathLike,
): Boolean
