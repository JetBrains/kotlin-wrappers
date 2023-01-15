// Automatically generated - do not modify!

@file:JsModule("node:crypto")

package node.crypto

import node.buffer.Buffer
import node.stream.Transform
import node.stream.TransformOptions

sealed external class Hash : Transform {
    /* private constructor() */
    /**
     * Creates a new `Hash` object that contains a deep copy of the internal state
     * of the current `Hash` object.
     *
     * The optional `options` argument controls stream behavior. For XOF hash
     * functions such as `'shake256'`, the `outputLength` option can be used to
     * specify the desired output length in bytes.
     *
     * An error is thrown when an attempt is made to copy the `Hash` object after
     * its `hash.digest()` method has been called.
     *
     * ```js
     * // Calculate a rolling hash.
     * const {
     *   createHash
     * } = await import('crypto');
     *
     * const hash = createHash('sha256');
     *
     * hash.update('one');
     * console.log(hash.copy().digest('hex'));
     *
     * hash.update('two');
     * console.log(hash.copy().digest('hex'));
     *
     * hash.update('three');
     * console.log(hash.copy().digest('hex'));
     *
     * // Etc.
     * ```
     * @since v13.1.0
     * @param options `stream.transform` options
     */
    fun copy(options: TransformOptions = definedExternally): Hash

    /**
     * Updates the hash content with the given `data`, the encoding of which
     * is given in `inputEncoding`.
     * If `encoding` is not provided, and the `data` is a string, an
     * encoding of `'utf8'` is enforced. If `data` is a `Buffer`, `TypedArray`, or`DataView`, then `inputEncoding` is ignored.
     *
     * This can be called many times with new data as it is streamed.
     * @since v0.1.92
     * @param inputEncoding The `encoding` of the `data` string.
     */
    fun update(data: BinaryLike): Hash
    fun update(
        data: String,
        inputEncoding: Encoding,
    ): Hash

    /**
     * Calculates the digest of all of the data passed to be hashed (using the `hash.update()` method).
     * If `encoding` is provided a string will be returned; otherwise
     * a `Buffer` is returned.
     *
     * The `Hash` object can not be used again after `hash.digest()` method has been
     * called. Multiple calls will cause an error to be thrown.
     * @since v0.1.92
     * @param encoding The `encoding` of the return value.
     */
    fun digest(): Buffer
    fun digest(encoding: BinaryToTextEncoding): String
}
