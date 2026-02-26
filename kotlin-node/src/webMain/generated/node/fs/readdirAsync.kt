// Automatically generated - do not modify!

@file:JsModule("node:fs/promises")

package node.fs

import node.buffer.NonSharedBuffer

/**
 * Reads the contents of a directory.
 *
 * The optional `options` argument can be a string specifying an encoding, or an
 * object with an `encoding` property specifying the character encoding to use for
 * the filenames. If the `encoding` is set to `'buffer'`, the filenames returned
 * will be passed as `Buffer` objects.
 *
 * If `options.withFileTypes` is set to `true`, the returned array will contain `fs.Dirent` objects.
 *
 * ```js
 * import { readdir } from 'node:fs/promises';
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
external fun readdirAsync(path: PathLike): js.promise.Promise<js.array.ReadonlyArray<String>>

/**
 * Reads the contents of a directory.
 *
 * The optional `options` argument can be a string specifying an encoding, or an
 * object with an `encoding` property specifying the character encoding to use for
 * the filenames. If the `encoding` is set to `'buffer'`, the filenames returned
 * will be passed as `Buffer` objects.
 *
 * If `options.withFileTypes` is set to `true`, the returned array will contain `fs.Dirent` objects.
 *
 * ```js
 * import { readdir } from 'node:fs/promises';
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
    options: (ReaddirAsyncOptions)? = definedExternally,
): js.promise.Promise<js.array.ReadonlyArray<String>>

/**
 * Reads the contents of a directory.
 *
 * The optional `options` argument can be a string specifying an encoding, or an
 * object with an `encoding` property specifying the character encoding to use for
 * the filenames. If the `encoding` is set to `'buffer'`, the filenames returned
 * will be passed as `Buffer` objects.
 *
 * If `options.withFileTypes` is set to `true`, the returned array will contain `fs.Dirent` objects.
 *
 * ```js
 * import { readdir } from 'node:fs/promises';
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
    options: node.buffer.BufferEncoding? = definedExternally,
): js.promise.Promise<js.array.ReadonlyArray<String>>

/**
 * Asynchronous readdir(3) - read a directory.
 * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
 * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
 */
@JsName("readdir")
external fun readdirAsync(
    path: PathLike,
    options: ReaddirBufferAsyncOptions,
): js.promise.Promise<js.array.ReadonlyArray<NonSharedBuffer>>

/**
 * Asynchronous readdir(3) - read a directory.
 * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
 * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
 */
@JsName("readdir")
external fun readdirAsync(
    path: PathLike,
    options: String, // "buffer"
): js.promise.Promise<js.array.ReadonlyArray<NonSharedBuffer>>

/**
 * Asynchronous readdir(3) - read a directory.
 * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
 * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
 */

/**
 * Asynchronous readdir(3) - read a directory.
 * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
 * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
 */

/**
 * Asynchronous readdir(3) - read a directory.
 * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
 * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
 */

/**
 * Asynchronous readdir(3) - read a directory.
 * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
 * @param options If called with `withFileTypes: true` the result data will be an array of Dirent.
 */
@JsName("readdir")
external fun readdirAsync(
    path: PathLike,
    options: ReaddirWithFileTypesAsyncOptions,
): js.promise.Promise<js.array.ReadonlyArray<Dirent<*>>>

/**
 * Asynchronous readdir(3) - read a directory.
 * @param path A path to a directory. If a URL is provided, it must use the `file:` protocol.
 * @param options Must include `withFileTypes: true` and `encoding: 'buffer'`.
 */
@JsName("readdir")
external fun readdirAsync(
    path: PathLike,
    options: ReaddirBufferWithFileTypesAsyncOptions,
): js.promise.Promise<js.array.ReadonlyArray<Dirent<NonSharedBuffer>>>
