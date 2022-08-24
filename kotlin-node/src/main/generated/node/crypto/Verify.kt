// Automatically generated - do not modify!

@file:JsModule("node:crypto")
@file:JsNonModule

package node.crypto

import node.stream.Writable
import org.khronos.webgl.ArrayBufferView

sealed external class Verify : Writable {
    /* private constructor() */
    /**
     * Updates the `Verify` content with the given `data`, the encoding of which
     * is given in `inputEncoding`.
     * If `inputEncoding` is not provided, and the `data` is a string, an
     * encoding of `'utf8'` is enforced. If `data` is a `Buffer`, `TypedArray`, or`DataView`, then `inputEncoding` is ignored.
     *
     * This can be called many times with new data as it is streamed.
     * @since v0.1.92
     * @param inputEncoding The `encoding` of the `data` string.
     */
    fun update(data: BinaryLike): Verify
    fun update(
        data: String,
        inputEncoding: Encoding,
    ): Verify

    /**
     * Verifies the provided data using the given `object` and `signature`.
     *
     * If `object` is not a `KeyObject`, this function behaves as if`object` had been passed to {@link createPublicKey}. If it is an
     * object, the following additional properties can be passed:
     *
     * The `signature` argument is the previously calculated signature for the data, in
     * the `signatureEncoding`.
     * If a `signatureEncoding` is specified, the `signature` is expected to be a
     * string; otherwise `signature` is expected to be a `Buffer`,`TypedArray`, or `DataView`.
     *
     * The `verify` object can not be used again after `verify.verify()` has been
     * called. Multiple calls to `verify.verify()` will result in an error being
     * thrown.
     *
     * Because public keys can be derived from private keys, a private key may
     * be passed instead of a public key.
     * @since v0.1.92
     */
    fun verify(
        o: Any, /* KeyLike | VerifyKeyObjectInput | VerifyPublicKeyInput */
        signature: ArrayBufferView,
    ): Boolean

    fun verify(
        o: Any, /* KeyLike | VerifyKeyObjectInput | VerifyPublicKeyInput */
        signature: String,
        signature_format: BinaryToTextEncoding = definedExternally,
    ): Boolean
}
