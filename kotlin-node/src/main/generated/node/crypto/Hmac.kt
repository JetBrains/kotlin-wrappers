// Automatically generated - do not modify!

@file:JsModule("node:crypto")
@file:JsNonModule

package node.crypto

import node.buffer.Buffer
import node.stream.TransformOptions

sealed external class Hmac : TransformOptions {
    /* private constructor() */
    /**
     * Updates the `Hmac` content with the given `data`, the encoding of which
     * is given in `inputEncoding`.
     * If `encoding` is not provided, and the `data` is a string, an
     * encoding of `'utf8'` is enforced. If `data` is a `Buffer`, `TypedArray`, or`DataView`, then `inputEncoding` is ignored.
     *
     * This can be called many times with new data as it is streamed.
     * @since v0.1.94
     * @param inputEncoding The `encoding` of the `data` string.
     */
    fun update(data: BinaryLike): Hmac
    fun update(
        data: String,
        inputEncoding: Encoding,
    ): Hmac

    /**
     * Calculates the HMAC digest of all of the data passed using `hmac.update()`.
     * If `encoding` is
     * provided a string is returned; otherwise a `Buffer` is returned;
     *
     * The `Hmac` object can not be used again after `hmac.digest()` has been
     * called. Multiple calls to `hmac.digest()` will result in an error being thrown.
     * @since v0.1.94
     * @param encoding The `encoding` of the return value.
     */
    fun digest(): Buffer
    fun digest(encoding: BinaryToTextEncoding): String
}
