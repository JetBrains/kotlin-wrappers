// Automatically generated - do not modify!

@file:JsModule("node:crypto")
@file:JsNonModule

package node.crypto

import kotlinx.js.Void
import node.buffer.Buffer
import org.khronos.webgl.ArrayBufferView

sealed external class DiffieHellman {
    /* private constructor() */
    /**
     * Generates private and public Diffie-Hellman key values, and returns
     * the public key in the specified `encoding`. This key should be
     * transferred to the other party.
     * If `encoding` is provided a string is returned; otherwise a `Buffer` is returned.
     * @since v0.5.0
     * @param encoding The `encoding` of the return value.
     */
    fun generateKeys(): Buffer
    fun generateKeys(encoding: BinaryToTextEncoding): String

    /**
     * Computes the shared secret using `otherPublicKey` as the other
     * party's public key and returns the computed shared secret. The supplied
     * key is interpreted using the specified `inputEncoding`, and secret is
     * encoded using specified `outputEncoding`.
     * If the `inputEncoding` is not
     * provided, `otherPublicKey` is expected to be a `Buffer`,`TypedArray`, or `DataView`.
     *
     * If `outputEncoding` is given a string is returned; otherwise, a `Buffer` is returned.
     * @since v0.5.0
     * @param inputEncoding The `encoding` of an `otherPublicKey` string.
     * @param outputEncoding The `encoding` of the return value.
     */
    fun computeSecret(
        otherPublicKey: ArrayBufferView,
        inputEncoding: Void = definedExternally,
        outputEncoding: Void = definedExternally,
    ): Buffer

    fun computeSecret(
        otherPublicKey: String,
        inputEncoding: BinaryToTextEncoding,
        outputEncoding: Void = definedExternally,
    ): Buffer

    fun computeSecret(
        otherPublicKey: ArrayBufferView,
        inputEncoding: Void,
        outputEncoding: BinaryToTextEncoding,
    ): String

    fun computeSecret(
        otherPublicKey: String,
        inputEncoding: BinaryToTextEncoding,
        outputEncoding: BinaryToTextEncoding,
    ): String

    /**
     * Returns the Diffie-Hellman prime in the specified `encoding`.
     * If `encoding` is provided a string is
     * returned; otherwise a `Buffer` is returned.
     * @since v0.5.0
     * @param encoding The `encoding` of the return value.
     */
    fun getPrime(): Buffer
    fun getPrime(encoding: BinaryToTextEncoding): String

    /**
     * Returns the Diffie-Hellman generator in the specified `encoding`.
     * If `encoding` is provided a string is
     * returned; otherwise a `Buffer` is returned.
     * @since v0.5.0
     * @param encoding The `encoding` of the return value.
     */
    fun getGenerator(): Buffer
    fun getGenerator(encoding: BinaryToTextEncoding): String

    /**
     * Returns the Diffie-Hellman public key in the specified `encoding`.
     * If `encoding` is provided a
     * string is returned; otherwise a `Buffer` is returned.
     * @since v0.5.0
     * @param encoding The `encoding` of the return value.
     */
    fun getPublicKey(): Buffer
    fun getPublicKey(encoding: BinaryToTextEncoding): String

    /**
     * Returns the Diffie-Hellman private key in the specified `encoding`.
     * If `encoding` is provided a
     * string is returned; otherwise a `Buffer` is returned.
     * @since v0.5.0
     * @param encoding The `encoding` of the return value.
     */
    fun getPrivateKey(): Buffer
    fun getPrivateKey(encoding: BinaryToTextEncoding): String

    /**
     * Sets the Diffie-Hellman public key. If the `encoding` argument is provided,`publicKey` is expected
     * to be a string. If no `encoding` is provided, `publicKey` is expected
     * to be a `Buffer`, `TypedArray`, or `DataView`.
     * @since v0.5.0
     * @param encoding The `encoding` of the `publicKey` string.
     */
    fun setPublicKey(publicKey: ArrayBufferView)
    fun setPublicKey(
        publicKey: String,
        encoding: node.buffer.BufferEncoding,
    )

    /**
     * Sets the Diffie-Hellman private key. If the `encoding` argument is provided,`privateKey` is expected
     * to be a string. If no `encoding` is provided, `privateKey` is expected
     * to be a `Buffer`, `TypedArray`, or `DataView`.
     * @since v0.5.0
     * @param encoding The `encoding` of the `privateKey` string.
     */
    fun setPrivateKey(privateKey: ArrayBufferView)
    fun setPrivateKey(
        privateKey: String,
        encoding: node.buffer.BufferEncoding,
    )

    /**
     * A bit field containing any warnings and/or errors resulting from a check
     * performed during initialization of the `DiffieHellman` object.
     *
     * The following values are valid for this property (as defined in `constants`module):
     *
     * * `DH_CHECK_P_NOT_SAFE_PRIME`
     * * `DH_CHECK_P_NOT_PRIME`
     * * `DH_UNABLE_TO_CHECK_GENERATOR`
     * * `DH_NOT_SUITABLE_GENERATOR`
     * @since v0.11.12
     */
    var verifyError: Number
}
