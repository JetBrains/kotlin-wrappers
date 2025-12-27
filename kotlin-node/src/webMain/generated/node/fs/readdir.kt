// Automatically generated - do not modify!

@file:JsModule("node:fs")

package node.fs

import node.buffer.NonSharedBuffer

/**
 * Reads the contents of a directory. The callback gets two arguments `(err, files)` where `files` is an array of the names of the files in the directory excluding `'.'` and `'..'`.
 *
 * See the POSIX [`readdir(3)`](http://man7.org/linux/man-pages/man3/readdir.3.html) documentation for more details.
 *
 * The optional `options` argument can be a string specifying an encoding, or an
 * object with an `encoding` property specifying the character encoding to use for
 * the filenames passed to the callback. If the `encoding` is set to `'buffer'`,
 * the filenames returned will be passed as `Buffer` objects.
 *
 * If `options.withFileTypes` is set to `true`, the `files` array will contain `fs.Dirent` objects.
 * @since v0.1.8
 */
external fun readdir(
    path: PathLike,
    options: (ReaddirStringOptions)?,
    callback: (err: node.ErrnoException?, files: js.array.ReadonlyArray<String>) -> Unit,
)

/**
 * Reads the contents of a directory. The callback gets two arguments `(err, files)` where `files` is an array of the names of the files in the directory excluding `'.'` and `'..'`.
 *
 * See the POSIX [`readdir(3)`](http://man7.org/linux/man-pages/man3/readdir.3.html) documentation for more details.
 *
 * The optional `options` argument can be a string specifying an encoding, or an
 * object with an `encoding` property specifying the character encoding to use for
 * the filenames passed to the callback. If the `encoding` is set to `'buffer'`,
 * the filenames returned will be passed as `Buffer` objects.
 *
 * If `options.withFileTypes` is set to `true`, the `files` array will contain `fs.Dirent` objects.
 * @since v0.1.8
 */
external fun readdir(
    path: PathLike,
    options: node.buffer.BufferEncoding?,
    callback: (err: node.ErrnoException?, files: js.array.ReadonlyArray<String>) -> Unit,
)

/**
 * Asynchronous readdir(3) - read a directory.
 * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
 * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
 */
external fun readdir(
    path: PathLike,
    options: ReaddirBufferOptions,
    callback: (err: node.ErrnoException?, files: js.array.ReadonlyArray<NonSharedBuffer>) -> Unit,
)

/**
 * Asynchronous readdir(3) - read a directory.
 * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
 * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
 */
external fun readdir(
    path: PathLike,
    options: String, /* "buffer" */
    callback: (err: node.ErrnoException?, files: js.array.ReadonlyArray<NonSharedBuffer>) -> Unit,
)

/**
 * Asynchronous readdir(3) - read a directory.
 * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
 * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
 */
external fun readdir(
    path: PathLike,
    options: (ReaddirOptions)?,
    callback: (err: node.ErrnoException?, files: Any /* string[] | NonSharedBuffer[] */) -> Unit,
)

/**
 * Asynchronous readdir(3) - read a directory.
 * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
 * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
 */
external fun readdir(
    path: PathLike,
    options: node.buffer.BufferEncoding?,
    callback: (err: node.ErrnoException?, files: Any /* string[] | NonSharedBuffer[] */) -> Unit,
)

/**
 * Asynchronous readdir(3) - read a directory.
 * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
 */
external fun readdir(
    path: PathLike,
    callback: (err: node.ErrnoException?, files: js.array.ReadonlyArray<String>) -> Unit,
)

/**
 * Asynchronous readdir(3) - read a directory.
 * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
 * @param options If called with `withFileTypes: true` the result data will be an array of Dirent.
 */
external fun readdir(
    path: PathLike,
    options: ReaddirWithFileTypesOptions,
    callback: (err: node.ErrnoException?, files: js.array.ReadonlyArray<Dirent<*>>) -> Unit,
)

/**
 * Asynchronous readdir(3) - read a directory.
 * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
 * @param options Must include `withFileTypes: true` and `encoding: 'buffer'`.
 */
external fun readdir(
    path: PathLike,
    options: ReaddirBufferWithFileTypesOptions,
    callback: (err: node.ErrnoException?, files: js.array.ReadonlyArray<Dirent<NonSharedBuffer>>) -> Unit,
)
