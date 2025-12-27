// Automatically generated - do not modify!

package node.crypto

import node.buffer.NonSharedBuffer

sealed external class DiffieHellmanGroup {
    // new (name: string): DiffieHellmanGroup;
    operator fun invoke(name: String): DiffieHellmanGroup

    constructor ()

    fun generateKeys(): NonSharedBuffer

    fun generateKeys(encoding: BinaryToTextEncoding): String

    fun computeSecret(
        otherPublicKey: js.buffer.ArrayBufferView<*>,
        inputEncoding: Nothing? = definedExternally,
        outputEncoding: Nothing? = definedExternally,
    ): NonSharedBuffer

    fun computeSecret(
        otherPublicKey: String,
        inputEncoding: BinaryToTextEncoding,
        outputEncoding: Nothing? = definedExternally,
    ): NonSharedBuffer

    fun computeSecret(
        otherPublicKey: js.buffer.ArrayBufferView<*>,
        inputEncoding: Nothing?,
        outputEncoding: BinaryToTextEncoding,
    ): String

    fun computeSecret(
        otherPublicKey: String,
        inputEncoding: BinaryToTextEncoding,
        outputEncoding: BinaryToTextEncoding,
    ): String

    fun getPrime(): NonSharedBuffer

    fun getPrime(encoding: BinaryToTextEncoding): String

    fun getGenerator(): NonSharedBuffer

    fun getGenerator(encoding: BinaryToTextEncoding): String

    fun getPublicKey(): NonSharedBuffer

    fun getPublicKey(encoding: BinaryToTextEncoding): String

    fun getPrivateKey(): NonSharedBuffer

    fun getPrivateKey(encoding: BinaryToTextEncoding): String

    var verifyError: Double
}
