// Automatically generated - do not modify!

package electron.core

@js.union.JsUnion
sealed /* union */
external interface WebSocketBinaryType

inline val WebSocketBinaryType.Companion.nodebuffer: WebSocketBinaryType
    get() = js.reflect.unsafeCast("nodebuffer")

inline val WebSocketBinaryType.Companion.arraybuffer: WebSocketBinaryType
    get() = js.reflect.unsafeCast("arraybuffer")

inline val WebSocketBinaryType.Companion.blob: WebSocketBinaryType
    get() = js.reflect.unsafeCast("blob")
