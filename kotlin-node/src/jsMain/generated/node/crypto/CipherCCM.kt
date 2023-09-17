package node.crypto

import node.buffer.Buffer


@Suppress("INTERFACE_WITH_SUPERCLASS")

sealed external interface CipherCCM : Cipher {
    fun setAAD(buffer: js.buffer.ArrayBufferView, options: CipherCCMSetAADOptions): Unit /* this */
    fun getAuthTag(): Buffer
}
