// Automatically generated - do not modify!

@file:JsModule("node:fs")
@file:JsNonModule

package node.fs

/**
 * Synchronously copies `src` to `dest`. By default, `dest` is overwritten if it
 * already exists. Returns `undefined`. Node.js makes no guarantees about the
 * atomicity of the copy operation. If an error occurs after the destination file
 * has been opened for writing, Node.js will attempt to remove the destination.
 *
 * `mode` is an optional integer that specifies the behavior
 * of the copy operation. It is possible to create a mask consisting of the bitwise
 * OR of two or more values (e.g.`fs.constants.COPYFILE_EXCL | fs.constants.COPYFILE_FICLONE`).
 *
 * * `fs.constants.COPYFILE_EXCL`: The copy operation will fail if `dest` already
 * exists.
 * * `fs.constants.COPYFILE_FICLONE`: The copy operation will attempt to create a
 * copy-on-write reflink. If the platform does not support copy-on-write, then a
 * fallback copy mechanism is used.
 * * `fs.constants.COPYFILE_FICLONE_FORCE`: The copy operation will attempt to
 * create a copy-on-write reflink. If the platform does not support
 * copy-on-write, then the operation will fail.
 *
 * ```js
 * import { copyFileSync, constants } from 'fs';
 *
 * // destination.txt will be created or overwritten by default.
 * copyFileSync('source.txt', 'destination.txt');
 * console.log('source.txt was copied to destination.txt');
 *
 * // By using COPYFILE_EXCL, the operation will fail if destination.txt exists.
 * copyFileSync('source.txt', 'destination.txt', constants.COPYFILE_EXCL);
 * ```
 * @since v8.5.0
 * @param src source filename to copy
 * @param dest destination filename of the copy operation
 * @param [mode=0] modifiers for copy operation.
 */
external fun copyFileSync(
    src: PathLike,
    dest: PathLike,
    mode: Number = definedExternally,
)
