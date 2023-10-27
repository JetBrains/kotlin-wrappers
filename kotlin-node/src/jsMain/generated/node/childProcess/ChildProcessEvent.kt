package node.childProcess


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{CLOSE: 'close', DISCONNECT: 'disconnect', ERROR: 'error', EXIT: 'exit', MESSAGE: 'message', SPAWN: 'spawn'}/*union*/)""")
sealed external interface ChildProcessEvent : node.events.EventType {
    object CLOSE : ChildProcessEvent
    object DISCONNECT : ChildProcessEvent
    object ERROR : ChildProcessEvent
    object EXIT : ChildProcessEvent
    object MESSAGE : ChildProcessEvent
    object SPAWN : ChildProcessEvent
}
