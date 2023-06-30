package electron.core


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{critical: 'critical', informational: 'informational'}/*union*/)""")
sealed external interface DockBounceType {
    companion object {
        val critical: DockBounceType
        val informational: DockBounceType
    }
}
