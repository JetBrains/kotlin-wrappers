package electron.core


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{default: 'default', foregroundTab: 'foreground-tab', backgroundTab: 'background-tab', newWindow: 'new-window', other: 'other'}/*union*/)""")
sealed external interface DidCreateWindowDetailsDisposition {
    companion object {
        val default: DidCreateWindowDetailsDisposition
        val foregroundTab: DidCreateWindowDetailsDisposition
        val backgroundTab: DidCreateWindowDetailsDisposition
        val newWindow: DidCreateWindowDetailsDisposition
        val other: DidCreateWindowDetailsDisposition
    }
}
