// Automatically generated - do not modify!

package node.crypto

@Suppress("INTERFACE_WITH_SUPERCLASS")
sealed external interface DecipherCCM : Decipheriv {
    fun setAuthTag(buffer: js.buffer.ArrayBufferView<*>) // this

    fun setAAD(buffer: js.buffer.ArrayBufferView<*>, options: DecipherCCMSetAADOptions) // this
}
