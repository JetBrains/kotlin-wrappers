// Automatically generated - do not modify!

package node.dgram

@js.union.JsUnion
sealed external interface SocketType

inline val SocketType.Companion.udp4: SocketType
    get() = js.reflect.unsafeCast("udp4")

inline val SocketType.Companion.udp6: SocketType
    get() = js.reflect.unsafeCast("udp6")
