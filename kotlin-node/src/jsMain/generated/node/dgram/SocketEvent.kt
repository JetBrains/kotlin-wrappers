// Generated by Karakum - do not modify it manually!

package node.dgram


@seskar.js.JsVirtual
sealed external interface SocketEvent {
    sealed interface CLOSE : node.events.LegacyEventType
    sealed interface CONNECT : node.events.LegacyEventType
    sealed interface ERROR : node.events.LegacyEventType
    sealed interface LISTENING : node.events.LegacyEventType
    sealed interface MESSAGE : node.events.LegacyEventType

    companion object {
        @seskar.js.JsValue("close")
        val CLOSE: CLOSE

        @seskar.js.JsValue("connect")
        val CONNECT: CONNECT

        @seskar.js.JsValue("error")
        val ERROR: ERROR

        @seskar.js.JsValue("listening")
        val LISTENING: LISTENING

        @seskar.js.JsValue("message")
        val MESSAGE: MESSAGE

        @seskar.js.JsValue("close")
        fun close(): node.events.EventType<Socket, js.array.JsTuple>

        @seskar.js.JsValue("connect")
        fun connect(): node.events.EventType<Socket, js.array.JsTuple>

        @seskar.js.JsValue("error")
        fun error(): node.events.EventType<Socket, js.array.JsTuple1<Throwable /* JsError */>>

        @seskar.js.JsValue("listening")
        fun listening(): node.events.EventType<Socket, js.array.JsTuple>

        @seskar.js.JsValue("message")
        fun message(): node.events.EventType<Socket, js.array.JsTuple2<node.buffer.Buffer, RemoteInfo>>
    }
}
