// Automatically generated - do not modify!

@file:JsModule("node:fs")
@file:JsNonModule

package node.fs

/**
 * Synchronous readlink(2) - read value of a symbolic link.
 * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
 * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
 */
external fun readlinkSync(
    path: PathLike,
    options: EncodingOption = definedExternally,
): dynamic /* string | Buffer */
