package electron.core


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{left: 'left', right: 'right', bottom: 'bottom', undocked: 'undocked', detach: 'detach'}/*union*/)""")
sealed external interface OpenDevToolsOptionsMode {
    companion object {
        val left: OpenDevToolsOptionsMode
        val right: OpenDevToolsOptionsMode
        val bottom: OpenDevToolsOptionsMode
        val undocked: OpenDevToolsOptionsMode
        val detach: OpenDevToolsOptionsMode
    }
}
