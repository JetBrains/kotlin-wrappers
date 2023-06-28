// Automatically generated - do not modify!

@file:JsModule("node:fs/promises")

package node.fs

import js.promise.Promise
import node.buffer.Buffer

/**
 * Reads the contents of the symbolic link referred to by `path`. See the POSIX [`readlink(2)`](http://man7.org/linux/man-pages/man2/readlink.2.html) documentation for more detail. The promise is
 * resolved with the`linkString` upon success.
 *
 * The optional `options` argument can be a string specifying an encoding, or an
 * object with an `encoding` property specifying the character encoding to use for
 * the link path returned. If the `encoding` is set to `'buffer'`, the link path
 * returned will be passed as a `Buffer` object.
 * @since v10.0.0
 * @return Fulfills with the `linkString` upon success.
 */
@JsName("readlink")
external fun readlinkAsync(
    path: PathLike,
    options: node.buffer.BufferEncoding? /* ObjectEncodingOptions | BufferEncoding */ = definedExternally,
): Promise<String>


/**
 * Asynchronous readlink(2) - read value of a symbolic link.
 * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
 * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
 */
@JsName("readlink")
external fun readlinkAsync(
    path: PathLike,
    options: BufferEncodingOption,
): Promise<Buffer>
