// Automatically generated - do not modify!

@file:JsModule("node:fs")

package node.fs

import node.buffer.Buffer

/**
 * Returns the symbolic link's string value.
 *
 * See the POSIX [`readlink(2)`](http://man7.org/linux/man-pages/man2/readlink.2.html) documentation for more details.
 *
 * The optional `options` argument can be a string specifying an encoding, or an
 * object with an `encoding` property specifying the character encoding to use for
 * the link path returned. If the `encoding` is set to `'buffer'`,
 * the link path returned will be passed as a `Buffer` object.
 * @since v0.1.31
 */
external fun readlinkSync(
    path: PathLike,
    options: EncodingOption = definedExternally,
): String


/**
 * Synchronous readlink(2) - read value of a symbolic link.
 * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
 * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
 */
external fun readlinkSync(
    path: PathLike,
    options: BufferEncodingOption,
): Buffer
