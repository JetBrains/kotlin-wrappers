// Generated by Karakum - do not modify it manually!

@file:JsModule("node:fs")

package node.fs

/**
 * Asynchronously computes the canonical pathname by resolving `.`, `..`, and
 * symbolic links.
 *
 * A canonical pathname is not necessarily unique. Hard links and bind mounts can
 * expose a file system entity through many pathnames.
 *
 * This function behaves like [`realpath(3)`](http://man7.org/linux/man-pages/man3/realpath.3.html), with some exceptions:
 *
 * 1. No case conversion is performed on case-insensitive file systems.
 * 2. The maximum number of symbolic links is platform-independent and generally
 * (much) higher than what the native [`realpath(3)`](http://man7.org/linux/man-pages/man3/realpath.3.html) implementation supports.
 *
 * The `callback` gets two arguments `(err, resolvedPath)`. May use `process.cwd` to resolve relative paths.
 *
 * Only paths that can be converted to UTF8 strings are supported.
 *
 * The optional `options` argument can be a string specifying an encoding, or an
 * object with an `encoding` property specifying the character encoding to use for
 * the path passed to the callback. If the `encoding` is set to `'buffer'`,
 * the path returned will be passed as a `Buffer` object.
 *
 * If `path` resolves to a socket or a pipe, the function will return a system
 * dependent name for that object.
 * @since v0.1.31
 */
external fun realpath(
    path: PathLike,
    options: EncodingOption,
    callback: (err: node.ErrnoException?, resolvedPath: String) -> Unit,
)

/**
 * Asynchronous realpath(3) - return the canonicalized absolute pathname.
 * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
 * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
 */
external fun realpath(
    path: PathLike,
    options: BufferEncodingOption,
    callback: (err: node.ErrnoException?, resolvedPath: node.buffer.Buffer<*>) -> Unit,
)

/**
 * Asynchronous realpath(3) - return the canonicalized absolute pathname.
 * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
 * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
 */
external fun realpath(
    path: PathLike,
    options: EncodingOption,
    callback: (err: node.ErrnoException?, resolvedPath: Any /* string | Buffer */) -> Unit,
)

/**
 * Asynchronous realpath(3) - return the canonicalized absolute pathname.
 * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
 */
external fun realpath(
    path: PathLike,
    callback: (err: node.ErrnoException?, resolvedPath: String) -> Unit,
)
