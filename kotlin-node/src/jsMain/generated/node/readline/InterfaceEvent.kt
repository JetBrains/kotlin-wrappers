package node.readline


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{CLOSE: 'close', LINE: 'line', PAUSE: 'pause', RESUME: 'resume', SIGCONT: 'SIGCONT', SIGINT: 'SIGINT', SIGTSTP: 'SIGTSTP', HISTORY: 'history'}/*union*/)""")
sealed external interface InterfaceEvent : node.events.EventType {
    object CLOSE : InterfaceEvent
    object LINE : InterfaceEvent
    object PAUSE : InterfaceEvent
    object RESUME : InterfaceEvent
    object SIGCONT : InterfaceEvent
    object SIGINT : InterfaceEvent
    object SIGTSTP : InterfaceEvent
    object HISTORY : InterfaceEvent
}
