// Automatically generated - do not modify!

package node.net

sealed external interface SocketReadyState {
    companion object
}

inline val SocketReadyState.Companion.opening: SocketReadyState
    get() = js.reflect.unsafeCast("opening")

inline val SocketReadyState.Companion.open: SocketReadyState
    get() = js.reflect.unsafeCast("open")

inline val SocketReadyState.Companion.readOnly: SocketReadyState
    get() = js.reflect.unsafeCast("readOnly")

inline val SocketReadyState.Companion.writeOnly: SocketReadyState
    get() = js.reflect.unsafeCast("writeOnly")

inline val SocketReadyState.Companion.closed: SocketReadyState
    get() = js.reflect.unsafeCast("closed")
