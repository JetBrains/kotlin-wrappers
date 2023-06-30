package electron.core


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{default: 'default', foregroundTab: 'foreground-tab', backgroundTab: 'background-tab', newWindow: 'new-window', other: 'other'}/*union*/)""")
sealed external interface HandlerDetailsDisposition {
    companion object {
        val default: HandlerDetailsDisposition
        val foregroundTab: HandlerDetailsDisposition
        val backgroundTab: HandlerDetailsDisposition
        val newWindow: HandlerDetailsDisposition
        val other: HandlerDetailsDisposition
    }
}
