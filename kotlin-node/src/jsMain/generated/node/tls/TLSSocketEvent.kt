package node.tls


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{OCSPRESPONSE: 'OCSPResponse', SECURECONNECT: 'secureConnect', SESSION: 'session', KEYLOG: 'keylog'}/*union*/)""")
sealed external interface TLSSocketEvent : node.events.EventType {
    object OCSPRESPONSE : TLSSocketEvent
    object SECURECONNECT : TLSSocketEvent
    object SESSION : TLSSocketEvent
    object KEYLOG : TLSSocketEvent
}
