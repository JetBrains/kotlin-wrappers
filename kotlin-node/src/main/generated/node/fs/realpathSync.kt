// Automatically generated - do not modify!

@file:JsModule("node:fs")
@file:JsNonModule

package node.fs

/**
 * Returns the resolved pathname.
 *
 * For detailed information, see the documentation of the asynchronous version of
 * this API: {@link realpath}.
 * @since v0.1.31
 */
external fun realpathSync(
    path: PathLike,
    options: EncodingOption = definedExternally,
): String


/**
 * Synchronous realpath(3) - return the canonicalized absolute pathname.
 * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
 * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
 */
external fun realpathSync(
    path: PathLike,
    options: BufferEncodingOption,
): node.buffer.Buffer
