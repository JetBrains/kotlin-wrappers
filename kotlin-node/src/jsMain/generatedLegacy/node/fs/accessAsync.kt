// Automatically generated - do not modify!

@file:JsModule("node:fs/promises")

package node.fs

import js.core.Void
import js.promise.Promise

/**
 * Tests a user's permissions for the file or directory specified by `path`.
 * The `mode` argument is an optional integer that specifies the accessibility
 * checks to be performed. `mode` should be either the value `fs.constants.F_OK`or a mask consisting of the bitwise OR of any of `fs.constants.R_OK`,`fs.constants.W_OK`, and `fs.constants.X_OK`
 * (e.g.`fs.constants.W_OK | fs.constants.R_OK`). Check `File access constants` for
 * possible values of `mode`.
 *
 * If the accessibility check is successful, the promise is resolved with no
 * value. If any of the accessibility checks fail, the promise is rejected
 * with an [Error](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Error) object. The following example checks if the file`/etc/passwd` can be read and
 * written by the current process.
 *
 * ```js
 * import { access } from 'fs/promises';
 * import { constants } from 'fs';
 *
 * try {
 *   await access('/etc/passwd', constants.R_OK | constants.W_OK);
 *   console.log('can access');
 * } catch {
 *   console.error('cannot access');
 * }
 * ```
 *
 * Using `fsPromises.access()` to check for the accessibility of a file before
 * calling `fsPromises.open()` is not recommended. Doing so introduces a race
 * condition, since other processes may change the file's state between the two
 * calls. Instead, user code should open/read/write the file directly and handle
 * the error raised if the file is not accessible.
 * @since v10.0.0
 * @param [mode=fs.constants.F_OK]
 * @return Fulfills with `undefined` upon success.
 */
@JsName("access")
external fun accessAsync(
    path: PathLike,
    mode: Number = definedExternally,
): Promise<Void>
