// Automatically generated - do not modify!

package node.crypto

import node.buffer.NonSharedBuffer

@Suppress("INTERFACE_WITH_SUPERCLASS")
sealed external interface CipherOCB : Cipheriv {
    fun setAAD(buffer: js.buffer.ArrayBufferView<*>, options: CipherOCBSetAADOptions = definedExternally) // this

    fun getAuthTag(): NonSharedBuffer
}
