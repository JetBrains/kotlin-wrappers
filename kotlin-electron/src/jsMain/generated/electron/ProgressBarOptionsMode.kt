package electron


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{none: 'none', normal: 'normal', indeterminate: 'indeterminate', error: 'error', paused: 'paused'}/*union*/)""")
sealed external interface ProgressBarOptionsMode {
    companion object {
        val none: ProgressBarOptionsMode
        val normal: ProgressBarOptionsMode
        val indeterminate: ProgressBarOptionsMode
        val error: ProgressBarOptionsMode
        val paused: ProgressBarOptionsMode
    }
}
