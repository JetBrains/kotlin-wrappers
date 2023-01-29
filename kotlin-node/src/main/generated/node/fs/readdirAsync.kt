// Automatically generated - do not modify!

@file:JsModule("node:fs/promises")

package node.fs

import js.core.ReadonlyArray
import node.buffer.Buffer
import node.buffer.BufferEncoding
import kotlin.js.Promise

/**
 * Reads the contents of a directory.
 *
 * The optional `options` argument can be a string specifying an encoding, or an
 * object with an `encoding` property specifying the character encoding to use for
 * the filenames. If the `encoding` is set to `'buffer'`, the filenames returned
 * will be passed as `Buffer` objects.
 *
 * If `options.withFileTypes` is set to `true`, the resolved array will contain `fs.Dirent` objects.
 *
 * ```js
 * import { readdir } from 'fs/promises';
 *
 * try {
 *   const files = await readdir(path);
 *   for (const file of files)
 *     console.log(file);
 * } catch (err) {
 *   console.error(err);
 * }
 * ```
 * @since v10.0.0
 * @return Fulfills with an array of the names of the files in the directory excluding `'.'` and `'..'`.
 */
@JsName("readdir")
external fun readdirAsync(
    path: PathLike,
    options: BufferEncoding? /*         | (ObjectEncodingOptions & {
              withFileTypes?: false | undefined;
          })
        | BufferEncoding
        */ = definedExternally,
): Promise<ReadonlyArray<String>>


/**
 * Asynchronous readdir(3) - read a directory.
 * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
 * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
 */
@JsName("readdir")
external fun readdirAsync(
    path: PathLike,
    options: BufferEncodingOption,
    /*         | {
              encoding: 'buffer';
              withFileTypes?: false | undefined;
          }
        | 'buffer' */
): Promise<ReadonlyArray<Buffer>>


/**
 * Asynchronous readdir(3) - read a directory.
 * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
 * @param options If called with `withFileTypes: true` the result data will be an array of Dirent.
 */
@JsName("readdir")
external fun readdirAsync(
    path: PathLike,
    options: ObjectEncodingOptions,
    /* {
            withFileTypes: true;
        } */
): Promise<ReadonlyArray<Dirent>>
