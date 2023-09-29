@file:JsModule("node:fs")

package node.fs


/**
 * Reads the contents of the symbolic link referred to by `path`. The callback gets
 * two arguments `(err, linkString)`.
 *
 * See the POSIX [`readlink(2)`](http://man7.org/linux/man-pages/man2/readlink.2.html) documentation for more details.
 *
 * The optional `options` argument can be a string specifying an encoding, or an
 * object with an `encoding` property specifying the character encoding to use for
 * the link path passed to the callback. If the `encoding` is set to `'buffer'`,
 * the link path returned will be passed as a `Buffer` object.
 * @since v0.1.31
 */
external fun readlink(
    path: PathLike,
    options: EncodingOption,
    callback: (err: node.ErrnoException?, linkString: String) -> Unit,
): Unit

/**
 * Asynchronous readlink(2) - read value of a symbolic link.
 * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
 * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
 */
external fun readlink(
    path: PathLike,
    options: BufferEncodingOption,
    callback: (err: node.ErrnoException?, linkString: node.buffer.Buffer) -> Unit,
): Unit

/**
 * Asynchronous readlink(2) - read value of a symbolic link.
 * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
 * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
 */
external fun readlink(
    path: PathLike,
    options: EncodingOption,
    callback: (err: node.ErrnoException?, linkString: Any /* string | Buffer */) -> Unit,
): Unit

/**
 * Asynchronous readlink(2) - read value of a symbolic link.
 * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
 */
external fun readlink(path: PathLike, callback: (err: node.ErrnoException?, linkString: String) -> Unit): Unit
