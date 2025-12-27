// Automatically generated - do not modify!

package node.crypto

import node.buffer.NonSharedBuffer

@Suppress("INTERFACE_WITH_SUPERCLASS")
sealed external interface CipherCCM : Cipheriv {
    fun setAAD(buffer: js.buffer.ArrayBufferView<*>, options: CipherCCMSetAADOptions) // this

    fun getAuthTag(): NonSharedBuffer
}
