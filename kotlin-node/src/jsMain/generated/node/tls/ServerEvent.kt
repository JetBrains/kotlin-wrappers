package node.tls


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{TLSCLIENTERROR: 'tlsClientError', NEWSESSION: 'newSession', OCSPREQUEST: 'OCSPRequest', RESUMESESSION: 'resumeSession', SECURECONNECTION: 'secureConnection', KEYLOG: 'keylog'}/*union*/)""")
sealed external interface ServerEvent : node.events.EventType {
    object TLSCLIENTERROR : ServerEvent
    object NEWSESSION : ServerEvent
    object OCSPREQUEST : ServerEvent
    object RESUMESESSION : ServerEvent
    object SECURECONNECTION : ServerEvent
    object KEYLOG : ServerEvent
}
