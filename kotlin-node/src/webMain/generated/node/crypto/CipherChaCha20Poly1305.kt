// Automatically generated - do not modify!

package node.crypto

import node.buffer.NonSharedBuffer

@Suppress("INTERFACE_WITH_SUPERCLASS")
sealed external interface CipherChaCha20Poly1305 : Cipheriv {
    fun setAAD(buffer: js.buffer.ArrayBufferView<*>, options: CipherChaCha20Poly1305SetAADOptions) // this

    fun getAuthTag(): NonSharedBuffer
}
