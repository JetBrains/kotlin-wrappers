// Automatically generated - do not modify!

package node.stream

// TODO: this interface never existed; remove in next major
sealed external interface Pipe {
    fun close()

    fun hasRef(): Boolean

    fun ref()

    fun unref()
}
