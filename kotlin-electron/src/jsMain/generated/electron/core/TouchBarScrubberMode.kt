package electron.core


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{fixed: 'fixed', free: 'free'}/*union*/)""")
sealed external interface TouchBarScrubberMode {
    companion object {
        val fixed: TouchBarScrubberMode
        val free: TouchBarScrubberMode
    }
}
