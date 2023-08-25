// Automatically generated - do not modify!

@file:JsModule("node:fs/promises")

package node.fs

import js.core.Void
import js.promise.Promise

/**
 * Asynchronously copies `src` to `dest`. By default, `dest` is overwritten if it
 * already exists.
 *
 * No guarantees are made about the atomicity of the copy operation. If an
 * error occurs after the destination file has been opened for writing, an attempt
 * will be made to remove the destination.
 *
 * ```js
 * import { constants } from 'fs';
 * import { copyFile } from 'fs/promises';
 *
 * try {
 *   await copyFile('source.txt', 'destination.txt');
 *   console.log('source.txt was copied to destination.txt');
 * } catch {
 *   console.log('The file could not be copied');
 * }
 *
 * // By using COPYFILE_EXCL, the operation will fail if destination.txt exists.
 * try {
 *   await copyFile('source.txt', 'destination.txt', constants.COPYFILE_EXCL);
 *   console.log('source.txt was copied to destination.txt');
 * } catch {
 *   console.log('The file could not be copied');
 * }
 * ```
 * @since v10.0.0
 * @param src source filename to copy
 * @param dest destination filename of the copy operation
 * @param [mode=0] Optional modifiers that specify the behavior of the copy operation. It is possible to create a mask consisting of the bitwise OR of two or more values (e.g.
 * `fs.constants.COPYFILE_EXCL | fs.constants.COPYFILE_FICLONE`)
 * @return Fulfills with `undefined` upon success.
 */
@JsName("copyFile")
external fun copyFileAsync(
    src: PathLike,
    dest: PathLike,
    mode: Number = definedExternally,
): Promise<Void>
