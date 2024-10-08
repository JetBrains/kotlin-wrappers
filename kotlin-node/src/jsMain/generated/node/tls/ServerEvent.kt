// Generated by Karakum - do not modify it manually!

package node.tls


sealed external interface ServerEvent {
    sealed interface TLSCLIENTERROR : node.events.LegacyEventType
    sealed interface NEWSESSION : node.events.LegacyEventType
    sealed interface OCSPREQUEST : node.events.LegacyEventType
    sealed interface RESUMESESSION : node.events.LegacyEventType
    sealed interface SECURECONNECTION : node.events.LegacyEventType
    sealed interface KEYLOG : node.events.LegacyEventType

    companion object {
        @seskar.js.JsValue("tlsClientError")
        val TLSCLIENTERROR: TLSCLIENTERROR

        @seskar.js.JsValue("newSession")
        val NEWSESSION: NEWSESSION

        @seskar.js.JsValue("OCSPRequest")
        val OCSPREQUEST: OCSPREQUEST

        @seskar.js.JsValue("resumeSession")
        val RESUMESESSION: RESUMESESSION

        @seskar.js.JsValue("secureConnection")
        val SECURECONNECTION: SECURECONNECTION

        @seskar.js.JsValue("keylog")
        val KEYLOG: KEYLOG

        @seskar.js.JsValue("tlsClientError")
        fun tlsClientError(): node.events.EventType<Server, js.array.JsTuple2<js.errors.JsError, TLSSocket>>

        @seskar.js.JsValue("newSession")
        fun newSession(): node.events.EventType<Server, js.array.JsTuple3<node.buffer.Buffer, node.buffer.Buffer, () -> Unit>>

        @seskar.js.JsValue("OCSPRequest")
        fun OCSPRequest(): node.events.EventType<Server, js.array.JsTuple3<node.buffer.Buffer, node.buffer.Buffer, (err: js.errors.JsError?, resp: node.buffer.Buffer) -> Unit>>

        @seskar.js.JsValue("resumeSession")
        fun resumeSession(): node.events.EventType<Server, js.array.JsTuple2<node.buffer.Buffer, (err: js.errors.JsError?, sessionData: node.buffer.Buffer?) -> Unit>>

        @seskar.js.JsValue("secureConnection")
        fun secureConnection(): node.events.EventType<Server, js.array.JsTuple1<TLSSocket>>

        @seskar.js.JsValue("keylog")
        fun keylog(): node.events.EventType<Server, js.array.JsTuple2<node.buffer.Buffer, TLSSocket>>
    }
}
