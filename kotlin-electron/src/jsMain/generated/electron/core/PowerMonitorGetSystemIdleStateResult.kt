package electron.core


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{active: 'active', idle: 'idle', locked: 'locked', unknown: 'unknown'}/*union*/)""")
sealed external interface PowerMonitorGetSystemIdleStateResult {
    companion object {
        val active: PowerMonitorGetSystemIdleStateResult
        val idle: PowerMonitorGetSystemIdleStateResult
        val locked: PowerMonitorGetSystemIdleStateResult
        val unknown: PowerMonitorGetSystemIdleStateResult
    }
}
