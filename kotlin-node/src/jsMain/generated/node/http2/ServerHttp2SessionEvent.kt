// Generated by Karakum - do not modify it manually!

package node.http2


@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@seskar.js.JsVirtual
sealed external interface ServerHttp2SessionEvent : node.events.EventType {
    sealed interface CONNECT : ServerHttp2SessionEvent
    sealed interface STREAM : ServerHttp2SessionEvent

    companion object {
        @seskar.js.JsValue("connect")
        val CONNECT: CONNECT

        @seskar.js.JsValue("stream")
        val STREAM: STREAM
    }
}