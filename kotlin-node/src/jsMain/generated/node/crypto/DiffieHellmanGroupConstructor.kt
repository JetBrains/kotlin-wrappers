package node.crypto

import node.buffer.Buffer


sealed external class DiffieHellmanGroup {
    /* new (name: string): DiffieHellmanGroup; */

    @Suppress("DEPRECATION")
    @nativeInvoke
    operator fun invoke(name: String): DiffieHellmanGroup

    constructor ()

    fun generateKeys(): Buffer
    fun generateKeys(encoding: BinaryToTextEncoding): String
    fun computeSecret(
        otherPublicKey: js.buffer.ArrayBufferView,
        inputEncoding: Nothing? = definedExternally,
        outputEncoding: Nothing? = definedExternally,
    ): Buffer

    fun computeSecret(
        otherPublicKey: String,
        inputEncoding: BinaryToTextEncoding,
        outputEncoding: Nothing? = definedExternally,
    ): Buffer

    fun computeSecret(
        otherPublicKey: js.buffer.ArrayBufferView,
        inputEncoding: Nothing?,
        outputEncoding: BinaryToTextEncoding,
    ): String

    fun computeSecret(
        otherPublicKey: String,
        inputEncoding: BinaryToTextEncoding,
        outputEncoding: BinaryToTextEncoding,
    ): String

    fun getPrime(): Buffer
    fun getPrime(encoding: BinaryToTextEncoding): String
    fun getGenerator(): Buffer
    fun getGenerator(encoding: BinaryToTextEncoding): String
    fun getPublicKey(): Buffer
    fun getPublicKey(encoding: BinaryToTextEncoding): String
    fun getPrivateKey(): Buffer
    fun getPrivateKey(encoding: BinaryToTextEncoding): String
    var verifyError: Double
}
