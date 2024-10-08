// Generated by Karakum - do not modify it manually!

package node.http2


sealed external interface Http2SessionEvent {
    sealed interface CLOSE : node.events.LegacyEventType
    sealed interface ERROR : node.events.LegacyEventType
    sealed interface FRAMEERROR : node.events.LegacyEventType
    sealed interface GOAWAY : node.events.LegacyEventType
    sealed interface LOCALSETTINGS : node.events.LegacyEventType
    sealed interface PING : node.events.LegacyEventType
    sealed interface REMOTESETTINGS : node.events.LegacyEventType
    sealed interface TIMEOUT : node.events.LegacyEventType

    companion object {
        @seskar.js.JsValue("close")
        val CLOSE: CLOSE

        @seskar.js.JsValue("error")
        val ERROR: ERROR

        @seskar.js.JsValue("frameError")
        val FRAMEERROR: FRAMEERROR

        @seskar.js.JsValue("goaway")
        val GOAWAY: GOAWAY

        @seskar.js.JsValue("localSettings")
        val LOCALSETTINGS: LOCALSETTINGS

        @seskar.js.JsValue("ping")
        val PING: PING

        @seskar.js.JsValue("remoteSettings")
        val REMOTESETTINGS: REMOTESETTINGS

        @seskar.js.JsValue("timeout")
        val TIMEOUT: TIMEOUT

        @seskar.js.JsValue("close")
        fun close(): node.events.EventType<Http2Session, js.array.JsTuple>

        @seskar.js.JsValue("error")
        fun error(): node.events.EventType<Http2Session, js.array.JsTuple1<js.errors.JsError>>

        @seskar.js.JsValue("frameError")
        fun frameError(): node.events.EventType<Http2Session, js.array.JsTuple3<Double, Double, Double>>

        @seskar.js.JsValue("goaway")
        fun goaway(): node.events.EventType<Http2Session, js.array.JsTuple3<Double, Double, node.buffer.Buffer>>

        @seskar.js.JsValue("localSettings")
        fun localSettings(): node.events.EventType<Http2Session, js.array.JsTuple1<Settings>>

        @seskar.js.JsValue("ping")
        fun ping(): node.events.EventType<Http2Session, js.array.JsTuple>

        @seskar.js.JsValue("remoteSettings")
        fun remoteSettings(): node.events.EventType<Http2Session, js.array.JsTuple1<Settings>>

        @seskar.js.JsValue("timeout")
        fun timeout(): node.events.EventType<Http2Session, js.array.JsTuple>
    }
}
