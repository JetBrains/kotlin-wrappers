// Automatically generated - do not modify!

package node.dgram

sealed external interface SocketType {
    companion object
}

inline val SocketType.Companion.udp4: SocketType
    get() = js.reflect.unsafeCast("udp4")

inline val SocketType.Companion.udp6: SocketType
    get() = js.reflect.unsafeCast("udp6")
