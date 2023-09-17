package node.crypto

import node.buffer.Buffer


@Suppress("INTERFACE_WITH_SUPERCLASS")

sealed external interface CipherGCM : Cipher {
    fun setAAD(buffer: js.buffer.ArrayBufferView, options: CipherGCMSetAADOptions = definedExternally): Unit /* this */
    fun getAuthTag(): Buffer
}
