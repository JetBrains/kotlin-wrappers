// Generated by Karakum - do not modify it manually!

package node.fs


suspend fun realpath(path: PathLike): String =
    realpathAsync(
        path
    ).await()


/**
 * Determines the actual location of `path` using the same semantics as the`fs.realpath.native()` function.
 *
 * Only paths that can be converted to UTF8 strings are supported.
 *
 * The optional `options` argument can be a string specifying an encoding, or an
 * object with an `encoding` property specifying the character encoding to use for
 * the path. If the `encoding` is set to `'buffer'`, the path returned will be
 * passed as a `Buffer` object.
 *
 * On Linux, when Node.js is linked against musl libc, the procfs file system must
 * be mounted on `/proc` in order for this function to work. Glibc does not have
 * this restriction.
 * @since v10.0.0
 * @return Fulfills with the resolved path upon success.
 */

suspend fun realpath(path: PathLike, options: ObjectEncodingOptions? = undefined.unsafeCast<Nothing>()): String =
    realpathAsync(
        path, options
    ).await()


/**
 * Determines the actual location of `path` using the same semantics as the`fs.realpath.native()` function.
 *
 * Only paths that can be converted to UTF8 strings are supported.
 *
 * The optional `options` argument can be a string specifying an encoding, or an
 * object with an `encoding` property specifying the character encoding to use for
 * the path. If the `encoding` is set to `'buffer'`, the path returned will be
 * passed as a `Buffer` object.
 *
 * On Linux, when Node.js is linked against musl libc, the procfs file system must
 * be mounted on `/proc` in order for this function to work. Glibc does not have
 * this restriction.
 * @since v10.0.0
 * @return Fulfills with the resolved path upon success.
 */

suspend fun realpath(path: PathLike, options: node.buffer.BufferEncoding? = undefined.unsafeCast<Nothing>()): String =
    realpathAsync(
        path, options
    ).await()


suspend fun realpath(path: PathLike, options: BufferEncodingOption): node.buffer.Buffer =
    realpathAsync(
        path, options
    ).await()


/**
 * Asynchronous realpath(3) - return the canonicalized absolute pathname.
 * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
 * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
 */


/**
 * Asynchronous realpath(3) - return the canonicalized absolute pathname.
 * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
 * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
 */
