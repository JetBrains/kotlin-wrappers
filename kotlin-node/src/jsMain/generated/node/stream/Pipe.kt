// Automatically generated - do not modify!

package node.stream

sealed external interface Pipe {
    fun close()
    fun hasRef(): Boolean
    fun ref()
    fun unref()
}
