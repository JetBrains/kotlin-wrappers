// Automatically generated - do not modify!

@file:JsModule("node:fs")

package node.fs

/**
 * Synchronously tests a user's permissions for the file or directory specified
 * by `path`. The `mode` argument is an optional integer that specifies the
 * accessibility checks to be performed. `mode` should be either the value`fs.constants.F_OK` or a mask consisting of the bitwise OR of any of`fs.constants.R_OK`, `fs.constants.W_OK`, and
 * `fs.constants.X_OK` (e.g.`fs.constants.W_OK | fs.constants.R_OK`). Check `File access constants` for
 * possible values of `mode`.
 *
 * If any of the accessibility checks fail, an `Error` will be thrown. Otherwise,
 * the method will return `undefined`.
 *
 * ```js
 * import { accessSync, constants } from 'fs';
 *
 * try {
 *   accessSync('etc/passwd', constants.R_OK | constants.W_OK);
 *   console.log('can read/write');
 * } catch (err) {
 *   console.error('no access!');
 * }
 * ```
 * @since v0.11.15
 * @param [mode=fs.constants.F_OK]
 */
external fun accessSync(
    path: PathLike,
    mode: Number = definedExternally,
)
