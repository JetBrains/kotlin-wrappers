// Automatically generated - do not modify!

@file:JsModule("node:fs")

package node.fs

import node.buffer.NonSharedBuffer

/**
 * Returns the contents of the `path`.
 *
 * For detailed information, see the documentation of the asynchronous version of
 * this API: {@link readFile}.
 *
 * If the `encoding` option is specified then this function returns a
 * string. Otherwise it returns a buffer.
 *
 * Similar to {@link readFile}, when the path is a directory, the behavior of `fs.readFileSync()` is platform-specific.
 *
 * ```js
 * import { readFileSync } from 'node:fs';
 *
 * // macOS, Linux, and Windows
 * readFileSync('<directory>');
 * // => [Error: EISDIR: illegal operation on a directory, read <directory>]
 *
 * //  FreeBSD
 * readFileSync('<directory>'); // => <data>
 * ```
 * @since v0.1.8
 * @param path filename or file descriptor
 */
external fun readFileSync(
    path: PathOrFileDescriptor,
    options: (ReadFileSyncBufferOptions)? = definedExternally,
): NonSharedBuffer

/**
 * Synchronously reads the entire contents of a file.
 * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
 * If a file descriptor is provided, the underlying file will _not_ be closed automatically.
 * @param options Either the encoding for the result, or an object that contains the encoding and an optional flag.
 * If a flag is not provided, it defaults to `'r'`.
 */
external fun readFileSync(
    path: PathOrFileDescriptor,
    options: ReadFileSyncStringOptions,
): String

/**
 * Synchronously reads the entire contents of a file.
 * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
 * If a file descriptor is provided, the underlying file will _not_ be closed automatically.
 * @param options Either the encoding for the result, or an object that contains the encoding and an optional flag.
 * If a flag is not provided, it defaults to `'r'`.
 */
external fun readFileSync(
    path: PathOrFileDescriptor,
    options: node.buffer.BufferEncoding,
): String

/**
 * Synchronously reads the entire contents of a file.
 * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
 * If a file descriptor is provided, the underlying file will _not_ be closed automatically.
 * @param options Either the encoding for the result, or an object that contains the encoding and an optional flag.
 * If a flag is not provided, it defaults to `'r'`.
 */
external fun readFileSync(path: PathOrFileDescriptor): Any // string | NonSharedBuffer

/**
 * Synchronously reads the entire contents of a file.
 * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
 * If a file descriptor is provided, the underlying file will _not_ be closed automatically.
 * @param options Either the encoding for the result, or an object that contains the encoding and an optional flag.
 * If a flag is not provided, it defaults to `'r'`.
 */
external fun readFileSync(
    path: PathOrFileDescriptor,
    options: (ReadFileSyncOptions)? = definedExternally,
): Any // string | NonSharedBuffer

/**
 * Synchronously reads the entire contents of a file.
 * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
 * If a file descriptor is provided, the underlying file will _not_ be closed automatically.
 * @param options Either the encoding for the result, or an object that contains the encoding and an optional flag.
 * If a flag is not provided, it defaults to `'r'`.
 */
external fun readFileSync(
    path: PathOrFileDescriptor,
    options: node.buffer.BufferEncoding? = definedExternally,
): Any // string | NonSharedBuffer
