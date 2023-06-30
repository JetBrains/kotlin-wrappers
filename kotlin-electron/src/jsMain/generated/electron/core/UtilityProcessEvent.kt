package electron.core


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{EXIT: 'exit', MESSAGE: 'message', SPAWN: 'spawn'}/*union*/)""")
sealed external interface UtilityProcessEvent : node.events.EventType {
    object EXIT : UtilityProcessEvent
    object MESSAGE : UtilityProcessEvent
    object SPAWN : UtilityProcessEvent
}
