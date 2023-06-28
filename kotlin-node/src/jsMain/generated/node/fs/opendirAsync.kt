// Automatically generated - do not modify!

@file:JsModule("node:fs/promises")

package node.fs

import js.promise.Promise

/**
 * Asynchronously open a directory for iterative scanning. See the POSIX [`opendir(3)`](http://man7.org/linux/man-pages/man3/opendir.3.html) documentation for more detail.
 *
 * Creates an `fs.Dir`, which contains all further functions for reading from
 * and cleaning up the directory.
 *
 * The `encoding` option sets the encoding for the `path` while opening the
 * directory and subsequent read operations.
 *
 * Example using async iteration:
 *
 * ```js
 * import { opendir } from 'fs/promises';
 *
 * try {
 *   const dir = await opendir('./');
 *   for await (const dirent of dir)
 *     console.log(dirent.name);
 * } catch (err) {
 *   console.error(err);
 * }
 * ```
 *
 * When using the async iterator, the `fs.Dir` object will be automatically
 * closed after the iterator exits.
 * @since v12.12.0
 * @return Fulfills with an {fs.Dir}.
 */
@JsName("opendir")
external fun opendirAsync(
    path: PathLike,
    options: OpenDirOptions = definedExternally,
): Promise<Dir>
